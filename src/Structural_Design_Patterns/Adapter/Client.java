package Structural_Design_Patterns.Adapter;

public class Client {

    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorpayPaymentGatewayAdapter());
        flipkart.makePaymentViaCC("5467 6353 7836" , 657 , 4 , 2034);
    }
}
