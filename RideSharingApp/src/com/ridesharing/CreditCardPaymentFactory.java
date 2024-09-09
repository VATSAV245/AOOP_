package com.ridesharing;

class CreditCardPaymentFactory extends PaymentFactory { 
    public PaymentMethod createPaymentMethod() { 
        return new CreditCardPayment(); 
    } 
}
