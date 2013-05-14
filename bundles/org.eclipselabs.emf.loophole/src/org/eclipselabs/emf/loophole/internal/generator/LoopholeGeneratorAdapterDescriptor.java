/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emf.loophole.internal.generator;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenClassGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenEnumGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenPackageGeneratorAdapter;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipselabs.emf.loophole.internal.model.GenGapModel;
import org.eclipselabs.emf.loophole.internal.model.GenGapPackage;

/**
 * @author Mikaël Barbero - Remove any MWE dependencies
 */
public class LoopholeGeneratorAdapterDescriptor implements GeneratorAdapterFactory.Descriptor {

	private final GenGapModel genGapModel;

	public LoopholeGeneratorAdapterDescriptor(GenGapModel genGapModel) {
		this.genGapModel = genGapModel;
	}
	
	protected Map<String, String> createModelMapper(GenGapModel genGapModel) {
		Map<String, String> qNameToCustomQName = new HashMap<String, String>();
		for(GenGapPackage genGapPackage: genGapModel.getGenGapPackages()) {
			for (GenClass genClass : genGapPackage.getGenPackage().getGenClasses()) {
				qNameToCustomQName.put(
						genClass.getQualifiedClassName(),
						genGapPackage.getCustomQualifiedClassName(genClass));
			}
		}
		return Collections.unmodifiableMap(qNameToCustomQName);
	}
	
	protected Map<String, String> createEditMapper(GenGapModel genGapModel) {
		Map<String, String> qNameToCustomQName = new HashMap<String, String>();
		for(GenGapPackage genGapPackage: genGapModel.getGenGapPackages()) {
			for (GenClass genClass : genGapPackage.getGenPackage().getGenClasses()) {
				qNameToCustomQName.put(
						genClass.getQualifiedProviderClassName(),
						genGapPackage.getCustomQualifiedProviderClassName(genClass));
			}
		}
		return Collections.unmodifiableMap(qNameToCustomQName);
	}
	
	public GeneratorAdapterFactory createAdapterFactory() {
		return new LoopholeGenModelGeneratorAdapterFactory();
	}
	
	protected void generateCustomClass(String className, String customClassName, URI path) {
		StringBuilder sb =new StringBuilder();
		sb.append("/**\n");
		if (genGapModel.getGenModel().getCopyrightText() != null) {
			sb.append(genGapModel.getGenModel().getCopyright(" *")).append("\n");
		}
		sb.append(" */\n");
		int lastIndexOfDot = className.lastIndexOf('.');
		int customLastIndexOfDot = customClassName.lastIndexOf('.');
		sb.append("package ").append(customClassName.substring(0, customLastIndexOfDot)).append(";\n\n");
		sb.append("import ").append(className).append(";\n\n");
		sb.append("public class ").append(customClassName.substring(customLastIndexOfDot+1)).append(" extends ").append(className.substring(lastIndexOfDot+1)).append(" {\n\n");
		sb.append("}\n");
		
		try {
			OutputStream stream = URIConverter.INSTANCE.createOutputStream(path);
			stream.write(sb.toString().getBytes());
			stream.close();
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}
	
	protected void generateCustomProvider(String className, String customClassName, URI path) {
		StringBuilder sb =new StringBuilder();
		sb.append("/**\n");
		if (genGapModel.getGenModel().getCopyrightText() != null) {
			sb.append(genGapModel.getGenModel().getCopyright(" *")).append("\n");
		}
		sb.append(" */\n");
		int lastIndexOfDot = className.lastIndexOf('.');
		int customLastIndexOfDot = customClassName.lastIndexOf('.');
		sb.append("package ").append(customClassName.substring(0, customLastIndexOfDot)).append(";\n\n");
		sb.append("import org.eclipse.emf.common.notify.AdapterFactory;\n");
		sb.append("import ").append(className).append(";\n\n");
		sb.append("public class ").append(customClassName.substring(customLastIndexOfDot+1)).append(" extends ").append(className.substring(lastIndexOfDot+1)).append(" {\n\n");
		sb.append("\tpublic ").append(customClassName.substring(customLastIndexOfDot+1)).append("(AdapterFactory adapterFactory) {\n");
		sb.append("\t\tsuper(adapterFactory);\n");
		sb.append("\t}\n");
		sb.append("}\n");
		
		try {
			OutputStream stream = URIConverter.INSTANCE.createOutputStream(path);
			stream.write(sb.toString().getBytes());
			stream.close();
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}

	/**
	 * @author Sebastian Zarnekow - Initial contribution and API
	 * @author Mikaël Barbero - Remove any MWE dependencies
	 */
	protected class LoopholeGenModelGeneratorAdapterFactory extends GenModelGeneratorAdapterFactory {
		
		private Map<String, String> editQNameToCustomQName;
		private Map<String, String> modelQNameToCustomQName;
		
		@Override
		public void initialize(Object input) {
			super.initialize(input);
			modelQNameToCustomQName = createModelMapper(genGapModel);
			editQNameToCustomQName = createEditMapper(genGapModel);
		}
		
		@Override
		public Adapter createGenClassAdapter() {
			if (genClassGeneratorAdapter == null) {
				genClassGeneratorAdapter = new GenClassGeneratorAdapter(this) {
					@Override
					protected void createImportManager(String packageName, String className) {
						importManager = new LoopholeImportManager(packageName);
						importManager.addMasterImport(packageName, className);
						if (generatingObject != null)
							((GenBase) generatingObject).getGenModel().setImportManager(importManager);
					}
				};
		    }
			return genClassGeneratorAdapter;
		}

		@Override
		public Adapter createGenEnumAdapter() {
			if (genEnumGeneratorAdapter == null) {
				genEnumGeneratorAdapter = new GenEnumGeneratorAdapter(this) {
					@Override
					protected void createImportManager(String packageName, String className) {
						importManager = new LoopholeImportManager(packageName);
						importManager.addMasterImport(packageName, className);
						if (generatingObject != null)
							((GenBase) generatingObject).getGenModel().setImportManager(importManager);
					}
				};
			}
			return genEnumGeneratorAdapter;
		}

		@Override
		public Adapter createGenModelAdapter() {
			if (genModelGeneratorAdapter == null) {
				genModelGeneratorAdapter = new GenModelGeneratorAdapter(this) {
					@Override
					protected void createImportManager(String packageName, String className) {
						importManager = new LoopholeImportManager(packageName);
						importManager.addMasterImport(packageName, className);
						if (generatingObject != null)
							((GenBase) generatingObject).getGenModel().setImportManager(importManager);
					}
				};
			}
			return genModelGeneratorAdapter;
		}

		@Override
		public Adapter createGenPackageAdapter() {
			if (genPackageGeneratorAdapter == null) {
				genPackageGeneratorAdapter = new GenPackageGeneratorAdapter(this) {
					@Override
					protected void createImportManager(String packageName, String className) {
						importManager = new LoopholeImportManager(packageName);
						importManager.addMasterImport(packageName, className);
						if (generatingObject != null)
							((GenBase) generatingObject).getGenModel().setImportManager(importManager);
					}
					/** 
					 * {@inheritDoc}
					 * @see org.eclipse.emf.codegen.ecore.genmodel.generator.GenPackageGeneratorAdapter#getJETEmitterDescriptors()
					 */
					@Override
					protected JETEmitterDescriptor[] getJETEmitterDescriptors() {
						JETEmitterDescriptor[] descriptors = new JETEmitterDescriptor[super.getJETEmitterDescriptors().length];
						System.arraycopy(super.getJETEmitterDescriptors(), 0, descriptors, 0, super.getJETEmitterDescriptors().length);
						
						for (JETEmitterDescriptor descriptor : descriptors) {
							if ("org.eclipse.emf.codegen.ecore.templates.edit.ItemProviderAdapterFactory".equals(descriptor.className)) {
								try {
									//test if the class is available in a fragment, if not, we are working with an emf version that fixes known bugs.
									Class<?> gen = Class.forName("org.eclipselabs.emf.loophole.internal.generator.edit.ItemProviderAdapterFactory", false, this.getClass().getClassLoader());
									descriptor.className = gen.getName();
								} catch (ClassNotFoundException cnfe) {
								}
							}
						}
						
						return descriptors;
					}
				};
			}
			return genPackageGeneratorAdapter;
		}
		
		protected class LoopholeImportManager extends ImportManager {

			public LoopholeImportManager(String compilationUnitPackage) {
				super(compilationUnitPackage);
			}
			
			@Override
			public String getImportedName(String importQualifiedName, boolean autoImport) {
				String customImportQualifiedName = getModelImportedName(importQualifiedName);
				if (customImportQualifiedName == null) {
					customImportQualifiedName = getEditImportedName(importQualifiedName);
				}
				
				if (customImportQualifiedName != null) {
					return super.getImportedName(customImportQualifiedName, autoImport);
				} else {
					return super.getImportedName(importQualifiedName, autoImport);
				}
			}

			protected String getModelImportedName(String importQualifiedName) {
				String customImportQualifiedName = modelQNameToCustomQName.get(importQualifiedName);
				if (customImportQualifiedName != null) {
					boolean exists = URIConverter.INSTANCE.exists(createURI(genGapModel.getCustomModelDirectory(), customImportQualifiedName), null);
					if (!exists) {
						if (genGapModel.isGenerateCustomClasses()) {
							generateCustomClass(importQualifiedName,customImportQualifiedName,createURI(genGapModel.getCustomModelDirectory(), customImportQualifiedName));
						} else {
							customImportQualifiedName = null;
						}
					}
				}
				return customImportQualifiedName;
			}
			
			protected String getEditImportedName(String importQualifiedName) {
				String customImportQualifiedName = editQNameToCustomQName.get(importQualifiedName);
				if (customImportQualifiedName != null) {
					boolean exists = URIConverter.INSTANCE.exists(createURI(genGapModel.getCustomEditDirectory(), customImportQualifiedName), null);
					if (!exists) {
						if (genGapModel.isGenerateCustomProviders()) {
							generateCustomProvider(importQualifiedName,customImportQualifiedName,createURI(genGapModel.getCustomEditDirectory(), customImportQualifiedName));
						} else {
							customImportQualifiedName = null;
						}
					}
				}
				return customImportQualifiedName;
			}

			protected URI createURI(String path, String customImportQualifiedName) {
				return URI.createURI(path+"/"+customImportQualifiedName.replace('.', '/')+".java");
			}
		}
	}
}
