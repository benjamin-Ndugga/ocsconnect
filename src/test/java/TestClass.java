
import com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultMsg;
import com.huawei.www.bme.cbsinterface.cbs.businessmgr.SubscribeAppendantProductRequestProduct;
import com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode;
import com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductResultMsg;
import com.huawei.www.bme.cbsinterface.common.ResultHeader;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import org.ibm.ws.OCSWebMethods;
import org.ibm.ws.OCSWebServices;

public class TestClass {

//    public static void main(String[] args) throws ServiceException, RemoteException {
//        String msisdn = "750376961";
//        //32806
//        OCSWebMethods methods = new OCSWebMethods("172.27.122.45", "9002");
//
//        SubscribeAppendantProductRequestProduct product1 = new SubscribeAppendantProductRequestProduct();
//        product1.setId("6000010");
//        product1.setValidMode(ValidMode.value1);
//
//        SubscribeAppendantProductRequestProduct[] productList = {product1};
//
//        SubscribeAppendantProductResultMsg subscribeAppendantProduct = methods.subscribeAppendantProduct(msisdn, productList, "SMS", "2323403434JNDIHFD");
//        ResultHeader resultHeader = subscribeAppendantProduct.getResultHeader();
//        System.out.println("RESULT-CODE: " + resultHeader.getResultCode());
//        System.out.println("RESULT-DESC: " + resultHeader.getResultDesc());
//
//    }
    
    
    public static void main(String[] args) throws ServiceException, RemoteException {
        OCSWebServices ocsWebServices = new OCSWebServices("172.27.122.45", "9002");
        QueryGroupListBySubscriberResultMsg queryGroupListBySubscriber = ocsWebServices.queryGroupListBySubscriber("750376961");
        
        com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader = queryGroupListBySubscriber.getResultHeader();
        System.out.println(resultHeader.getResultCode());
        System.out.println(resultHeader.getResultDesc());
    }
    
    

}
