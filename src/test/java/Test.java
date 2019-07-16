
import com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResult;
import com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItem;
import com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail;
import com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultMsg;
import com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import org.ibm.ws.OCSWebServices;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Benjamin
 */
public class Test {

    public static void main(String[] args) throws RemoteException, ServiceException {

        QueryFreeUnitResultMsg queryFreeUnit = new OCSWebServices("172.27.122.45", "9002").queryFreeUnit("750376961");

        ResultHeader resultHeader = queryFreeUnit.getResultHeader();

        System.out.println(resultHeader.getResultCode());
        System.out.println(resultHeader.getResultDesc());

        QueryFreeUnitResult queryFreeUnitResult = queryFreeUnit.getQueryFreeUnitResult();
        QueryFreeUnitResultFreeUnitItem[] freeUnitItem = queryFreeUnitResult.getFreeUnitItem();

        for (QueryFreeUnitResultFreeUnitItem item : freeUnitItem) {
            long currentAmount = 0;
            String effectiveTime = "x", expireTime = "x";

            if (item.getMeasureUnitName().equals("Bytes")) {

                QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail[] freeUnitItemDetail = item.getFreeUnitItemDetail();

                for (QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail detail : freeUnitItemDetail) {
                    currentAmount = detail.getCurrentAmount();
                    effectiveTime = detail.getEffectiveTime();
                    expireTime = detail.getExpireTime();
                }

                System.out.println(item.getFreeUnitTypeName() + " " + ((currentAmount / 1024) / 1024) / 1024 + " GB. Start >> " + effectiveTime + " | End >> " + expireTime);
            }
        }

        //System.out.println(generateRandomKey().getBytes().length);
        //System.out.println("F-7549174330096025564".getBytes().length);
    }

//        private static  String generateRandomKey() {
//
//        char alphaNumeral[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
//            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
//            'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
//            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0'};
//        Random random = new Random();
//
//        return alphaNumeral[random.nextInt(alphaNumeral.length)] + "" + random.nextLong();
}
