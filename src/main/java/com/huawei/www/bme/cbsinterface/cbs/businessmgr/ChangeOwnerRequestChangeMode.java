/**
 * ChangeOwnerRequestChangeMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ChangeOwnerRequestChangeMode implements java.io.Serializable {
    private int _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ChangeOwnerRequestChangeMode(int value) {
        _value_ = value;
        _table_.put(new java.lang.Integer(_value_),this);
    }

    public static final int _value1 = 4050000;
    public static final int _value2 = 4050001;
    public static final int _value3 = 4050002;
    public static final int _value4 = 4050003;
    public static final int _value5 = 4050004;
    public static final ChangeOwnerRequestChangeMode value1 = new ChangeOwnerRequestChangeMode(_value1);
    public static final ChangeOwnerRequestChangeMode value2 = new ChangeOwnerRequestChangeMode(_value2);
    public static final ChangeOwnerRequestChangeMode value3 = new ChangeOwnerRequestChangeMode(_value3);
    public static final ChangeOwnerRequestChangeMode value4 = new ChangeOwnerRequestChangeMode(_value4);
    public static final ChangeOwnerRequestChangeMode value5 = new ChangeOwnerRequestChangeMode(_value5);
    public int getValue() { return _value_;}
    public static ChangeOwnerRequestChangeMode fromValue(int value)
          throws java.lang.IllegalArgumentException {
        ChangeOwnerRequestChangeMode enumeration = (ChangeOwnerRequestChangeMode)
            _table_.get(new java.lang.Integer(value));
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ChangeOwnerRequestChangeMode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(java.lang.Integer.parseInt(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return java.lang.String.valueOf(_value_);}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeOwnerRequestChangeMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeOwnerRequest>ChangeMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
