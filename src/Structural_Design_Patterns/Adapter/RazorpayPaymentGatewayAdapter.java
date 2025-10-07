package Structural_Design_Patterns.Adapter;

import Structural_Design_Patterns.Adapter.razorpay.RazorpayGateway;

public class RazorpayPaymentGatewayAdapter implements PaymentGateway {

    private RazorpayGateway razorpayGateway = new RazorpayGateway();


    @Override
    public Long patViaCreditCard(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvStr = String.valueOf(cvv);
        String expiry = String.valueOf(expiryMonth) + "/" + String.valueOf(expiryYear);
        String output = razorpayGateway.payByCreditCard(cardNumber , cvvStr , expiry);
        return Long.parseLong(output);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = razorpayGateway.checkPaymentStatus(String.valueOf(id));
        if(status) return PaymentStatus.SUCCESS;
        return PaymentStatus.FAILURE;
    }
}
