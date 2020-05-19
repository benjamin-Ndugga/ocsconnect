/**
 * BcServicsBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
package com.huawei.www.bme.cbsinterface.bcservices;

import org.apache.axis.MessageContext;
import org.apache.axis.transport.http.HTTPConstants;

public class BcServicsBindingStub extends org.apache.axis.client.Stub implements com.huawei.www.bme.cbsinterface.bcservices.BcServices_PortType {

    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[130];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChkPrefixOp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChkPrefixOpRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChkPrefixOpRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChkPrefixOpResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChkPrefixOpResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PenaltyCalculation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PenaltyCalculationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PenaltyCalculationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeScatteredAcctInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeScatteredAcctInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeScatteredAcctInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeScatteredAcctInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeScatteredAcctInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApplyInstallmentExtend");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentExtendRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentExtendRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentExtendResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentExtendResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeCustInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeCustInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeCustInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeCustInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeCustInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeOfferingProperty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeOfferingPropertyRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeOfferingPropertyRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeOfferingPropertyResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeOfferingPropertyResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManFphCaller");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManFphCallerRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManFphCallerRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManFphCallerResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManFphCallerResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryFphCaller");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryFphCallerRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryFphCallerRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryFphCallerResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryFphCallerResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthSubPwd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AuthSubPwdRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AuthSubPwdRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AuthSubPwdResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AuthSubPwdResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApplyPrepayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyPrepaymentRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyPrepaymentRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyPrepaymentResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyPrepaymentResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApplyInstallment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryInstallment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryInstallmentRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryInstallmentRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryInstallmentResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryInstallmentResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryAccumulationUsage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryAccumulationUsageRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAccumulationUsageRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAccumulationUsageResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryAccumulationUsageResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckSubscribersGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CheckSubscribersGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CheckSubscribersGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CheckSubscribersGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CheckSubscribersGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApplyProdFreeValidity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyProdFreeValidityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyProdFreeValidityRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyProdFreeValidityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyProdFreeValidityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryDataPackageUsage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryDataPackageUsageRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryDataPackageUsageRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryDataPackageUsageResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryDataPackageUsageResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SynDTUserGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SynDTUserGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SynDTUserGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SynDTUserGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SynDTUserGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryZoneInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryZoneInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryZoneInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryLoanOffering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryLoanOfferingInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryLoanOfferingInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryLoanOfferingInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryLoanOfferingInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryPaymentRelation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentRelationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentRelationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryOfferingInstProperty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingInstPropertyRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingInstPropertyResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryGroupMemberList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupMemberListRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemberListRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemberListResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupMemberListResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryGroupListBySubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupListBySubscriberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupListBySubscriberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupListBySubscriberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupListBySubscriberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryCustomerInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCustomerInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCustomerInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeAcctOwnership");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctOwnershipRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctOwnershipRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctOwnershipResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctOwnershipResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubOwnership");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubOwnershipRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOwnershipRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOwnershipResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubOwnershipResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCustNoticeSuppress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustNoticeSuppressRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustNoticeSuppressRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustNoticeSuppressResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustNoticeSuppressResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeConsumptionLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeConsumptionLimitRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeConsumptionLimitResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustDeactivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustDeactivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CustDeactivationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CustDeactivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustDeactivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AcctDeactivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctDeactivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AcctDeactivationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AcctDeactivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctDeactivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeTaxExemption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeTaxExemptionRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeTaxExemptionRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeTaxExemptionResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeTaxExemptionResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DelStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelStatementRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelStatementRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.DelStatementRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelStatementResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.DelStatementResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelStatementResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyStatementRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ModifyStatementRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ModifyStatementResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyStatementResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddStatementRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddStatementRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.AddStatementRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddStatementResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.AddStatementResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddStatementResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeMemberShortNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeMemberShortNoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeMemberShortNoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeMemberShortNoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeMemberShortNoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchSubDeactivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSubDeactivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubDeactivationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubDeactivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSubDeactivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchSubActivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSubActivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubActivationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubActivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSubActivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeMemberStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeMemberStatusRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeMemberStatusRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeMemberStatusResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeMemberStatusResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchDelGroupMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchDelGroupMemberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchDelGroupMemberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchDelGroupMemberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchDelGroupMemberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeSubValidity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubValidityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubValidityRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubValidityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubValidityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchAddGroupMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchAddGroupMemberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAddGroupMemberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAddGroupMemberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchAddGroupMemberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchSwitchGroupMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSwitchGroupMemberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSwitchGroupMemberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSwitchGroupMemberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSwitchGroupMemberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeSubInitBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubInitBalanceRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubInitBalanceRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubInitBalanceResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubInitBalanceResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeSubOffering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubOfferingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubOfferingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubOfferingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubOfferingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeSubBasicInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubBasicInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubBasicInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubBasicInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubBasicInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeMemberShortNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeMemberShortNoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeMemberShortNoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeMemberShortNoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeMemberShortNoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeMemberStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeMemberStatusRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeMemberStatusRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeMemberStatusResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeMemberStatusResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeGroupMemberInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemberInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemberInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeGroupStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupStatusRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupStatusRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupStatusResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupStatusResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GroupDeactivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupDeactivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">GroupDeactivationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">GroupDeactivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupDeactivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeGroupOffering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupOfferingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupOfferingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeGroupMemberOffering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemberOfferingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemberOfferingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeGroupBasicInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupBasicInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupBasicInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupBasicInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupBasicInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DelGroupMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelGroupMemberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelGroupMemberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelGroupMemberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelGroupMemberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddGroupMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddGroupMemberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddGroupMemberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddGroupMemberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddGroupMemberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.CreateGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubIdentity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubIdentityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubIdentityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubDFTAcct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubDFTAcctRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubDFTAcctRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubDFTAcctResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubDFTAcctResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubGrpDFTAcct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubGrpDFTAcctRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubGrpDFTAcctRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubGrpDFTAcctResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubGrpDFTAcctResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCustDFTAcct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustDFTAcctRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustDFTAcctRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustDFTAcctResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustDFTAcctResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SupplementProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementProfileRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementProfileResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCustInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeAcctInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangePayRelation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangePayRelationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangePayRelationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangePayRelationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangePayRelationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeAcctBillCycle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctBillCycleRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctBillCycleRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctBillCycleResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctBillCycleResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateSubscriberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateSubscriberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateCustomerRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateCustomerRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateCustomerResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateCustomerResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateAccountRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateAccountRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateAccountResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.CreateAccountResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateAccountResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubActivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubActivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubActivationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.SubActivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubActivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.SubActivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubActivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubStatusRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubStatusRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubStatusResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubStatusResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubPwd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubPwdRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubPwdResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubGrpPwd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubGrpPwdRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubGrpPwdRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubGrpPwdResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubGrpPwdResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubDeactivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubDeactivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubDeactivationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubDeactivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubDeactivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelPreDeactivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CancelPreDeactivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CancelPreDeactivationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CancelPreDeactivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CancelPreDeactivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubOffering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubOfferingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOfferingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOfferingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubOfferingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubValidity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubValidityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubValidityRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubValidityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubValidityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubPaymentMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubPaymentModeRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubPaymentModeResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateOffering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActivateOfferingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ActivateOfferingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ActivateOfferingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActivateOfferingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeOfferingStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeOfferingStatusRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingStatusRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingStatusResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeOfferingStatusResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeProductStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeProductStatusRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeProductStatusRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeProductStatusResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeProductStatusResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeAcctCreditLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctCreditLimitRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctCreditLimitResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeOfferingProperty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeOfferingPropertyRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingPropertyRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingPropertyResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeOfferingPropertyResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeRechageBlacklist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeRechageBlacklistRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRechageBlacklistRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRechageBlacklistResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeRechageBlacklistResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeAccountOffering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAccountOfferingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAccountOfferingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCustOffering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustOfferingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustOfferingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustOfferingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustOfferingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchCreateSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchCreateSubscriberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchCreateSubscriberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchCreateSubscriberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchCreateSubscriberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeSubStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubStatusRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubStatusRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubStatusResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubStatusResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeSubActiveLimitDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubActiveLimitDateRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubActiveLimitDateRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubActiveLimitDateResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubActiveLimitDateResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubLifeCycle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubLifeCycleRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubLifeCycleRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubLifeCycleResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubLifeCycleResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryOfferingRentCycle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingRentCycleRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentCycleRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentCycleResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingRentCycleResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FeeDeduction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FeeDeductionRollBack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionRollBackRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionRollBackResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CleanUpCustData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CleanUpCustDataRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CleanUpCustDataRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CleanUpCustDataResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CleanUpCustDataResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FeeQuotation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeQuotationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeQuotationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryConsumptionLimitUsage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryConsumptionLimitRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryConsumptionLimitRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryConsumptionLimitResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryConsumptionLimitResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryPaymentLimitUsage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentLimitUsageRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentLimitUsageResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SynDTDiscount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SynDTDiscountRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SynDTDiscountRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SynDTDiscountResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SynDTDiscountResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeInitCreditLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeInitCreditLimitRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeInitCreditLimitRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeInitCreditLimitResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeInitCreditLimitResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCustHierachy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustHierachyRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustHierachyRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustHierachyResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustHierachyResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryBatchTaskStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryBatchTaskStatusRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryBatchTaskStatusRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryBatchTaskStatusResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryBatchTaskStatusResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeAcctOffering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeAcctOfferingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeAcctOfferingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeAcctOfferingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeAcctOfferingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeGroupMemOffNetNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemOffNetNumberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemOffNetNumberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemOffNetNumberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemOffNetNumberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeGroupOffNetNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupOffNetNumberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOffNetNumberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOffNetNumberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupOffNetNumberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryGroupMemOffNetNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupMemOffNetNumberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemOffNetNumberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemOffNetNumberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupMemOffNetNumberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryGroupOffNetNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupOffNetNumberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupOffNetNumberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupOffNetNumberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupOffNetNumberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryRebate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryRebateRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryRebateRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryRebateRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryRebateResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryRebateResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryRebateResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeRscRelation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeRscRelationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRscRelationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRscRelationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeRscRelationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeRedFlag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeRedFlagRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRedFlagRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRedFlagResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeRedFlagResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManAppendSubIdentity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManAppendSubIdentityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManAppendSubIdentityRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManAppendSubIdentityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManAppendSubIdentityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryAppendSubIdentity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryAppendSubIdentityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAppendSubIdentityRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAppendSubIdentityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryAppendSubIdentityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GroupDelMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupDelMemberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">GroupDelMemberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">GroupDelMemberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupDelMemberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManCrossGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManCrossGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManCrossGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManCrossGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManCrossGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSuperGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateSuperGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSuperGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSuperGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateSuperGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JoinSuperGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "JoinSuperGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">JoinSuperGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">JoinSuperGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "JoinSuperGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSuperGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeleteSuperGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeleteSuperGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSuperGroupMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeleteSuperGroupMemberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupMemberRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupMemberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeleteSuperGroupMemberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubInforToMicro");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubInforToMicroRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInforToMicroRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInforToMicroResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubInforToMicroResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubInfoExToCube");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubInfoExToCubeRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInfoExToCubeRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInfoExToCubeResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubInfoExToCubeResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryExpireSubToMicro");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryExpireSubToMicroRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryExpireSubToMicroResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryOfferingRentFailedFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingRentFailedFeeRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentFailedFeeRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentFailedFeeResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingRentFailedFeeResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryZoneMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryZoneMappingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneMappingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneMappingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryZoneMappingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangePayRelation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangePayRelationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangePayRelationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangePayRelationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangePayRelationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchScatteredSubActivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchScatteredSubActivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchScatteredSubActivationRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchScatteredSubActivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchScatteredSubActivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManageCallHunting");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManageCallHuntingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageCallHuntingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageCallHuntingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManageCallHuntingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryCallHunting");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCallHuntingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCallHuntingRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCallHuntingResponseMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingResponseMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCallHuntingResponseMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManageGrpCallScreenNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManageGrpCallScreenNoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageGrpCallScreenNoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageGrpCallScreenNoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManageGrpCallScreenNoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryGrpCallScreenNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGrpCallScreenNoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGrpCallScreenNoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGrpCallScreenNoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGrpCallScreenNoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchAdjustment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchAdjustmentRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAdjustmentRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAdjustmentResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchAdjustmentResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchSupplementCustInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSupplementCustInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSupplementCustInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSupplementCustInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSupplementCustInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    public BcServicsBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public BcServicsBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public BcServicsBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
        addBindings6();
        addBindings7();
        addBindings8();
        addBindings9();
    }

    private void addBindings0() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AccountInfo>AutoPayChannel>AutoPayChannelInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannelAutoPayChannelInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AutoPayChannelInfo>PaymentPlan>BillCycleSchema");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanBillCycleSchema.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AutoPayChannelInfo>PaymentPlan>LowBalanceSchema");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanLowBalanceSchema.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AutoPayChannelInfo>PaymentPlan>TimeSchema");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanTimeSchema.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>Subscriber>ConsumptionLimit>LimitParam");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimitLimitParam.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">AccountForBatch>CreditLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AccountForBatchCreditLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">AccountInfo>AutoPayChannel");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannel.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">AccountInfo>CreditLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AccountInfoCreditLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">AutoPayChannelInfo>PaymentPlan");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlan.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">CustInfo>NoticeSuppress");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.CustInfoNoticeSuppress.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">InstProperty>SubPropInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.InstPropertySubPropInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">OfferingInst>OInstProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.OfferingInstOInstProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">PaymentLimit>Limit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.PaymentLimitLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">POfferingInst>OfferingInstProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.POfferingInstOfferingInstProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">ProductInst>PInstProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.ProductInstPInstProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">RscRelation>RelationDestIdentify");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.RscRelationRelationDestIdentify.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">RscRelation>ShareLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.RscRelationShareLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">Subscriber>ConsumptionLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">SubscriberForBatch>SubBasicInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubscriberForBatchSubBasicInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountBasicInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountForBatch");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AccountForBatch.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AccountInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ActiveMode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.ActiveMode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Address");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.Address.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPayChannelInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPaymentPlan");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.AutoPaymentPlan.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BalanceChgInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.BalanceChgInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Contact");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.Contact.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustBasicInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.CustInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustomerForBatch");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.CustomerForBatch.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "DateTime");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.EffectMode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeBillMedium");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeUnitChgInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.FreeUnitChgInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "IndividualInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "InstProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.InstProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingExpireMode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.OfferingExpireMode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.OfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.OfferingKey.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.OrgInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.PaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PayOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.PayOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PayRelExtRule");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "POfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.POfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ProductInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.ProductInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "RscRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.RscRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SalesInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SalesInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Statement");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.Statement.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "StatementInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.StatementInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "StatementMedium");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.StatementMedium.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "StatementScenario");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.StatementScenario.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubBasicInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubBasicInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroup");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubGroup.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupBasicInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubGroupBasicInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupMember");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubGroupMember.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupMemberInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubGroupMemberInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubIdentity");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubIdentity.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubRelationInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubRelationInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.Subscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubscriberForBatch");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SubscriberForBatch.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Tax");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.Tax.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "TaxException");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.TaxException.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>>ChangeSubOwnershipRequest>NewOwnership>Subscriber>SubDFTAcct>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberSubDFTAcctPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>>FeeQuotationRequest>ChargeElement>OfferingFee>AddOffering>ProductInst>PInstProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInstPInstProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>AddGroupMemberRequest>PaymentRelation>AddPayRelation>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>AddGroupMemberRequest>PaymentRelation>NewDFTAcct>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>BatchAddGroupMemberRequest>PaymentRelation>AddPayRelation>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>BatchAddGroupMemberRequest>PaymentRelation>NewDFTAcct>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>BatchChangePayRelationRequest>PayRelation>AddPayRelation>PayLimit>Limit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>BatchSwitchGroupMemberRequest>PaymentRelation>AddPayRelation>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationAddPayRelationPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>BatchSwitchGroupMemberRequest>PaymentRelation>NewDFTAcct>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangeAcctOwnershipRequest>NewOwnership>Subscriber>SubPayRelation>ShiftPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangePayRelationRequest>PaymentRelation>AddPayRelation>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationAddPayRelationPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangePayRelationRequest>PaymentRelation>ModPayRelation>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationModPayRelationPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangePayRelationRequest>PaymentRelation>ModPayRelation>PayRelation>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangeRscRelationRequest>RscRelation>ModRelation>NewRelation>ShareLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewRelationShareLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangeSubOwnershipRequest>NewOwnership>Subscriber>SubDFTAcct>AcctList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberSubDFTAcctAcctList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangeSubOwnershipRequest>NewOwnership>Subscriber>SubDFTAcct>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberSubDFTAcctPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangeSubOwnershipRequest>NewOwnership>Subscriber>SubDFTAcct>PayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberSubDFTAcctPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangeSubPaymentModeRequest>PaymentModeChange>DFTPayRelation>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>CreateSubscriberRequest>Subscriber>SubPaymentMode>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>FeeQuotationRequest>ChargeElement>OfferingFee>AddOffering>OInstProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingOInstProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>FeeQuotationRequest>ChargeElement>OfferingFee>AddOffering>ProductInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>QueryCustomerInfoResult>Account>AcctInfo>AutoPayChannel>AutoPayChannelInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoAutoPayChannelAutoPayChannelInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>AddGroupMemberRequest>PaymentRelation>AddPayRelation>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>AddGroupMemberRequest>PaymentRelation>AddPayRelation>PayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>AddGroupMemberRequest>PaymentRelation>NewDFTAcct>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>BatchAddGroupMemberRequest>PaymentRelation>AddPayRelation>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>BatchAddGroupMemberRequest>PaymentRelation>AddPayRelation>PayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelationAddPayRelationPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>BatchAddGroupMemberRequest>PaymentRelation>NewDFTAcct>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>BatchChangePayRelationRequest>PayRelation>AddPayRelation>PayLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>BatchSwitchGroupMemberRequest>PaymentRelation>AddPayRelation>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>BatchSwitchGroupMemberRequest>PaymentRelation>AddPayRelation>PayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationAddPayRelationPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings1() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>BatchSwitchGroupMemberRequest>PaymentRelation>NewDFTAcct>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeAcctOwnershipRequest>NewOwnership>Account>AutoPayChannel");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeAcctOwnershipRequest>NewOwnership>Subscriber>SubPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangeAcctOwnershipRequest>NewOwnership>Subscriber>SubPayRelation>ShiftPayRelation");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ShiftPayRelation");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeAcctOwnershipRequest>NewOwnership>SupplementaryOffering>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSupplementaryOfferingAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeAcctOwnershipRequest>NewOwnership>SupplementaryOffering>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSupplementaryOfferingDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeAcctOwnershipRequest>NewOwnership>SupplementaryOffering>ShiftOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam>AddLimitParam");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam>DelLimitParam");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamDelLimitParam.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam>ModifyLimitParam");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeOfferingPropertyRequest>OfferingInst>OfferingInstProperty>AddProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingInstPropertyAddProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeOfferingPropertyRequest>OfferingInst>OfferingInstProperty>DelProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingInstPropertyDelProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeOfferingPropertyRequest>OfferingInst>OfferingOwner>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingOwnerAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeOfferingPropertyRequest>OfferingInst>ProductInst>AddProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstAddProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeOfferingPropertyRequest>OfferingInst>ProductInst>DelProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeOfferingStatusRequest>OfferingInst>OfferingOwner>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestOfferingInstOfferingOwnerAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangePayRelationRequest>PaymentRelation>AddPayRelation>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationAddPayRelationPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangePayRelationRequest>PaymentRelation>AddPayRelation>PayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangePayRelationRequest>PaymentRelation>ModPayRelation>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationModPayRelationPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangePayRelationRequest>PaymentRelation>ModPayRelation>PayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationModPayRelationPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeProductStatusRequest>OfferingInst>OfferingOwner>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstOfferingOwnerAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>DelRelation>RelationDestIdentify");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelationRelationDestIdentify.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>ModRelation>NewDestIdentify");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewDestIdentify.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>ModRelation>NewRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>ModRelation>OldRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationOldRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>ModRelation>RelationDestIdentify");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubDFTAcctRequest>DFTPayRelation>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOfferingRequest>SupplementaryOffering>DelOffering>AdditionalProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOfferingDelOfferingAdditionalProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>Subscriber>ShiftPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberShiftPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>Subscriber>SubDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberSubDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>SupplementaryOffering>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>SupplementaryOffering>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>SupplementaryOffering>ShiftOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubPaymentModeRequest>PaymentModeChange>DFTPayRelation>AddPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubPaymentModeRequest>PaymentModeChange>DFTPayRelation>DelPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationDelPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubPaymentModeRequest>PaymentModeChange>DFTPayRelation>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubPaymentModeRequest>PaymentModeChange>SubDFTAccount>NewDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubPaymentModeRequest>PaymentModeChange>SubDFTAccount>OldDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountOldDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>CreateSubscriberRequest>Subscriber>SubPaymentMode>AcctList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModeAcctList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>CreateSubscriberRequest>Subscriber>SubPaymentMode>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>CreateSubscriberRequest>Subscriber>SubPaymentMode>PayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>FeeQuotationRequest>ChargeElement>OfferingFee>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>FeeQuotationRequest>ChargeElement>OfferingFee>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryCustomerInfoResult>Account>AcctInfo>AutoPayChannel");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoAutoPayChannel.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryCustomerInfoResult>Account>AcctInfo>UserCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoUserCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryCustomerInfoResult>SubGroup>SubGroupInfo>UserCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSubGroupInfoUserCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryCustomerInfoResult>Subscriber>SubscriberInfo>UserCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSubscriberInfoUserCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryOfferingInstPropertyResult>OfferingInst>ProductInst>ProductInstProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInstProductInstProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryOfferingRentCycleRequest>OfferingInst>OfferingOwner>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestOfferingInstOfferingOwnerAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryOfferingRentCycleResult>OfferingRentCycle>OfferingOwner>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultOfferingRentCycleOfferingOwnerAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryPaymentRelationResult>PaymentRelationList>PaymentLimit>PaymentLimitInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPaymentLimitPaymentLimitInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QuerySubInfoExToCubeResult>Subscriber>AdditionalProperty>Code");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QuerySubInfoExToCubeResult>Subscriber>AdditionalProperty>Value");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>SupplementProfileRequest>Account>AutoPayChannel>AutoPayChannelInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountAutoPayChannelAutoPayChannelInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ActivateOfferingRequest>OfferingOwner>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingRequestOfferingOwnerAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ActivateProductRequest>OfferingOwner>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ActivateProductRequestOfferingOwnerAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>AddGroupMemberRequest>GroupMember>SubInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestGroupMemberSubInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>AddGroupMemberRequest>PaymentRelation>AddPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>AddGroupMemberRequest>PaymentRelation>NewDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationNewDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ApplyInstallmentExtendRequest>newInstallment>InatallmentPlan");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ApplyInstallmentExtendResult>newInstallmentInfo>InatallmentDetail");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResultNewInstallmentInfoInatallmentDetail.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchAddGroupMemberRequest>PaymentRelation>AddPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelationAddPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchAddGroupMemberRequest>PaymentRelation>NewDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelationNewDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeAcctOfferingRequest>AcctOffering>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeAcctOfferingRequest>AcctOffering>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeAcctOfferingRequest>AcctOffering>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeOfferingPropertyRequest>OfferingInstProperty>AddProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequestOfferingInstPropertyAddProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeOfferingPropertyRequest>OfferingInstProperty>DelProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequestOfferingInstPropertyDelProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeOfferingPropertyRequest>ProductInst>AddProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequestProductInstAddProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeOfferingPropertyRequest>ProductInst>DelProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequestProductInstDelProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangePayRelationRequest>PayRelation>AddPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangePayRelationRequest>PayRelation>ModPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationModPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeSubOfferingRequest>SupplementaryOffering>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingRequestSupplementaryOfferingAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeSubOfferingRequest>SupplementaryOffering>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingRequestSupplementaryOfferingDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeSubOfferingRequest>SupplementaryOffering>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingRequestSupplementaryOfferingModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchSwitchGroupMemberRequest>PaymentRelation>AddPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationAddPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchSwitchGroupMemberRequest>PaymentRelation>NewDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationNewDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctBillCycleRequest>Account>RootAccount");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountRootAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctBillCycleRequest>Account>SubAccount");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountSubAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctCreditLimitRequest>AccountCredit>CommonCreditLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctCreditLimitRequest>AccountCredit>TmpCreditLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctInfoRequest>AcctPayMethod>AddAutoPayChannel");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodAddAutoPayChannel.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctInfoRequest>AcctPayMethod>DelAutoPayChannel");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodDelAutoPayChannel.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>PrimaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>RegisterCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipRegisterCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>SupplementaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSupplementaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>UserCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipUserCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>OldOwnership>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestOldOwnershipAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeConsumptionLimitRequest>AddLimit>LimitParam");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimitLimitParam.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParam.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeCustNoticeSuppressRequest>SuppressSetting>AddSuppressSet");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingAddSuppressSet.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeCustNoticeSuppressRequest>SuppressSetting>DelSuppressSet");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingDelSuppressSet.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeOfferingPropertyRequest>OfferingInst>OfferingInstProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingInstProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeOfferingPropertyRequest>OfferingInst>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeOfferingPropertyRequest>OfferingInst>ProductInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeOfferingStatusRequest>OfferingInst>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestOfferingInstOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangePayRelationRequest>PaymentRelation>AddPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationAddPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangePayRelationRequest>PaymentRelation>DelPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationDelPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangePayRelationRequest>PaymentRelation>ModPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationModPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings2() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeProductStatusRequest>OfferingInst>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeProductStatusRequest>OfferingInst>ProductInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstProductInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeRedFlagRequest>ChangeObj>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequestChangeObjAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeRscRelationRequest>RscRelation>DelRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeRscRelationRequest>RscRelation>ModRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubDFTAcctRequest>DFTPayRelation>AddPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationAddPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubDFTAcctRequest>DFTPayRelation>DelPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationDelPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubDFTAcctRequest>DFTPayRelation>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubDFTAcctRequest>SubDFTAccount>NewDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccountNewDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubDFTAcctRequest>SubDFTAccount>OldDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccountOldDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOfferingRequest>SupplementaryOffering>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOfferingAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOfferingRequest>SupplementaryOffering>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOfferingDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOfferingRequest>SupplementaryOffering>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOfferingModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>PrimaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipPrimaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>RegisterCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipRegisterCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>SupplementaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>UserCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipUserCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>AddressInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeAddressInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>DFTPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>PrimaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>SubDFTAccount");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>SupplementaryOffering>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestSupplementaryOfferingAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>SupplementaryOffering>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>SupplementaryOffering>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestSupplementaryOfferingModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>CreateSubscriberRequest>Subscriber>SubPaymentMode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentMode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>DelGroupMemberRequest>PaymentRelation>DelPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationDelPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>DelGroupMemberRequest>PaymentRelation>NewDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationNewDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>FeeDeductionRequest>DeductObj>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductObjAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>FeeDeductionRollBackRequest>DeductObj>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestDeductObjAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>FeeQuotationRequest>ChargeElement>FeeAmount");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementFeeAmount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>FeeQuotationRequest>ChargeElement>OfferingFee");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFee.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>FeeQuotationRequest>ChargeElement>OperationFee");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOperationFee.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>FeeQuotationRequest>ChargeObj>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeObjAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ModifyStatementRequest>StatementScenario>AddStatementScenario");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioAddStatementScenario.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ModifyStatementRequest>StatementScenario>DelStatementScenario");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioDelStatementScenario.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryAccumulationUsageRequest>QueryObj>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageRequestQueryObjAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryConsumptionLimitResult>LimitUsageList>LimitParam");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultLimitUsageListLimitParam.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoRequest>QueryObj>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestQueryObjAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoRequest>QueryObj>SubAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestQueryObjSubAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Account>AcctInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Account>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Customer>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultCustomerOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>SubGroup>SubGroupInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSubGroupInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>SubGroup>SupplementaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSupplementaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Subscriber>SubscriberInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSubscriberInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Subscriber>SupplementaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSupplementaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryExpireSubToMicroRequest>TimePeriod>EndTime");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryExpireSubToMicroRequest>TimePeriod>StartTime");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryExpireSubToMicroResult>ExpireSubscriber>ExpireTime");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryExpireSubToMicroResult>ExpireSubscriber>ServiceNum");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingInstPropertyRequest>OfferingInst>ProductInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInstProductInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingInstPropertyRequest>OfferingOwner>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingInstPropertyResult>OfferingInst>OfferingInstProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstOfferingInstProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingInstPropertyResult>OfferingInst>ProductInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingRentCycleRequest>OfferingInst>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestOfferingInstOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingRentCycleResult>OfferingRentCycle>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultOfferingRentCycleOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingRentFailedFeeRequest>OfferingInst>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestOfferingInstOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingRentFailedFeeResult>OfferingRentFailedFee>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultOfferingRentFailedFeeOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryPaymentRelationResult>PaymentRelationList>PaymentLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPaymentLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryPaymentRelationResult>PaymentRelationList>PayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryRebateRequest>OfferingOwner>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryRebateRequestOfferingOwnerAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeRequest>AccessInfo>ObjectId");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeRequest>AccessInfo>ObjectIdType");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>AdditionalProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberAdditionalProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>BlacklistStatus");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>LifeCycleStatus");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>ManagementSatus");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>PaymentLimitUsage");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>PaymentType");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>PrimaryOfferName");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>ServiceNum");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInforToMicroRequest>AccessInfo>ObjectId");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInforToMicroRequest>AccessInfo>ObjectIdType");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInforToMicroResult>Subscriber>EffectiveDate");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInforToMicroResult>Subscriber>Language");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInforToMicroResult>Subscriber>SubStatus");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInforToMicroResult>Subscriber>SubType");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>SubActivationRequest>OfferingInst>OfferingKey");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubActivationRequestOfferingInstOfferingKey.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>SubDeactivationResult>AcctBalance>AmountList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalanceAmountList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>SupplementProfileRequest>Account>AutoPayChannel");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountAutoPayChannel.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>SupplementProfileRequest>Account>CreditLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountCreditLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AcctDeactivationRequest>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationRequestAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AcctDeactivationRequest>AdditionalProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationRequestAdditionalProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AcctDeactivationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AcctDeactivationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ActivateOfferingRequest>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingRequestOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ActivateOfferingRequest>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingRequestOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ActivateOfferingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ActivateOfferingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ActivateProductRequest>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ActivateProductRequestOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ActivateProductRequest>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ActivateProductRequestProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddGroupMemberRequest>GroupMember");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestGroupMember.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddGroupMemberRequest>GroupMemberOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestGroupMemberOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddGroupMemberRequest>PaymentRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddGroupMemberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddGroupMemberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddStatementRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddStatementRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings3() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddStatementResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddStatementResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentExtendRequest>ApplyObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestApplyObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentExtendRequest>newInstallment");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestNewInstallment.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentExtendRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentExtendResult>newInstallmentInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResultNewInstallmentInfoInatallmentDetail[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ApplyInstallmentExtendResult>newInstallmentInfo>InatallmentDetail");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "InatallmentDetail");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentExtendResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentRequest>ApplyObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestApplyObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentRequest>InatallmentPlan");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestInatallmentPlan.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentResult>InatallmentDetail");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentResultInatallmentDetail.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyPrepaymentRequest>ApplyObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentRequestApplyObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyPrepaymentRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyPrepaymentResult>InatallmentDetail");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultInatallmentDetail.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyPrepaymentResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyProdFreeValidityRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyProdFreeValidityResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AuthSubPwdRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AuthSubPwdResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAddGroupMemberRequest>PaymentRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAddGroupMemberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAddGroupMemberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAdjustmentRequest>AdjustmentInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestAdjustmentInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAdjustmentRequest>FreeUnitAdjustmentInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestFreeUnitAdjustmentInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAdjustmentRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAdjustmentResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeAcctOfferingRequest>AcctOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeAcctOfferingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeAcctOfferingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeCustInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeCustInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeInitCreditLimitRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeInitCreditLimitResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeMemberShortNoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeMemberShortNoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeMemberStatusRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeMemberStatusResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeOfferingPropertyRequest>OfferingInstProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequestOfferingInstProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeOfferingPropertyRequest>ProductInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequestProductInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeOfferingPropertyRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeOfferingPropertyResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangePayRelationRequest>PayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangePayRelationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangePayRelationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeScatteredAcctInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeScatteredAcctInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubActiveLimitDateRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubActiveLimitDateResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubBasicInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubBasicInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubInitBalanceRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubInitBalanceResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubOfferingRequest>PrimaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingRequestPrimaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubOfferingRequest>SupplementaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingRequestSupplementaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubOfferingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubOfferingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubStatusRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubStatusResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubValidityRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubValidityResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchCreateSubscriberRequest>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchCreateSubscriberRequest>SupplementaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSupplementaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchCreateSubscriberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchCreateSubscriberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchDelGroupMemberRequest>DelGroupMemberOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.OfferingKey[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchDelGroupMemberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchDelGroupMemberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchScatteredSubActivationRequest>SubBasicInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationRequestSubBasicInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchScatteredSubActivationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchScatteredSubActivationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubActivationRequest>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubActivationRequest>SubBasicInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestSubBasicInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubActivationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubActivationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubDeactivationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubDeactivationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSupplementCustInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSupplementCustInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSwitchGroupMemberRequest>PaymentRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSwitchGroupMemberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSwitchGroupMemberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CancelPreDeactivationRequest>ResumeStatus");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationRequestResumeStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CancelPreDeactivationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CancelPreDeactivationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingRequest>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingRequest>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingRequest>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingRequest>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingResult>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingResultModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctBillCycleRequest>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctBillCycleRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctBillCycleResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>AccountCredit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCredit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>AddAccountCredit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAddAccountCredit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>DelAccountCredit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestDelAccountCredit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitResult>CreditLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitResultCreditLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings4() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctInfoRequest>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctInfoRequest>AcctPayMethod");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethod.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctOwnershipRequest>NewOwnership");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnership.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctOwnershipRequest>OldOwnership");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestOldOwnership.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctOwnershipRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctOwnershipResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequest>AddLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequest>DelLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestDelLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequest>LimitObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestLimitObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequest>ModifyLimit");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustDFTAcctRequest>NewDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctRequestNewDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustDFTAcctRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustDFTAcctResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustHierachyRequest>AcctAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestAcctAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustHierachyRequest>NewParentAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestNewParentAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustHierachyRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustHierachyResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustInfoRequest>CustInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoRequestCustInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustNoticeSuppressRequest>SuppressSetting");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSetting.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustNoticeSuppressRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustNoticeSuppressResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustOfferingRequest>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingRequestAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustOfferingRequest>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingRequestDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustOfferingRequest>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingRequestModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustOfferingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustOfferingResult>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingResultModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustOfferingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupBasicInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupBasicInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberInfoRequest>GroupMember");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoRequestGroupMember.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingRequest>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingRequest>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingRequest>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingResult>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingResultModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemOffNetNumberRequest>GroupMemOffNetNumber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestGroupMemOffNetNumber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemOffNetNumberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemOffNetNumberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequest>AddOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestAddOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequest>DelOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestDelOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequest>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequest>PrimaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestPrimaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingResult>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingResultModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOffNetNumberRequest>GroupOffNetNumber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberRequestGroupOffNetNumber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOffNetNumberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOffNetNumberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupStatusRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupStatusResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeMemberShortNoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeMemberShortNoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeMemberStatusRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeMemberStatusResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingPropertyRequest>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingPropertyRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingPropertyResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingStatusRequest>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingStatusRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingStatusResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangePayRelationRequest>PaymentObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangePayRelationRequest>PaymentRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangePayRelationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangePayRelationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeProductStatusRequest>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeProductStatusRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeProductStatusResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRechageBlacklistRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRechageBlacklistResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRedFlagRequest>ChangeObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequestChangeObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRedFlagRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRedFlagResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRscRelationRequest>RscRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRscRelationRequest>SubAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestSubAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRscRelationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRscRelationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubDFTAcctRequest>DFTPayRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubDFTAcctRequest>SubDFTAccount");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubDFTAcctRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubDFTAcctResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubGrpDFTAcctRequest>NewDFTAcct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctRequestNewDFTAcct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubGrpDFTAcctRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubGrpDFTAcctResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubGrpPwdRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubGrpPwdResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityRequest>AddSubIdentity");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestAddSubIdentity.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityRequest>DelSubIdentity");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestDelSubIdentity.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityRequest>ModifySubIdentity");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestModifySubIdentity.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings5() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubInfoRequest>UserCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoRequestUserCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOfferingRequest>PrimaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestPrimaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOfferingRequest>SupplementaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOfferingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOfferingResult>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingResultModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOfferingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOwnershipRequest>NewOwnership");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnership.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOwnershipRequest>OldOwnership");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestOldOwnership.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOwnershipRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOwnershipResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeRequest>PaymentModeChange");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChange.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeRequest>SupplementaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestSupplementaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeResult>ModifyOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeResultModifyOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdResult>AcctBalanceChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultAcctBalanceChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdResult>CreditLimitChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultCreditLimitChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdResult>FreeUnitChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultFreeUnitChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubStatusRequest>AdditionalProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusRequestAdditionalProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubStatusRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubStatusResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubValidityRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubValidityResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeTaxExemptionRequest>AddExemption");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestAddExemption.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeTaxExemptionRequest>DelExemption");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestDelExemption.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeTaxExemptionRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeTaxExemptionResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CheckSubscribersGroupRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CheckSubscribersGroupResult>UserGroup");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultUserGroup.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CheckSubscribersGroupResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChkPrefixOpRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChkPrefixOpResult>NetworkDetails");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultNetworkDetails.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChkPrefixOpResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CleanUpCustDataRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CleanUpCustDataResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateAccountRequest>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateAccountRequest>Offering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateAccountRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateAccountResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateAccountResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateCustomerRequest>Customer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateCustomerRequest>DFTAccount");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestDFTAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateCustomerRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateCustomerResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>Group");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestGroup.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>RegisterCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestRegisterCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>SupplementaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestSupplementaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>UserCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestUserCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateGroupResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>PrimaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestPrimaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>RegisterCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestRegisterCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>SupplementaryOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSupplementaryOffering.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>UserCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestUserCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSuperGroupRequest>SuperGroupAccessCode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupRequestSuperGroupAccessCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSuperGroupRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSuperGroupResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CustDeactivationRequest>AdditionalProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationRequestAdditionalProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CustDeactivationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CustDeactivationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupMemberRequest>members");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMembers.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupMemberRequest>SuperGroupAccess");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestSuperGroupAccess.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupMemberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupMemberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupRequest>SuperGroupAccess");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupRequestSuperGroupAccess.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelGroupMemberRequest>DelGroupMemberOffering");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.OfferingKey[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelGroupMemberRequest>PaymentRelation");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelGroupMemberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelGroupMemberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelStatementRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DelStatementRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelStatementResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DelStatementResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRequest>DeductInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRequest>DeductObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRequest>OperationInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestOperationInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionResult>AcctBalanceChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResultAcctBalanceChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionResult>CreditLimitChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResultCreditLimitChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionResult>FreeUnitChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResultFreeUnitChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackRequest>DeductObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestDeductObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackRequest>RollBackFeeValues");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestRollBackFeeValues.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackResult>BalanceRollBack");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultBalanceRollBack.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackResult>CreditLimitChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultCreditLimitChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackResult>FreeUnitRollBack");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultFreeUnitRollBack.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationRequest>ChargeElement");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElement.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationRequest>ChargeObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>AcctBalanceChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultAcctBalanceChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings6() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>ChargeAmountList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultChargeAmountList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>ConsumptionLimitChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultConsumptionLimitChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>CreditLimitChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultCreditLimitChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>FreeUnitChangeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultFreeUnitChangeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">GroupDeactivationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">GroupDeactivationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">GroupDelMemberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">GroupDelMemberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">JoinSuperGroupRequest>members");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMembers.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">JoinSuperGroupRequest>SuperGroupAccess");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestSuperGroupAccess.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">JoinSuperGroupRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">JoinSuperGroupResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageCallHuntingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageCallHuntingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageGrpCallScreenNoRequest>CallScreenNoInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestCallScreenNoInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageGrpCallScreenNoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageGrpCallScreenNoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManAppendSubIdentityRequest>AppendSubIdentityList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestAppendSubIdentityList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManAppendSubIdentityRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManAppendSubIdentityResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManCrossGroupRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManCrossGroupResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManFphCallerRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManFphCallerResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ModifyStatementRequest>StatementScenario");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenario.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ModifyStatementRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ModifyStatementResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationRequest>PenaltyOfferingInstInfoList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestPenaltyOfferingInstInfoList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationResult>PenaltyChargeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationResultPenaltyChargeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAccumulationUsageRequest>QueryObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageRequestQueryObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAccumulationUsageRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAccumulationUsageResult>AccmUsageList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageResultAccmUsageList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAccumulationUsageResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAppendSubIdentityRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAppendSubIdentityResult>SubIdentityList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityResultSubIdentityList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAppendSubIdentityResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryBatchTaskStatusRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryBatchTaskStatusResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCallHuntingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCallHuntingResponseMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingResponseMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryConsumptionLimitRequest>QueryObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitRequestQueryObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryConsumptionLimitRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryConsumptionLimitResult>LimitUsageList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultLimitUsageList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryConsumptionLimitResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoRequest>QueryObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestQueryObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>Customer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>SubGroup");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroup.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryDataPackageUsageRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryDataPackageUsageResult>UsageList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultUsageList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryDataPackageUsageResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroRequest>PagingInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestPagingInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroRequest>TimePeriod");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestTimePeriod.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroResult>ExpireSubscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultExpireSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroResult>PagingInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultPagingInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryFphCallerRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryFphCallerResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupListBySubscriberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupListBySubscriberResult>GroupList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultGroupList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupListBySubscriberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemberListRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemberListResult>GroupMemberList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultGroupMemberList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemberListResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemOffNetNumberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemOffNetNumberResult>GroupMemOffNetNumber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemOffNetNumberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupOffNetNumberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupOffNetNumberResult>GroupOffNetNumber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberResultGroupOffNetNumber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupOffNetNumberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGrpCallScreenNoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGrpCallScreenNoResult>CallScreenNoInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultCallScreenNoInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGrpCallScreenNoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryInstallmentRequest>QueryObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentRequestQueryObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryInstallmentRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryInstallmentResult>InatallmentDetail");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentResultInatallmentDetail.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryInstallmentResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryLoanOfferingInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryLoanOfferingInfoResult>LoanOfferingInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoResultLoanOfferingInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryLoanOfferingInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyRequest>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyRequest>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyResult>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentCycleRequest>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentCycleRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentCycleResult>OfferingRentCycle");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultOfferingRentCycle.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentCycleResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentFailedFeeRequest>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentFailedFeeRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentFailedFeeResult>OfferingRentFailedFee");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultOfferingRentFailedFee.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentFailedFeeResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings7() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageRequest>PayAccount");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestPayAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageRequest>PayObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestPayObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageResult>LimitUsageList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageResultLimitUsageList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationRequest>PayAccount");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestPayAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationRequest>PaymentObj");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestPaymentObj.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationResult>PaymentRelationList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryRebateRequest>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryRebateRequestOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryRebateRequest>OfferingOwner");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryRebateRequestOfferingOwner.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryRebateRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryRebateRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryRebateResult>Rebate");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryRebateResultRebate.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryRebateResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryRebateResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInfoExToCubeRequest>AccessInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeRequestAccessInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInfoExToCubeRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInfoExToCubeResult>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInfoExToCubeResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInforToMicroRequest>AccessInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroRequestAccessInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInforToMicroRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInforToMicroResult>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroResultSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInforToMicroResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubLifeCycleRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubLifeCycleResult>LifeCycleStatus");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultLifeCycleStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubLifeCycleResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneInfoResult>ZoneList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoResultZoneList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneMappingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneMappingResult>zoneDetail");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingResultZoneDetail.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneMappingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubActivationRequest>OfferingInst");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubActivationRequestOfferingInst.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubActivationRequest>SubBasicInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubActivationRequestSubBasicInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubActivationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubActivationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubActivationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubActivationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubDeactivationRequest>AdditionalProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestAdditionalProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubDeactivationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubDeactivationResult>AcctBalance");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalance.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubDeactivationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>AddressInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAddressInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>NewOwnership");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestNewOwnership.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>RegisterCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestRegisterCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>UserCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestUserCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SynDTDiscountRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SynDTDiscountResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SynDTUserGroupRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SynDTUserGroupResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctDeactivationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActivateOfferingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActivateProductRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ActivateProductRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddGroupMemberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddStatementRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AddStatementRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentExtendRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentExtendResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentResultInatallmentDetail[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentResult>InatallmentDetail");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "InatallmentDetail");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyPrepaymentRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyPrepaymentResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyProdFreeValidityRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyProdFreeValidityResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AuthSubPwdRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchAddGroupMemberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchAdjustmentRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchCancelPreDeactivationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchCancelPreDeactivationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeAcctOfferingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeCustInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeInitCreditLimitRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeMemberShortNoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeMemberStatusRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeOfferingPropertyRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangePayRelationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeScatteredAcctInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubActiveLimitDateRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubBasicInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubInitBalanceRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubOfferingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubStatusRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubValidityRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchCreateSubscriberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchDelGroupMemberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchScatteredSubActivationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSubActivationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSubDeactivationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSupplementCustInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSwitchGroupMemberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CancelPreDeactivationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAccountOfferingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAccountOfferingResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingResultModifyOffering[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingResult>ModifyOffering");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyOffering");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctBillCycleRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctCreditLimitRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctCreditLimitResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitResultCreditLimit[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitResult>CreditLimit");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditLimit");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctOwnershipRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeConsumptionLimitRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustDFTAcctRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustHierachyRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings8() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustNoticeSuppressRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustOfferingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustOfferingResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingResultModifyOffering[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustOfferingResult>ModifyOffering");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyOffering");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupBasicInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemberInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemberOfferingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemberOfferingResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingResultModifyOffering[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingResult>ModifyOffering");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyOffering");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemOffNetNumberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupOfferingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupOfferingResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingResultModifyOffering[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingResult>ModifyOffering");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyOffering");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupOffNetNumberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupStatusRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeMemberShortNoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeMemberStatusRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeOfferingPropertyRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInst[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingPropertyRequest>OfferingInst");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInst");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeOfferingStatusRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestOfferingInst[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingStatusRequest>OfferingInst");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInst");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangePayRelationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeProductStatusRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInst[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeProductStatusRequest>OfferingInst");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInst");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeRechageBlacklistRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeRedFlagRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeRscRelationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubDFTAcctRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubGrpDFTAcctRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubGrpPwdRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubIdentityRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubOfferingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubOfferingResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingResultModifyOffering[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOfferingResult>ModifyOffering");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyOffering");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubOwnershipRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubPaymentModeRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubPaymentModeResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeResultModifyOffering[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeResult>ModifyOffering");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyOffering");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubPwdRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubPwdResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubStatusRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubStatusResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubValidityRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubValidityResponse");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeTaxExemptionRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CheckSubscribersGroupRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CheckSubscribersGroupResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChkPrefixOpRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChkPrefixOpResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultNetworkDetails[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChkPrefixOpResult>NetworkDetails");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NetworkDetails");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CleanUpCustDataRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateAccountRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateCustomerRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateCustomerResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Property");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateGroupRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateSubscriberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateSubscriberResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateSuperGroupRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustDeactivationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeleteSuperGroupMemberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeleteSuperGroupRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelGroupMemberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelStatementRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.DelStatementRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionRollBackRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionRollBackResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeQuotationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeQuotationResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FphCaller");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FphCaller.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FPHCallerOperatorType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.FPHCallerOperatorType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupDeactivationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupDelMemberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "JoinSuperGroupRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManageCallHuntingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManageGrpCallScreenNoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManAppendSubIdentityRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManCrossGroupRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManFphCallerRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyStatementRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInstInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PenaltyCalculationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PenaltyCalculationResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationResultPenaltyChargeList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationResult>PenaltyChargeList");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PenaltyChargeList");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryAccumulationUsageRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryAccumulationUsageResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageResultAccmUsageList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAccumulationUsageResult>AccmUsageList");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AccmUsageList");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryAppendSubIdentityRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryAppendSubIdentityResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityResultSubIdentityList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAppendSubIdentityResult>SubIdentityList");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubIdentityList");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryBatchTaskStatusRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryBatchTaskStatusResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCallHuntingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCallHuntingResponse");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryConsumptionLimitRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryConsumptionLimitResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultLimitUsageList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryConsumptionLimitResult>LimitUsageList");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitUsageList");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCustomerInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCustomerInfoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryDataPackageUsageRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryDataPackageUsageResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryExpireSubToMicroRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryExpireSubToMicroResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryFphCallerRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryFphCallerResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupListBySubscriberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupListBySubscriberResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultGroupList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupListBySubscriberResult>GroupList");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupList");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupMemberListRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupMemberListResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupMemOffNetNumberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupMemOffNetNumberResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberResultGroupMemOffNetNumber[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemOffNetNumberResult>GroupMemOffNetNumber");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupMemOffNetNumber");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    private void addBindings9() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupOffNetNumberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupOffNetNumberResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberResultGroupOffNetNumber[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupOffNetNumberResult>GroupOffNetNumber");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupOffNetNumber");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGrpCallScreenNoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGrpCallScreenNoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultCallScreenNoInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGrpCallScreenNoResult>CallScreenNoInfo");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CallScreenNoInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryInstallmentRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryInstallmentResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryLoanOfferingInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryLoanOfferingInfoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoResultLoanOfferingInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryLoanOfferingInfoResult>LoanOfferingInfo");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LoanOfferingInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingInstPropertyRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingInstPropertyResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInst[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyResult>OfferingInst");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInst");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingRentCycleRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestOfferingInst[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentCycleRequest>OfferingInst");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInst");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingRentCycleResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultOfferingRentCycle[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentCycleResult>OfferingRentCycle");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingRentCycle");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingRentFailedFeeRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestOfferingInst[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentFailedFeeRequest>OfferingInst");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInst");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingRentFailedFeeResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultOfferingRentFailedFee[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentFailedFeeResult>OfferingRentFailedFee");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingRentFailedFee");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentLimitUsageRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentLimitUsageResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageResultLimitUsageList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageResult>LimitUsageList");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitUsageList");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentRelationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentRelationResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryRebateRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryRebateRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryRebateResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryRebateResultRebate[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryRebateResult>Rebate");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Rebate");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubInfoExToCubeRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubInfoExToCubeResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubInforToMicroRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubInforToMicroResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubLifeCycleRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubLifeCycleResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryZoneInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryZoneInfoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoResultZoneList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneInfoResult>ZoneList");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ZoneList");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryZoneMappingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryZoneMappingResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingResultZoneDetail[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneMappingResult>zoneDetail");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "zoneDetail");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubActivationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubActivationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubActivationResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubActivationResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubDeactivationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubDeactivationResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementProfileRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SynDTDiscountRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SynDTUserGroupRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", ">RequestHeader>AdditionalProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderAdditionalProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", ">RequestHeader>TimeFormat");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderTimeFormat.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", ">ResultHeader>AdditionalProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbscommon.ResultHeaderAdditionalProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "OperatorInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbscommon.OperatorInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "OwnershipInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbscommon.OwnershipInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "SecurityInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbscommon.SecurityInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();

            _call.setProperty(MessageContext.HTTP_TRANSPORT_VERSION, HTTPConstants.HEADER_PROTOCOL_V11);

            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName
                                = (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class) cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class) cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultMsg chkPrefixOp(com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpRequestMsg chkPrefixOpRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChkPrefixOp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChkPrefixOp"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{chkPrefixOpRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationResultMsg penaltyCalculation(com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestMsg penaltyCalculationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PenaltyCalculation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PenaltyCalculation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{penaltyCalculationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoResultMsg batchChangeScatteredAcctInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoRequestMsg batchChangeScatteredAcctInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeScatteredAcctInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeScatteredAcctInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeScatteredAcctInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResultMsg applyInstallmentExtend(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestMsg applyInstallmentExtendRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ApplyInstallmentExtend");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ApplyInstallmentExtend"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{applyInstallmentExtendRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoResultMsg batchChangeCustInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoRequestMsg batchChangeCustInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeCustInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeCustInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeCustInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyResultMsg batchChangeOfferingProperty(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequestMsg batchChangeOfferingPropertyRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeOfferingProperty");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeOfferingProperty"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeOfferingPropertyRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerResultMsg manFphCaller(com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerRequestMsg manFphCallerRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManFphCaller");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManFphCaller"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manFphCallerRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerResultMsg queryFphCaller(com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerRequestMsg queryFphCallerRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryFphCaller");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryFphCaller"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryFphCallerRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdResultMsg authSubPwd(com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdRequestMsg authSubPwdRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AuthSubPwd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AuthSubPwd"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{authSubPwdRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultMsg applyPrepayment(com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentRequestMsg applyPrepaymentRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ApplyPrepayment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ApplyPrepayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{applyPrepaymentRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentResultMsg applyInstallment(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestMsg applyInstallmentRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ApplyInstallment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ApplyInstallment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{applyInstallmentRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentResultMsg queryInstallment(com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentRequestMsg queryInstallmentRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryInstallment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryInstallment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryInstallmentRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageResultMsg queryAccumulationUsage(com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageRequestMsg queryAccumulationUsageRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryAccumulationUsage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryAccumulationUsage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryAccumulationUsageRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultMsg checkSubscribersGroup(com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupRequestMsg checkSubscribersGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CheckSubscribersGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckSubscribersGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{checkSubscribersGroupRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResultMsg applyProdFreeValidity(com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityRequestMsg applyProdFreeValidityRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ApplyProdFreeValidity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ApplyProdFreeValidity"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{applyProdFreeValidityRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultMsg queryDataPackageUsage(com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageRequestMsg queryDataPackageUsageRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryDataPackageUsage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryDataPackageUsage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryDataPackageUsageRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupResultMsg synDTUserGroup(com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupRequestMsg synDTUserGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SynDTUserGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SynDTUserGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{synDTUserGroupRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoResultMsg queryZoneInfo(com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoRequestMsg queryZoneInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryZoneInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryZoneInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryZoneInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoResultMsg queryLoanOffering(com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoRequestMsg queryLoanOfferingInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryLoanOffering");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryLoanOffering"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryLoanOfferingInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultMsg queryPaymentRelation(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestMsg queryPaymentRelationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryPaymentRelation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryPaymentRelation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryPaymentRelationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultMsg queryOfferingInstProperty(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestMsg queryOfferingInstPropertyRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryOfferingInstProperty");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryOfferingInstProperty"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryOfferingInstPropertyRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultMsg queryGroupMemberList(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListRequestMsg queryGroupMemberListRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryGroupMemberList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryGroupMemberList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryGroupMemberListRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultMsg queryGroupListBySubscriber(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberRequestMsg queryGroupListBySubscriberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryGroupListBySubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryGroupListBySubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryGroupListBySubscriberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultMsg queryCustomerInfo(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestMsg queryCustomerInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryCustomerInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryCustomerInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryCustomerInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipResultMsg changeAcctOwnership(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestMsg changeAcctOwnershipRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeAcctOwnership");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeAcctOwnership"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeAcctOwnershipRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipResultMsg changeSubOwnership(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestMsg changeSubOwnershipRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubOwnership");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubOwnership"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubOwnershipRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressResultMsg changeCustNoticeSuppress(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestMsg changeCustNoticeSuppressRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeCustNoticeSuppress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCustNoticeSuppress"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeCustNoticeSuppressRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitResultMsg changeConsumptionLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestMsg changeConsumptionLimitRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeConsumptionLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeConsumptionLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeConsumptionLimitRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationResultMsg custDeactivation(com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationRequestMsg custDeactivationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CustDeactivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CustDeactivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{custDeactivationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationResultMsg acctDeactivation(com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationRequestMsg acctDeactivationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AcctDeactivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AcctDeactivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{acctDeactivationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionResultMsg changeTaxExemption(com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestMsg changeTaxExemptionRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeTaxExemption");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeTaxExemption"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeTaxExemptionRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.DelStatementResultMsg delStatement(com.huawei.www.bme.cbsinterface.bcservices.DelStatementRequestMsg delStatementRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DelStatement");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DelStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{delStatementRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.DelStatementResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.DelStatementResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.DelStatementResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementResultMsg modifyStatement(com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestMsg modifyStatementRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifyStatement");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifyStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{modifyStatementRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.AddStatementResultMsg addStatement(com.huawei.www.bme.cbsinterface.bcservices.AddStatementRequestMsg addStatementRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddStatement");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{addStatementRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.AddStatementResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.AddStatementResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.AddStatementResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoResultMsg batchChangeMemberShortNo(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoRequestMsg batchChangeMemberShortNoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeMemberShortNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeMemberShortNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeMemberShortNoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationResultMsg batchSubDeactivation(com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationRequestMsg batchSubDeactivationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchSubDeactivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchSubDeactivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchSubDeactivationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationResultMsg batchSubActivation(com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestMsg batchSubActivationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchSubActivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchSubActivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchSubActivationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusResultMsg batchChangeMemberStatus(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusRequestMsg batchChangeMemberStatusRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeMemberStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeMemberStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeMemberStatusRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberResultMsg batchDelGroupMember(com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberRequestMsg batchDelGroupMemberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchDelGroupMember");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchDelGroupMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchDelGroupMemberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityResultMsg batchChangeSubValidity(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityRequestMsg batchChangeSubValidityRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeSubValidity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeSubValidity"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeSubValidityRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberResultMsg batchAddGroupMember(com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestMsg batchAddGroupMemberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchAddGroupMember");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchAddGroupMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchAddGroupMemberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberResultMsg batchSwitchGroupMember(com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestMsg batchSwitchGroupMemberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchSwitchGroupMember");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchSwitchGroupMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchSwitchGroupMemberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceResultMsg batchChangeSubInitBalance(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceRequestMsg batchChangeSubInitBalanceRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeSubInitBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeSubInitBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeSubInitBalanceRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingResultMsg batchChangeSubOffering(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingRequestMsg batchChangeSubOfferingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeSubOffering");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeSubOffering"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeSubOfferingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoResultMsg batchChangeSubBasicInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoRequestMsg batchChangeSubBasicInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeSubBasicInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeSubBasicInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeSubBasicInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoResultMsg changeMemberShortNo(com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoRequestMsg changeMemberShortNoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeMemberShortNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeMemberShortNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeMemberShortNoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusResultMsg changeMemberStatus(com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusRequestMsg changeMemberStatusRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeMemberStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeMemberStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeMemberStatusRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoResultMsg changeGroupMemberInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoRequestMsg changeGroupMemberInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeGroupMemberInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeGroupMemberInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeGroupMemberInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusResultMsg changeGroupStatus(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusRequestMsg changeGroupStatusRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeGroupStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeGroupStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeGroupStatusRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationResultMsg groupDeactivation(com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationRequestMsg groupDeactivationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GroupDeactivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GroupDeactivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{groupDeactivationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingResultMsg changeGroupOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestMsg changeGroupOfferingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeGroupOffering");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeGroupOffering"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeGroupOfferingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingResultMsg changeGroupMemberOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestMsg changeGroupMemberOfferingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeGroupMemberOffering");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeGroupMemberOffering"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeGroupMemberOfferingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoResultMsg changeGroupBasicInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoRequestMsg changeGroupBasicInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeGroupBasicInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeGroupBasicInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeGroupBasicInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberResultMsg delGroupMember(com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestMsg delGroupMemberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DelGroupMember");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DelGroupMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{delGroupMemberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberResultMsg addGroupMember(com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestMsg addGroupMemberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AddGroupMember");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddGroupMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{addGroupMemberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateGroupResultMsg createGroup(com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestMsg createGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{createGroupRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CreateGroupResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CreateGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.CreateGroupResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityResultMsg changeSubIdentity(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestMsg changeSubIdentityRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubIdentity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubIdentity"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubIdentityRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctResultMsg changeSubDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestMsg changeSubDFTAcctRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubDFTAcct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubDFTAcct"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubDFTAcctRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctResultMsg changeSubGrpDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctRequestMsg changeSubGrpDFTAcctRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubGrpDFTAcct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubGrpDFTAcct"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubGrpDFTAcctRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctResultMsg changeCustDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctRequestMsg changeCustDFTAcctRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeCustDFTAcct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCustDFTAcct"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeCustDFTAcctRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileResultMsg supplementProfile(com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestMsg supplementProfileRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SupplementProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SupplementProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{supplementProfileRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoResultMsg changeSubInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoRequestMsg changeSubInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoResultMsg changeCustInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoRequestMsg changeCustInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeCustInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCustInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeCustInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoResultMsg changeAcctInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestMsg changeAcctInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeAcctInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeAcctInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeAcctInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationResultMsg changePayRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestMsg changePayRelationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangePayRelation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangePayRelation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changePayRelationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleResultMsg changeAcctBillCycle(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestMsg changeAcctBillCycleRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeAcctBillCycle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeAcctBillCycle"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeAcctBillCycleRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberResultMsg createSubscriber(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestMsg createSubscriberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{createSubscriberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerResultMsg createCustomer(com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestMsg createCustomerRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateCustomer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{createCustomerRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateAccountResultMsg createAccount(com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestMsg createAccountRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{createAccountRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CreateAccountResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CreateAccountResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.CreateAccountResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SubActivationResultMsg subActivation(com.huawei.www.bme.cbsinterface.bcservices.SubActivationRequestMsg subActivationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SubActivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubActivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{subActivationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.SubActivationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.SubActivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.SubActivationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusResultMsg changeSubStatus(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusRequestMsg changeSubStatusRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubStatusRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultMsg changeSubPwd(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdRequestMsg changeSubPwdRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubPwd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubPwd"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubPwdRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdResultMsg changeSubGrpPwd(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdRequestMsg changeSubGrpPwdRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubGrpPwd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubGrpPwd"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubGrpPwdRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultMsg subDeactivation(com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestMsg changeSubGrpPwdRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SubDeactivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubDeactivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubGrpPwdRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationResultMsg cancelPreDeactivation(com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationRequestMsg cancelPreDeactivationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CancelPreDeactivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CancelPreDeactivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{cancelPreDeactivationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingResultMsg changeSubOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestMsg changeSubOfferingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubOffering");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubOffering"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubOfferingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityResultMsg changeSubValidity(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityRequestMsg changeSubValidityRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubValidity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubValidity"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubValidityRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeResultMsg changeSubPaymentMode(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestMsg changeSubPaymentModeRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubPaymentMode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubPaymentMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubPaymentModeRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingResultMsg activateOffering(com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingRequestMsg activateOfferingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ActivateOffering");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ActivateOffering"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{activateOfferingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusResultMsg changeOfferingStatus(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestMsg changeOfferingStatusRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeOfferingStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeOfferingStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeOfferingStatusRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusResultMsg changeProductStatus(com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestMsg changeProductStatusRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeProductStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeProductStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeProductStatusRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitResultMsg changeAcctCreditLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestMsg changeAcctCreditLimitRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeAcctCreditLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeAcctCreditLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeAcctCreditLimitRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyResultMsg changeOfferingProperty(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestMsg changeOfferingPropertyRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeOfferingProperty");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeOfferingProperty"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeOfferingPropertyRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistResultMsg changeRechageBlacklist(com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistRequestMsg changeRechageBlacklistRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeRechageBlacklist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeRechageBlacklist"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeRechageBlacklistRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingResultMsg changeAccountOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestMsg changeAccountOfferingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeAccountOffering");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeAccountOffering"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeAccountOfferingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingResultMsg changeCustOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingRequestMsg changeCustOfferingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeCustOffering");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCustOffering"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeCustOfferingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberResultMsg batchCreateSubscriber(com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestMsg batchCreateSubscriberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchCreateSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchCreateSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchCreateSubscriberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusResultMsg batchChangeSubStatus(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusRequestMsg batchChangeSubStatusRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeSubStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeSubStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeSubStatusRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateResultMsg batchChangeSubActiveLimitDate(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateRequestMsg batchChangeSubActiveLimitDateRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeSubActiveLimitDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeSubActiveLimitDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeSubActiveLimitDateRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultMsg querySubLifeCycle(com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleRequestMsg querySubLifeCycleRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubLifeCycle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubLifeCycle"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubLifeCycleRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultMsg queryOfferingRentCycle(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestMsg queryOfferingRentCycleRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryOfferingRentCycle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryOfferingRentCycle"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryOfferingRentCycleRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResultMsg feeDeduction(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestMsg feeDeductionRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FeeDeduction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FeeDeduction"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{feeDeductionRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultMsg feeDeductionRollBack(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestMsg feeDeductionRollBackRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FeeDeductionRollBack");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FeeDeductionRollBack"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{feeDeductionRollBackRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataResultMsg cleanUpCustData(com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataRequestMsg cleanUpCustDataRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CleanUpCustData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CleanUpCustData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{cleanUpCustDataRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultMsg feeQuotation(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestMsg feeQuotationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FeeQuotation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FeeQuotation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{feeQuotationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultMsg queryConsumptionLimitUsage(com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitRequestMsg queryConsumptionLimitRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryConsumptionLimitUsage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryConsumptionLimitUsage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryConsumptionLimitRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageResultMsg queryPaymentLimitUsage(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestMsg queryPaymentLimitUsageRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryPaymentLimitUsage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryPaymentLimitUsage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryPaymentLimitUsageRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountResultMsg synDTDiscount(com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountRequestMsg synDTDiscountRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SynDTDiscount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SynDTDiscount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{synDTDiscountRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitResultMsg batchChangeInitCreditLimit(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitRequestMsg batchChangeInitCreditLimitRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeInitCreditLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeInitCreditLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeInitCreditLimitRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyResultMsg changeCustHierachy(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestMsg changeCustHierachyRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeCustHierachy");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCustHierachy"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeCustHierachyRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusResultMsg queryBatchTaskStatus(com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusRequestMsg queryBatchTaskStatusRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryBatchTaskStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryBatchTaskStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryBatchTaskStatusRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingResultMsg batchChangeAcctOffering(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestMsg batchChangeAcctOfferingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeAcctOffering");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeAcctOffering"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangeAcctOfferingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberResultMsg changeGroupMemOffNetNumber(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestMsg changeGroupMemOffNetNumberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeGroupMemOffNetNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeGroupMemOffNetNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeGroupMemOffNetNumberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberResultMsg changeGroupOffNetNumber(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberRequestMsg changeGroupOffNetNumberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeGroupOffNetNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeGroupOffNetNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeGroupOffNetNumberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberResultMsg queryGroupMemOffNetNumber(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberRequestMsg queryGroupMemOffNetNumberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryGroupMemOffNetNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryGroupMemOffNetNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryGroupMemOffNetNumberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberResultMsg queryGroupOffNetNumber(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberRequestMsg queryGroupOffNetNumberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryGroupOffNetNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryGroupOffNetNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryGroupOffNetNumberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryRebateResultMsg queryRebate(com.huawei.www.bme.cbsinterface.bcservices.QueryRebateRequestMsg queryRebateRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryRebate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryRebate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryRebateRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryRebateResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryRebateResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryRebateResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationResultMsg changeRscRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestMsg changeRscRelationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeRscRelation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeRscRelation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeRscRelationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagResultMsg changeRedFlag(com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequestMsg changeRedFlagRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeRedFlag");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeRedFlag"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeRedFlagRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityResultMsg manAppendSubIdentity(com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestMsg manAppendSubIdentityRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManAppendSubIdentity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManAppendSubIdentity"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manAppendSubIdentityRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityResultMsg queryAppendSubIdentity(com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityRequestMsg manAppendSubIdentityRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryAppendSubIdentity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryAppendSubIdentity"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manAppendSubIdentityRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberResultMsg groupDelMember(com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberRequestMsg groupDelMemberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GroupDelMember");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GroupDelMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{groupDelMemberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupResultMsg manCrossGroup(com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupRequestMsg manCrossGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManCrossGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManCrossGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manCrossGroupRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupResultMsg createSuperGroup(com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupRequestMsg createSuperGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateSuperGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSuperGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{createSuperGroupRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupResultMsg joinSuperGroup(com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMsg joinSuperGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("JoinSuperGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "JoinSuperGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{joinSuperGroupRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupResultMsg deleteSuperGroup(com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupRequestMsg deleteSuperGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteSuperGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSuperGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{deleteSuperGroupRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberResultMsg deleteSuperGroupMember(com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMsg deleteSuperGroupMemberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteSuperGroupMember");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSuperGroupMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{deleteSuperGroupMemberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroResultMsg querySubInforToMicro(com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroRequestMsg querySubInforToMicroRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubInforToMicro");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubInforToMicro"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubInforToMicroRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultMsg querySubInfoExToCube(com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeRequestMsg querySubInfoExToCubeRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubInfoExToCube");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubInfoExToCube"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubInfoExToCubeRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultMsg queryExpireSubToMicro(com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestMsg queryExpireSubToMicroRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryExpireSubToMicro");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryExpireSubToMicro"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryExpireSubToMicroRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultMsg queryOfferingRentFailedFee(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestMsg queryOfferingRentFailedFeeRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryOfferingRentFailedFee");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryOfferingRentFailedFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryOfferingRentFailedFeeRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingResultMsg queryZoneMapping(com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingRequestMsg queryZoneMappingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryZoneMapping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryZoneMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryZoneMappingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationResultMsg batchChangePayRelation(com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestMsg batchChangePayRelationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangePayRelation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangePayRelation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchChangePayRelationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationResultMsg batchScatteredSubActivation(com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationRequestMsg batchScatteredSubActivationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchScatteredSubActivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchScatteredSubActivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchScatteredSubActivationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingResultMsg manageCallHunting(com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingRequestMsg manageCallHuntingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManageCallHunting");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManageCallHunting"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manageCallHuntingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingResponseMsg queryCallHunting(com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingRequestMsg queryCallHuntingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryCallHunting");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryCallHunting"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryCallHuntingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingResponseMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingResponseMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingResponseMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoResultMsg manageGrpCallScreenNo(com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestMsg manageGrpCallScreenNoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManageGrpCallScreenNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManageGrpCallScreenNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manageGrpCallScreenNoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultMsg queryGrpCallScreenNo(com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoRequestMsg queryGrpCallScreenNoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryGrpCallScreenNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryGrpCallScreenNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryGrpCallScreenNoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentResultMsg batchAdjustment(com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestMsg batchAdjustmentRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchAdjustment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchAdjustment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchAdjustmentRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoResultMsg batchSupplementCustInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoRequestMsg batchSupplementCustInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchSupplementCustInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchSupplementCustInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchSupplementCustInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
