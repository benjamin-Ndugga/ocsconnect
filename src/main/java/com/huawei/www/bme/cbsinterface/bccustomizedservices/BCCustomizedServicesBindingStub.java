/**
 * BCCustomizedServicesBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccustomizedservices;

public class BCCustomizedServicesBindingStub extends org.apache.axis.client.Stub implements com.huawei.www.bme.cbsinterface.bccustomizedservices.BCCustomizedServices_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[13];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchCancelPreDeactivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchCancelPreDeactivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchCancelPreDeactivationRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchCancelPreDeactivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchCancelPreDeactivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchSupplementScatteredProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchSupplementScatteredProfileRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchSupplementScatteredProfileRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchSupplementScatteredProfileResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchSupplementScatteredProfileResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeSubIdentity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeSubIdentityRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeSubIdentityRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeSubIdentityResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeSubIdentityResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeAcctBillCycle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeAcctBillCycleRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeAcctBillCycleRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeAcctBillCycleResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeAcctBillCycleResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeOfferingProperty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeOfferingPropertyRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeOfferingPropertyRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeOfferingPropertyResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeOfferingPropertyResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeScatteredSubOwnership");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeScatteredSubOwnershipRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeScatteredSubOwnershipRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeScatteredSubOwnershipResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeScatteredSubOwnershipResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManCrossGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "ManCrossGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">ManCrossGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">ManCrossGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "ManCrossGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchChangeAcctInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeAcctInfoRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeAcctInfoRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeAcctInfoResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeAcctInfoResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchScatteredSubActivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchScatteredSubActivationRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchScatteredSubActivationRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchScatteredSubActivationResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchScatteredSubActivationResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSuperGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "CreateSuperGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">CreateSuperGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">CreateSuperGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "CreateSuperGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JoinSuperGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "JoinSuperGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">JoinSuperGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">JoinSuperGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "JoinSuperGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSuperGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "DeleteSuperGroupRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "DeleteSuperGroupResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSuperGroupMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "DeleteSuperGroupMemberRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupMemberRequestMsg"), com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupMemberResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "DeleteSuperGroupMemberResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

    }

    public BCCustomizedServicesBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BCCustomizedServicesBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BCCustomizedServicesBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">>BatchChangeOfferingPropertyRequest>OfferingInstProperty>AddProperty");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestOfferingInstPropertyAddProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">>BatchChangeOfferingPropertyRequest>OfferingInstProperty>DelProperty");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestOfferingInstPropertyDelProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">>BatchChangeOfferingPropertyRequest>ProductInst>AddProperty");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestProductInstAddProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">>BatchChangeOfferingPropertyRequest>ProductInst>DelProperty");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestProductInstDelProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchCancelPreDeactivationRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchCancelPreDeactivationResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeAcctBillCycleRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeAcctBillCycleResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeAcctInfoRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeAcctInfoResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeOfferingPropertyRequest>OfferingInstProperty");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestOfferingInstProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeOfferingPropertyRequest>ProductInst");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestProductInst.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeOfferingPropertyRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeOfferingPropertyResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeScatteredSubOwnershipRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeScatteredSubOwnershipResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeSubIdentityRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeSubIdentityResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchScatteredSubActivationRequest>SubBasicInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationRequestSubBasicInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchScatteredSubActivationRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchScatteredSubActivationResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchSubActivationRequest>OfferingInst");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSubActivationRequestOfferingInst.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchSubActivationRequest>SubBasicInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSubActivationRequestSubBasicInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchSupplementScatteredProfileRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchSupplementScatteredProfileResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">CreateSuperGroupRequest>SuperGroupAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupRequestSuperGroupAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">CreateSuperGroupRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">CreateSuperGroupResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupMemberRequest>members");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberRequestMembers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupMemberRequest>SuperGroupAccess");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberRequestSuperGroupAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupMemberRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberRequestMsg.class;
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
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupMemberResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupRequest>SuperGroupAccess");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupRequestSuperGroupAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">DeleteSuperGroupResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">JoinSuperGroupRequest>members");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupRequestMembers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">JoinSuperGroupRequest>SuperGroupAccess");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupRequestSuperGroupAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">JoinSuperGroupRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">JoinSuperGroupResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">ManCrossGroupRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">ManCrossGroupResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchCancelPreDeactivationRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeAcctBillCycleRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeAcctInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeOfferingPropertyRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeScatteredSubOwnershipRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeSubIdentityRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchScatteredSubActivationRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchSubActivationRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSubActivationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchSubDeactivationRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSubDeactivationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchSupplementScatteredProfileRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "CreateSuperGroupRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "DeleteSuperGroupMemberRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "DeleteSuperGroupRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "JoinSuperGroupRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "ManCrossGroupRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupRequest.class;
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

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationResultMsg batchCancelPreDeactivation(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationRequestMsg batchCancelPreDeactivationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchCancelPreDeactivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchCancelPreDeactivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {batchCancelPreDeactivationRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileResultMsg batchSupplementScatteredProfile(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileRequestMsg batchSupplementScatteredProfileRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchSupplementScatteredProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchSupplementScatteredProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {batchSupplementScatteredProfileRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityResultMsg batchChangeSubIdentity(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityRequestMsg batchChangeSubIdentityRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeSubIdentity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeSubIdentity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {batchChangeSubIdentityRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleResultMsg batchChangeAcctBillCycle(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleRequestMsg batchChangeAcctBillCycleRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeAcctBillCycle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeAcctBillCycle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {batchChangeAcctBillCycleRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyResultMsg batchChangeOfferingProperty(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestMsg batchChangeOfferingPropertyRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeOfferingProperty");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeOfferingProperty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {batchChangeOfferingPropertyRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipResultMsg batchChangeScatteredSubOwnership(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipRequestMsg batchChangeScatteredSubOwnershipRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeScatteredSubOwnership");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeScatteredSubOwnership"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {batchChangeScatteredSubOwnershipRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupResultMsg manCrossGroup(com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupRequestMsg manCrossGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManCrossGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManCrossGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {manCrossGroupRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoResultMsg batchChangeAcctInfo(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoRequestMsg batchChangeAcctInfoRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchChangeAcctInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchChangeAcctInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {batchChangeAcctInfoRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationResultMsg batchScatteredSubActivation(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationRequestMsg batchScatteredSubActivationRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BatchScatteredSubActivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BatchScatteredSubActivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {batchScatteredSubActivationRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupResultMsg createSuperGroup(com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupRequestMsg createSuperGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateSuperGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSuperGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createSuperGroupRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupResultMsg joinSuperGroup(com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupRequestMsg joinSuperGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("JoinSuperGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "JoinSuperGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {joinSuperGroupRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupResultMsg deleteSuperGroup(com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupRequestMsg deleteSuperGroupRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteSuperGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSuperGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteSuperGroupRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberResultMsg deleteSuperGroupMember(com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberRequestMsg deleteSuperGroupMemberRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteSuperGroupMember");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSuperGroupMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteSuperGroupMemberRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
