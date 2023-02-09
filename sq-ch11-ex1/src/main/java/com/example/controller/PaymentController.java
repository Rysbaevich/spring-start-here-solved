package com.example.controller;

import com.example.model.Payment;
import com.example.proxy.PaymentProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {
    private final PaymentProxy proxy;

    public PaymentController(PaymentProxy proxy) {
        this.proxy = proxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ) {
        String requestId = UUID.randomUUID().toString();
        System.out.println(requestId);
        return proxy.createPayment(requestId, payment);
    }
}
