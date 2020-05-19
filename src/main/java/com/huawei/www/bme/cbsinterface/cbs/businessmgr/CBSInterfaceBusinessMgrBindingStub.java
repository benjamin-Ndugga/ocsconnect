/**
 * CBSInterfaceBusinessMgrBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

import org.apache.axis.MessageContext;
import org.apache.axis.transport.http.HTTPConstants;

public class CBSInterfaceBusinessMgrBindingStub extends org.apache.axis.client.Stub implements com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgr {

    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[69];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryBasicInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryBasicInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryBasicInfoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryBasicInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryBasicInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryPaymentPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryPaymentPlanRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryPaymentPlanRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryPaymentPlanResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryPaymentPlanResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "CheckPasswordRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">CheckPasswordRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">CheckPasswordResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "CheckPasswordResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NewSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "NewSubscriberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">NewSubscriberRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">NewSubscriberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "NewSubscriberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReNewSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ReNewSubscriberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ReNewSubscriberRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ReNewSubscriberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ReNewSubscriberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "DeleteSubscriberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteSubscriberRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteSubscriberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "DeleteSubscriberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeMainProd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeMainProdRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeMainProdRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeMainProdResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeMainProdResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubscribeAppendantProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "SubscribeAppendantProductRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SubscribeAppendantProductRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SubscribeAppendantProductResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "SubscribeAppendantProductResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeAppendantProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeAppendantProductRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeAppendantProductRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeAppendantProductResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeAppendantProductResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnSubscribeAppendantProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "UnSubscribeAppendantProductRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">UnSubscribeAppendantProductRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">UnSubscribeAppendantProductResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "UnSubscribeAppendantProductResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCustBasicInfor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeCustBasicInforRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeCustBasicInforRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeCustBasicInforResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeCustBasicInforResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubscriberBasicInfor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeSubscriberBasicInforRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSubscriberBasicInforRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSubscriberBasicInforResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeSubscriberBasicInforResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeAccountBasicInfor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeAccountBasicInforRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeAccountBasicInforRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeAccountBasicInforResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeAccountBasicInforResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangePasswordRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangePasswordRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangePasswordResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangePasswordResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ResetPasswordRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ResetPasswordRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ResetPasswordResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ResetPasswordResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeMSISDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeMSISDNRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeMSISDNRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeMSISDNResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeMSISDNResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSIM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeSIMRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSIMRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSIMResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeSIMResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SyncDDS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "SyncDDSRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SyncDDSRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SyncDDSResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "SyncDDSResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeServicesRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeServicesRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeServicesResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeServicesResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteRechageBlack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "DeleteRechageBlackRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteRechageBlackRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteRechageBlackResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "DeleteRechageBlackResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Suspend");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "SuspendRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SuspendRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SuspendResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "SuspendResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Reconnect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ReconnectRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ReconnectRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ReconnectResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ReconnectResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ClaimMissing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ClaimMissingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ClaimMissingRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ClaimMissingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ClaimMissingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DisclaimMissing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "DisclaimMissingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DisclaimMissingRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DisclaimMissingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "DisclaimMissingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "BatchOperationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BatchOperationRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BatchOperationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "BatchOperationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeOwner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeOwnerRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeOwnerRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeOwnerResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeOwnerResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryUserGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryUserGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryUserGroupRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryUserGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryUserGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManGroupMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManGroupMemberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManGroupMemberRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManGroupMemberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManGroupMemberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubscribedGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubscribedGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscribedGroupRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscribedGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubscribedGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifySubscriberValidity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ModifySubscriberValidityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberValidityRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberValidityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ModifySubscriberValidityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IntegrationEnquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "IntegrationEnquiryRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">IntegrationEnquiryRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">IntegrationEnquiryResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "IntegrationEnquiryResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubscriberProductInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubscriberProductInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscriberProductInfoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscriberProductInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubscriberProductInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubscriberServiceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubscriberServiceInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscriberServiceInfoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscriberServiceInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubscriberServiceInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifySubscriberState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ModifySubscriberStateRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberStateRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberStateResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ModifySubscriberStateResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifySubscriberEmoticon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ModifySubscriberEmoticonRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberEmoticonRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberEmoticonResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ModifySubscriberEmoticonResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManSubCallScreenNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManSubCallScreenNoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubCallScreenNoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubCallScreenNoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManSubCallScreenNoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManSubFamilyNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManSubFamilyNoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubFamilyNoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubFamilyNoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManSubFamilyNoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubLowBalPrt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeSubLowBalPrtRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSubLowBalPrtRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSubLowBalPrtResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeSubLowBalPrtResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubLowBalPrt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubLowBalPrtRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubLowBalPrtRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubLowBalPrtResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubLowBalPrtResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManSubHomeZone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManSubHomeZoneRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubHomeZoneRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubHomeZoneResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManSubHomeZoneResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyPosUserState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ModifyPosUserStateRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifyPosUserStateRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifyPosUserStateResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ModifyPosUserStateResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryAdjustValidityLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryAdjustValidityLogRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryAdjustValidityLogRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryAdjustValidityLogResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryAdjustValidityLogResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubFamilyNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubFamilyNoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubFamilyNoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubFamilyNoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubFamilyNoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubHomeZone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubHomeZoneRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubHomeZoneRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubHomeZoneResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubHomeZoneResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubCallScreenNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubCallScreenNoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubCallScreenNoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubCallScreenNoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubCallScreenNoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryGroupMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryGroupMemberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryGroupMemberRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryGroupMemberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryGroupMemberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubChangeLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubChangeLogRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubChangeLogRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubChangeLogResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QuerySubChangeLogResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManParentChild");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManParentChildRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManParentChildRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManParentChildResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManParentChildResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryChildLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryChildLimitRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryChildLimitRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryChildLimitResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryChildLimitResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyCFNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ModifyCFNoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifyCFNoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifyCFNoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ModifyCFNoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BlockSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "BlockSubscriberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BlockSubscriberRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BlockSubscriberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "BlockSubscriberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NewSubscriberExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "NewSubscriberExtRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">NewSubscriberExtRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">NewSubscriberExtResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "NewSubscriberExtResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BindProductSubscriberNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "BindProductSubscriberNoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BindProductSubscriberNoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BindProductSubscriberNoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "BindProductSubscriberNoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSubscriberExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "DeleteSubscriberExtRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteSubscriberExtRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteSubscriberExtResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "DeleteSubscriberExtResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnSubscribeAppendantProductExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "UnSubscribeAppendantProductExtRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">UnSubscribeAppendantProductExtRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">UnSubscribeAppendantProductExtResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "UnSubscribeAppendantProductExtResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryDefinedZonesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryDefinedZonesInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryDefinedZonesInfoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryDefinedZonesInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryDefinedZonesInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckOperatorPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "CheckOperatorPasswordRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">CheckOperatorPasswordRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">CheckOperatorPasswordResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "CheckOperatorPasswordResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCreditLevel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeCreditLevelRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeCreditLevelRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeCreditLevelResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangeCreditLevelResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManageLoanSMS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManageLoanSMSRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManageLoanSMSRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManageLoanSMSResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManageLoanSMSResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryLoanSMS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryLoanSMSRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryLoanSMSRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryLoanSMSResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryLoanSMSResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExtendMSFValidity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ExtendMSFValidityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ExtendMSFValidityRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ExtendMSFValidityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ExtendMSFValidityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryInterActLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryInterActLogRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryInterActLogRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryInterActLogResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryInterActLogResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangePaymentPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangePaymentPlanRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangePaymentPlanRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangePaymentPlanResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ChangePaymentPlanResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManPairNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManPairNumberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManPairNumberRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManPairNumberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManPairNumberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryPairNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryPairNumberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryPairNumberRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryPairNumberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryPairNumberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryCUGMembers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryCUGMembersRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryCUGMembersRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryCUGMembersResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "QueryCUGMembersResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManCUGInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManCUGInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManCUGInfoRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManCUGInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManCUGInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManageMemberOfGroupCug");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManageMemberOfGroupCugRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManageMemberOfGroupCugRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManageMemberOfGroupCugResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "ManageMemberOfGroupCugResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetDTNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "SetDTNotificationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SetDTNotificationRequestMsg"), com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SetDTNotificationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", "SetDTNotificationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

    }

    public CBSInterfaceBusinessMgrBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public CBSInterfaceBusinessMgrBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public CBSInterfaceBusinessMgrBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BatchOperationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BatchOperationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BindProductSubscriberNoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BindProductSubscriberNoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BlockSubscriberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">BlockSubscriberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeAccountBasicInforRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeAccountBasicInforResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeAppendantProductRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeAppendantProductResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeCreditLevelRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeCreditLevelResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeCustBasicInforRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeCustBasicInforResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeMainProdRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeMainProdResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeMSISDNRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeMSISDNResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeOwnerRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeOwnerResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangePasswordRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangePasswordResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangePaymentPlanRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangePaymentPlanResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeServicesRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeServicesResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSIMRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSIMResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSubLowBalPrtRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSubLowBalPrtResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSubscriberBasicInforRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSubscriberBasicInforResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">CheckOperatorPasswordRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">CheckOperatorPasswordResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">CheckPasswordRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">CheckPasswordResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ClaimMissingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ClaimMissingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteRechageBlackRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteRechageBlackResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteSubscriberExtRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteSubscriberExtResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteSubscriberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteSubscriberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DisclaimMissingRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DisclaimMissingResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ExtendMSFValidityRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ExtendMSFValidityResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">IntegrationEnquiryRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">IntegrationEnquiryResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManageLoanSMSRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManageLoanSMSResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManageMemberOfGroupCugRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManageMemberOfGroupCugResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManCUGInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManCUGInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManGroupMemberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManGroupMemberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManPairNumberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManPairNumberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManParentChildRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManParentChildResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubCallScreenNoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubCallScreenNoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubFamilyNoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubFamilyNoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubHomeZoneRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ManSubHomeZoneResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifyCFNoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifyCFNoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifyPosUserStateRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifyPosUserStateResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberEmoticonRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberEmoticonResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberStateRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberStateResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberValidityRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ModifySubscriberValidityResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">NewSubscriberExtRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">NewSubscriberExtResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">NewSubscriberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">NewSubscriberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryAdjustValidityLogRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryAdjustValidityLogResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryBasicInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryBasicInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryChildLimitRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryChildLimitResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryCUGMembersRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryCUGMembersResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryDefinedZonesInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryDefinedZonesInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryGroupMemberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryGroupMemberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryInterActLogRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryInterActLogResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryLoanSMSRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryLoanSMSResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryPairNumberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryPairNumberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberResultMsg.class;
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
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryPaymentPlanRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryPaymentPlanResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubCallScreenNoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubCallScreenNoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubChangeLogRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubChangeLogResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubFamilyNoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubFamilyNoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubHomeZoneRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubHomeZoneResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubLowBalPrtRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubLowBalPrtResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscribedGroupRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscribedGroupResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscriberProductInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscriberProductInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscriberServiceInfoRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscriberServiceInfoResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryUserGroupRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QueryUserGroupResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ReconnectRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ReconnectResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ReNewSubscriberRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ReNewSubscriberResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ResetPasswordRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ResetPasswordResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SetDTNotificationRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SetDTNotificationResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SubscribeAppendantProductRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SubscribeAppendantProductResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SuspendRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SuspendResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SyncDDSRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">SyncDDSResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">UnSubscribeAppendantProductExtRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">UnSubscribeAppendantProductExtResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">UnSubscribeAppendantProductRequestMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductRequestMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">UnSubscribeAppendantProductResultMsg");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductResultMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>>BatchOperationRequest>BatchAjustAccount>ModifyAcctFeeList>ModifyAcctFee");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccountModifyAcctFeeListModifyAcctFee.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>>BatchOperationRequest>BatchUnSubscribe>Product>Service");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchUnSubscribeProductService.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchAjustAccount>ModifyAcctFeeList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccountModifyAcctFeeListModifyAcctFee[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>>BatchOperationRequest>BatchAjustAccount>ModifyAcctFeeList>ModifyAcctFee");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifyAcctFee");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchChangeMainProduct>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchChangeMainProduct>RemovedProduct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductRemovedProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchChangeService>Service");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeServiceService.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchModifySubValidity>ModifyType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifySubValidityModifyType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchNewSubscriber>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchNewSubscriberSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchSubscribe>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchSubscribeProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchUnSubscribe>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchUnSubscribeProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>ChangePaymentPlanRequest>PaymentPlan>Priority");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>CumulativeItemList>CumulativeItem");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultCumulativeItemListCumulativeItem.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>SubscriberInfo>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberInfoProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>SubscriberInfo>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberInfoSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>SubscriberState>DPFlag");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateDPFlag.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>SubscriberState>FraudState");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateFraudState.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>SubscriberState>LossFlag");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateLossFlag.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>UserGroupList>UserGroup");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultUserGroupListUserGroup.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QueryAdjustValidityLogResult>AdjustValidityLog>ModifyType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryAdjustValidityLogResultAdjustValidityLogModifyType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QueryBasicInfoResult>Subscriber>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QueryBasicInfoResult>Subscriber>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QueryInterActLogResult>QueryInterActLogList>QueryInterActLog");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryInterActLogResultQueryInterActLogListQueryInterActLog.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QuerySubChangeLogResult>SubChangeLogList>SubChangeLog");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubChangeLogResultSubChangeLogListSubChangeLog.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>UnSubscribeAppendantProductExtRequest>Product>Service");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductExtRequestProductService.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>UnSubscribeAppendantProductRequest>Product>Service");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductRequestProductService.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchActiveSubscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchActiveSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchAjustAccount");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchCashRecharge");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchCashRecharge.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchChangeMainProduct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchChangeService");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeService.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchChgLRN");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChgLRN.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchChgMSISDN");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChgMSISDN.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchDeleteSubscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchDeleteSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchManageCUGMember");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchManageCUGMember.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchModCallBundle");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModCallBundle.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchModifyMainBalance");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifyMainBalance.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchModifySubValidity");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifySubValidity.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchModifyVoucherState");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifyVoucherState.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchNewSubscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchNewSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchReleaseBlacklist");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchReleaseBlacklist.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchReplaceProduct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchReplaceProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchSubscribe");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchSubscribe.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchUnSubscribe");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchUnSubscribe.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchVouchRecharge");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchVouchRecharge.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BindProductSubscriberNoRequest>BindSubNumber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindProductSubscriberNoRequestBindSubNumber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeAppendantProductRequest>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeAppendantProductRequestProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeMainProdRequest>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeMainProdRequest>RemovedProduct");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestRemovedProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeOwnerRequest>ChangeMode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeOwnerRequestChangeMode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangePaymentPlanRequest>PaymentPlan");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangePaymentPlanRequestPaymentPlan.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeServicesRequest>Service");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeServicesRequestService.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeSubLowBalPrtRequest>LowBalPrt");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeSubLowBalPrtRequestLowBalPrt.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeSubscriberBasicInforRequest>InitialCredit");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryRequest>QueryType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryRequestQueryType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>BalanceRecordList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BalanceRecordType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BalanceRecordType");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BalanceRecord");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>BillingCycleDate");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultBillingCycleDate.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>CumulativeItemList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultCumulativeItemListCumulativeItem[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>CumulativeItemList>CumulativeItem");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CumulativeItem");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>SubAttachedInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubAttachedInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>SubscriberInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>SubscriberState");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberState.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>UserGroupList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultUserGroupListUserGroup[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>UserGroupList>UserGroup");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UserGroup");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManageMemberOfGroupCugRequest>GroupMember");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManageMemberOfGroupCugRequestGroupMember.class;
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
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManParentChildRequest>ChildSubscriberInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManParentChildRequestChildSubscriberInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManParentChildResult>ChildSubscriberInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManParentChildResultChildSubscriberInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManSubCallScreenNoRequest>CallScreenNoInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubCallScreenNoRequestCallScreenNoInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManSubFamilyNoRequest>FamilyNoInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubFamilyNoRequestFamilyNoInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManSubHomeZoneRequest>HomeZoneInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubHomeZoneRequestHomeZoneInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ModifySubscriberEmoticonRequest>COMMENT");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ModifySubscriberValidityRequest>ModifyType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifySubscriberValidityRequestModifyType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">NewSubscriberExtRequest>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">NewSubscriberExtRequest>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">NewSubscriberRequest>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberRequestSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryAdjustValidityLogResult>AdjustValidityLog");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryAdjustValidityLogResultAdjustValidityLog.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoRequest>QueryType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoRequestQueryType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>Customer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>SubscriberAccount");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryCUGMembersRequest>CUGID");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryCUGMembersResult>CUGMemberList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryCUGMembersResultCUGMemberList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryDefinedZonesInfoResult>DefinedZonesInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryDefinedZonesInfoResultDefinedZonesInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryInterActLogResult>QueryInterActLogList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryInterActLogResultQueryInterActLogListQueryInterActLog[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QueryInterActLogResult>QueryInterActLogList>QueryInterActLog");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryInterActLog");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryPaymentPlanResult>PaymentPlanForMe");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForMe.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryPaymentPlanResult>PaymentPlanForOther");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForOther.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubCallScreenNoResult>CallScreenNoInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultCallScreenNoInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubCallScreenNoResult>NonCallScreenNoInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultNonCallScreenNoInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubChangeLogResult>SubChangeLogList");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubChangeLogResultSubChangeLogListSubChangeLog[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QuerySubChangeLogResult>SubChangeLogList>SubChangeLog");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubChangeLog");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubFamilyNoResult>FamilyNoInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubFamilyNoResultFamilyNoInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubHomeZoneResult>HomeZoneNoInfo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubHomeZoneResultHomeZoneNoInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubLowBalPrtResult>SubLowBalPrt");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubLowBalPrtResultSubLowBalPrt.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubscribedGroupResult>UserGroup");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscribedGroupResultUserGroup.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubscriberProductInfoResult>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscriberProductInfoResultProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryUserGroupResult>UserGroup");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryUserGroupResultUserGroup.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ReNewSubscriberRequest>Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ReNewSubscriberRequestSubscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">SubscribeAppendantProductRequest>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.SubscribeAppendantProductRequestProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">SubscriberBasic>InitialCredit");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">UnSubscribeAppendantProductExtRequest>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductExtRequestProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">UnSubscribeAppendantProductRequest>Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductRequestProduct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Account");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.Account.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BalanceRecordType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BalanceRecordType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchOperationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BindProductSubscriberNoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindProductSubscriberNoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BindSubscriberNo");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BlockSubscriberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BlockSubscriberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BlockSubscriberResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.BlockSubscriberResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeAccountBasicInforRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeAccountBasicInforRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeAppendantProductRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeAppendantProductRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeAppendantProductResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeAppendantProductResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeCreditLevelRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeCreditLevelRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeCustBasicInforRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeCustBasicInforRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeMainProdRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeMainProdResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeMSISDNRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMSISDNRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeOwnerRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeOwnerRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangePasswordRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangePasswordRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangePaymentPlanRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangePaymentPlanRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeServicesRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeServicesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeSIMRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeSIMRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeSubLowBalPrtRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeSubLowBalPrtRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeSubscriberBasicInforRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeSubscriberBasicInforRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CheckOperatorPasswordRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.CheckOperatorPasswordRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CheckPasswordRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.CheckPasswordRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ClaimMissingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ClaimMissingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Common");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.Common.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CustomerGrade");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.CustomerGrade.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DeleteRechageBlackRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.DeleteRechageBlackRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DeleteSubscriberExtRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.DeleteSubscriberExtRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DeleteSubscriberExtResult");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DeleteSubscriberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.DeleteSubscriberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DisclaimMissingRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.DisclaimMissingRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ExtendMSFValidityRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ExtendMSFValidityRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ExtendMSFValidityResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ExtendMSFValidityResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Gender");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.Gender.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IDType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IDType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IndividualCustomer");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IndividualCustomer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IntegrationEnquiryRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IntegrationEnquiryResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManageLoanSMSRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManageLoanSMSRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManageMemberOfGroupCugRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManageMemberOfGroupCugRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManCUGInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManCUGInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManCUGInfoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManCUGInfoResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManGroupMemberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManGroupMemberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManPairNumberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManPairNumberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManParentChildRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManParentChildRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManParentChildResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManParentChildResultChildSubscriberInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManParentChildResult>ChildSubscriberInfo");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChildSubscriberInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManSubCallScreenNoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubCallScreenNoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManSubFamilyNoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubFamilyNoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManSubHomeZoneRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubHomeZoneRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifyCFNoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifyCFNoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifyPosUserStateRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifyPosUserStateRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifySubscriberEmoticonRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifySubscriberEmoticonRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifySubscriberStateRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifySubscriberStateRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifySubscriberValidityRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifySubscriberValidityRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifySubscriberValidityResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifySubscriberValidityResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewSubscriberExtRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewSubscriberExtResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewSubscriberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewSubscriberResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOrderInfoType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderInfoType");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.OperationType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Paymode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.Paymode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Product");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.Product.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOperationType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOperationType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

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
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderInfoType");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOrderInfoType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryAdjustValidityLogRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryAdjustValidityLogRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryAdjustValidityLogResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryAdjustValidityLogResultAdjustValidityLog[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryAdjustValidityLogResult>AdjustValidityLog");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "AdjustValidityLog");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryBasicInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryBasicInfoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryChildLimitRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryChildLimitRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryChildLimitResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryChildLimitResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryCUGMembersRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryCUGMembersRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryCUGMembersResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryCUGMembersResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryDefinedZonesInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryDefinedZonesInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryDefinedZonesInfoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryDefinedZonesInfoResultDefinedZonesInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryDefinedZonesInfoResult>DefinedZonesInfo");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DefinedZonesInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryGroupMemberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryGroupMemberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryGroupMemberResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryGroupMemberResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryInterActLogRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryInterActLogRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryInterActLogResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryInterActLogResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryLoanSMSRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryLoanSMSRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryLoanSMSResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryLoanSMSResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryPairNumberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPairNumberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryPairNumberResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPairNumberResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryPaymentPlanRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryPaymentPlanResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubCallScreenNoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubCallScreenNoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubChangeLogRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubChangeLogRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubChangeLogResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubChangeLogResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubFamilyNoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubFamilyNoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubFamilyNoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubFamilyNoResultFamilyNoInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubFamilyNoResult>FamilyNoInfo");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "FamilyNoInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubHomeZoneRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubHomeZoneRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubHomeZoneResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubHomeZoneResultHomeZoneNoInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubHomeZoneResult>HomeZoneNoInfo");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "HomeZoneNoInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubLowBalPrtRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubLowBalPrtRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubLowBalPrtResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubLowBalPrtResultSubLowBalPrt[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubLowBalPrtResult>SubLowBalPrt");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubLowBalPrt");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubscribedGroupRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscribedGroupRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubscribedGroupResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscribedGroupResultUserGroup[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubscribedGroupResult>UserGroup");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UserGroup");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubscriberProductInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscriberProductInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubscriberProductInfoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscriberProductInfoResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubscriberServiceInfoRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscriberServiceInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubscriberServiceInfoResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscriberServiceInfoResult.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryUserGroupRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryUserGroupRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryUserGroupResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryUserGroupResultUserGroup[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryUserGroupResult>UserGroup");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UserGroup");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ReconnectRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ReconnectRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ReNewSubscriberRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ReNewSubscriberRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ReNewSubscriberResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOrderInfoType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderInfoType");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ResetPasswordRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ResetPasswordRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Service");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SetDTNotificationRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.SetDTNotificationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SimpleProperty");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscribeAppendantProductRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.SubscribeAppendantProductRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscribeAppendantProductResult");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOrderInfoType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderInfoType");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Subscriber");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.Subscriber.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberBasic");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.SubscriberBasic.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SuspendRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.SuspendRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SyncDDSRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.SyncDDSRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UnSubscribeAppendantProductExtRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductExtRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UnSubscribeAppendantProductExtResult");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UnSubscribeAppendantProductRequest");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidMode");
        cachedSerQNames.add(qName);
        cls = com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

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

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoResultMsg queryBasicInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoRequestMsg queryBasicInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryBasicInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryBasicInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryBasicInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanResultMsg queryPaymentPlan(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanRequestMsg queryPaymentPlanRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryPaymentPlan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryPaymentPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryPaymentPlanRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordResultMsg checkPassword(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordRequestMsg checkPasswordRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CheckPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{checkPasswordRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberResultMsg newSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberRequestMsg newSubscriberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("NewSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "NewSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{newSubscriberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberResultMsg reNewSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberRequestMsg reNewSubscriberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ReNewSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReNewSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{reNewSubscriberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberResultMsg deleteSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberRequestMsg deleteSubscriberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{deleteSubscriberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdResultMsg changeMainProd(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdRequestMsg changeMainProdRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeMainProd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeMainProd"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeMainProdRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductResultMsg subscribeAppendantProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductRequestMsg subscribeAppendantProductRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SubscribeAppendantProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubscribeAppendantProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{subscribeAppendantProductRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductResultMsg changeAppendantProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductRequestMsg changeAppendantProductRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeAppendantProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeAppendantProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeAppendantProductRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductResultMsg unSubscribeAppendantProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductRequestMsg unSubscribeAppendantProductRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UnSubscribeAppendantProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UnSubscribeAppendantProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{unSubscribeAppendantProductRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforResultMsg changeCustBasicInfor(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforRequestMsg changeCustBasicInforRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeCustBasicInfor");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCustBasicInfor"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeCustBasicInforRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforResultMsg changeSubscriberBasicInfor(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforRequestMsg changeSubscriberBasicInforRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubscriberBasicInfor");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubscriberBasicInfor"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubscriberBasicInforRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforResultMsg changeAccountBasicInfor(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforRequestMsg changeAccountBasicInforRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeAccountBasicInfor");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeAccountBasicInfor"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeAccountBasicInforRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordResultMsg changePassword(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordRequestMsg changePasswordRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangePassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changePasswordRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordResultMsg resetPassword(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordRequestMsg resetPasswordRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ResetPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{resetPasswordRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNResultMsg changeMSISDN(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNRequestMsg changeMSISDNRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeMSISDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeMSISDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeMSISDNRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMResultMsg changeSIM(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMRequestMsg changeSIMRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSIM");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSIM"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSIMRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSResultMsg syncDDS(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSRequestMsg syncDDSRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SyncDDS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SyncDDS"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{syncDDSRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesResultMsg changeServices(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesRequestMsg changeServicesRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeServicesRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackResultMsg deleteRechageBlack(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackRequestMsg deleteRechageBlackRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteRechageBlack");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteRechageBlack"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{deleteRechageBlackRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendResultMsg suspend(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendRequestMsg suspendRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Suspend");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Suspend"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{suspendRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectResultMsg reconnect(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectRequestMsg reconnectRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Reconnect");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Reconnect"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{reconnectRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingResultMsg claimMissing(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingRequestMsg claimMissingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ClaimMissing");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ClaimMissing"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{claimMissingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingResultMsg disclaimMissing(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingRequestMsg disclaimMissingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DisclaimMissing");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DisclaimMissing"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{disclaimMissingRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationResultMsg batchOperation(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationRequestMsg batchOperationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{batchOperationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerResultMsg changeOwner(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerRequestMsg changeOwnerRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeOwner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeOwner"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeOwnerRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupResultMsg queryUserGroup(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupRequestMsg queryUserGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryUserGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryUserGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryUserGroupRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberResultMsg manGroupMember(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberRequestMsg manGroupMemberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManGroupMember");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManGroupMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manGroupMemberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupResultMsg querySubscribedGroup(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupRequestMsg querySubscribedGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubscribedGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubscribedGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubscribedGroupRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityResultMsg modifySubscriberValidity(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityRequestMsg modifySubscriberValidityRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifySubscriberValidity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifySubscriberValidity"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{modifySubscriberValidityRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryResultMsg integrationEnquiry(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryRequestMsg integrationEnquiryRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("IntegrationEnquiry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "IntegrationEnquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{integrationEnquiryRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoResultMsg querySubscriberProductInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoRequestMsg querySubscriberProductInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubscriberProductInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubscriberProductInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubscriberProductInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoResultMsg querySubscriberServiceInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoRequestMsg querySubscriberServiceInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubscriberServiceInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubscriberServiceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubscriberServiceInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateResultMsg modifySubscriberState(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateRequestMsg modifySubscriberStateRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifySubscriberState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifySubscriberState"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{modifySubscriberStateRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonResultMsg modifySubscriberEmoticon(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonRequestMsg modifySubscriberEmoticonRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifySubscriberEmoticon");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifySubscriberEmoticon"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{modifySubscriberEmoticonRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoResultMsg manSubCallScreenNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoRequestMsg manSubCallScreenNoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManSubCallScreenNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManSubCallScreenNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manSubCallScreenNoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoResultMsg manSubFamilyNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoRequestMsg manSubFamilyNoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManSubFamilyNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManSubFamilyNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manSubFamilyNoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtResultMsg changeSubLowBalPrt(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtRequestMsg changeSubLowBalPrtRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeSubLowBalPrt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubLowBalPrt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeSubLowBalPrtRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtResultMsg querySubLowBalPrt(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtRequestMsg querySubLowBalPrtRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubLowBalPrt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubLowBalPrt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubLowBalPrtRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneResultMsg manSubHomeZone(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneRequestMsg manSubHomeZoneRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManSubHomeZone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManSubHomeZone"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manSubHomeZoneRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateResultMsg modifyPosUserState(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateRequestMsg modifyPosUserStateRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifyPosUserState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifyPosUserState"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{modifyPosUserStateRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogResultMsg queryAdjustValidityLog(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogRequestMsg queryAdjustValidityLogRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryAdjustValidityLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryAdjustValidityLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryAdjustValidityLogRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoResultMsg querySubFamilyNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoRequestMsg querySubFamilyNoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubFamilyNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubFamilyNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubFamilyNoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneResultMsg querySubHomeZone(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneRequestMsg querySubHomeZoneRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubHomeZone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubHomeZone"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubHomeZoneRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoResultMsg querySubCallScreenNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoRequestMsg querySubCallScreenNoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubCallScreenNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubCallScreenNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubCallScreenNoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberResultMsg queryGroupMember(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberRequestMsg queryGroupMemberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryGroupMember");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryGroupMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryGroupMemberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogResultMsg querySubChangeLog(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogRequestMsg querySubChangeLogRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QuerySubChangeLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySubChangeLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{querySubChangeLogRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildResultMsg manParentChild(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildRequestMsg manParentChildRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManParentChild");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManParentChild"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manParentChildRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitResultMsg queryChildLimit(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitRequestMsg queryChildLimitRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryChildLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryChildLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryChildLimitRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoResultMsg modifyCFNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoRequestMsg modifyCFNoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifyCFNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifyCFNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{modifyCFNoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberResultMsg blockSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberRequestMsg blockSubscriberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BlockSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BlockSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{blockSubscriberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtResultMsg newSubscriberExt(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtRequestMsg newSubscriberExtRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("NewSubscriberExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "NewSubscriberExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{newSubscriberExtRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoResultMsg bindProductSubscriberNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoRequestMsg bindProductSubscriberNoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BindProductSubscriberNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BindProductSubscriberNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{bindProductSubscriberNoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtResultMsg deleteSubscriberExt(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtRequestMsg deleteSubscriberExtRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteSubscriberExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSubscriberExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{deleteSubscriberExtRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtResultMsg unSubscribeAppendantProductExt(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtRequestMsg unSubscribeAppendantProductExtRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UnSubscribeAppendantProductExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UnSubscribeAppendantProductExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{unSubscribeAppendantProductExtRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoResultMsg queryDefinedZonesInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoRequestMsg queryDefinedZonesInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryDefinedZonesInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryDefinedZonesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryDefinedZonesInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordResultMsg checkOperatorPassword(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordRequestMsg checkOperatorPasswordRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CheckOperatorPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckOperatorPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{checkOperatorPasswordRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelResultMsg changeCreditLevel(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelRequestMsg changeCreditLevelRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeCreditLevel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCreditLevel"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changeCreditLevelRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSResultMsg manageLoanSMS(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSRequestMsg manageLoanSMSRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManageLoanSMS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManageLoanSMS"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manageLoanSMSRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSResultMsg queryLoanSMS(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSRequestMsg queryLoanSMSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:QueryLoanSMS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryLoanSMS"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryLoanSMSRequest});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityResultMsg extendMSFValidity(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityRequestMsg extendMSFValidityRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ExtendMSFValidity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExtendMSFValidity"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{extendMSFValidityRequest});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogResultMsg queryInterActLog(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogRequestMsg queryInterActLogRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryInterActLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryInterActLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryInterActLogRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanResultMsg changePaymentPlan(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanRequestMsg changePaymentPlanRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangePaymentPlan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangePaymentPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{changePaymentPlanRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberResultMsg manPairNumber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberRequestMsg manPairNumberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManPairNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManPairNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manPairNumberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberResultMsg queryPairNumber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberRequestMsg queryPairNumberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryPairNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryPairNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryPairNumberRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersResultMsg queryCUGMembers(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersRequestMsg queryCUGMembersRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryCUGMembers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryCUGMembers"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{queryCUGMembersRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoResultMsg manCUGInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoRequestMsg manCUGInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManCUGInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManCUGInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manCUGInfoRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugResultMsg manageMemberOfGroupCug(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugRequestMsg manageMemberOfGroupCugRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManageMemberOfGroupCug");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManageMemberOfGroupCug"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{manageMemberOfGroupCugRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationResultMsg setDTNotification(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationRequestMsg setDTNotificationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetDTNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetDTNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{setDTNotificationRequestMsg});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationResultMsg) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationResultMsg.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
