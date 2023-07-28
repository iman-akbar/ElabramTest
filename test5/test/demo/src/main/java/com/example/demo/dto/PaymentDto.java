package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {
     String processingcode;
     String pan;
     String transactionamount;
     String transactiondatetime;
     String transactiontraceauditnumber;
     String systemtraceauditnumber;
     String localtransactiondatetime;
     String settlementdate;
     String capturedate;
     String merchanttype;
     String posentrymode;
     String feetype;
     String feeamount;
     String acquiredid;
     String issuerid;
     String forwadingid;
     String rrn;
     String approvalcode;
     String terminalid;
     String merchantid;
     String merchantname;
     String merchantcity;
     String merchantcountry;
     String productindicator;
     String customerdata;
     String merchantcriteria;
     String currencycode;
     String postalcode;
     String additionalfield;
     String customerpan;
}
