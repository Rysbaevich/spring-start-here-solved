package com.example.controllers;

import com.example.model.Payment;
import com.example.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentController {

  private final PaymentService paymentService;

  Logger logger = Logger.getLogger(PaymentController.class.getName());

  public PaymentController(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  @PostMapping("/payment")
  public ResponseEntity<Payment> makePayment(
          @RequestHeader String requestId,
          @RequestBody Payment payment
  ) {
      logger.info("Received request with ID " + requestId + " Payment amount: " + payment.getAmount());
      payment.setId(requestId);
      return ResponseEntity
              .status(HttpStatus.ACCEPTED)
              .body(payment);
  }
}
