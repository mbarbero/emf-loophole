/**
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Obeo - initial API and implementation
 */
package org.eclipselabs.emf.loophole.internal.generator;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelPackageImpl;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;
import org.eclipselabs.emf.loophole.internal.model.GenGapModel;

public class GenGapModelUtil {

	  public static Generator createGenerator(GenGapModel genGapModel)
	  {
		GenModel genModel = genGapModel.getGenModel();
	    Generator generator = new Generator() {
	    	@Override
	    	protected String getPackageID(Object object) {
	    		// always use package name to be compatible with all UML Genmodel versions
	    		// we don't know beforehand all nsURIs of UML Genmodel
	    		return object.getClass().getPackage().getName();
	    	}
	    };
	    
	    generator.getAdapterFactoryDescriptorRegistry().addDescriptor(GenModelPackageImpl.class.getPackage().getName(), new LoopholeGeneratorAdapterDescriptor(genGapModel));
	    generator.getAdapterFactoryDescriptorRegistry().addDescriptor("org.eclipse.uml2.codegen.ecore.genmodel.impl", new LoopholeGeneratorAdapterDescriptor(genGapModel));
	    
	    generator.setInput(genModel);
	    JControlModel jControlModel = generator.getJControlModel();

	    if (genModel.isCodeFormatting())
	    {
	      jControlModel.setLeadingTabReplacement(null);
	      jControlModel.setConvertToStandardBraceStyle(false);
	    }
	    else
	    {
	      Map<?, ?> options = JavaCore.getOptions();
	      String tabSize = (String)options.get(DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE);
	      String braceStyle = (String)options.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION);
	      String tabCharacter = (String)options.get(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR);
	      if (JavaCore.TAB.equals(tabCharacter))
	      {
	        jControlModel.setLeadingTabReplacement("\t");
	      }
	      else
	      {
	        String spaces = "";
	        for (int i = Integer.parseInt(tabSize); i > 0; --i)
	        {
	          spaces += " ";
	        }
	        jControlModel.setLeadingTabReplacement(spaces);
	      }
	      jControlModel.setConvertToStandardBraceStyle(DefaultCodeFormatterConstants.END_OF_LINE.equals(braceStyle));
	    }
	    return generator;
	  }
}
