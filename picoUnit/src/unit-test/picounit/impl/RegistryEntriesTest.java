/*****************************************************************************
 * Copyright (C) Stacy Curl. All rights reserved.                            *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the LICENSE.txt file.                                                     *
 *****************************************************************************/
package picounit.impl;

import picounit.Implementation;
import picounit.Interface;
import picounit.Registry;
import picounit.registry.RegistryEntries;
import previous.picounit.Mocker;
import previous.picounit.Test;

public class RegistryEntriesTest implements Test {
	private final Object instance = new Object();
	
	private final RegistryEntries registryEntries = new RegistryEntries();
	
	private Registry registry;
	
	public void mock(Registry registry) {
		this.registry = registry;
	}
	
	public void testRegistersImplementationClassesRegistered(Mocker mocker) {
		registry.register(Implementation.class);
		
		mocker.replay();
		
		registryEntries.register(Implementation.class);
		registryEntries.registerWith(registry);
	}
	
	public void testRegistersInterfaceToInstancesRegistered(Mocker mocker) {
		registry.register(Interface.class, instance);
		
		mocker.replay();
		
		registryEntries.register(Interface.class, instance);
		registryEntries.registerWith(registry);
	}
	
	public void testRegistersInterfaceToImplementationRegistered(Mocker mocker) {
		registry.register(Interface.class, Implementation.class);
		
		mocker.replay();
		
		registryEntries.register(Interface.class, Implementation.class);
		registryEntries.registerWith(registry);
	}
}
