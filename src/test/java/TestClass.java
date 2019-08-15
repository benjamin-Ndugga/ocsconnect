
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import org.ibm.ws.OCSWebMethods;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClass {

    @Test
    public void test() throws ServiceException, RemoteException {
        OCSWebMethods ocsWebMethods = new OCSWebMethods("172.27.122.45", "9002");

        assertEquals("405000000", ocsWebMethods.queryBalance("753001184", "VOL-CHECK").getResultHeader().getResultCode());
    }
}
