/**
 * BbServicsBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class BbServicsBindingStub extends org.apache.axis.client.Stub implements com.huawei.www.bme.cbsinterface.bbservices.BbServices_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryUnbilledAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryUnbilledAmountRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountRequestMsg"), com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryUnbilledAmountResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryFreeUnit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryFreeUnitRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitRequestMsg"), com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryFreeUnitResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryCDR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRRequestMsg"), com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Charge2Bill");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRequestMsg"), com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Charge2BillRollback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillRollbackRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRollbackRequestMsg"), com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRollbackResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillRollbackResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryAggregationAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryAggregationAmountRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountRequestMsg"), com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryAggregationAmountResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BillSuppress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BillSuppressRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">BillSuppressRequestMsg"), com.huawei.www.bme.cbsinterface.bbservices.BillSuppressRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">BillSuppressResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bbservices.BillSuppressResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BillSuppressResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HotBilling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "HotBillingRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">HotBillingRequestMsg"), com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">HotBillingResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bbservices.HotBillingResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "HotBillingResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryHotBillingStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryHotBillingStatusRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryHotBillingStatusRequestMsg"), com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryHotBillingStatusResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryHotBillingStatusResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryCDRDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRDetailRequestMsg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRDetailRequestMsg"), com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailRequestMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRDetailResultMsg"));
        oper.setReturnClass(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultMsg.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRDetailResultMsg"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    public BbServicsBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BbServicsBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BbServicsBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "AcctAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbcommon.AcctAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "CustAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbcommon.CustAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SimpleProperty");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubGroupAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbcommon.SubGroupAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "Tax");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbcommon.Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>>QueryCDRResult>CDRInfo>VolumeInfo>FreeVolumeList>Offering");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>>QueryFreeUnitResult>FreeUnitItem>FreeUnitItemDetail>FreeUnitOrigin>OfferingKey");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOriginOfferingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo>Adjustment");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountListAggregationInfoAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo>BillMediumCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountListAggregationInfoBillMediumCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo>CustomizedCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SimpleProperty");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PropList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo>Discount");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountListAggregationInfoDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo>MinCommitmentCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountListAggregationInfoMinCommitmentCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo>NRecurringCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountListAggregationInfoNRecurringCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo>RecurringCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountListAggregationInfoRecurringCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo>Tax");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountListAggregationInfoTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo>UsageCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRDetailResult>CDRInfo>ChargeDetail>Tax");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetailTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRDetailResult>CDRInfo>VolumeInfo>FreeUnitList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRInfo>ChargeDetail>Tax");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetailTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRInfo>TotalChargeInfo>ActualTax");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoActualTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRInfo>TotalChargeInfo>FreeTax");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoFreeTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRInfo>VolumeInfo>FreeUnitList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoVolumeInfoFreeUnitList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRInfo>VolumeInfo>FreeVolumeList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoVolumeInfoFreeVolumeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRSummary>TotalChargeInfo>ActualTax");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryTotalChargeInfoActualTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRSummary>TotalChargeInfo>FreeTax");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryTotalChargeInfoFreeTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRSummary>VolumeInfo>FreeUnitList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfoFreeUnitList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryFreeUnitResult>FreeUnitItem>FreeUnitItemDetail>FreeUnitOrigin");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>Adjustment");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>BillMediumCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoBillMediumCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>CustomizedCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SimpleProperty");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PropList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>Discount");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>MinCommitmentCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>NRecurringCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>RecurringCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoRecurringCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>Tax");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>UsageCharge");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoUsageCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountListAggregationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRDetailResult>CDRInfo>AdditionalProperty");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoAdditionalProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRDetailResult>CDRInfo>ChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRDetailResult>CDRInfo>VolumeInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRDetailResult>CDRInfo>VolumeInfo>FreeUnitList");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>AdditionalProperty");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAdditionalProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>AreaInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAreaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>ChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>TotalChargeInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>VolumeInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoVolumeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRSummary>AdditionalProperty");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryAdditionalProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRSummary>TotalChargeInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryTotalChargeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRSummary>VolumeInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryFreeUnitResult>FreeUnitItem>FreeUnitItemDetail");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryFreeUnitResult>FreeUnitItem>MemberUsageList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemMemberUsageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryFreeUnitResult>ShareUsageList>OfferingKey");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageListOfferingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">BillSuppressRequest>AcctAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.BillSuppressRequestAcctAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">BillSuppressRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.BillSuppressRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">BillSuppressResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.BillSuppressResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRequest>AcctAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRequestAcctAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRequest>ChargeItemList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRequestChargeItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRollbackRequest>AcctAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestAcctAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRollbackRequest>RollBackFeeValues");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestRollBackFeeValues.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRollbackRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRollbackResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">HotBillingRequest>AcctAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequestAcctAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">HotBillingRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">HotBillingResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.HotBillingResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountRequest>AcctAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestAcctAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountRequest>TimePeriod");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestTimePeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountResult>AggregationAmountList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRDetailRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRDetailResult>CDRInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRDetailResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRRequest>TimePeriod");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequestTimePeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRResult>CDRInfo");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRResult>CDRSummary");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitRequest>OfferingKey");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequestOfferingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitRequest>QueryObj");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequestQueryObj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitResult>FreeUnitItem");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitResult>ShareUsageList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryHotBillingStatusRequest>AcctAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequestAcctAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryHotBillingStatusRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryHotBillingStatusResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountRequest>AcctAccessCode");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestAcctAccessCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountRequest>ChargeObj");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestChargeObj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountRequestMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountResult>UnbilledAmountList");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountResultMsg");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BillSuppressRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.BillSuppressRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillRollbackRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillRollbackResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "HotBillingRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequest.class;
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
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "HotBillingResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.HotBillingResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryAggregationAmountRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryAggregationAmountResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountResult>AggregationAmountList");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AggregationAmountList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRDetailRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRDetailResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryFreeUnitRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryFreeUnitResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryHotBillingStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryHotBillingStatusResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryUnbilledAmountRequest");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryUnbilledAmountResult");
            cachedSerQNames.add(qName);
            cls = com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountResult>UnbilledAmountList");
            qName2 = new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "UnbilledAmountList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

    public com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultMsg queryUnbilledAmount(com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestMsg queryUnbilledAmountRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryUnbilledAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryUnbilledAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryUnbilledAmountRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultMsg queryFreeUnit(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequestMsg queryFreeUnitRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryFreeUnit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryFreeUnit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryFreeUnitRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultMsg queryCDR(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequestMsg queryCDRRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryCDR");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryCDR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryCDRRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillResultMsg charge2Bill(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRequestMsg charge2BillRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Charge2Bill");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Charge2Bill"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {charge2BillRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bbservices.Charge2BillResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bbservices.Charge2BillResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bbservices.Charge2BillResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResultMsg charge2BillRollback(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestMsg charge2BillRollbackRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Charge2BillRollback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Charge2BillRollback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {charge2BillRollbackRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultMsg queryAggregationAmount(com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestMsg queryAggregationAmountRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryAggregationAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryAggregationAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryAggregationAmountRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bbservices.BillSuppressResultMsg billSuppress(com.huawei.www.bme.cbsinterface.bbservices.BillSuppressRequestMsg billSuppressRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BillSuppress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BillSuppress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billSuppressRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bbservices.BillSuppressResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bbservices.BillSuppressResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bbservices.BillSuppressResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bbservices.HotBillingResultMsg hotBilling(com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequestMsg hotBillingRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("HotBilling");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "HotBilling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hotBillingRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bbservices.HotBillingResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bbservices.HotBillingResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bbservices.HotBillingResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusResultMsg queryHotBillingStatus(com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequestMsg queryHotBillingStatusRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryHotBillingStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryHotBillingStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryHotBillingStatusRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultMsg queryCDRDetail(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailRequestMsg queryCDRDetailRequestMsg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryCDRDetail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryCDRDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryCDRDetailRequestMsg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultMsg) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultMsg) org.apache.axis.utils.JavaUtils.convert(_resp, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultMsg.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
