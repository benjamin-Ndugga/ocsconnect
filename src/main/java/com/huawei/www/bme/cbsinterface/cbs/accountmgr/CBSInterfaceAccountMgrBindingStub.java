/**
 * CBSInterfaceAccountMgrBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class CBSInterfaceAccountMgrBindingStub extends org.apache.axis.client.Stub implements com.huawei.www.bme.cbsinterface.cbs.accountmgr.CBSInterfaceAccountMgr {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[25];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "QueryBalanceRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryBalanceRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryBalanceResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "QueryBalanceResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VoucherRecharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "VoucherRechargeRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "VoucherRechargeResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Payment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "PaymentRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">PaymentRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">PaymentResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "PaymentResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActiveFirst");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ActiveFirstRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ActiveFirstRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ActiveFirstResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ActiveFirstResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReversePayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ReversePaymentRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ReversePaymentRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ReversePaymentResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ReversePaymentResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AdjustAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "AdjustAccountRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">AdjustAccountRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">AdjustAccountResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "AdjustAccountResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VoucherRechargeEnquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "VoucherRechargeEnquiryRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeEnquiryRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeEnquiryResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "VoucherRechargeEnquiryResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransferAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "TransferAccountRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">TransferAccountRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">TransferAccountResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "TransferAccountResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PaymentEnquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "PaymentEnquiryRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">PaymentEnquiryRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">PaymentEnquiryResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "PaymentEnquiryResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CumulateEnquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "CumulateEnquiryRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">CumulateEnquiryRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">CumulateEnquiryResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "CumulateEnquiryResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VoucherEnquiryBySeq");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "VoucherEnquiryBySeqRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherEnquiryBySeqRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherEnquiryBySeqResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "VoucherEnquiryBySeqResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VoucherEnquiryByPIN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "VoucherEnquiryByPINRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherEnquiryByPINRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherEnquiryByPINResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "VoucherEnquiryByPINResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OneOffDeduction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "OneOffDeductionRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">OneOffDeductionRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">OneOffDeductionResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "OneOffDeductionResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ServiceHandleFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ServiceHandleFeeRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ServiceHandleFeeRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ServiceHandleFeeResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ServiceHandleFeeResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryTransferLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "QueryTransferLogRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryTransferLogRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryTransferLogResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "QueryTransferLogResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryAdjustmentLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "QueryAdjustmentLogRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryAdjustmentLogRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryAdjustmentLogResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "QueryAdjustmentLogResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyVoucherState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ModifyVoucherStateRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ModifyVoucherStateRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ModifyVoucherStateResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ModifyVoucherStateResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BalanceToValidity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "BalanceToValidityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">BalanceToValidityRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">BalanceToValidityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "BalanceToValidityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransInPpsPos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "TransInPpsPosRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">TransInPpsPosRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">TransInPpsPosResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "TransInPpsPosResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExchangeAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ExchangeAccountRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ExchangeAccountRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ExchangeAccountResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ExchangeAccountResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModSubBillCycleType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ModSubBillCycleTypeRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ModSubBillCycleTypeRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ModSubBillCycleTypeResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "ModSubBillCycleTypeResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AdjustSubAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "AdjustSubAccountRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">AdjustSubAccountRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">AdjustSubAccountResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "AdjustSubAccountResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubAccountRecharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "SubAccountRechargeRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">SubAccountRechargeRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">SubAccountRechargeResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "SubAccountRechargeResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VoucherRechargeBySeq");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "VoucherRechargeBySeqRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeBySeqRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeBySeqResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "VoucherRechargeBySeqResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BonusValidity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "BonusValidityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">BonusValidityRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">BonusValidityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", "BonusValidityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

    }

    public CBSInterfaceAccountMgrBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CBSInterfaceAccountMgrBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CBSInterfaceAccountMgrBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
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
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ActiveFirstRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ActiveFirstResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">AdjustAccountRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">AdjustAccountResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">AdjustSubAccountRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">AdjustSubAccountResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">BalanceToValidityRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">BalanceToValidityResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">BonusValidityRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">BonusValidityResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">CumulateEnquiryRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">CumulateEnquiryResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ExchangeAccountRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ExchangeAccountResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ModifyVoucherStateRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ModifyVoucherStateResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ModSubBillCycleTypeRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ModSubBillCycleTypeResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">OneOffDeductionRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">OneOffDeductionResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">PaymentEnquiryRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">PaymentEnquiryResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">PaymentRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">PaymentResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryAdjustmentLogRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryAdjustmentLogResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryBalanceRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryBalanceResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryTransferLogRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryTransferLogResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ReversePaymentRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ReversePaymentResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ServiceHandleFeeRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">ServiceHandleFeeResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">SubAccountRechargeRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">SubAccountRechargeResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">TransferAccountRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">TransferAccountResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">TransInPpsPosRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">TransInPpsPosResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherEnquiryByPINRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherEnquiryByPINResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherEnquiryBySeqRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherEnquiryBySeqResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeBySeqRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeBySeqResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeEnquiryRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeEnquiryResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">VoucherRechargeResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>BonusValidityRequest>BonusList>BonusInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.BonusValidityRequestBonusListBonusInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>PaymentEnquiryResult>PaymentLog>PaymentBonus");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentEnquiryResultPaymentLogPaymentBonus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>QueryAdjustmentLogResult>AdjustmentLog>AdjustmentItem");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryAdjustmentLogResultAdjustmentLogAdjustmentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>QueryTransferLogResult>TransferLog>TransferAcctItem");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogResultTransferLogTransferAcctItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>ServiceHandleFeeRequest>ParamList>Param");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ServiceHandleFeeRequestParamListParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>VoucherRechargeEnquiryResult>RechargeLog>RechargeBonus");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryResultRechargeLogRechargeBonus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">AdjustAccountRequest>ModifyAcctFeeList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFeeType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFee");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">AdjustAccountRequest>ModifyType");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequestModifyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">AdjustAccountRequest>OverDraftFlag");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequestOverDraftFlag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">AdjustSubAccountRequest>ModifySubAcctList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifySubAcctType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifySubAcctType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifySubAcct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">BonusValidityRequest>BonusList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.BonusValidityRequestBonusListBonusInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>BonusValidityRequest>BonusList>BonusInfo");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BonusInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">CumulateEnquiryResult>CumulativeItem");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.CumulateEnquiryResultCumulativeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">PaymentEnquiryResult>PaymentLog");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentEnquiryResultPaymentLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">PaymentResult>AcctChgRecList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">QueryAdjustmentLogResult>AdjustmentLog");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryAdjustmentLogResultAdjustmentLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">QueryTransferLogResult>TransferLog");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogResultTransferLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">ReversePaymentResult>AcctChgRecList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">ServiceHandleFeeRequest>ParamList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ServiceHandleFeeRequestParamListParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>ServiceHandleFeeRequest>ParamList>Param");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Param");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">TransferAccountRequest>ModifyAcctFeeList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFeeType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFee");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">TransferAccountResult>TransfereeAcctChgList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">TransferAccountResult>TransferorAcctChgList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">TransInPpsPosResult>TransfereeAcctChgList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">TransInPpsPosResult>TransferorAcctChgList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">VoucherRechargeBySeqResult>RechargeBonus");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeBySeqResultRechargeBonus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">VoucherRechargeEnquiryResult>RechargeLog");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryResultRechargeLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">VoucherRechargeResult>RechargeBonus");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeResultRechargeBonus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ActiveFirstRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ActiveFirstRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdjustAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdjustAccountResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdjustSubAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustSubAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdjustSubAccountResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BalanceRecordType");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BalanceToValidityRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceToValidityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BalanceToValidityResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceToValidityResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BonusValidityRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.BonusValidityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BonusValidityResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CumulateEnquiryRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.CumulateEnquiryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CumulateEnquiryResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.CumulateEnquiryResultCumulativeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">CumulateEnquiryResult>CumulativeItem");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CumulativeItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ExchangeAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ExchangeAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ExchangeAccountResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ExchangeAccountResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFeeType");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifySubAcctType");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifySubAcctType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyVoucherStateRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyVoucherStateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModSubBillCycleTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModSubBillCycleTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OneOffDeductionRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.OneOffDeductionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OneOffDeductionResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentEnquiryRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentEnquiryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentEnquiryResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentEnquiryResultPaymentLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">PaymentEnquiryResult>PaymentLog");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentLog");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentRequest.class;
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
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "QueryAdjustmentLogRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryAdjustmentLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "QueryAdjustmentLogResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryAdjustmentLogResultAdjustmentLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">QueryAdjustmentLogResult>AdjustmentLog");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdjustmentLog");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "QueryBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "QueryBalanceResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryBalanceResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "QueryTransferLogRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "QueryTransferLogResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogResultTransferLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">QueryTransferLogResult>TransferLog");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferLog");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ReversePaymentRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ReversePaymentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ReversePaymentResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ReversePaymentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ServiceHandleFeeRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ServiceHandleFeeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ServiceHandleFeeResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.ServiceHandleFeeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SimpleProperty");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.SimpleProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SimplePropertyList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.SimpleProperty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SimpleProperty");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SimleProperty");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SubAccountRechargeRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.SubAccountRechargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SubAccountRechargeResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.SubAccountRechargeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.TransferAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferAccountResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.TransferAccountResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransInPpsPosRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.TransInPpsPosRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransInPpsPosResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.TransInPpsPosResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherEnquiryByPINRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherEnquiryByPINRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherEnquiryByPINResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherEnquiryByPINResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherEnquiryBySeqRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherEnquiryBySeqRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherEnquiryBySeqResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherEnquiryBySeqResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherRechargeBySeqRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeBySeqRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherRechargeBySeqResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeBySeqResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherRechargeEnquiryRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherRechargeEnquiryResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryResultRechargeLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">VoucherRechargeEnquiryResult>RechargeLog");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargeLog");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherRechargeRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherRechargeResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", ">RequestHeader>RequestType");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.common.RequestHeaderRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "RequestHeader");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.common.RequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "ResultHeader");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.common.ResultHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "SessionEntityType");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.common.SessionEntityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
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
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceResultMsg queryBalance(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceRequestMsg queryBalanceRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryBalanceRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeResultMsg voucherRecharge(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeRequestMsg voucherRechargeRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("VoucherRecharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VoucherRecharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {voucherRechargeRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentResultMsg payment(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentRequestMsg paymentRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Payment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Payment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paymentRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstResultMsg activeFirst(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstRequestMsg activeFirstRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ActiveFirst");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ActiveFirst"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activeFirstRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentResultMsg reversePayment(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentRequestMsg reversePaymentRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ReversePayment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReversePayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reversePaymentRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountResultMsg adjustAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountRequestMsg adjustAccountRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AdjustAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AdjustAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {adjustAccountRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryResultMsg voucherRechargeEnquiry(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryRequestMsg voucherRechargeEnquiryRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("VoucherRechargeEnquiry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VoucherRechargeEnquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {voucherRechargeEnquiryRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountResultMsg transferAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountRequestMsg transferAccountRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TransferAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TransferAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {transferAccountRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryResultMsg paymentEnquiry(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryRequestMsg paymentEnquiryRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PaymentEnquiry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PaymentEnquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paymentEnquiryRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryResultMsg cumulateEnquiry(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryRequestMsg cumulateEnquiryRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CumulateEnquiry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CumulateEnquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cumulateEnquiryRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqResultMsg voucherEnquiryBySeq(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqRequestMsg voucherEnquiryBySeqRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("VoucherEnquiryBySeq");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VoucherEnquiryBySeq"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {voucherEnquiryBySeqRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINResultMsg voucherEnquiryByPIN(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINRequestMsg voucherEnquiryByPINRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("VoucherEnquiryByPIN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VoucherEnquiryByPIN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {voucherEnquiryByPINRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionResultMsg oneOffDeduction(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionRequestMsg oneOffDeductionRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("OneOffDeduction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OneOffDeduction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {oneOffDeductionRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeResultMsg serviceHandleFee(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeRequestMsg serviceHandleFeeRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ServiceHandleFee");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ServiceHandleFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceHandleFeeRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogResultMsg queryTransferLog(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogRequestMsg queryTransferLogRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryTransferLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryTransferLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryTransferLogRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogResultMsg queryAdjustmentLog(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogRequestMsg queryAdjustmentLogRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryAdjustmentLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryAdjustmentLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryAdjustmentLogRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateResultMsg modifyVoucherState(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateRequestMsg modifyVoucherStateRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifyVoucherState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifyVoucherState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyVoucherStateRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityResultMsg balanceToValidity(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityRequestMsg balanceToValidityRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BalanceToValidity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BalanceToValidity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {balanceToValidityRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosResultMsg transInPpsPos(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosRequestMsg transInPpsPosRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TransInPpsPos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TransInPpsPos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {transInPpsPosRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountResultMsg exchangeAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountRequestMsg exchangeAccountRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ExchangeAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExchangeAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {exchangeAccountRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeResultMsg modSubBillCycleType(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeRequestMsg modSubBillCycleTypeRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModSubBillCycleType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModSubBillCycleType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modSubBillCycleTypeRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountResultMsg adjustSubAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountRequestMsg adjustSubAccountRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AdjustSubAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AdjustSubAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {adjustSubAccountRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeResultMsg subAccountRecharge(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeRequestMsg subAccountRechargeRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SubAccountRecharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubAccountRecharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subAccountRechargeRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqResultMsg voucherRechargeBySeq(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqRequestMsg voucherRechargeBySeqRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("VoucherRechargeBySeq");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VoucherRechargeBySeq"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {voucherRechargeBySeqRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityResultMsg bonusValidity(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityRequestMsg bonusValidityRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BonusValidity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BonusValidity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bonusValidityRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
