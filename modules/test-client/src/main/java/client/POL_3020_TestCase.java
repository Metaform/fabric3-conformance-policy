/*
 * Copyright(C) OASIS(R) 2009,2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 */
package client;

import org.junit.Test;
import org.junit.Ignore;

import client.BaseJAXWSTestRunner;
import client.TestConfiguration;
import testClient.TestInvocation;

/**
 * Client for POL_3020_TestCase
 * Tests that the only qualifier on an intent definition is used the default qualifier.
 * 
 * This testcase is expected to fail.
 */
public class POL_3020_TestCase extends BaseJAXWSTestRunner {

    protected TestConfiguration getTestConfiguration() {
    	TestConfiguration config = new TestConfiguration();
    	config.testName 		 = this.getClass().getSimpleName().substring(0, 8);
    	config.input 		 	 = "request";
    	config.output[0] 		 = "POL_3020 request no invocation";
    	config.composite 		 = "Test_" + config.testName + ".composite";
    	config.testServiceName 	 = "TestClient";
    	config.contributionNames = new String[] { "POL_3020", "Policy_General" , "General_Java" };
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
    
} // end class Test_POL_3020
