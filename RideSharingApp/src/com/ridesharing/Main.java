package com.ridesharing;

public class Main {
    public static void main(String[] args) {
        UserAuthentication userAuth = UserAuthentication.getInstance();
        userAuth.login("Alice");

        Vehicle vehicle = new CarFactory().createVehicle();
        vehicle.drive();

        PaymentMethod payment = new CreditCardPaymentFactory().createPaymentMethod();
        payment.pay(50.0);

        userAuth.logout();
    }
}
