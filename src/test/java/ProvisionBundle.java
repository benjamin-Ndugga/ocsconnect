
import com.huawei.www.bme.cbsinterface.cbs.businessmgr.SubscribeAppendantProductRequestProduct;
import com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode;
import com.huawei.www.bme.cbsinterface.common.ResultHeader;
import java.rmi.RemoteException;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.rpc.ServiceException;
import org.ibm.ws.OCSWebMethods;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 2308156
 */
public class ProvisionBundle implements Consumer<String> {

    private final OCSWebMethods methods;

    public ProvisionBundle() throws ServiceException {

        methods = new OCSWebMethods("172.27.122.45", "9002");
    }

    @Override
    public void accept(String t) {

        try {
            String[] splitLine = t.split("\\t");

            String msisdn = splitLine[0];
            String producId = splitLine[1];
            String bundle = splitLine[2];

            //System.out.println(msisdn + " | " + bundle + " | "+producId);
            
            SubscribeAppendantProductRequestProduct product = new SubscribeAppendantProductRequestProduct();
            product.setId(producId);
            product.setValidMode(ValidMode.value1);

            SubscribeAppendantProductRequestProduct[] productList = {product};

            ResultHeader resultHeader = methods.subscribeAppendantProduct(msisdn, productList, "IT_OFFICE_ATL_MN").getResultHeader();

            System.out.println(msisdn + " | " + bundle + " | " + resultHeader.getResultDesc() + " | " + resultHeader.getResultCode());

            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
