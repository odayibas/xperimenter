/*
 * generated by Xtext 2.18.0
 */
package io.github.odayibas


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class XperimenterStandaloneSetup extends XperimenterStandaloneSetupGenerated {

	def static void doSetup() {
		new XperimenterStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
