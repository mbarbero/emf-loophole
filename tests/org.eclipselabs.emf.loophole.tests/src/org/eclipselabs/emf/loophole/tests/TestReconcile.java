package org.eclipselabs.emf.loophole.tests;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipselabs.emf.loophole.internal.model.GenGapModel;
import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholeFactory;
import org.junit.Test;

public class TestReconcile {

	@Test
	public void testSimpleGenGapModelInit() {
		EPackage modelPackage = createSimpleEcorePackage();
		createContainingResource(ecoreResourceFactory(), URI.createURI("test:/model.ecore"), modelPackage);
		
		GenModel genModel = initializeGenModel(modelPackage);
		createContainingResource(ecoreResourceFactory(), URI.createURI("test:/model.genmodel"), genModel);
		
		GenGapModel genGapModel = LoopholeFactory.eINSTANCE.createGenGapModel();
		genGapModel.initialize(genModel);
		
		assertThat(genGapModel.getGenModel(), equalTo(genModel));
		assertThat(genGapModel.getGenGapPackages().get(0).getGenPackage(), 
				equalTo(genModel.getGenPackages().get(0)));
	}
	
	@Test
	public void testMultipleRootGenGapModelInit() {
		EPackage modelPackage1 = createSimpleEcorePackage();
		EPackage modelPackage2 = createSimpleEcorePackage();
		createContainingResource(ecoreResourceFactory(), URI.createURI("test:/model.ecore"), modelPackage1, modelPackage2);
		
		GenModel genModel = initializeGenModel(modelPackage1, modelPackage2);
		createContainingResource(ecoreResourceFactory(), URI.createURI("test:/model.genmodel"), genModel);
		
		GenGapModel genGapModel = LoopholeFactory.eINSTANCE.createGenGapModel();
		genGapModel.initialize(genModel);
		
		assertThat(genGapModel.getGenModel(), equalTo(genModel));
		assertThat(genGapModel.getGenGapPackages().get(0).getGenPackage(), 
				equalTo(genModel.getGenPackages().get(0)));
		assertThat(genGapModel.getGenGapPackages().get(1).getGenPackage(), 
				equalTo(genModel.getGenPackages().get(1)));
	}

	@Test
	public void testSimpleGenGapModelReconcile() {
		EPackage modelPackage = createSimpleEcorePackage();
		createContainingResource(ecoreResourceFactory(), URI.createURI("test:/model.ecore"), modelPackage);
		
		GenModel genModel = initializeGenModel(modelPackage);
		createContainingResource(ecoreResourceFactory(), URI.createURI("test:/model.genmodel"), genModel);
		
		GenGapModel genGapModel = LoopholeFactory.eINSTANCE.createGenGapModel();
		genGapModel.initialize(genModel);
		
		GenGapModel newGenGapModel = LoopholeFactory.eINSTANCE.createGenGapModel();
		newGenGapModel.reconcile(genGapModel);
		newGenGapModel.reconcile();
		
		assertThat(newGenGapModel.getGenModel(), equalTo(genModel));
		assertThat(newGenGapModel.getGenGapPackages().get(0).getGenPackage(), 
				equalTo(genModel.getGenPackages().get(0)));
	}

	protected Resource.Factory ecoreResourceFactory() {
		return new EcoreResourceFactoryImpl();
	}

	protected GenModel initializeGenModel(EPackage... ePackages) {
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.initialize(Arrays.asList(ePackages));
		return genModel;
	}

	protected Resource createContainingResource(Resource.Factory resourceFactory, URI uri, EObject... root) {
		Resource resource = resourceFactory.createResource(uri);
		resource.getContents().addAll(Arrays.asList(root));
		return resource;
	}

	protected EPackage createSimpleEcorePackage() {
		EcoreFactory eFactory = EcoreFactory.eINSTANCE;
		EPackage modelPackage = eFactory.createEPackage();
		modelPackage.setName("model");
		modelPackage.setNsURI("model");
		modelPackage.setNsPrefix("m");
		
		EClass superClass = eFactory.createEClass();
		superClass.setName("SuperClass");
		
		EClass subClass = eFactory.createEClass();
		subClass.setName("SubClass");
		subClass.getESuperTypes().add(superClass);
		
		EClass anotherClass = eFactory.createEClass();
		anotherClass.setName("AnotherClass");
		
		EStructuralFeature name = eFactory.createEAttribute();
		name.setName("name");
		name.setEType(EcorePackage.Literals.ESTRING);
		superClass.getEStructuralFeatures().add(name);
		
		EStructuralFeature anInt = eFactory.createEAttribute();
		anInt.setName("anInt");
		anInt.setEType(EcorePackage.Literals.EINT);
		anotherClass.getEStructuralFeatures().add(anInt);
		
		EStructuralFeature refSingle = eFactory.createEReference();
		refSingle.setName("refSingle");
		refSingle.setEType(anotherClass);
		refSingle.setUpperBound(1);
		subClass.getEStructuralFeatures().add(refSingle);
		
		EStructuralFeature refMany = eFactory.createEReference();
		refMany.setName("refSingle");
		refMany.setEType(anotherClass);
		refMany.setUpperBound(-1);
		subClass.getEStructuralFeatures().add(refMany);
		
		EStructuralFeature refUnspecified = eFactory.createEReference();
		refUnspecified.setName("refSingle");
		refUnspecified.setEType(anotherClass);
		refUnspecified.setUpperBound(-2);
		subClass.getEStructuralFeatures().add(refUnspecified);
		
		modelPackage.getEClassifiers().add(superClass);
		modelPackage.getEClassifiers().add(subClass);
		modelPackage.getEClassifiers().add(anotherClass);
		
		return modelPackage;
	}
	
	protected void debug(EObject eObject, OutputStream stream) {
		boolean toBeRemoved = false;
		Resource eResource = eObject.eResource();
		if (eResource == null) {
			toBeRemoved = true;
			eResource = new XMLResourceImpl();
			eResource.getContents().add(eObject);
		}
		try {
			eResource.save(stream, Collections.emptyMap());
		} catch (IOException e) {
		}
		if (toBeRemoved)
			eResource.getContents().remove(eObject);
	}
}
