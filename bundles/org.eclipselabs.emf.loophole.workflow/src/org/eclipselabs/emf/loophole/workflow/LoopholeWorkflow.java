/*******************************************************************************
 * Copyright (c) 2014 Dennis Melzer and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Dennis - initial API and implementation
 ******************************************************************************/

package org.eclipselabs.emf.loophole.workflow;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.utils.DirectoryCleaner;
import org.eclipse.emf.mwe2.runtime.Mandatory;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipselabs.emf.loophole.internal.generator.GenGapModelUtil;
import org.eclipselabs.emf.loophole.internal.model.GenGapModel;
import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholeFactory;

/**
 * @author Dennis Melzer
 */
public class LoopholeWorkflow implements IWorkflowComponent {

    private static Logger LOGGER = Logger.getLogger(LoopholeWorkflow.class);

    private boolean generateEdit = false;
    private String genModel;
    private ResourceSet resourceSet;

    private String customClassNamePattern;
    private String customEditDirectory;
    private String customModelDirectory;
    private boolean generateCustomClasses = false;
    private boolean generateCustomProviders = false;
    private boolean cleanModelDirectory = true;
    private boolean cleanEditDirectory = true;

    public void setCleanModelDirectory(boolean cleanModelDirectory) {
        this.cleanModelDirectory = cleanModelDirectory;
    }

    public void setCleanEditDirectory(boolean cleanEditDirectory) {
        this.cleanEditDirectory = cleanEditDirectory;
    }

    @Mandatory
    public void setCustomClassNamePattern(String customClassNamePattern) {
        this.customClassNamePattern = customClassNamePattern;
    }

    @Mandatory
    public void setCustomModelDirectory(String customModelDirectory) {
        this.customModelDirectory = customModelDirectory;
    }

    public void setGenerateCustomProviders(boolean generateCustomProviders) {
        this.generateCustomProviders = generateCustomProviders;
    }

    @Mandatory
    public void setCustomEditDirectory(String customEditDirectory) {
        this.customEditDirectory = customEditDirectory;
    }

    @Mandatory
    public void setGenModel(String genModel) {
        this.genModel = genModel;
    }

    public void setGenerateCustomClasses(boolean generateCustomClasses) {
        this.generateCustomClasses = generateCustomClasses;
    }

    public void setGenerateEdit(boolean generateEdit) {
        this.generateEdit = generateEdit;
    }

    public void preInvoke() {
        getResourceSet().getResource(URI.createURI(this.genModel), true);

    }

    private ResourceSet getResourceSet() {
        return this.resourceSet == null ? new ResourceSetImpl() : this.resourceSet;
    }

    public void invoke(IWorkflowContext ctx) {
        ResourceSet resSet = getResourceSet();
        Resource resource = resSet.getResource(URI.createURI(this.genModel), true);
        final GenModel genModel = (GenModel) resource.getContents().get(0);

        GenGapModel genGapModel = LoopholeFactory.eINSTANCE.createGenGapModel();

        genGapModel.setGenModel(genModel);
        genModel.setCanGenerate(true);
        genGapModel.reconcile();
        genGapModel.getGenModel().setCanGenerate(true);
        genGapModel.setCustomModelDirectory(this.customModelDirectory);
        genGapModel.setCustomClassNamePattern(this.customClassNamePattern);
        genGapModel.setCustomEditDirectory(this.customEditDirectory);
        genGapModel.setGenerateCustomClasses(this.generateCustomClasses);
        genGapModel.setGenerateCustomProviders(this.generateCustomProviders);
        genGapModel.setCleanModelDirectory(this.cleanModelDirectory);
        genGapModel.setCleanEditDirectory(this.cleanEditDirectory);

        if (genGapModel.isCleanModelDirectory()) {
            cleanFolder(genGapModel.getGenModel().getModelDirectory());
        }
        if (genGapModel.isCleanEditDirectory()) {
            cleanFolder(genGapModel.getGenModel().getEditDirectory());
        }

        LOGGER.info("generating EMF code for " + this.genModel);
        Generator generator = GenGapModelUtil.createGenerator(genGapModel);
        Diagnostic diagnostic = generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
                new BasicMonitor());

        if (diagnostic.getSeverity() != Diagnostic.OK) {
            LOGGER.error(diagnostic);
        }

        if (this.generateEdit) {
            LOGGER.info("generating EMF Edit code for " + this.genModel);
            Diagnostic editDiag = generator.generate(genModel, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE,
                    new BasicMonitor());
            if (editDiag.getSeverity() != Diagnostic.OK) {
                LOGGER.error(diagnostic);
            }
        }

    }

    private void cleanFolder(String directory) {
        URI file = EcorePlugin.resolvePlatformResourcePath(directory);
        DirectoryCleaner cleaner = new DirectoryCleaner();
        String filePath = file.toFileString();
        LOGGER.info("Cleaning Resource " + filePath);
        try {
            cleaner.cleanFolder(filePath);
        } catch (FileNotFoundException e) {
            LOGGER.error("Cannot found file " + this.customEditDirectory, e);
        }
    }

    public void postInvoke() {
        // TODO Auto-generated method stub

    }

}
