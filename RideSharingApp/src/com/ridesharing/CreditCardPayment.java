package com.ridesharing;

class CreditCardPayment implements PaymentMethod { 
    public void pay(double amount) { 
        System.out.println("Paid " + amount + " using Credit Card."); 
    } 
}
