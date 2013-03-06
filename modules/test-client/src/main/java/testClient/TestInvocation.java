
package testClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TestInvocation", targetNamespace = "http://test.sca.oasisopen.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestInvocation {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws TestException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "invokeTest", targetNamespace = "http://test.sca.oasisopen.org/", className = "testClient.InvokeTest")
    @ResponseWrapper(localName = "invokeTestResponse", targetNamespace = "http://test.sca.oasisopen.org/", className = "testClient.InvokeTestResponse")
    public String invokeTest(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws TestException_Exception
    ;

}
