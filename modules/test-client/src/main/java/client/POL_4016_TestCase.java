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
 * Client for POL_4016_TestCase
 * Tests that externally attached policySets are ignored when the runtime does not support them.
 * 
 * This testcase is expected to fail.
 */
public class POL_4016_TestCase extends BaseJAXWSTestRunner {

    protected TestConfiguration getTestConfiguration() {
    	TestConfiguration config = new TestConfiguration();
    	config.testName 		 = this.getClass().getSimpleName().substring(0, 8);
    	config.input 		 	 = "request";
    	config.output[0] 		 = "exception";
    	config.composite 		 = "Test_" + config.testName + ".composite";
    	config.testServiceName 	 = "TestClient";
    	config.contributionNames = new String[] { "POL_4016" , "Policy_General" , "General_Java" };
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
    
} // end class Test_POL_4016
