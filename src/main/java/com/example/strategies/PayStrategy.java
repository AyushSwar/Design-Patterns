package com.example.strategies;

//common interface for all strategies

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
