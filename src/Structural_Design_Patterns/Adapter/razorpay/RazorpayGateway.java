package Structural_Design_Patterns.Adapter.razorpay;

public class RazorpayGateway {

    public String payByCreditCard(String creditCard, String cvv , String expiry) {
        System.out.println("Payment done by razorpay");
        return "123";
    }

    public boolean checkPaymentStatus(String id) {
        return false;
    }
}
