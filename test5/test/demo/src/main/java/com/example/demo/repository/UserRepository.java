package com.example.demo.repository;

import com.example.demo.model.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<PaymentModel,String> {
    @Query(value = "select * from Payment" , nativeQuery = true)
    List<PaymentModel> getPayment();

    @Query(value = "select * from payment p order by payment_id desc limit 1" , nativeQuery = true)
    List<PaymentModel> getUpdate();
    @Modifying
    @Query(value = "insert into payment (processingCode, additionalField, pan, transactionAmount," +
            "transactionDateTime, transactionTraceAuditNumber,systemTraceAuditNumber, localTransactionDateTime, settlementDate, captureDate, merchantType," +
            "posEntryMode, feeType, feeAmount, acquiredId, issuerId, forwadingId, rrn, approvalCode, terminalId, merchantId, merchantName, merchantCity, merchantCountry," +
            "productIndicator, customerData, merchantCriteria, currencyCode, postalCode, customerPan) values(:processingcode, :additionalfield, :pan, :transactionamount, :transactiondatetime, :transactiontraceauditnumber, :systemtraceauditnumber," +
            ":localtransactiondatetime, :settlementdate, :capturedate, :merchanttype, :posentrymode, :feetype, :feeamount, :acquiredid, :issuerid, :forwadingid," +
            ":rrn, :approvalcode, :terminalid, :merchantid, :merchantname, :merchantcity, :merchantcountry, :productindicator, :customerdata, :merchantcriteria, :currencycode, :postalcode, :customerpan)" , nativeQuery = true)
    public void postPayment(@Param("processingcode") String processingcode, @Param("additionalfield") String additionalfield, @Param("pan") String pan,
                            @Param("transactionamount") String transactionamount,@Param("transactiondatetime") String transactiondatetime,
                            @Param("transactiontraceauditnumber") String transactiontraceauditnumber,@Param("systemtraceauditnumber") String systemtraceauditnumber,@Param("localtransactiondatetime") String localtransactiondatetime,
                            @Param("settlementdate") String settlementdate,@Param("capturedate") String capturedate, @Param("merchanttype") String merchanttype,
                            @Param("posentrymode") String posentrymode,@Param("feetype") String feetype,@Param("feeamount") String feeamount,
                            @Param("acquiredid") String acquiredid,@Param("issuerid") String issuerid,@Param("forwadingid") String forwadingid,@Param("rrn") String rrn,
                            @Param("approvalcode") String approvalcode,@Param("terminalid") String terminalid,@Param("merchantid") String merchantid,
                            @Param("merchantname") String merchantname,@Param("merchantcity") String merchantcity,@Param("merchantcountry") String merchantcountry,
                            @Param("productindicator") String productindicator, @Param("customerdata") String customerdata, @Param("merchantcriteria") String merchantcriteria,
                            @Param("currencycode") String currencycode, @Param("postalcode") String postalcode,@Param("customerpan") String customerpan);
}
