# EMF Loophole 

*Generation Gap Pattern Tooling*

EMF Loophole is a tool that hooks into the EMF codegen and helps you implement the generation gap pattern. This pattern is about separating generated code and the handwritten one in two separate classes, the handwritten one inheriting from the generated one.


This project is based on the ideas described in a blog post by Heiko Behrens (http://heikobehrens.net/2009/04/23/generation-gap-pattern/) and a basic implementation in MWE 2 (http://download.eclipse.org/modeling/emft/mwe/javadoc/2.3/org/eclipse/emf/mwe2/ecore/EcoreGenerator.html)

## Installation

%TODO...

### Requirements

* Java SE 5

* Eclipse 3.5+ (Galileo)

## Basic usage

1. Create in the src folder a new mwe2 file

2. Copy paste this source

```java
module myModule

import org.eclipse.emf.mwe.utils.*
import org.eclipse.xtext.generator.*
import org.eclipse.xtext.ui.generator.*

var resourceBundle ="platform:/resource/mybundle"
var genmodel = "${resourceBundle}/model/mygenmodel.genmodel"

Workflow {
	bean = StandaloneSetup {
		scanClassPath = true
		platformUri = ".."
		registerGenModelFile = genmodel
	}

	component = org.eclipselabs.emf.loophole.workflow.LoopholeWorkflow {
		customModelDirectory="${resourceBundle}/src"
		customEditDirectory="${resourceBundle}.edit/src"
		customClassNamePattern="{0}CustomImpl"
		generateEdit=true
		genModel = genmodel
	}
}
```

3. Replace myModule by bundle symbolic name + mwe2 filename

4. Replace mybundle by  bundle symbolic name

5.  Replace mygenmodel by name of genmodel

6. You need follow dependencies in your manifest
```
Import-Package: javax.inject;version="[1.0.0,2.0.0)";resolution:=optional,
 org.apache.commons.logging;version="[1.1.1,2.0.0)";resolution:=optional,
 org.apache.log4j;version="1.2.15";resolution:=optional,
 org.eclipselabs.emf.loophole.workflow;version="[1.0.0,2.0.0)";resolution:=optional
 
 Require-Bundle: org.eclipse.emf.mwe2.launch;bundle-version="[2.3.0,3.0.0)";resolution:=optional,
 org.eclipse.emf.mwe2.lib;bundle-version="[2.3.0,3.0.0)";resolution:=optional,
```

7. Select mwe 2 Click Run as Mwe2 Workflow (Maybe you have to create first the edit bundle if not exists)

### Generate source headless(Maven)

There is a Maven plugin from fornax to generate the source files
Example:

```xml
  <build>
		<resources>
			<resource>
				<directory>${project.build.directory}/xtext</directory>
			</resource>
		</resources>
		<plugins>
			<plugin>
                <groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-resources-plugin</artifactId>
				<executions>
					<execution>
						<id>copy-resources</id>
						<phase>initialize</phase>
						<goals>
							<goal>copy-resources</goal>
						</goals>
						<configuration>
							<outputDirectory>${project.build.directory}/xtext</outputDirectory>
							<resources>
								<resource>
									<directory>src</directory>
									<includes>
										<include>**/*.mwe2</include>
									</includes>
								</resource>
							</resources>
						</configuration>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.fornax.toolsupport</groupId>
				<artifactId>fornax-oaw-m2-plugin</artifactId>
				<executions>
					<execution>
						<id>xtext</id>
						<phase>generate-sources</phase>
						<goals>
							<goal>run-workflow</goal>
						</goals>
						<configuration>
							<workflowEngine>mwe2</workflowEngine>
							<workflowDescriptor>myModul</workflowDescriptor>
							<jvmSettings>
								<fork>true</fork>
								<jvmArgs>
									<jvmArg>-Xms100m</jvmArg>
									<jvmArg>-Xmx700m</jvmArg>
									<jvmArg>-XX:MaxPermSize=128m</jvmArg>
								</jvmArgs>
							</jvmSettings>
						</configuration>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
```

Replace myModule (workflowDescriptor) with your moduleName in the mwe2 file.

### GenGapModel Options

#### Model

* **customClassNamePattern** Pattern for deriving custom implementation and item provider names from model element names ("{0}CustomImpl" by default)
* **generateCustomClasses** Whether all custom implementation classes should be generated  
* **customModelDirectory** The target directory for custom model code
* **cleanModelDirectory** Whether the source folder containing generated model classes should be cleaned

#### Edit

* **generateCustomProviders** Whether all custom item providers should be generated  
* **customEditDirectory** The target directory for custom edit code
* **cleanEditDirectory** Whether the source folder containing generated item provider should be cleaned

### GenGapPackage Options

#### Model

* **customClassPackageSuffix** The suffix of the package for custom model class

#### Edit

* **customProviderPackageSuffix** The suffix of the package for custom item providers

## Limitations

It is not possible to reference a Loophole Generator (.gengapmodel) model from another one. Then it is not possible to create customized Ecore models that reference each others.

## Build

Go to @org.eclipselabs.emf.loophole-parent@ and do a @mvn clean package@.

## Contribute

Clone this repository, import all projects in your Eclipse and set your target platform to the one in @org.eclipselabs.emf.loophole-parent/targetPlatforms@.

## License

Copyright (c) 2013 Obeo. All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html 


