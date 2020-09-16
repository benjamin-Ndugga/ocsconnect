
import com.huawei.www.bme.cbsinterface.cbs.businessmgr.SubscribeAppendantProductRequestProduct;
import com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode;
import com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductResultMsg;
import com.huawei.www.bme.cbsinterface.common.ResultHeader;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import junit.framework.TestCase;
import org.apache.commons.lang3.RandomStringUtils;
import org.ibm.ws.OCSWebMethods;
import org.junit.Test;

public class TestFunctionality extends TestCase {

    @Test
    public void testSubscribeAppendantMethod() throws ServiceException, RemoteException {

        String user = "dse";
        String password = "QWer12#$";
        String msisdn = "753001184";

        OCSWebMethods methods = new OCSWebMethods("172.27.122.45", "9002", user, password);

        SubscribeAppendantProductRequestProduct product1 = new SubscribeAppendantProductRequestProduct();
        product1.setId("6000010");
        product1.setValidMode(ValidMode.value1);

        SubscribeAppendantProductRequestProduct[] productList = {product1};

        String requestSerial = RandomStringUtils.random(4, false, true);

        SubscribeAppendantProductResultMsg subscribeAppendantProduct = methods.subscribeAppendantProduct(msisdn, productList, "SMS", requestSerial + "SMS", "TXNID1");
        ResultHeader resultHeader = subscribeAppendantProduct.getResultHeader();

        System.out.println("RESULT-CODE: " + resultHeader.getResultCode());
        System.out.println("RESULT-DESC: " + resultHeader.getResultDesc());

        assertEquals("405400203", resultHeader.getResultCode());
    }
}
