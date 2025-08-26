package ATMMachine_StateDesignPattern.models;

import ATMMachine_StateDesignPattern.Enums.CardType;

public class MasterDebitCard extends Card implements IMasterCard , IDebit{
    public MasterDebitCard(long cardNumber, int pin, String name, CardType cardType, BankName bankName) {
        super(cardNumber, pin, name, cardType, bankName);
    }

    @Override
    public void makePinPayment() {
        this.connectToMasterCard();
        System.out.println("PIN PAYMENT VIA MASTER DEBIT CARD");
    }

    @Override
    public void connectToMasterCard() {
        System.out.println("Connected to master card network");
    }
}
