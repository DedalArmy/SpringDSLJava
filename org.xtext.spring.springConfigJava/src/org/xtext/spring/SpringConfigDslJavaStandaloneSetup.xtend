/*
 * generated by Xtext 2.15.0
 */
package org.xtext.spring


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SpringConfigDslJavaStandaloneSetup extends SpringConfigDslJavaStandaloneSetupGenerated {

	def static void doSetup() {
		new SpringConfigDslJavaStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
