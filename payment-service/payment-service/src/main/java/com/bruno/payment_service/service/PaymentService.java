package com.bruno.payment_service.service;

import com.bruno.payment_service.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
