/*
 *
 * Copyright(C) OASIS(R) 2009,2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.Property;
import org.oasisopen.sca.annotation.Service;


/**
 * Java component implementation
 * 1 service with interface ServiceOneWay
 * 0 references
 */
@Service(value=ServiceOneWay.class, names={Service1.class})
public class ServiceOneWayImpl implements ServiceOneWay {
	
	@Property
	public String serviceName = "service1";

	public void operation1(String input) {
		return;
	}

}
