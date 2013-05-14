package org.eclipselabs.emf.loophole.internal.util;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class LoopholeUtil {

	public static Map<URI, URI> computePlatformURIMap(boolean targetPlatform) {
		return EcorePlugin.computePlatformURIMap();
	}
}
