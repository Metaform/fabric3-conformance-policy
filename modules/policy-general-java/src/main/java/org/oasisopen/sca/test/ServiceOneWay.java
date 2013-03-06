/*
 *
 * Copyright(C) OASIS(R) 2009,2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.OneWay;
import org.oasisopen.sca.annotation.Remotable;

/**
 * A test service interface
 * - one operation = operation1 with a single string input and a void output, marked @OneWay
 *
 */
@Remotable
public interface ServiceOneWay {
	
	/**
	 * Method for invoking testcase service
	 * @param input - input parameter(s) as a String
	 * @return - void
	 */
	@OneWay
	public void operation1( String input );

}
