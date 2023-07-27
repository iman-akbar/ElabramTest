package com.example.demo.model;

import javax.persistence.*;

@Entity
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "paymentId", nullable = false)
    private Long paymentId;

    private String processingcode;
    private String pan;
    private String transactionamount;
    private String transactiondatetime;
    private String transactiontraceauditnumber;
    private String systemtraceauditnumber;
    private String localtransactiondatetime;
    private String settlementdate;
    private String capturedate;
    private String merchanttype;
    private String posentrymode;
    private String feetype;
    private String feeamount;
    private String acquiredid;
    private String issuerid;
    private String forwadingid;
    private String rrn;
    private String approvalcode;
    private String terminalid;
    private String merchantid;
    private String merchantname;
    private String merchantcity;
    private String merchantcountry;
    private String productindicator;
    private String customerdata;
    private String merchantcriteria;
    private String currencycode;
    private String postalcode;
    private String additionalfield;
    private String customerpan;

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getProcessingcode() {
        return processingcode;
    }

    public void setProcessingcode(String processingcode) {
        this.processingcode = processingcode;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getTransactionamount() {
        return transactionamount;
    }

    public void setTransactionamount(String transactionamount) {
        this.transactionamount = transactionamount;
    }

    public String getTransactiondatetime() {
        return transactiondatetime;
    }

    public void setTransactiondatetime(String transactiondatetime) {
        this.transactiondatetime = transactiondatetime;
    }



    public String getSystemtraceauditnumber() {
        return systemtraceauditnumber;
    }

    public void setSystemtraceauditnumber(String systemtraceauditnumber) {
        this.systemtraceauditnumber = systemtraceauditnumber;
    }

    public String getLocaltransactiondatetime() {
        return localtransactiondatetime;
    }

    public void setLocaltransactiondatetime(String localtransactiondatetime) {
        this.localtransactiondatetime = localtransactiondatetime;
    }

    public String getSettlementdate() {
        return settlementdate;
    }

    public void setSettlementdate(String settlementdate) {
        this.settlementdate = settlementdate;
    }

    public String getCapturedate() {
        return capturedate;
    }

    public void setCapturedate(String capturedate) {
        this.capturedate = capturedate;
    }

    public String getMerchanttype() {
        return merchanttype;
    }

    public void setMerchanttype(String merchanttype) {
        this.merchanttype = merchanttype;
    }

    public String getPosentrymode() {
        return posentrymode;
    }

    public void setPosentrymode(String posentrymode) {
        this.posentrymode = posentrymode;
    }

    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    public String getFeeamount() {
        return feeamount;
    }

    public void setFeeamount(String feeamount) {
        this.feeamount = feeamount;
    }

    public String getAcquiredid() {
        return acquiredid;
    }

    public void setAcquiredid(String acquiredid) {
        this.acquiredid = acquiredid;
    }

    public String getIssuerid() {
        return issuerid;
    }

    public void setIssuerid(String issuerid) {
        this.issuerid = issuerid;
    }

    public String getForwadingid() {
        return forwadingid;
    }

    public void setForwadingid(String forwadingid) {
        this.forwadingid = forwadingid;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getApprovalcode() {
        return approvalcode;
    }

    public void setApprovalcode(String approvalcode) {
        this.approvalcode = approvalcode;
    }

    public String getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(String terminalid) {
        this.terminalid = terminalid;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    public String getMerchantname() {
        return merchantname;
    }

    public void setMerchantname(String merchantname) {
        this.merchantname = merchantname;
    }

    public String getMerchantcity() {
        return merchantcity;
    }

    public void setMerchantcity(String merchantcity) {
        this.merchantcity = merchantcity;
    }

    public String getMerchantcountry() {
        return merchantcountry;
    }

    public void setMerchantcountry(String merchantcountry) {
        this.merchantcountry = merchantcountry;
    }

    public String getProductindicator() {
        return productindicator;
    }

    public void setProductindicator(String productindicator) {
        this.productindicator = productindicator;
    }

    public String getCustomerdata() {
        return customerdata;
    }

    public void setCustomerdata(String customerdata) {
        this.customerdata = customerdata;
    }

    public String getMerchantcriteria() {
        return merchantcriteria;
    }

    public void setMerchantcriteria(String merchantcriteria) {
        this.merchantcriteria = merchantcriteria;
    }

    public String getCurrencycode() {
        return currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getAdditionalfield() {
        return additionalfield;
    }

    public void setAdditionalfield(String additionalfield) {
        this.additionalfield = additionalfield;
    }

    public String getCustomerpan() {
        return customerpan;
    }

    public void setCustomerpan(String customerpan) {
        this.customerpan = customerpan;
    }
    public String getTransactiontraceauditnumber() {
        return transactiontraceauditnumber;
    }

    public void setTransactiontraceauditnumber(String transactiontraceauditnumber) {
        this.transactiontraceauditnumber = transactiontraceauditnumber;
    }
}
