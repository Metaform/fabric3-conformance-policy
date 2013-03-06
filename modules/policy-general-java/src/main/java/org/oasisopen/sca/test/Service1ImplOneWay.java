/*
 *
 * Copyright(C) OASIS(R) 2009,2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.*;
import org.oasisopen.sca.test.Service1;


/**
 * Java component implementation with
 * 1 service with interface Service1,
 * 1 reference (1..1) with interface ServiceOneWay
 * reference gets called when service1 operation1 is invoked
 *
 */
@Service(Service1.class)
public class Service1ImplOneWay implements Service1 {
	
	@Property
	public String serviceName = "service1";
	// Reference with an implied multiplicity of (1..1) since required=true is the default
	@Reference
	public ServiceOneWay reference1 = null;

	public String operation1(String input) {
		reference1.operation1(input);
		return serviceName + " oneway operation1 invoked";
	}

} // end class Service1ImplOneWay

