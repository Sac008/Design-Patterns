package Structural_Design_Patterns.Adapter;

public class Flipkart {

    private PaymentGateway paymentGateway;

    public Flipkart(PaymentGateway paymentGateway) {
        paymentGateway = paymentGateway;
    }
    public void makePaymentViaCC(String cardNumber , int cvv , int expiryMonth , int expiryYear) {
        Long transactionId = paymentGateway.patViaCreditCard(cardNumber, cvv, expiryMonth, expiryYear);
        while(!paymentGateway.getStatus(transactionId).equals("SUCCESS")) {
            System.out.println("Waiting");
        }
    }


}
