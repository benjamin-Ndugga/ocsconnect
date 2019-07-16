package org.ibm.ws;

import com.huawei.www.bme.cbsinterface.cbs.accountmgr.*;
import com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.*;
import com.huawei.www.bme.cbsinterface.cbs.businessmgr.*;
import com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.*;
import com.huawei.www.bme.cbsinterface.common.*;
import java.rmi.RemoteException;
import java.util.Random;
import javax.xml.rpc.ServiceException;

/**
 * <em>Service Endpoint Interface To OCS 5.5</em>
 *
 * @author BENJI IBM
 */
public class OCSWebMethods {

    private final CBSInterfaceAccountMgr portAccMgr;
    private final CBSInterfaceBusinessMgr portBizMgr;
    private String serialNo;
    private static final String USER = "dse";
    private static final String PASS = "QWer12#$";

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public OCSWebMethods(String ipAddress, String port) throws ServiceException {
        CBSInterfaceAccountMgrServiceLocator accMgrlocator = new CBSInterfaceAccountMgrServiceLocator();
        accMgrlocator.setCBSInterfaceAccountMgrServicePortEndpointAddress("https://" + ipAddress + ":" + port + "/services/CBSInterfaceAccountMgrService?wsdl");
        portAccMgr = accMgrlocator.getCBSInterfaceAccountMgrServicePort();

        CBSInterfaceBusinessMgrServiceLocator bizlocator = new CBSInterfaceBusinessMgrServiceLocator();
        bizlocator.setCBSInterfaceBusinessMgrServicePortEndpointAddress("https://" + ipAddress + ":" + port + "/services/CBSInterfaceBusinessMgrService?wsdl");
        portBizMgr = bizlocator.getCBSInterfaceBusinessMgrServicePort();
    }

    /**
     *
     * @param msisdn
     * @param accountType
     * @param operatorId
     * @param amount
     * @param serNo
     * @return
     * @throws RemoteException
     */
    public AdjustAccountResultMsg adjustAccount(String msisdn, String accountType, String operatorId, long amount, String serNo) throws RemoteException {
        AdjustAccountRequestMsg adjustAccountRequestMsg = new AdjustAccountRequestMsg();

        RequestHeader requestHeader = createRequestHeader("AdjustAccount", operatorId, serNo);

        adjustAccountRequestMsg.setRequestHeader(requestHeader);

        AdjustAccountRequest adjustAccountRequest = new AdjustAccountRequest();
        adjustAccountRequest.setSubscriberNo(msisdn);
        adjustAccountRequest.setOperateType(2);

        ModifyAcctFeeType modifyAcctFeeType = new ModifyAcctFeeType();
        modifyAcctFeeType.setAccountType(accountType);
        modifyAcctFeeType.setCurrAcctChgAmt(amount);

        ModifyAcctFeeType[] modifyAcctFeeList = new ModifyAcctFeeType[]{modifyAcctFeeType};

        //AdjustAccountRequestModifyAcctFeeList adjustAccountRequestModifyAcctFeeList = new AdjustAccountRequestModifyAcctFeeList();
        //adjustAccountRequestModifyAcctFeeList.setModifyAcctFee(modifyAcctFeeList);
        //adjustAccountRequest.setModifyAcctFeeList(adjustAccountRequestModifyAcctFeeList);
        adjustAccountRequest.setModifyAcctFeeList(modifyAcctFeeList);

        adjustAccountRequestMsg.setAdjustAccountRequest(adjustAccountRequest);

        return portAccMgr.adjustAccount(adjustAccountRequestMsg);

    }

    public AdjustAccountResultMsg adjustAccount(String msisdn, String accountType, String operatorId, long amount) throws RemoteException {
        AdjustAccountRequestMsg adjustAccountRequestMsg = new AdjustAccountRequestMsg();

        RequestHeader requestHeader = createRequestHeader("AdjustAccount", operatorId);

        adjustAccountRequestMsg.setRequestHeader(requestHeader);

        AdjustAccountRequest adjustAccountRequest = new AdjustAccountRequest();
        adjustAccountRequest.setSubscriberNo(msisdn);
        adjustAccountRequest.setOperateType(2);

        ModifyAcctFeeType modifyAcctFeeType = new ModifyAcctFeeType();
        modifyAcctFeeType.setAccountType(accountType);
        modifyAcctFeeType.setCurrAcctChgAmt(amount);

        ModifyAcctFeeType[] modifyAcctFeeList = new ModifyAcctFeeType[]{modifyAcctFeeType};

        //AdjustAccountRequestModifyAcctFeeList adjustAccountRequestModifyAcctFeeList = new AdjustAccountRequestModifyAcctFeeList();
        //adjustAccountRequestModifyAcctFeeList.setModifyAcctFee(modifyAcctFeeList);
        //adjustAccountRequest.setModifyAcctFeeList(adjustAccountRequestModifyAcctFeeList);
        adjustAccountRequest.setModifyAcctFeeList(modifyAcctFeeList);

        adjustAccountRequestMsg.setAdjustAccountRequest(adjustAccountRequest);

        return portAccMgr.adjustAccount(adjustAccountRequestMsg);

    }

    /**
     *
     * Adjusts the balance on the Account Type specified stating its expire time
     *
     * @param msisdn the number whose balance is to be adjusted
     * @param accountType the account type that will be adjusted
     * @param operatorId the operator Id for this transaction
     * @param amount the amount to adjust it could be -Ve ot +Ve
     * @param expireTime the expire Time for this product
     *
     * @return the XML representation for this adjust transaction result
     *
     * @throws RemoteException
     */
//    public AdjustAccountResultMsg adjustAccount(String msisdn, String accountType, String operatorId, long amount, String expireTime) throws RemoteException {
//        AdjustAccountRequestMsg adjustAccountRequestMsg = new AdjustAccountRequestMsg();
//
//        RequestHeader requestHeader = createRequestHeader("AdjustAccount", operatorId);
//
//        adjustAccountRequestMsg.setRequestHeader(requestHeader);
//
//        AdjustAccountRequest adjustAccountRequest = new AdjustAccountRequest();
//        adjustAccountRequest.setSubscriberNo(msisdn);
//        adjustAccountRequest.setOperateType(2);
//
//        ModifyAcctFeeType modifyAcctFeeType = new ModifyAcctFeeType();
//        modifyAcctFeeType.setAccountType(accountType);
//        modifyAcctFeeType.setCurrAcctChgAmt(amount);
//        modifyAcctFeeType.setExpireTime(expireTime);
//
//        ModifyAcctFeeType[] modifyAcctFeeList = new ModifyAcctFeeType[]{modifyAcctFeeType};
//
//        //AdjustAccountRequestModifyAcctFeeList adjustAccountRequestModifyAcctFeeList = new AdjustAccountRequestModifyAcctFeeList();
//        //adjustAccountRequestModifyAcctFeeList.setModifyAcctFee(modifyAcctFeeList);
//        adjustAccountRequest.setModifyAcctFeeList(modifyAcctFeeList);
//        adjustAccountRequestMsg.setAdjustAccountRequest(adjustAccountRequest);
//
//        return portAccMgr.adjustAccount(adjustAccountRequestMsg);
//
//    }
    /**
     * This Queries the balance of a Prepaid Subscriber
     *
     * @param msisdn the prepaid subscriber's number
     * @param operatorId
     * @return QueryBalanceResultMsg
     * @throws RemoteException
     */
    public QueryBalanceResultMsg queryBalance(String msisdn, String operatorId) throws RemoteException {
        QueryBalanceRequestMsg queryBalanceRequestMsg = new QueryBalanceRequestMsg();

        RequestHeader requestHeader = createRequestHeader("QueryBalance", operatorId);

        queryBalanceRequestMsg.setRequestHeader(requestHeader);

        QueryBalanceRequest queryBalanceRequest = new QueryBalanceRequest();
        queryBalanceRequest.setSubscriberNo(msisdn);

        queryBalanceRequestMsg.setQueryBalanceRequest(queryBalanceRequest);
        return portAccMgr.queryBalance(queryBalanceRequestMsg);
    }

    /**
     ** <em>valid mode is set to 4050003 if the expiry parameter is passed</em>
     *
     * @param msisdn
     * @param productList
     * @param operatorID
     * @return
     * @throws RemoteException
     */
    public SubscribeAppendantProductResultMsg subscribeAppendantProduct(String msisdn, SubscribeAppendantProductRequestProduct[] productList, String operatorID) throws RemoteException {

        SubscribeAppendantProductRequestMsg subscribeAppendantProductRequestMsg = new SubscribeAppendantProductRequestMsg();

        RequestHeader requestHeader = createRequestHeader("SubscribeAppendantProduct", operatorID);
        subscribeAppendantProductRequestMsg.setRequestHeader(requestHeader);

        SubscribeAppendantProductRequest subscribeAppendantProductRequest = new SubscribeAppendantProductRequest();
        subscribeAppendantProductRequest.setSubscriberNo(msisdn);

        subscribeAppendantProductRequest.setProduct(productList);

        subscribeAppendantProductRequestMsg.setSubscribeAppendantProductRequest(subscribeAppendantProductRequest);

        return portBizMgr.subscribeAppendantProduct(subscribeAppendantProductRequestMsg);
    }

    public SubscribeAppendantProductResultMsg subscribeAppendantProduct(String msisdn, SubscribeAppendantProductRequestProduct[] productList, String operatorID, String serNo) throws RemoteException {

        SubscribeAppendantProductRequestMsg subscribeAppendantProductRequestMsg = new SubscribeAppendantProductRequestMsg();

        RequestHeader requestHeader = createRequestHeader("SubscribeAppendantProduct", operatorID, serNo);
        subscribeAppendantProductRequestMsg.setRequestHeader(requestHeader);

        SubscribeAppendantProductRequest subscribeAppendantProductRequest = new SubscribeAppendantProductRequest();
        subscribeAppendantProductRequest.setSubscriberNo(msisdn);

        subscribeAppendantProductRequest.setProduct(productList);

        subscribeAppendantProductRequestMsg.setSubscribeAppendantProductRequest(subscribeAppendantProductRequest);

        return portBizMgr.subscribeAppendantProduct(subscribeAppendantProductRequestMsg);
    }

    /**
     *
     * @param msisdn
     * @param productId
     * @param operatorId
     * @return
     * @throws RemoteException
     */
    public ResultHeader changeAppendantProduct(String msisdn, String productId, String operatorId) throws RemoteException {
        ChangeAppendantProductRequestMsg changeAppendantProductRequestMsg = new ChangeAppendantProductRequestMsg();

        RequestHeader requestHeader = createRequestHeader("ChangeAppendantProduct", operatorId);
        changeAppendantProductRequestMsg.setRequestHeader(requestHeader);

        ChangeAppendantProductRequest changeAppendantProductRequest = new ChangeAppendantProductRequest();
        changeAppendantProductRequest.setSubscriberNo(msisdn);

        ChangeAppendantProductRequestProduct product = new ChangeAppendantProductRequestProduct();
        product.setId(productId);
        product.setOperationType(ProductOperationType.value2);//deletes appendant Product
        product.setValidMode(ValidMode.value1);

        ChangeAppendantProductRequestProduct[] productList = {product};

        changeAppendantProductRequest.setProduct(productList);

        changeAppendantProductRequestMsg.setChangeAppendantProductRequest(changeAppendantProductRequest);

        return portBizMgr.changeAppendantProduct(changeAppendantProductRequestMsg).getResultHeader();

    }

    public ResultHeader addAppendantProduct(String msisdn, String productId, String operatorId) throws RemoteException {
        ChangeAppendantProductRequestMsg changeAppendantProductRequestMsg = new ChangeAppendantProductRequestMsg();

        RequestHeader requestHeader = createRequestHeader("ChangeAppendantProduct", operatorId);
        changeAppendantProductRequestMsg.setRequestHeader(requestHeader);

        ChangeAppendantProductRequest changeAppendantProductRequest = new ChangeAppendantProductRequest();
        changeAppendantProductRequest.setSubscriberNo(msisdn);

        ChangeAppendantProductRequestProduct product = new ChangeAppendantProductRequestProduct();
        product.setId(productId);
        product.setOperationType(ProductOperationType.value1);//adds appendant Product
        product.setValidMode(ValidMode.value1);

        ChangeAppendantProductRequestProduct[] productList = {product};

        changeAppendantProductRequest.setProduct(productList);

        changeAppendantProductRequestMsg.setChangeAppendantProductRequest(changeAppendantProductRequest);

        return portBizMgr.changeAppendantProduct(changeAppendantProductRequestMsg).getResultHeader();

    }

    /**
     *
     * @param msisdn
     * @param newProdId
     * @param operatorId
     * @return
     * @throws RemoteException
     */
    public ChangeMainProdResultMsg changeMainProduct(String msisdn, String newProdId, String operatorId) throws RemoteException {

        ChangeMainProdRequestMsg changeMainProdRequestMsg = new ChangeMainProdRequestMsg();

        RequestHeader requestHeader = createRequestHeader("ChangeMainProd", operatorId);

        changeMainProdRequestMsg.setRequestHeader(requestHeader);

        ChangeMainProdRequest changeMainProdRequest = new ChangeMainProdRequest();
        changeMainProdRequest.setSubscriberNo(msisdn);
        changeMainProdRequest.setNewMainProductId(newProdId);
        changeMainProdRequest.setValidMode(ValidMode.value1);

        changeMainProdRequestMsg.setChangeMainProdRequest(changeMainProdRequest);

        return portBizMgr.changeMainProd(changeMainProdRequestMsg);
    }

    public ResultHeader blockSubscriber(String msisdn, String operatorId) throws RemoteException {
        BlockSubscriberRequestMsg blockSubscriberRequestMsg = new BlockSubscriberRequestMsg();

        RequestHeader requestHeader = createRequestHeader("BlockSubscriber", operatorId);
        blockSubscriberRequestMsg.setRequestHeader(requestHeader);

        BlockSubscriberRequest blockSubscriberRequest = new BlockSubscriberRequest();
        blockSubscriberRequest.setSubscriberNo(msisdn);
        blockSubscriberRequest.setOperationType(1);

        blockSubscriberRequestMsg.setBlockSubscriberRequest(blockSubscriberRequest);

        return portBizMgr.blockSubscriber(blockSubscriberRequestMsg).getResultHeader();
    }

    /**
     *
     * @param msisdn
     * @param operatorId
     * @return
     * @throws RemoteException
     */
    public ResultHeader unBlockSubscriber(String msisdn, String operatorId) throws RemoteException {

        BlockSubscriberRequestMsg blockSubscriberRequestMsg = new BlockSubscriberRequestMsg();

        RequestHeader requestHeader = createRequestHeader("BlockSubscriber", operatorId);
        blockSubscriberRequestMsg.setRequestHeader(requestHeader);

        BlockSubscriberRequest blockSubscriberRequest = new BlockSubscriberRequest();
        blockSubscriberRequest.setSubscriberNo(msisdn);
        blockSubscriberRequest.setOperationType(0);

        blockSubscriberRequestMsg.setBlockSubscriberRequest(blockSubscriberRequest);

        return portBizMgr.blockSubscriber(blockSubscriberRequestMsg).getResultHeader();
    }

    /**
     *
     * @param msisdn
     * @param StartTime
     * @param EndTime
     * @param operatorId
     * @return
     * @throws RemoteException
     */
    public QueryAdjustmentLogResultMsg queryAdjustmentLog(String msisdn, String StartTime, String EndTime, String operatorId) throws RemoteException {
        QueryAdjustmentLogRequestMsg queryAdjustmentLogRequestMsg = new QueryAdjustmentLogRequestMsg();

        RequestHeader requestHeader = createRequestHeader("QueryAdjustmentLog", operatorId);
        queryAdjustmentLogRequestMsg.setRequestHeader(requestHeader);

        QueryAdjustmentLogRequest queryAdjustmentLogRequest = new QueryAdjustmentLogRequest();
        queryAdjustmentLogRequest.setSubscriberNo(msisdn);
        queryAdjustmentLogRequest.setStartTime(StartTime);
        queryAdjustmentLogRequest.setEndTime(EndTime);

        queryAdjustmentLogRequestMsg.setQueryAdjustmentLogRequest(queryAdjustmentLogRequest);

        return portAccMgr.queryAdjustmentLog(queryAdjustmentLogRequestMsg);
    }

    public TransferAccountResultMsg transferAccount(String transferorMsisdn, String transfereeMsisdn, ModifyAcctFeeType account, String operatorId) throws RemoteException {
        TransferAccountRequestMsg transferAccountRequestMsg = new TransferAccountRequestMsg();
        RequestHeader requestHeader = createRequestHeader("TransferAccount", operatorId);

        transferAccountRequestMsg.setRequestHeader(requestHeader);

        TransferAccountRequest transferAccountRequest = new TransferAccountRequest();
        transferAccountRequest.setHandlingChargeFlag(0);
        transferAccountRequest.setTransferorNo(transferorMsisdn);
        transferAccountRequest.setTransfereeNo(transfereeMsisdn);
        /**
         * The transfer type below means that the account balance of both
         * transferor and transferee exist in OCS (same OCS)
         */
        transferAccountRequest.setTransferType(2);
        //TransferAccountRequestModifyAcctFeeList transferAccountRequestModifyAcctFeeList = new TransferAccountRequestModifyAcctFeeList();

        //ModifyAcctFeeType account = new ModifyAcctFeeType();
        //account.setAccountType("2000");
        //account.setCurrAcctChgAmt(amount);
        ModifyAcctFeeType modifyAcctFeeType[] = {account};
        //transferAccountRequestModifyAcctFeeList.setModifyAcctFee(modifyAcctFeeType);

        //transferAccountRequest.setModifyAcctFeeList(transferAccountRequestModifyAcctFeeList);
        transferAccountRequest.setModifyAcctFeeList(modifyAcctFeeType);

        transferAccountRequestMsg.setTransferAccountRequest(transferAccountRequest);

        return portAccMgr.transferAccount(transferAccountRequestMsg);
    }

    public TransferAccountResultMsg transferAccount(String transferorMsisdn, String transfereeMsisdn, ModifyAcctFeeType account, String operatorId, int chargeHandlingFlag) throws RemoteException {
        TransferAccountRequestMsg transferAccountRequestMsg = new TransferAccountRequestMsg();
        RequestHeader requestHeader = createRequestHeader("TransferAccount", operatorId);

        transferAccountRequestMsg.setRequestHeader(requestHeader);

        TransferAccountRequest transferAccountRequest = new TransferAccountRequest();
        transferAccountRequest.setHandlingChargeFlag(chargeHandlingFlag);
        transferAccountRequest.setTransferorNo(transferorMsisdn);
        transferAccountRequest.setTransfereeNo(transfereeMsisdn);
        /**
         * The transfer type below means that the account balance of both
         * transferor and transferee exist in OCS (same OCS)
         */
        transferAccountRequest.setTransferType(2);
        //TransferAccountRequestModifyAcctFeeList transferAccountRequestModifyAcctFeeList = new TransferAccountRequestModifyAcctFeeList();

        //ModifyAcctFeeType account = new ModifyAcctFeeType();
        //account.setAccountType("2000");
        //account.setCurrAcctChgAmt(amount);
        ModifyAcctFeeType modifyAcctFeeType[] = {account};
        //transferAccountRequestModifyAcctFeeList.setModifyAcctFee(modifyAcctFeeType);

        //transferAccountRequest.setModifyAcctFeeList(transferAccountRequestModifyAcctFeeList);
        transferAccountRequest.setModifyAcctFeeList(modifyAcctFeeType);

        transferAccountRequestMsg.setTransferAccountRequest(transferAccountRequest);

        return portAccMgr.transferAccount(transferAccountRequestMsg);
    }

    public ResultHeader transferAccount(String transferorMsisdn, String transfereeMsisdn, long amount, String operatorId) throws RemoteException {
        TransferAccountRequestMsg transferAccountRequestMsg = new TransferAccountRequestMsg();
        RequestHeader requestHeader = createRequestHeader("TransferAccount", operatorId);

        transferAccountRequestMsg.setRequestHeader(requestHeader);

        TransferAccountRequest transferAccountRequest = new TransferAccountRequest();
        transferAccountRequest.setHandlingChargeFlag(0);
        transferAccountRequest.setTransferorNo(transferorMsisdn);
        transferAccountRequest.setTransfereeNo(transfereeMsisdn);
        /**
         * The transfer type below means that the account balance of both
         * transferor and transferee exist in OCS (same OCS)
         */
        transferAccountRequest.setTransferType(2);
        //TransferAccountRequestModifyAcctFeeList transferAccountRequestModifyAcctFeeList = new TransferAccountRequestModifyAcctFeeList();

        ModifyAcctFeeType account = new ModifyAcctFeeType();
        account.setAccountType("2000");
        account.setCurrAcctChgAmt(amount);

        ModifyAcctFeeType modifyAcctFeeType[] = {account};
        //transferAccountRequestModifyAcctFeeList.setModifyAcctFee(modifyAcctFeeType);

        //transferAccountRequest.setModifyAcctFeeList(transferAccountRequestModifyAcctFeeList);
        transferAccountRequest.setModifyAcctFeeList(modifyAcctFeeType);

        transferAccountRequestMsg.setTransferAccountRequest(transferAccountRequest);

        return portAccMgr.transferAccount(transferAccountRequestMsg).getResultHeader();
    }

    public TransferAccountResultMsg transferSubscriberAccount(String transferorMsisdn, String transfereeMsisdn, long amount, String operatorid) throws RemoteException {

        TransferAccountRequestMsg transferAccountRequestMsg = new TransferAccountRequestMsg();
        RequestHeader requestHeader = createRequestHeader("TransferAccount", operatorid);

        transferAccountRequestMsg.setRequestHeader(requestHeader);

        TransferAccountRequest transferAccountRequest = new TransferAccountRequest();
        transferAccountRequest.setHandlingChargeFlag(0);
        transferAccountRequest.setTransferorNo(transferorMsisdn);
        transferAccountRequest.setTransfereeNo(transfereeMsisdn);
        /**
         * The transfer type below means that the account balance of both
         * transferor and transferee exist in OCS (same OCS)
         */

        transferAccountRequest.setTransferType(2);
        //no charge this transaction of transfer
        transferAccountRequest.setHandlingChargeFlag(0);
        //TransferAccountRequestModifyAcctFeeList transferAccountRequestModifyAcctFeeList = new TransferAccountRequestModifyAcctFeeList();

        ModifyAcctFeeType account = new ModifyAcctFeeType();
        account.setAccountType("2000");//main account
        account.setCurrAcctChgAmt(amount);

        ModifyAcctFeeType modifyAcctFeeType[] = {account};
        //transferAccountRequestModifyAcctFeeList.setModifyAcctFee(modifyAcctFeeType);

        //transferAccountRequest.setModifyAcctFeeList(transferAccountRequestModifyAcctFeeList);
        transferAccountRequest.setModifyAcctFeeList(modifyAcctFeeType);

        transferAccountRequestMsg.setTransferAccountRequest(transferAccountRequest);

        return portAccMgr.transferAccount(transferAccountRequestMsg);
    }

    /**
     *
     * @param msisdn
     * @param startTime
     * @param endTime
     * @param operatorId
     * @return
     * @throws RemoteException
     */
    public QueryTransferLogResultMsg queryTransferLog(String msisdn, String startTime, String endTime, String operatorId) throws RemoteException {
        QueryTransferLogRequestMsg queryTransferLogRequestMsg = new QueryTransferLogRequestMsg();
        RequestHeader requestHeader = createRequestHeader("QueryTransferLog", operatorId);
        queryTransferLogRequestMsg.setRequestHeader(requestHeader);

        QueryTransferLogRequest queryTransferLogRequest = new QueryTransferLogRequest();

        queryTransferLogRequest.setSubscriberNo(msisdn);
        queryTransferLogRequest.setStartTime(startTime);
        queryTransferLogRequest.setEndTime(endTime);

        queryTransferLogRequestMsg.setQueryTransferLogRequest(queryTransferLogRequest);

        return portAccMgr.queryTransferLog(queryTransferLogRequestMsg);
    }

    public ActiveFirstResultMsg activeFirst(String msisdn, int access_method, String operatorId) throws RemoteException {
        ActiveFirstRequestMsg activeFirstRequestMsg = new ActiveFirstRequestMsg();
        RequestHeader requestHeader = createRequestHeader("ActiveFirst", operatorId);

        activeFirstRequestMsg.setRequestHeader(requestHeader);
        ActiveFirstRequest activeFirstRequest = new ActiveFirstRequest();

        activeFirstRequest.setSubscriberNo(msisdn);
        activeFirstRequest.setAccessMethod(access_method);

        activeFirstRequestMsg.setActiveFirstRequest(activeFirstRequest);

        return portAccMgr.activeFirst(activeFirstRequestMsg);
    }

    /**
     * Queries OCS for the Account Information of the Subscriber. Information
     * includes MAIN PRODUCT ID (SubcosID) Language Type, Account state
     *
     * @param msisdn the subscriber's msisdn being queried
     * @return QueryAcntInfoResult the contains the information mentioned above
     * @throws RemoteException
     */
//    public QueryAcntInfoResult queyAccntInfo(String msisdn) throws RemoteException {
//        QueryAcntInfoRequestMsg queryAcntInfoRequestMsg = new QueryAcntInfoRequestMsg();
//        RequestHeader requestHeader = createRequestHeader("QueryAcntInfo", OPERATOR_ID);
//
//        queryAcntInfoRequestMsg.setRequestHeader(requestHeader);
//
//        QueryAcntInfoRequest queryAcntInfoRequest = new QueryAcntInfoRequest();
//        queryAcntInfoRequest.setSubscriberNo(msisdn);
//
//        queryAcntInfoRequestMsg.setQueryAcntInfoRequest(queryAcntInfoRequest);
//
//        return portBizMgr.queryAcntInfo(queryAcntInfoRequestMsg).getQueryAcntInfoResult();
//
//    }//end 
//    
//    public QueryAcntInfoResultMsg querySubscriberAccntInfo(String msisdn) throws RemoteException {
//        QueryAcntInfoRequestMsg queryAcntInfoRequestMsg = new QueryAcntInfoRequestMsg();
//        RequestHeader requestHeader = createRequestHeader("QueryAcntInfo", OPERATOR_ID);
//
//        queryAcntInfoRequestMsg.setRequestHeader(requestHeader);
//
//        QueryAcntInfoRequest queryAcntInfoRequest = new QueryAcntInfoRequest();
//        queryAcntInfoRequest.setSubscriberNo(msisdn);
//
//        queryAcntInfoRequestMsg.setQueryAcntInfoRequest(queryAcntInfoRequest);
//
//        return portBizMgr.queryAcntInfo(queryAcntInfoRequestMsg);
//
//    }//end 
//    public QueryAcntInfoResultMsg queryAccountInfo(String msisdn) throws RemoteException {
//        QueryAcntInfoRequestMsg queryAcntInfoRequestMsg = new QueryAcntInfoRequestMsg();
//        RequestHeader requestHeader = createRequestHeader("QueryAcntInfo", OPERATOR_ID);
//
//        queryAcntInfoRequestMsg.setRequestHeader(requestHeader);
//
//        QueryAcntInfoRequest queryAcntInfoRequest = new QueryAcntInfoRequest();
//        queryAcntInfoRequest.setSubscriberNo(msisdn);
//
//        queryAcntInfoRequestMsg.setQueryAcntInfoRequest(queryAcntInfoRequest);
//
//        return portBizMgr.queryAcntInfo(queryAcntInfoRequestMsg);
//    }//end 
//    public QueryBonusAcctResultMsg queryBonusAccount(String msisdn) throws RemoteException {
//        QueryBonusAcctRequestMsg queryBonusAcctRequestMsg = new QueryBonusAcctRequestMsg();
//
//        RequestHeader requestHeader = createRequestHeader("QueryBonusAcct", OPERATOR_ID);
//        queryBonusAcctRequestMsg.setRequestHeader(requestHeader);
//
//        QueryBonusAcctRequest queryBonusAcctRequest = new QueryBonusAcctRequest();
//        queryBonusAcctRequest.setSubscriberNo(msisdn);
//
//        queryBonusAcctRequestMsg.setQueryBonusAcctRequest(queryBonusAcctRequest);
//
//        return portAccMgr.queryBonusAcct(queryBonusAcctRequestMsg);
//    }
//    public QueryBonusAcctResultMsg querySubscriberBonusAccount(String msisdn) throws RemoteException {
//        QueryBonusAcctRequestMsg queryBonusAcctRequestMsg = new QueryBonusAcctRequestMsg();
//
//        RequestHeader requestHeader = createRequestHeader("QueryBonusAcct", OPERATOR_ID);
//        queryBonusAcctRequestMsg.setRequestHeader(requestHeader);
//
//        QueryBonusAcctRequest queryBonusAcctRequest = new QueryBonusAcctRequest();
//        queryBonusAcctRequest.setSubscriberNo(msisdn);
//
//        queryBonusAcctRequestMsg.setQueryBonusAcctRequest(queryBonusAcctRequest);
//
//        return portAccMgr.queryBonusAcct(queryBonusAcctRequestMsg);
//    }
    /**
     *
     * @param msisdn
     * @param state here are the states 1.suspend 2.reconnect 3.Claim missing 4.
     * Disclaim missing 5.Initiated by Operator 6.Activate Post Paid Acc
     * 7.suspend post-paid Account
     *
     * @return
     * @throws RemoteException
     */
    public ResultHeader modifySubscriberState(String msisdn, int state, String operatorId) throws RemoteException {

        ModifySubscriberStateRequestMsg modifySubscriberStateRequestMsg = new ModifySubscriberStateRequestMsg();
        RequestHeader requestHeader = createRequestHeader("ModifySubscriberState", operatorId);
        modifySubscriberStateRequestMsg.setRequestHeader(requestHeader);

        ModifySubscriberStateRequest modifySubscriberStateRequest = new ModifySubscriberStateRequest();
        modifySubscriberStateRequest.setSubscriberNo(msisdn);
        modifySubscriberStateRequest.setOperateType(state);

        modifySubscriberStateRequestMsg.setModifySubscriberStateRequest(modifySubscriberStateRequest);
        return portBizMgr.modifySubscriberState(modifySubscriberStateRequestMsg).getResultHeader();
    }

    /**
     * un-subscribes a product from user profile
     *
     * @param msisdn
     * @param productList
     * @param productId
     * @param operatorId
     * @return
     * @throws RemoteException
     */
    public UnSubscribeAppendantProductResultMsg unsubscribeAppendantProduct(String msisdn, UnSubscribeAppendantProductRequestProduct productList[], String operatorId) throws RemoteException {
        UnSubscribeAppendantProductRequestMsg unSubscribeAppendantProductRequestMsg = new UnSubscribeAppendantProductRequestMsg();
        RequestHeader requestHeader = createRequestHeader("UnSubscribeAppendantProduct", operatorId);
        unSubscribeAppendantProductRequestMsg.setRequestHeader(requestHeader);

        UnSubscribeAppendantProductRequest unSubscribeAppendantProductRequest = new UnSubscribeAppendantProductRequest();
        unSubscribeAppendantProductRequest.setSubscriberNo(msisdn);

//        UnSubscribeAppendantProductRequestProduct product = new UnSubscribeAppendantProductRequestProduct();
//        product.setProductID(productId);
//        product.setValidMode(ValidMode._value1);
//        UnSubscribeAppendantProductRequestProduct productList[] = {product};
        unSubscribeAppendantProductRequest.setProduct(productList);
        unSubscribeAppendantProductRequestMsg.setUnSubscribeAppendantProductRequest(unSubscribeAppendantProductRequest);

        return portBizMgr.unSubscribeAppendantProduct(unSubscribeAppendantProductRequestMsg);

    }

//    public QueryProfileResultMsg queryProfile(String msisdn) throws RemoteException {
//        QueryProfileRequestMsg queryProfileRequestMsg = new QueryProfileRequestMsg();
//
//        RequestHeader requestHeader = createRequestHeader("QueryProfile", OPERATOR_ID);
//        queryProfileRequestMsg.setRequestHeader(requestHeader);
//        QueryProfileRequest queryProfileRequest = new QueryProfileRequest();
//        queryProfileRequest.setSubscriberNo(msisdn);
//        queryProfileRequestMsg.setQueryProfileRequest(queryProfileRequest);
//
//        return portBizMgr.queryProfile(queryProfileRequestMsg);
//    }
    public QuerySubscriberProductInfoResultMsg querySubscriberProductInfo(String msisdn, String productId, String operatorId) throws RemoteException {
        QuerySubscriberProductInfoRequestMsg querySubscriberProductInfoRequestMsg = new QuerySubscriberProductInfoRequestMsg();
        RequestHeader requestHeader = createRequestHeader("QuerySubscriberProductInfo", operatorId);

        querySubscriberProductInfoRequestMsg.setRequestHeader(requestHeader);

        QuerySubscriberProductInfoRequest querySubscriberProductInfoRequest = new QuerySubscriberProductInfoRequest();
        querySubscriberProductInfoRequest.setSubscriberNo(msisdn);
        querySubscriberProductInfoRequest.setProductId(productId);

        querySubscriberProductInfoRequestMsg.setQuerySubscriberProductInfoRequest(querySubscriberProductInfoRequest);
        return portBizMgr.querySubscriberProductInfo(querySubscriberProductInfoRequestMsg);

    }//end of method

    public ResultHeader newSubscriber(String msisdn, String mainProductId, String operatorId) throws RemoteException {
        NewSubscriberRequestMsg newSubscriberRequestMsg = new NewSubscriberRequestMsg();

        RequestHeader requestHeader = createRequestHeader("NewSubscriber", operatorId);
        newSubscriberRequestMsg.setRequestHeader(requestHeader);

        NewSubscriberRequest newSubscriberRequest = new NewSubscriberRequest();
        newSubscriberRequest.setSubscriberNo(msisdn);

        NewSubscriberRequestSubscriber newSubscriberRequestSubscriber = new NewSubscriberRequestSubscriber();
        newSubscriberRequestSubscriber.setLang("1");
        newSubscriberRequestSubscriber.setUSSDLang("1");
        newSubscriberRequestSubscriber.setPaidMode(Paymode.value1);
        newSubscriberRequestSubscriber.setMainProductID(mainProductId);

        newSubscriberRequest.setSubscriber(newSubscriberRequestSubscriber);

        newSubscriberRequestMsg.setNewSubscriberRequest(newSubscriberRequest);

        return portBizMgr.newSubscriber(newSubscriberRequestMsg).getResultHeader();

    }

    public QueryBasicInfoResultMsg queryBasicInfo(String msisdn, String operatorId) throws RemoteException {
        QueryBasicInfoRequestMsg queryBasicInfoRequestMsg = new QueryBasicInfoRequestMsg();

        RequestHeader requestHeader = createRequestHeader("QueryBasicInfo", operatorId);

        queryBasicInfoRequestMsg.setRequestHeader(requestHeader);

        QueryBasicInfoRequest queryBasicInfoRequest = new QueryBasicInfoRequest();
        queryBasicInfoRequest.setSubscriberNo(msisdn);
        queryBasicInfoRequest.setQueryType(QueryBasicInfoRequestQueryType.value2);

        queryBasicInfoRequestMsg.setQueryBasicInfoRequest(queryBasicInfoRequest);

        return portBizMgr.queryBasicInfo(queryBasicInfoRequestMsg);

    }

    public ChangeSIMResultMsg changeSIM(String msisdn, String newIMSI, String oldIMSI, String operatorId) throws RemoteException {
        ChangeSIMRequestMsg changeSIMRequestMsg = new ChangeSIMRequestMsg();

        RequestHeader requestHeader = createRequestHeader("ChangeSIM", operatorId);

        changeSIMRequestMsg.setRequestHeader(requestHeader);

        ChangeSIMRequest changeSIMRequest = new ChangeSIMRequest();

        changeSIMRequest.setSubscriberNo(msisdn);
        changeSIMRequest.setNewIMSI(newIMSI);
        changeSIMRequest.setOldIMSI(oldIMSI);

        changeSIMRequestMsg.setChangeSIMRequest(changeSIMRequest);

        return portBizMgr.changeSIM(changeSIMRequestMsg);

    }

    public ManSubFamilyNoResultMsg addSubFamilyNo(String msisdn, String familyNo, String operatorId) throws RemoteException {

        RequestHeader requestHeader = createRequestHeader("ModifySubFamilyNo", operatorId);

        ManSubFamilyNoRequestMsg manSubFamilyNoRequestMsg = new ManSubFamilyNoRequestMsg();
        manSubFamilyNoRequestMsg.setRequestHeader(requestHeader);

        ManSubFamilyNoRequest manSubFamilyNoRequest = new ManSubFamilyNoRequest();
        manSubFamilyNoRequest.setSubscriberNo(msisdn);

        //create the family number
        ManSubFamilyNoRequestFamilyNoInfo familyNoInfo = new ManSubFamilyNoRequestFamilyNoInfo();
        familyNoInfo.setFamilyNo(familyNo);

        //add it to the Family Numbers List
        ManSubFamilyNoRequestFamilyNoInfo familyNosInfo[] = {familyNoInfo};
        manSubFamilyNoRequest.setFamilyNoInfo(familyNosInfo);
        manSubFamilyNoRequest.setOperationType(1);//adds the subscriber no.

        manSubFamilyNoRequestMsg.setManSubFamilyNoRequest(manSubFamilyNoRequest);

        return portBizMgr.manSubFamilyNo(manSubFamilyNoRequestMsg);
    }

    /**
     * This is the new OCS 5.5 Method for adding a child
     *
     * @param msisdn the parent line
     * @param child the child line
     * @return
     * @throws RemoteException
     */
    public ManParentChildResultMsg addChild(String msisdn, String child, String operatorId) throws RemoteException {

        ManParentChildRequestMsg mpcrm = new ManParentChildRequestMsg();

        RequestHeader requestHeader = createRequestHeader("ManParentChild", operatorId);

        mpcrm.setRequestHeader(requestHeader);

        ManParentChildRequest manParentChildRequest = new ManParentChildRequest();
        manParentChildRequest.setSubscriberNo(msisdn);
        manParentChildRequest.setOperationType(1);

        ManParentChildRequestChildSubscriberInfo childSubscriberInfo = new ManParentChildRequestChildSubscriberInfo();

        childSubscriberInfo.setChildSubNo(child);
        childSubscriberInfo.setChildSubType(3);
        childSubscriberInfo.setChildSubLimitAmt(0);
        childSubscriberInfo.setPayFormeVoiceFlag(0);
        childSubscriberInfo.setPayFormeSmsFlag(0);
        childSubscriberInfo.setMultiSurfFlag(1);

        manParentChildRequest.setChildSubscriberInfo(childSubscriberInfo);

        mpcrm.setManParentChildRequest(manParentChildRequest);

        return portBizMgr.manParentChild(mpcrm);
    }

    public ManSubFamilyNoResultMsg modifySubFamilyNo(String msisdn, String oldFamilyNo, String newFamilyNo, String operatorId) throws RemoteException {

        RequestHeader requestHeader = createRequestHeader("ModifySubFamilyNo", operatorId);

        ManSubFamilyNoRequestMsg manSubFamilyNoRequestMsg = new ManSubFamilyNoRequestMsg();
        manSubFamilyNoRequestMsg.setRequestHeader(requestHeader);

        ManSubFamilyNoRequest manSubFamilyNoRequest = new ManSubFamilyNoRequest();
        manSubFamilyNoRequest.setSubscriberNo(msisdn);

        //create the family number
        ManSubFamilyNoRequestFamilyNoInfo familyNoInfo = new ManSubFamilyNoRequestFamilyNoInfo();
        familyNoInfo.setFamilyNo(oldFamilyNo);
        familyNoInfo.setNewFamilyNo(newFamilyNo);

        //add it to the Family Numbers List
        ManSubFamilyNoRequestFamilyNoInfo familyNosInfo[] = {familyNoInfo};
        manSubFamilyNoRequest.setFamilyNoInfo(familyNosInfo);
        manSubFamilyNoRequest.setOperationType(3);

        manSubFamilyNoRequestMsg.setManSubFamilyNoRequest(manSubFamilyNoRequest);

        return portBizMgr.manSubFamilyNo(manSubFamilyNoRequestMsg);
    }

    public QuerySubFamilyNoResultMsg querySubFamilyNo(String msisdn, String operatorId) throws RemoteException {
        RequestHeader requestHeader = createRequestHeader("QuerySubFamilyNo", operatorId);

        QuerySubFamilyNoRequestMsg querySubFamilyNoRequestMsg = new QuerySubFamilyNoRequestMsg();
        querySubFamilyNoRequestMsg.setRequestHeader(requestHeader);

        QuerySubFamilyNoRequest querySubFamilyNoRequest = new QuerySubFamilyNoRequest();
        querySubFamilyNoRequest.setSubscriberNo(msisdn);

        querySubFamilyNoRequestMsg.setQuerySubFamilyNoRequest(querySubFamilyNoRequest);

        return portBizMgr.querySubFamilyNo(querySubFamilyNoRequestMsg);
    }

    public VoucherRechargeResultMsg voucherRecharge(String msisdn, String cardPinNumber, String operatorId) throws RemoteException {
        RequestHeader requestHeader = createRequestHeader("VoucherRecharge", operatorId);

        VoucherRechargeRequestMsg voucherRechargeRequestMsg = new VoucherRechargeRequestMsg();
        voucherRechargeRequestMsg.setRequestHeader(requestHeader);

        VoucherRechargeRequest voucherRechargeRequest = new VoucherRechargeRequest();
        voucherRechargeRequest.setSubscriberNo(msisdn);
        voucherRechargeRequest.setCardPinNumber(cardPinNumber);

        voucherRechargeRequestMsg.setVoucherRechargeRequest(voucherRechargeRequest);
        return portAccMgr.voucherRecharge(voucherRechargeRequestMsg);

    }//end of class

    public VoucherRechargeResultMsg VoucherRecharge(String msisdn, String cardPinNumber, String operatorId) throws RemoteException {
        RequestHeader requestHeader = createRequestHeader("VoucherRecharge", operatorId);

        VoucherRechargeRequestMsg voucherRechargeRequestMsg = new VoucherRechargeRequestMsg();
        voucherRechargeRequestMsg.setRequestHeader(requestHeader);

        VoucherRechargeRequest voucherRechargeRequest = new VoucherRechargeRequest();
        voucherRechargeRequest.setSubscriberNo(msisdn);
        voucherRechargeRequest.setCardPinNumber(cardPinNumber);

        voucherRechargeRequestMsg.setVoucherRechargeRequest(voucherRechargeRequest);
        return portAccMgr.voucherRecharge(voucherRechargeRequestMsg);

    }//end of class

    public VoucherRechargeResultMsg voucherRechargeSubscriber(String msisdn, String cardPinNumber, String operatorId) throws RemoteException {

        RequestHeader requestHeader = createRequestHeader("VoucherRecharge", operatorId);

        VoucherRechargeRequestMsg voucherRechargeRequestMsg = new VoucherRechargeRequestMsg();
        voucherRechargeRequestMsg.setRequestHeader(requestHeader);

        VoucherRechargeRequest voucherRechargeRequest = new VoucherRechargeRequest();
        voucherRechargeRequest.setSubscriberNo(msisdn);
        voucherRechargeRequest.setCardPinNumber(cardPinNumber);

        voucherRechargeRequestMsg.setVoucherRechargeRequest(voucherRechargeRequest);
        return portAccMgr.voucherRecharge(voucherRechargeRequestMsg);

    }

    /**
     * @param msisdn the number being queried
     * @param QueryType these below are the possible parameters and the
     * information they query
     * <ol>
     * <li>: Query all information</li>
     * <li>: Query subscriber state</li>
     * <li>: Query subscriber balance</li>
     * <li>: Query subscriber bill cycle date</li>
     * <li>: Query subscriber static information</li>
     * <li>: Query subscriber usage (usage cumulative information)</li>
     * <li>: Query the CUG that the subscriber subscribed</li>
     * <li>: Query subscriber additional information</li>
     * </ol>
     * <em>the default value is 0</em>
     * @param operatorId
     * @return
     * @throws java.rmi.RemoteException
     *
     */
    public IntegrationEnquiryResultMsg integrationEnquiry(String msisdn, String QueryType, String operatorId) throws RemoteException {

        RequestHeader requestHeader = createRequestHeader("IntegrationEnquiry", operatorId);

        IntegrationEnquiryRequestMsg integrationEnquiryRequestMsg = new IntegrationEnquiryRequestMsg();
        integrationEnquiryRequestMsg.setRequestHeader(requestHeader);

        IntegrationEnquiryRequest integrationEnquiryRequest = new IntegrationEnquiryRequest();
        integrationEnquiryRequest.setSubscriberNo(msisdn);

        if (QueryType.equals("1")) {
            integrationEnquiryRequest.setQueryType(IntegrationEnquiryRequestQueryType.value2);
        } else if (QueryType.equals("2")) {
            integrationEnquiryRequest.setQueryType(IntegrationEnquiryRequestQueryType.value3);
        } else if (QueryType.equals("3")) {
            integrationEnquiryRequest.setQueryType(IntegrationEnquiryRequestQueryType.value4);
        } else if (QueryType.equals("4")) {
            integrationEnquiryRequest.setQueryType(IntegrationEnquiryRequestQueryType.value5);
        } else if (QueryType.equals("5")) {
            integrationEnquiryRequest.setQueryType(IntegrationEnquiryRequestQueryType.value6);
        } else if (QueryType.equals("6")) {
            integrationEnquiryRequest.setQueryType(IntegrationEnquiryRequestQueryType.value7);
        } else if (QueryType.equals("7")) {
            integrationEnquiryRequest.setQueryType(IntegrationEnquiryRequestQueryType.value8);
        } else {
            integrationEnquiryRequest.setQueryType(IntegrationEnquiryRequestQueryType.value1);
        }
        integrationEnquiryRequestMsg.setIntegrationEnquiryRequest(integrationEnquiryRequest);

        return portBizMgr.integrationEnquiry(integrationEnquiryRequestMsg);
    }

    public ManParentChildResultMsg ManParentChild(String msisdn, String childSubNo, int childSubType, int limit, int operationType, String operatorId) throws RemoteException {

        RequestHeader requestHeader = createRequestHeader("ManParentChild", operatorId);

        ManParentChildRequestMsg manParentChildRequestMsg = new ManParentChildRequestMsg();

        manParentChildRequestMsg.setRequestHeader(requestHeader);

        ManParentChildRequest manParentChildRequest = new ManParentChildRequest();
        manParentChildRequest.setSubscriberNo(msisdn);
        manParentChildRequest.setOperationType(operationType);

        ManParentChildRequestChildSubscriberInfo manParentChildRequestChildSubscriberInfo = new ManParentChildRequestChildSubscriberInfo();
        manParentChildRequestChildSubscriberInfo.setChildSubNo(childSubNo);
        manParentChildRequestChildSubscriberInfo.setChildSubType(childSubType);
        //the sub-limit has to be set to 0 for the data account to be consumed by the slave
        manParentChildRequestChildSubscriberInfo.setChildSubLimitAmt(limit);

        manParentChildRequest.setChildSubscriberInfo(manParentChildRequestChildSubscriberInfo);

        manParentChildRequestMsg.setManParentChildRequest(manParentChildRequest);

        return portBizMgr.manParentChild(manParentChildRequestMsg);
    }

    public ManParentChildResultMsg removeChild(String msisdn, String childSubNo, String operatorId) throws RemoteException {

        RequestHeader requestHeader = createRequestHeader("ManParentChild", operatorId);

        ManParentChildRequestMsg manParentChildRequestMsg = new ManParentChildRequestMsg();

        manParentChildRequestMsg.setRequestHeader(requestHeader);

        ManParentChildRequest manParentChildRequest = new ManParentChildRequest();
        manParentChildRequest.setSubscriberNo(msisdn);
        manParentChildRequest.setOperationType(2);

        ManParentChildRequestChildSubscriberInfo manParentChildRequestChildSubscriberInfo = new ManParentChildRequestChildSubscriberInfo();
        manParentChildRequestChildSubscriberInfo.setChildSubNo(childSubNo);
        manParentChildRequest.setChildSubscriberInfo(manParentChildRequestChildSubscriberInfo);

        manParentChildRequestMsg.setManParentChildRequest(manParentChildRequest);

        return portBizMgr.manParentChild(manParentChildRequestMsg);
    }

    private RequestHeader createRequestHeader(String commandId, String operatorId) {
        RequestHeader requestHeader = new RequestHeader();

        requestHeader.setCommandId(commandId);
        requestHeader.setVersion("1");
        requestHeader.setTransactionId("1");
        requestHeader.setSequenceId("1");
        requestHeader.setRequestType(RequestHeaderRequestType.Event);
        requestHeader.setOperatorID(operatorId);

        SessionEntityType sessionEntityType = new SessionEntityType();
        sessionEntityType.setName(USER);
        sessionEntityType.setPassword(PASS);
        sessionEntityType.setRemoteAddress("172.27.122.45");
        requestHeader.setSessionEntity(sessionEntityType);

        //randomise the serial number for each request
        char alphaNumeral[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
            'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Random random = new Random();

        //set the serial thru a mutator Method
        setSerialNo(alphaNumeral[random.nextInt(alphaNumeral.length)] + "" + random.nextLong());

        //retrieve the serial thru a mutator Method
        requestHeader.setSerialNo(getSerialNo());

        return requestHeader;
    }

    private RequestHeader createRequestHeader(String commandId, String operatorId, String serialNo) {
        RequestHeader requestHeader = new RequestHeader();

        requestHeader.setCommandId(commandId);
        requestHeader.setVersion("1");
        requestHeader.setTransactionId("1");
        requestHeader.setSequenceId("1");
        requestHeader.setRequestType(RequestHeaderRequestType.Event);
        requestHeader.setOperatorID(operatorId);
        

        SessionEntityType sessionEntityType = new SessionEntityType();
        sessionEntityType.setName(USER);
        sessionEntityType.setPassword(PASS);
        sessionEntityType.setRemoteAddress("172.27.122.45");
        requestHeader.setSessionEntity(sessionEntityType);

        //set the serial thru a mutator Method
        setSerialNo(serialNo);

        //retrieve the serial thru a mutator Method
        requestHeader.setSerialNo(serialNo);

        return requestHeader;
    }

    /**
     *
     * @param msisdn
     * @param productId
     * @param productId1
     * @param operatorId
     * @return
     * @throws RemoteException
     */
    public ResultHeader addAppendantMultiProduct(String msisdn, String productId, String productId1, String operatorId) throws RemoteException {
        SubscribeAppendantProductRequestMsg subscribeAppendantProductRequestMsg = new SubscribeAppendantProductRequestMsg();
        RequestHeader requestHeader = createRequestHeader("subscribeAppendantProduct", "IBM-UG");
        subscribeAppendantProductRequestMsg.setRequestHeader(requestHeader);
        SubscribeAppendantProductRequest subscribeAppendantProductRequest = new SubscribeAppendantProductRequest();
        subscribeAppendantProductRequest.setSubscriberNo(msisdn);
        SubscribeAppendantProductRequestProduct products[] = new SubscribeAppendantProductRequestProduct[2];
        SubscribeAppendantProductRequestProduct product;

        //set product 1 
        product = new SubscribeAppendantProductRequestProduct();
        product.setId(productId);
        product.setValidMode(ValidMode.value1);
        products[0] = product;

        //set product 2 
        product = new SubscribeAppendantProductRequestProduct();
        product.setId(productId1);
        product.setValidMode(ValidMode.value1);
        products[1] = product;
        subscribeAppendantProductRequest.setProduct(products);
        subscribeAppendantProductRequestMsg.setSubscribeAppendantProductRequest(subscribeAppendantProductRequest);
        return portBizMgr.subscribeAppendantProduct(subscribeAppendantProductRequestMsg).getResultHeader();
    }

}//end of Class
