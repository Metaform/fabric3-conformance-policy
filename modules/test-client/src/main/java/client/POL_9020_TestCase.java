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
 * Client for POL_9020_TestCase
 * Tests that where the <interface/> of a reference involves request/response operations, 
 * that the <reference/> using that interface is not marked with the transactedOneWay intent
 * 
 * This testcase is expected to fail.
 */
public class POL_9020_TestCase extends BaseJAXWSTestRunner {

    protected TestConfiguration getTestConfiguration() {
    	TestConfiguration config = new TestConfiguration();
    	config.testName 		 = this.getClass().getSimpleName().substring(0, 8);
    	config.input 		 	 = "request";
    	config.output[0] 		 = "exception";
    	config.composite 		 = "Test_" + config.testName + ".composite";
    	config.testServiceName 	 = "TestClient";
    	config.contributionNames = new String[] { "POL_9020" , "Policy_General" , "General_Java" , "Policy_General_Java" };
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
    
} // end class Test_POL_9020
