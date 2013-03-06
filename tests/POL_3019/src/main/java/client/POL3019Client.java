package client;

import junit.framework.TestCase;
import org.oasisopen.sca.annotation.Reference;
import org.oasisopen.sca.test.TestInvocation;

/**
 *
 */
public class POL3019Client extends TestCase {
    private static final String EXPECTED = "POL_3019 request no invocation";

    @Reference
    protected TestInvocation invocation;

    public void testInvoke() throws Exception {
        assertEquals(EXPECTED, invocation.invokeTest("request"));
    }
}
