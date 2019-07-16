/**
 * BatchOperationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class BatchOperationRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchNewSubscriber batchNewSubscriber;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchDeleteSubscriber batchDeleteSubscriber;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChgLRN batchChgLRN;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchSubscribe batchSubscribe;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchUnSubscribe batchUnSubscribe;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeService batchChangeService;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProduct batchChangeMainProduct;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifySubValidity batchModifySubValidity;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifyVoucherState batchModifyVoucherState;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchReplaceProduct batchReplaceProduct;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchCashRecharge batchCashRecharge;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchVouchRecharge batchVouchRecharge;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchActiveSubscriber batchActiveSubscriber;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchReleaseBlacklist batchReleaseBlacklist;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifyMainBalance batchModifyMainBalance;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchManageCUGMember batchManageCUGMember;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccount batchAjustAccount;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChgMSISDN batchChgMSISDN;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModCallBundle batchModCallBundle;

    public BatchOperationRequest() {
    }

    public BatchOperationRequest(
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchNewSubscriber batchNewSubscriber,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchDeleteSubscriber batchDeleteSubscriber,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChgLRN batchChgLRN,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchSubscribe batchSubscribe,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchUnSubscribe batchUnSubscribe,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeService batchChangeService,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProduct batchChangeMainProduct,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifySubValidity batchModifySubValidity,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifyVoucherState batchModifyVoucherState,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchReplaceProduct batchReplaceProduct,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchCashRecharge batchCashRecharge,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchVouchRecharge batchVouchRecharge,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchActiveSubscriber batchActiveSubscriber,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchReleaseBlacklist batchReleaseBlacklist,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifyMainBalance batchModifyMainBalance,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchManageCUGMember batchManageCUGMember,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccount batchAjustAccount,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChgMSISDN batchChgMSISDN,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModCallBundle batchModCallBundle) {
           this.batchNewSubscriber = batchNewSubscriber;
           this.batchDeleteSubscriber = batchDeleteSubscriber;
           this.batchChgLRN = batchChgLRN;
           this.batchSubscribe = batchSubscribe;
           this.batchUnSubscribe = batchUnSubscribe;
           this.batchChangeService = batchChangeService;
           this.batchChangeMainProduct = batchChangeMainProduct;
           this.batchModifySubValidity = batchModifySubValidity;
           this.batchModifyVoucherState = batchModifyVoucherState;
           this.batchReplaceProduct = batchReplaceProduct;
           this.batchCashRecharge = batchCashRecharge;
           this.batchVouchRecharge = batchVouchRecharge;
           this.batchActiveSubscriber = batchActiveSubscriber;
           this.batchReleaseBlacklist = batchReleaseBlacklist;
           this.batchModifyMainBalance = batchModifyMainBalance;
           this.batchManageCUGMember = batchManageCUGMember;
           this.batchAjustAccount = batchAjustAccount;
           this.batchChgMSISDN = batchChgMSISDN;
           this.batchModCallBundle = batchModCallBundle;
    }


    /**
     * Gets the batchNewSubscriber value for this BatchOperationRequest.
     * 
     * @return batchNewSubscriber
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchNewSubscriber getBatchNewSubscriber() {
        return batchNewSubscriber;
    }


    /**
     * Sets the batchNewSubscriber value for this BatchOperationRequest.
     * 
     * @param batchNewSubscriber
     */
    public void setBatchNewSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchNewSubscriber batchNewSubscriber) {
        this.batchNewSubscriber = batchNewSubscriber;
    }


    /**
     * Gets the batchDeleteSubscriber value for this BatchOperationRequest.
     * 
     * @return batchDeleteSubscriber
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchDeleteSubscriber getBatchDeleteSubscriber() {
        return batchDeleteSubscriber;
    }


    /**
     * Sets the batchDeleteSubscriber value for this BatchOperationRequest.
     * 
     * @param batchDeleteSubscriber
     */
    public void setBatchDeleteSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchDeleteSubscriber batchDeleteSubscriber) {
        this.batchDeleteSubscriber = batchDeleteSubscriber;
    }


    /**
     * Gets the batchChgLRN value for this BatchOperationRequest.
     * 
     * @return batchChgLRN
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChgLRN getBatchChgLRN() {
        return batchChgLRN;
    }


    /**
     * Sets the batchChgLRN value for this BatchOperationRequest.
     * 
     * @param batchChgLRN
     */
    public void setBatchChgLRN(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChgLRN batchChgLRN) {
        this.batchChgLRN = batchChgLRN;
    }


    /**
     * Gets the batchSubscribe value for this BatchOperationRequest.
     * 
     * @return batchSubscribe
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchSubscribe getBatchSubscribe() {
        return batchSubscribe;
    }


    /**
     * Sets the batchSubscribe value for this BatchOperationRequest.
     * 
     * @param batchSubscribe
     */
    public void setBatchSubscribe(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchSubscribe batchSubscribe) {
        this.batchSubscribe = batchSubscribe;
    }


    /**
     * Gets the batchUnSubscribe value for this BatchOperationRequest.
     * 
     * @return batchUnSubscribe
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchUnSubscribe getBatchUnSubscribe() {
        return batchUnSubscribe;
    }


    /**
     * Sets the batchUnSubscribe value for this BatchOperationRequest.
     * 
     * @param batchUnSubscribe
     */
    public void setBatchUnSubscribe(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchUnSubscribe batchUnSubscribe) {
        this.batchUnSubscribe = batchUnSubscribe;
    }


    /**
     * Gets the batchChangeService value for this BatchOperationRequest.
     * 
     * @return batchChangeService
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeService getBatchChangeService() {
        return batchChangeService;
    }


    /**
     * Sets the batchChangeService value for this BatchOperationRequest.
     * 
     * @param batchChangeService
     */
    public void setBatchChangeService(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeService batchChangeService) {
        this.batchChangeService = batchChangeService;
    }


    /**
     * Gets the batchChangeMainProduct value for this BatchOperationRequest.
     * 
     * @return batchChangeMainProduct
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProduct getBatchChangeMainProduct() {
        return batchChangeMainProduct;
    }


    /**
     * Sets the batchChangeMainProduct value for this BatchOperationRequest.
     * 
     * @param batchChangeMainProduct
     */
    public void setBatchChangeMainProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProduct batchChangeMainProduct) {
        this.batchChangeMainProduct = batchChangeMainProduct;
    }


    /**
     * Gets the batchModifySubValidity value for this BatchOperationRequest.
     * 
     * @return batchModifySubValidity
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifySubValidity getBatchModifySubValidity() {
        return batchModifySubValidity;
    }


    /**
     * Sets the batchModifySubValidity value for this BatchOperationRequest.
     * 
     * @param batchModifySubValidity
     */
    public void setBatchModifySubValidity(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifySubValidity batchModifySubValidity) {
        this.batchModifySubValidity = batchModifySubValidity;
    }


    /**
     * Gets the batchModifyVoucherState value for this BatchOperationRequest.
     * 
     * @return batchModifyVoucherState
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifyVoucherState getBatchModifyVoucherState() {
        return batchModifyVoucherState;
    }


    /**
     * Sets the batchModifyVoucherState value for this BatchOperationRequest.
     * 
     * @param batchModifyVoucherState
     */
    public void setBatchModifyVoucherState(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifyVoucherState batchModifyVoucherState) {
        this.batchModifyVoucherState = batchModifyVoucherState;
    }


    /**
     * Gets the batchReplaceProduct value for this BatchOperationRequest.
     * 
     * @return batchReplaceProduct
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchReplaceProduct getBatchReplaceProduct() {
        return batchReplaceProduct;
    }


    /**
     * Sets the batchReplaceProduct value for this BatchOperationRequest.
     * 
     * @param batchReplaceProduct
     */
    public void setBatchReplaceProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchReplaceProduct batchReplaceProduct) {
        this.batchReplaceProduct = batchReplaceProduct;
    }


    /**
     * Gets the batchCashRecharge value for this BatchOperationRequest.
     * 
     * @return batchCashRecharge
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchCashRecharge getBatchCashRecharge() {
        return batchCashRecharge;
    }


    /**
     * Sets the batchCashRecharge value for this BatchOperationRequest.
     * 
     * @param batchCashRecharge
     */
    public void setBatchCashRecharge(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchCashRecharge batchCashRecharge) {
        this.batchCashRecharge = batchCashRecharge;
    }


    /**
     * Gets the batchVouchRecharge value for this BatchOperationRequest.
     * 
     * @return batchVouchRecharge
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchVouchRecharge getBatchVouchRecharge() {
        return batchVouchRecharge;
    }


    /**
     * Sets the batchVouchRecharge value for this BatchOperationRequest.
     * 
     * @param batchVouchRecharge
     */
    public void setBatchVouchRecharge(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchVouchRecharge batchVouchRecharge) {
        this.batchVouchRecharge = batchVouchRecharge;
    }


    /**
     * Gets the batchActiveSubscriber value for this BatchOperationRequest.
     * 
     * @return batchActiveSubscriber
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchActiveSubscriber getBatchActiveSubscriber() {
        return batchActiveSubscriber;
    }


    /**
     * Sets the batchActiveSubscriber value for this BatchOperationRequest.
     * 
     * @param batchActiveSubscriber
     */
    public void setBatchActiveSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchActiveSubscriber batchActiveSubscriber) {
        this.batchActiveSubscriber = batchActiveSubscriber;
    }


    /**
     * Gets the batchReleaseBlacklist value for this BatchOperationRequest.
     * 
     * @return batchReleaseBlacklist
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchReleaseBlacklist getBatchReleaseBlacklist() {
        return batchReleaseBlacklist;
    }


    /**
     * Sets the batchReleaseBlacklist value for this BatchOperationRequest.
     * 
     * @param batchReleaseBlacklist
     */
    public void setBatchReleaseBlacklist(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchReleaseBlacklist batchReleaseBlacklist) {
        this.batchReleaseBlacklist = batchReleaseBlacklist;
    }


    /**
     * Gets the batchModifyMainBalance value for this BatchOperationRequest.
     * 
     * @return batchModifyMainBalance
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifyMainBalance getBatchModifyMainBalance() {
        return batchModifyMainBalance;
    }


    /**
     * Sets the batchModifyMainBalance value for this BatchOperationRequest.
     * 
     * @param batchModifyMainBalance
     */
    public void setBatchModifyMainBalance(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifyMainBalance batchModifyMainBalance) {
        this.batchModifyMainBalance = batchModifyMainBalance;
    }


    /**
     * Gets the batchManageCUGMember value for this BatchOperationRequest.
     * 
     * @return batchManageCUGMember
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchManageCUGMember getBatchManageCUGMember() {
        return batchManageCUGMember;
    }


    /**
     * Sets the batchManageCUGMember value for this BatchOperationRequest.
     * 
     * @param batchManageCUGMember
     */
    public void setBatchManageCUGMember(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchManageCUGMember batchManageCUGMember) {
        this.batchManageCUGMember = batchManageCUGMember;
    }


    /**
     * Gets the batchAjustAccount value for this BatchOperationRequest.
     * 
     * @return batchAjustAccount
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccount getBatchAjustAccount() {
        return batchAjustAccount;
    }


    /**
     * Sets the batchAjustAccount value for this BatchOperationRequest.
     * 
     * @param batchAjustAccount
     */
    public void setBatchAjustAccount(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccount batchAjustAccount) {
        this.batchAjustAccount = batchAjustAccount;
    }


    /**
     * Gets the batchChgMSISDN value for this BatchOperationRequest.
     * 
     * @return batchChgMSISDN
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChgMSISDN getBatchChgMSISDN() {
        return batchChgMSISDN;
    }


    /**
     * Sets the batchChgMSISDN value for this BatchOperationRequest.
     * 
     * @param batchChgMSISDN
     */
    public void setBatchChgMSISDN(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChgMSISDN batchChgMSISDN) {
        this.batchChgMSISDN = batchChgMSISDN;
    }


    /**
     * Gets the batchModCallBundle value for this BatchOperationRequest.
     * 
     * @return batchModCallBundle
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModCallBundle getBatchModCallBundle() {
        return batchModCallBundle;
    }


    /**
     * Sets the batchModCallBundle value for this BatchOperationRequest.
     * 
     * @param batchModCallBundle
     */
    public void setBatchModCallBundle(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModCallBundle batchModCallBundle) {
        this.batchModCallBundle = batchModCallBundle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchOperationRequest)) return false;
        BatchOperationRequest other = (BatchOperationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchNewSubscriber==null && other.getBatchNewSubscriber()==null) || 
             (this.batchNewSubscriber!=null &&
              this.batchNewSubscriber.equals(other.getBatchNewSubscriber()))) &&
            ((this.batchDeleteSubscriber==null && other.getBatchDeleteSubscriber()==null) || 
             (this.batchDeleteSubscriber!=null &&
              this.batchDeleteSubscriber.equals(other.getBatchDeleteSubscriber()))) &&
            ((this.batchChgLRN==null && other.getBatchChgLRN()==null) || 
             (this.batchChgLRN!=null &&
              this.batchChgLRN.equals(other.getBatchChgLRN()))) &&
            ((this.batchSubscribe==null && other.getBatchSubscribe()==null) || 
             (this.batchSubscribe!=null &&
              this.batchSubscribe.equals(other.getBatchSubscribe()))) &&
            ((this.batchUnSubscribe==null && other.getBatchUnSubscribe()==null) || 
             (this.batchUnSubscribe!=null &&
              this.batchUnSubscribe.equals(other.getBatchUnSubscribe()))) &&
            ((this.batchChangeService==null && other.getBatchChangeService()==null) || 
             (this.batchChangeService!=null &&
              this.batchChangeService.equals(other.getBatchChangeService()))) &&
            ((this.batchChangeMainProduct==null && other.getBatchChangeMainProduct()==null) || 
             (this.batchChangeMainProduct!=null &&
              this.batchChangeMainProduct.equals(other.getBatchChangeMainProduct()))) &&
            ((this.batchModifySubValidity==null && other.getBatchModifySubValidity()==null) || 
             (this.batchModifySubValidity!=null &&
              this.batchModifySubValidity.equals(other.getBatchModifySubValidity()))) &&
            ((this.batchModifyVoucherState==null && other.getBatchModifyVoucherState()==null) || 
             (this.batchModifyVoucherState!=null &&
              this.batchModifyVoucherState.equals(other.getBatchModifyVoucherState()))) &&
            ((this.batchReplaceProduct==null && other.getBatchReplaceProduct()==null) || 
             (this.batchReplaceProduct!=null &&
              this.batchReplaceProduct.equals(other.getBatchReplaceProduct()))) &&
            ((this.batchCashRecharge==null && other.getBatchCashRecharge()==null) || 
             (this.batchCashRecharge!=null &&
              this.batchCashRecharge.equals(other.getBatchCashRecharge()))) &&
            ((this.batchVouchRecharge==null && other.getBatchVouchRecharge()==null) || 
             (this.batchVouchRecharge!=null &&
              this.batchVouchRecharge.equals(other.getBatchVouchRecharge()))) &&
            ((this.batchActiveSubscriber==null && other.getBatchActiveSubscriber()==null) || 
             (this.batchActiveSubscriber!=null &&
              this.batchActiveSubscriber.equals(other.getBatchActiveSubscriber()))) &&
            ((this.batchReleaseBlacklist==null && other.getBatchReleaseBlacklist()==null) || 
             (this.batchReleaseBlacklist!=null &&
              this.batchReleaseBlacklist.equals(other.getBatchReleaseBlacklist()))) &&
            ((this.batchModifyMainBalance==null && other.getBatchModifyMainBalance()==null) || 
             (this.batchModifyMainBalance!=null &&
              this.batchModifyMainBalance.equals(other.getBatchModifyMainBalance()))) &&
            ((this.batchManageCUGMember==null && other.getBatchManageCUGMember()==null) || 
             (this.batchManageCUGMember!=null &&
              this.batchManageCUGMember.equals(other.getBatchManageCUGMember()))) &&
            ((this.batchAjustAccount==null && other.getBatchAjustAccount()==null) || 
             (this.batchAjustAccount!=null &&
              this.batchAjustAccount.equals(other.getBatchAjustAccount()))) &&
            ((this.batchChgMSISDN==null && other.getBatchChgMSISDN()==null) || 
             (this.batchChgMSISDN!=null &&
              this.batchChgMSISDN.equals(other.getBatchChgMSISDN()))) &&
            ((this.batchModCallBundle==null && other.getBatchModCallBundle()==null) || 
             (this.batchModCallBundle!=null &&
              this.batchModCallBundle.equals(other.getBatchModCallBundle())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBatchNewSubscriber() != null) {
            _hashCode += getBatchNewSubscriber().hashCode();
        }
        if (getBatchDeleteSubscriber() != null) {
            _hashCode += getBatchDeleteSubscriber().hashCode();
        }
        if (getBatchChgLRN() != null) {
            _hashCode += getBatchChgLRN().hashCode();
        }
        if (getBatchSubscribe() != null) {
            _hashCode += getBatchSubscribe().hashCode();
        }
        if (getBatchUnSubscribe() != null) {
            _hashCode += getBatchUnSubscribe().hashCode();
        }
        if (getBatchChangeService() != null) {
            _hashCode += getBatchChangeService().hashCode();
        }
        if (getBatchChangeMainProduct() != null) {
            _hashCode += getBatchChangeMainProduct().hashCode();
        }
        if (getBatchModifySubValidity() != null) {
            _hashCode += getBatchModifySubValidity().hashCode();
        }
        if (getBatchModifyVoucherState() != null) {
            _hashCode += getBatchModifyVoucherState().hashCode();
        }
        if (getBatchReplaceProduct() != null) {
            _hashCode += getBatchReplaceProduct().hashCode();
        }
        if (getBatchCashRecharge() != null) {
            _hashCode += getBatchCashRecharge().hashCode();
        }
        if (getBatchVouchRecharge() != null) {
            _hashCode += getBatchVouchRecharge().hashCode();
        }
        if (getBatchActiveSubscriber() != null) {
            _hashCode += getBatchActiveSubscriber().hashCode();
        }
        if (getBatchReleaseBlacklist() != null) {
            _hashCode += getBatchReleaseBlacklist().hashCode();
        }
        if (getBatchModifyMainBalance() != null) {
            _hashCode += getBatchModifyMainBalance().hashCode();
        }
        if (getBatchManageCUGMember() != null) {
            _hashCode += getBatchManageCUGMember().hashCode();
        }
        if (getBatchAjustAccount() != null) {
            _hashCode += getBatchAjustAccount().hashCode();
        }
        if (getBatchChgMSISDN() != null) {
            _hashCode += getBatchChgMSISDN().hashCode();
        }
        if (getBatchModCallBundle() != null) {
            _hashCode += getBatchModCallBundle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchOperationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchOperationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchNewSubscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchNewSubscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchNewSubscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchDeleteSubscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchDeleteSubscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchDeleteSubscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchChgLRN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchChgLRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchChgLRN"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchSubscribe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchSubscribe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchSubscribe"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchUnSubscribe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchUnSubscribe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchUnSubscribe"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchChangeService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchChangeService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchChangeService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchChangeMainProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchChangeMainProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchChangeMainProduct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchModifySubValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchModifySubValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchModifySubValidity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchModifyVoucherState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchModifyVoucherState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchModifyVoucherState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchReplaceProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchReplaceProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchReplaceProduct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchCashRecharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchCashRecharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchCashRecharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchVouchRecharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchVouchRecharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchVouchRecharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchActiveSubscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchActiveSubscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchActiveSubscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchReleaseBlacklist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchReleaseBlacklist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchReleaseBlacklist"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchModifyMainBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchModifyMainBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchModifyMainBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchManageCUGMember");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchManageCUGMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchManageCUGMember"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchAjustAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchAjustAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchAjustAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchChgMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchChgMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchChgMSISDN"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchModCallBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BatchModCallBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchModCallBundle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
