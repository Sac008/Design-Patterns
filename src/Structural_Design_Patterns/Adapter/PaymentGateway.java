package Structural_Design_Patterns.Adapter;

public interface PaymentGateway {

    Long patViaCreditCard(String cardNumber , int cvv , int expiryMonth , int expiryYear);

    PaymentStatus getStatus(Long id);
}
