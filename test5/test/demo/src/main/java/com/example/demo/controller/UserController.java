package com.example.demo.controller;

import com.example.demo.dto.PaymentDto;
import com.example.demo.model.PaymentModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping("/qr")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllUser() {
        LinkedHashMap<String, Object> res = new LinkedHashMap<>();
        List<PaymentModel> data = userRepository.getPayment();
        res.put("data", data);
        return ResponseEntity.ok().body(res);

    }

    @PostMapping(path = "/payment", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> postPayment(@RequestBody PaymentDto paymentDto) {
        LinkedHashMap<String, Object> res = new LinkedHashMap<>();

        try {
            userRepository.postPayment(paymentDto.getProcessingcode(), paymentDto.getAdditionalfield(), paymentDto.getPan(),
                    paymentDto.getTransactionamount(), paymentDto.getTransactiondatetime(), paymentDto.getTransactiontraceauditnumber(),
                    paymentDto.getSystemtraceauditnumber(), paymentDto.getLocaltransactiondatetime(),
                    paymentDto.getSettlementdate(), paymentDto.getCapturedate(), paymentDto.getMerchanttype(),
                    paymentDto.getPosentrymode(), paymentDto.getFeetype(), paymentDto.getFeeamount(), paymentDto.getAcquiredid(),
                    paymentDto.getIssuerid(), paymentDto.getForwadingid(), paymentDto.getRrn(), paymentDto.getApprovalcode(),
                    paymentDto.getTerminalid(), paymentDto.getMerchantid(), paymentDto.getMerchantname(), paymentDto.getMerchantcity(),
                    paymentDto.getMerchantcountry(), paymentDto.getProductindicator(), paymentDto.getCustomerdata(),
                    paymentDto.getMerchantcriteria(), paymentDto.getCurrencycode(), paymentDto.getPostalcode(), paymentDto.getCustomerpan());
            List<PaymentModel> data = userRepository.getUpdate();

            res.put("data", data);
            return ResponseEntity.ok().body(res);
        } catch (Exception e) {
            res.put("data", e);
            return ResponseEntity.ok().body(res);
        }
    }
}
