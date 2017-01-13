/*
 * generated by Xtext 2.11.0-SNAPSHOT
 */
package org.xtext.builddsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.builddsl.ui.internal.BuilddslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BuildDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return BuilddslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return BuilddslActivator.getInstance().getInjector(BuilddslActivator.ORG_XTEXT_BUILDDSL_BUILDDSL);
	}
	
}
