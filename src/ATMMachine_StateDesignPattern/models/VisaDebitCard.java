package ATMMachine_StateDesignPattern.models;

import ATMMachine_StateDesignPattern.Enums.CardType;

public class VisaDebitCard extends Card implements IVisa , IDebit{
    public VisaDebitCard(long cardNumber, int pin, String name, CardType cardType, BankName bankName) {
        super(cardNumber, pin, name, cardType, bankName);
    }

    @Override
    public void makePinPayment() {
        this.connectToVisa();
        System.out.println("PIN PAYMENT VISA DEBIT");
    }

    @Override
    public void connectToVisa() {
        System.out.println("Connected to Visa Network");
    }
}
