package org.ibm.ws;

import com.huawei.www.bme.cbsinterface.bbservices.BbServices_PortType;
import com.huawei.www.bme.cbsinterface.bbservices.BbServices_ServiceLocator;
import com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequest;
import com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequestMsg;
import com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequestQueryObj;
import com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultMsg;
import com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.www.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.www.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.www.bme.cbsinterface.bccommon.POfferingInst;
import com.huawei.www.bme.cbsinterface.bccommon.PaymentLimitLimit;
import com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode;
import com.huawei.www.bme.cbsinterface.bccommon.SubGroupMember;
import com.huawei.www.bme.cbsinterface.bccommon.SubGroupMemberInfo;
import com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequest;
import com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestGroupMember;
import com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestMsg;
import com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelation;
import com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelation;
import com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation;
import com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit;
import com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimitPaymentLimitInfo;
import com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberResultMsg;
import com.huawei.www.bme.cbsinterface.bcservices.BcServices_PortType;
import com.huawei.www.bme.cbsinterface.bcservices.BcServices_ServiceLocator;
import com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequest;
import com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestAccount;
import com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestGroup;
import com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestMsg;
import com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestRegisterCustomer;
import com.huawei.www.bme.cbsinterface.bcservices.CreateGroupResultMsg;
import com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequest;
import com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestMsg;
import com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberResultMsg;
import com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationRequest;
import com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationRequestMsg;
import com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationResultMsg;
import com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageRequest;
import com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageRequestMsg;
import com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageRequestQueryObj;
import com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageResultMsg;
import com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequest;
import com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestMsg;
import com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestQueryObj;
import com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestQueryObjAcctAccessCode;
import com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultMsg;
import com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberRequest;
import com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberRequestMsg;
import com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultMsg;
import com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListRequest;
import com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListRequestMsg;
import com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultMsg;
import com.huawei.www.bme.cbsinterface.cbscommon.OperatorInfo;
import com.huawei.www.bme.cbsinterface.cbscommon.OwnershipInfo;
import com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader;
import com.huawei.www.bme.cbsinterface.cbscommon.SecurityInfo;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.xml.rpc.ServiceException;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author benjamin
 */
public class OCSWebServices {

    private final BcServices_PortType bcServicesPort;
    private final BbServices_PortType bbServices_Port;

    private String user = "dse";
    private String password = "QWer12#$";
    private String messageSequence;

    public OCSWebServices(String ip, String port, String user, String password) throws ServiceException {

        this.user = user;
        this.password = password;

        BcServices_ServiceLocator serviceLocator = new BcServices_ServiceLocator();
        serviceLocator.setBcServicesPortEndpointAddress("https://" + ip + ":" + port + "/services/BcServices");

        bcServicesPort = serviceLocator.getBcServicesPort();

        BbServices_ServiceLocator bbServices_ServiceLocator = new BbServices_ServiceLocator();
        bbServices_ServiceLocator.setBbServicesPortEndpointAddress("https://" + ip + ":" + port + "/services/BbServices");

        bbServices_Port = bbServices_ServiceLocator.getBbServicesPort();
    }

    /**
     *
     * @param msisdn member to be added
     * @param groupKey the group indentifier ID (prefarably the Master's line)
     * @param acctKey this is the acct Key that belongs to the master line
     * <em>(this is only used when the member type is 3)</em>
     * @param member_code the type of memeber being added either Master or Child
     * <em>1.Parent</em>,<em>3.Child</em>
     * @return
     * @throws RemoteException
     */
    public AddGroupMemberResultMsg addGroupMember(String msisdn, String groupKey, String acctKey, int member_code) throws RemoteException {

        AddGroupMemberRequestMsg addGroupMemberRequestMsg = new AddGroupMemberRequestMsg();

        RequestHeader requestHeader = createRequestHeader("AddGroupMember");

        addGroupMemberRequestMsg.setRequestHeader(requestHeader);

        AddGroupMemberRequest addGroupMemberRequest = new AddGroupMemberRequest();
        SubGroupAccessCode subGroupAccessCode = new SubGroupAccessCode();
        subGroupAccessCode.setSubGroupKey(groupKey);

        addGroupMemberRequest.setSubGroupAccessCode(subGroupAccessCode);

        AddGroupMemberRequestGroupMember addGroupMemberRequestGroupMember = new AddGroupMemberRequestGroupMember();

        com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode = new com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode();

        subAccessCode.setPrimaryIdentity(msisdn);
        addGroupMemberRequestGroupMember.setSubAccessCode(subAccessCode);

        SubGroupMember subGroupMember = new SubGroupMember();
        SubGroupMemberInfo subGroupMemberInfo = new SubGroupMemberInfo();
        subGroupMemberInfo.setMemberTypeCode("" + member_code);
        subGroupMember.setSubGrpMemberInfo(subGroupMemberInfo);

        addGroupMemberRequestGroupMember.setSubGrpMember(subGroupMember);

        addGroupMemberRequest.setGroupMember(addGroupMemberRequestGroupMember);

        //if you are adding a child member add the payment relation details
        if (member_code == 3) {
            AddGroupMemberRequestPaymentRelation paymentRelation = new AddGroupMemberRequestPaymentRelation();

            AddGroupMemberRequestPaymentRelationAddPayRelation addPayRelation = new AddGroupMemberRequestPaymentRelationAddPayRelation();

            AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation py = new AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation();
            py.setPayRelationKey("PRK758800001");
            py.setAcctKey(acctKey);
            py.setPriority(BigInteger.valueOf(80));
            py.setPaymentLimitKey("PLK758800001");

            AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation pyList[] = {py};

            addPayRelation.setPayRelation(pyList);

            AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit pl = new AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit();
            pl.setPaymentLimitKey("PLK758800001");

            AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimitPaymentLimitInfo pLimitInfo = new AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimitPaymentLimitInfo();
            pLimitInfo.setLimitCycleType("B");
            PaymentLimitLimit paymentLimitLimit = new PaymentLimitLimit();
            paymentLimitLimit.setLimitType("M");
            paymentLimitLimit.setLimitValueType("A");
            paymentLimitLimit.setLimitValue(10000);

            pLimitInfo.setLimit(paymentLimitLimit);

            pl.setPaymentLimitInfo(pLimitInfo);

            AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit plList[] = {pl};

            addPayRelation.setPaymentLimit(plList);

            paymentRelation.setAddPayRelation(addPayRelation);

            addGroupMemberRequest.setPaymentRelation(paymentRelation);
        }

        EffectMode effectMode = new EffectMode();
        effectMode.setMode("I");

        addGroupMemberRequest.setEffectiveTime(effectMode);

        addGroupMemberRequestMsg.setAddGroupMemberRequest(addGroupMemberRequest);

        return bcServicesPort.addGroupMember(addGroupMemberRequestMsg);
    }

    /**
     *
     * @param customerKey - this can be fetched from customer Info
     * @param accountKey - this can be fetched from the customer Info
     * @param groupKey - this is the Indetifier of the Group <em>(it can be the
     * master msisdn)</em>
     * @param offeringId - this is like the product ID for the group
     * @return
     * @throws RemoteException
     */
    public CreateGroupResultMsg createGroup(String customerKey, String accountKey, String groupKey, int offeringId) throws RemoteException {
        CreateGroupRequestMsg createGroupRequestMsg = new CreateGroupRequestMsg();

        RequestHeader requestHeader = createRequestHeader("CreateGroup");

        createGroupRequestMsg.setRequestHeader(requestHeader);

        CreateGroupRequest createGroupRequest = new CreateGroupRequest();

        //create RegisterCustomer
        CreateGroupRequestRegisterCustomer RegisterCustomer = new CreateGroupRequestRegisterCustomer();
        RegisterCustomer.setCustKey(customerKey);
        RegisterCustomer.setOpType("2");
        createGroupRequest.setRegisterCustomer(RegisterCustomer);

        //create Account
        CreateGroupRequestAccount account = new CreateGroupRequestAccount();
        account.setPayRelationKey(generateRandomKey());
        account.setAcctKey(accountKey);
        createGroupRequest.setAccount(account);

        //create the group
        CreateGroupRequestGroup group = new CreateGroupRequestGroup();
        group.setSubGroupKey(groupKey);
        createGroupRequest.setGroup(group);

        //create Primary Offering
        POfferingInst pOfferingInst = new POfferingInst();
        OfferingKey offeringKey = new OfferingKey();
        offeringKey.setOfferingID(BigInteger.valueOf(offeringId));
        pOfferingInst.setOfferingKey(offeringKey);
        pOfferingInst.setBundledFlag("S");
        pOfferingInst.setOfferingClass("I");
        pOfferingInst.setStatus("2");

        createGroupRequest.setPrimaryOffering(pOfferingInst);

        createGroupRequestMsg.setCreateGroupRequest(createGroupRequest);

        return bcServicesPort.createGroup(createGroupRequestMsg);
    }

    public QueryGroupListBySubscriberResultMsg queryGroupListBySubscriber(String msisdn) throws RemoteException {

        QueryGroupListBySubscriberRequestMsg queryGroupListBySubscriberRequestMsg = new QueryGroupListBySubscriberRequestMsg();

        RequestHeader requestHeader = createRequestHeader("QueryGroupListBySubscriber");
        queryGroupListBySubscriberRequestMsg.setRequestHeader(requestHeader);

        QueryGroupListBySubscriberRequest queryGroupListBySubscriberRequest = new QueryGroupListBySubscriberRequest();

        com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode = new com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode();
        subAccessCode.setPrimaryIdentity(msisdn);
        queryGroupListBySubscriberRequest.setSubAccessCode(subAccessCode);
        queryGroupListBySubscriberRequest.setSubGroupType("5");

        queryGroupListBySubscriberRequestMsg.setQueryGroupListBySubscriberRequest(queryGroupListBySubscriberRequest);

        return bcServicesPort.queryGroupListBySubscriber(queryGroupListBySubscriberRequestMsg);
    }

    /**
     *
     * @param subGroupCode
     * @return
     * @throws RemoteException
     */
    public QueryGroupMemberListResultMsg queryGroupMemberListBySubGroupCode(String subGroupCode) throws RemoteException {
        QueryGroupMemberListRequestMsg groupMemberListRequestMsg = new QueryGroupMemberListRequestMsg();

        RequestHeader requestHeader = createRequestHeader("QueryGroupMemberList");

        groupMemberListRequestMsg.setRequestHeader(requestHeader);

        QueryGroupMemberListRequest queryGroupMemberListRequest = new QueryGroupMemberListRequest();

        SubGroupAccessCode subGroupAccessCode = new SubGroupAccessCode();
        subGroupAccessCode.setSubGroupCode(subGroupCode);

        queryGroupMemberListRequest.setSubGroupAccessCode(subGroupAccessCode);
        queryGroupMemberListRequest.setTotalNumber(BigInteger.ZERO);
        queryGroupMemberListRequest.setBeginRowNum(BigInteger.ONE);
        queryGroupMemberListRequest.setFetchRowNum(BigInteger.TEN);

        groupMemberListRequestMsg.setQueryGroupMemberListRequest(queryGroupMemberListRequest);

        return bcServicesPort.queryGroupMemberList(groupMemberListRequestMsg);
    }

    /**
     * Query by SubGroupKey
     *
     * @param subGroupKey
     * @return
     * @throws RemoteException
     */
    public QueryGroupMemberListResultMsg queryGroupMemberListBySubGroupKey(String subGroupKey) throws RemoteException {
        QueryGroupMemberListRequestMsg groupMemberListRequestMsg = new QueryGroupMemberListRequestMsg();

        RequestHeader requestHeader = createRequestHeader("QueryGroupMemberList");

        groupMemberListRequestMsg.setRequestHeader(requestHeader);

        QueryGroupMemberListRequest queryGroupMemberListRequest = new QueryGroupMemberListRequest();

        SubGroupAccessCode subGroupAccessCode = new SubGroupAccessCode();
        subGroupAccessCode.setSubGroupKey(subGroupKey);

        queryGroupMemberListRequest.setSubGroupAccessCode(subGroupAccessCode);
        queryGroupMemberListRequest.setTotalNumber(BigInteger.ZERO);
        queryGroupMemberListRequest.setBeginRowNum(BigInteger.ONE);
        queryGroupMemberListRequest.setFetchRowNum(BigInteger.TEN);

        groupMemberListRequestMsg.setQueryGroupMemberListRequest(queryGroupMemberListRequest);

        return bcServicesPort.queryGroupMemberList(groupMemberListRequestMsg);
    }

    /**
     * Queries the customer Information
     *
     * @param msisdn
     * @return
     * @throws RemoteException
     */
    public QueryCustomerInfoResultMsg queryCustomerInfoCust(String msisdn) throws RemoteException {

        QueryCustomerInfoRequestMsg queryCustomerInfoRequestMsg = new QueryCustomerInfoRequestMsg();

        RequestHeader requestHeader = createRequestHeader("QueryCustomerInfo");
        queryCustomerInfoRequestMsg.setRequestHeader(requestHeader);

        QueryCustomerInfoRequest queryCustomerInfoRequest = new QueryCustomerInfoRequest();

        QueryCustomerInfoRequestQueryObj QueryObj = new QueryCustomerInfoRequestQueryObj();

        CustAccessCode custAccessCode = new CustAccessCode();
        custAccessCode.setPrimaryIdentity(msisdn);
        QueryObj.setCustAccessCode(custAccessCode);

        queryCustomerInfoRequest.setQueryObj(QueryObj);
        queryCustomerInfoRequestMsg.setQueryCustomerInfoRequest(queryCustomerInfoRequest);

        return bcServicesPort.queryCustomerInfo(queryCustomerInfoRequestMsg);
    }

    /**
     *
     * @param msisdn
     * @return
     * @throws RemoteException
     */
    public QueryCustomerInfoResultMsg queryCustomerInfoAcct(String msisdn) throws RemoteException {

        QueryCustomerInfoRequestMsg queryCustomerInfoRequestMsg = new QueryCustomerInfoRequestMsg();

        RequestHeader requestHeader = createRequestHeader("QueryCustomerInfo");
        queryCustomerInfoRequestMsg.setRequestHeader(requestHeader);

        QueryCustomerInfoRequest queryCustomerInfoRequest = new QueryCustomerInfoRequest();

        QueryCustomerInfoRequestQueryObj QueryObj = new QueryCustomerInfoRequestQueryObj();

        QueryCustomerInfoRequestQueryObjAcctAccessCode acctAccessCode = new QueryCustomerInfoRequestQueryObjAcctAccessCode();

        acctAccessCode.setPrimaryIdentity(msisdn);
        QueryObj.setAcctAccessCode(acctAccessCode);

        queryCustomerInfoRequest.setQueryObj(QueryObj);
        queryCustomerInfoRequestMsg.setQueryCustomerInfoRequest(queryCustomerInfoRequest);

        return bcServicesPort.queryCustomerInfo(queryCustomerInfoRequestMsg);
    }

    /**
     *
     * @param subGroupKey the indentifier of the group
     * @param msisdn the number that will be removed from the group
     * @return
     * @throws java.rmi.RemoteException
     */
    public DelGroupMemberResultMsg delGroupMember(String subGroupKey, String msisdn) throws RemoteException {

        DelGroupMemberRequestMsg delGroupMemberRequestMsg = new DelGroupMemberRequestMsg();

        RequestHeader requestHeader = createRequestHeader("DelGroupMember");

        delGroupMemberRequestMsg.setRequestHeader(requestHeader);

        DelGroupMemberRequest delGroupMemberRequest = new DelGroupMemberRequest();

        SubGroupAccessCode subGroupAccessCode = new SubGroupAccessCode();
        subGroupAccessCode.setSubGroupKey(subGroupKey);
        delGroupMemberRequest.setSubGroupAccessCode(subGroupAccessCode);

        com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode groupMember = new com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode();
        groupMember.setPrimaryIdentity(msisdn);
        delGroupMemberRequest.setGroupMember(groupMember);

        EffectMode effectMode = new EffectMode();
        effectMode.setMode("I");
        delGroupMemberRequest.setEffectiveTime(effectMode);

        delGroupMemberRequestMsg.setDelGroupMemberRequest(delGroupMemberRequest);

        return bcServicesPort.delGroupMember(delGroupMemberRequestMsg);
    }

    /**
     *
     * @param subGroupKey the group key to be deactivated
     * @return
     * @throws RemoteException
     */
    public GroupDeactivationResultMsg deactivateGroup(String subGroupKey) throws RemoteException {
        GroupDeactivationRequestMsg groupDeactivationRequestMsg = new GroupDeactivationRequestMsg();

        RequestHeader requestHeader = createRequestHeader("GroupDeactivation");

        groupDeactivationRequestMsg.setRequestHeader(requestHeader);

        GroupDeactivationRequest groupDeactivationRequest = new GroupDeactivationRequest();

        SubGroupAccessCode subGroupAccessCode = new SubGroupAccessCode();
        subGroupAccessCode.setSubGroupKey(subGroupKey);

        groupDeactivationRequest.setSubGroupAccessCode(subGroupAccessCode);

        groupDeactivationRequestMsg.setGroupDeactivationRequest(groupDeactivationRequest);

        return bcServicesPort.groupDeactivation(groupDeactivationRequestMsg);
    }

    public QueryFreeUnitResultMsg queryFreeUnit(String msisdn) throws RemoteException {

        QueryFreeUnitRequestMsg queryFreeUnitRequestMsg = new QueryFreeUnitRequestMsg();

        queryFreeUnitRequestMsg.setRequestHeader(createRequestHeader("QueryFreeUnit"));

        QueryFreeUnitRequest queryFreeUnitRequest = new QueryFreeUnitRequest();

        QueryFreeUnitRequestQueryObj queryFreeUnitRequestQueryObj = new QueryFreeUnitRequestQueryObj();

        com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode = new com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode();
        subAccessCode.setPrimaryIdentity(msisdn);
        queryFreeUnitRequestQueryObj.setSubAccessCode(subAccessCode);

        queryFreeUnitRequest.setQueryObj(queryFreeUnitRequestQueryObj);
        queryFreeUnitRequestMsg.setQueryFreeUnitRequest(queryFreeUnitRequest);

        return bbServices_Port.queryFreeUnit(queryFreeUnitRequestMsg);
    }

    private RequestHeader createRequestHeader(String businessCode, String operatorId) {

        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setVersion("1");
        requestHeader.setBusinessCode(businessCode);

        //randomise the serial number for each request
        char alphaNumeral[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
            'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1',
            '2', '3', '4', '5', '6', '7', '8', '9'};
        Random random = new Random();

        //set the serial thru a mutator Method
        setMessageSequence(alphaNumeral[random.nextInt(alphaNumeral.length)] + alphaNumeral[random.nextInt(alphaNumeral.length)] + "" + random.nextInt());

        requestHeader.setMessageSeq(getMessageSequence());

        OwnershipInfo ownershipInfo = new OwnershipInfo();
        ownershipInfo.setBEID("101");
        requestHeader.setOwnershipInfo(ownershipInfo);

        SecurityInfo securityInfo = new SecurityInfo();
        securityInfo.setLoginSystemCode(user);
        securityInfo.setPassword(password);

        requestHeader.setAccessSecurity(securityInfo);

        OperatorInfo operatorInfo = new OperatorInfo();
        operatorInfo.setOperatorID(operatorId);

        requestHeader.setOperatorInfo(operatorInfo);

        return requestHeader;
    }

    public QueryAccumulationUsageResultMsg QueryAccumulationUsage(String msisdn, String accmType) throws RemoteException {

        RequestHeader requestHeader = createRequestHeader(msisdn);

        QueryAccumulationUsageRequestMsg queryAccumulationUsageRequestMsg = new QueryAccumulationUsageRequestMsg();

        queryAccumulationUsageRequestMsg.setRequestHeader(requestHeader);

        QueryAccumulationUsageRequest queryAccumulationUsageRequest = new QueryAccumulationUsageRequest();

        QueryAccumulationUsageRequestQueryObj queryAccumulationUsageRequestQueryObj = new QueryAccumulationUsageRequestQueryObj();
        SubAccessCode subAccessCode = new SubAccessCode();
        subAccessCode.setPrimaryIdentity(msisdn);

        queryAccumulationUsageRequestQueryObj.setSubAccessCode(subAccessCode);
        queryAccumulationUsageRequest.setQueryObj(queryAccumulationUsageRequestQueryObj);
        queryAccumulationUsageRequest.setAccmType(accmType);

        queryAccumulationUsageRequestMsg.setQueryAccumulationUsageRequest(queryAccumulationUsageRequest);

        return bcServicesPort.queryAccumulationUsage(queryAccumulationUsageRequestMsg);

    }

    private RequestHeader createRequestHeader(String businessCode) {

        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setVersion("1");
        requestHeader.setBusinessCode(businessCode);

        //randomise the serial number for each request
        char alphaNumeral[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
            'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1',
            '2', '3', '4', '5', '6', '7', '8', '9'};
        Random random = new Random();

        //set the serial thru a mutator Method
        setMessageSequence(alphaNumeral[random.nextInt(alphaNumeral.length)] + alphaNumeral[random.nextInt(alphaNumeral.length)] + "" + random.nextInt());

        requestHeader.setMessageSeq(getMessageSequence());

        OwnershipInfo ownershipInfo = new OwnershipInfo();
        ownershipInfo.setBEID("101");
        requestHeader.setOwnershipInfo(ownershipInfo);

        SecurityInfo securityInfo = new SecurityInfo();
        securityInfo.setLoginSystemCode(user);
        securityInfo.setPassword(password);

        requestHeader.setAccessSecurity(securityInfo);

        return requestHeader;
    }

    public String getMessageSequence() {
        return messageSequence;
    }

    public void setMessageSequence(String messageSequence) {
        this.messageSequence = messageSequence;
    }

    private String generateRandomKey() {

//        char alphaNumeral[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
//            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
//            'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
//            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//        Random random = new Random();
//        return alphaNumeral[random.nextInt(alphaNumeral.length)] + "" + random.nextLong();
        return RandomStringUtils.random(2, true, false).toUpperCase() + "" + Math.abs(ThreadLocalRandom.current().nextLong(1, 999999999));

    }

//    public static void main(String[] args) throws ServiceException, RemoteException, InterruptedException {
//        
//        OCSWebServices ocsWebServices = new OCSWebServices("10.150.43.54", "9002");
//        
//        while (true) {
//            QueryCustomerInfoResultMsg queryCustomerInfoAcct = ocsWebServices.queryCustomerInfoAcct("705332846");
//            
//            com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader = queryCustomerInfoAcct.getResultHeader();
//            
//            System.out.println("Desc: " + resultHeader.getResultDesc());
//            System.out.println("Code: " + resultHeader.getResultCode());
//            
//            Thread.sleep(1000);
//        }
//    }//end of main method
}//end of class
