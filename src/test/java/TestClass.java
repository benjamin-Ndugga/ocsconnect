
import com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceResultMsg;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import org.ibm.ws.OCSWebMethods;

public class TestClass {

    public static void main(String[] args) throws ServiceException, RemoteException {

        OCSWebMethods methods = new OCSWebMethods("172.27.122.45", "9002");
        QueryBalanceResultMsg queryBalance = methods.queryBalance("750376961", "test23");

        com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader = queryBalance.getResultHeader();
        System.out.println("" + resultHeader.getResultCode());
    }

//    public static void main() throws ServiceException, RemoteException {
//        OCSWebServices ocsWebServices = new OCSWebServices("172.27.122.45", "9002");
//        DelGroupMemberResultMsg msg = ocsWebServices.delGroupMember("8286597954190843777", "759073039");
//
//        ResultHeader resultHeader = msg.getResultHeader();
//
//        System.out.println(resultHeader.getResultCode());
//        System.out.println(resultHeader.getResultDesc());
//
//        resultHeader = ocsWebServices.deactivateGroup("8286597954190843777").getResultHeader();
//
//        System.out.println(resultHeader.getResultCode());
//        System.out.println(resultHeader.getResultDesc());
//    }
//
//    
//    public void test() throws ServiceException, RemoteException {
//        OCSWebMethods ocsWebMethods = new OCSWebMethods("172.27.122.45", "9002");
//
//        assertEquals("405000000", ocsWebMethods.queryBalance("750376961", "VOL-CHECK").getResultHeader().getResultCode());
//    }
}
