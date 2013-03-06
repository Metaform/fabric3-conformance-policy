/*
 * Copyright(C) OASIS(R) 2009,2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 */
package client;

import org.junit.Ignore;
import org.junit.Test;
import testClient.TestInvocation;

/**
 * Client for POL_4029_TestCase
 * Tests that where a <component/> has an <implementation/> element which has a service with an attached intent, 
 * that the intent applies to the binding of the <component/> <service/> and must be satisfied by that binding.
 */
public class POL_4029_TestCase extends BaseJAXWSTestRunner {

    protected TestConfiguration getTestConfiguration() {
    	TestConfiguration config = new TestConfiguration();
    	config.testName 		 = this.getClass().getSimpleName().substring(0, 8);
    	config.input 		 	 = "request";
    	config.output[0] 		 = "POL_4029 request service1 operation1 invoked";
    	config.composite 		 = "Test_" + config.testName + ".composite";
    	config.testServiceName 	 = "TestClient";
    	config.contributionNames = new String[] { "Policy_General" , "General_Java" , "Policy_General_Java"};
    	config.serviceInterface  = TestInvocation.class;
    	return config;
    }
    
    /**
     * Dummy method to ensure that things work with JUnit 3 eg within Eclipse Ganymede
     */
    @Ignore
    @Test
    public void testFoo() throws Exception {  	
    }
    
} // end class Test_POL_4029
