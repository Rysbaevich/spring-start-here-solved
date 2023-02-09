package com.example.service;

import com.example.exceptions.NotEnoughMoneyException;
import com.example.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

  public Payment processPayment() {
    throw new NotEnoughMoneyException();
  }
}
