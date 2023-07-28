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
        userRepository.postPayment(paymentDto.getProcessingode(), paymentDto.getAdditionalfield());
        res.put("data", "ok");
        return ResponseEntity.ok().body(res);
    }
}
