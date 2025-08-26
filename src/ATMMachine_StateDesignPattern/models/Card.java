package ATMMachine_StateDesignPattern.models;

import ATMMachine_StateDesignPattern.Enums.CardType;

public class Card {

    private final long cardNumber;

    private final int pin;

    private final String name;

    private final CardType cardType;

    private final BankName bankName;

    public Card(long cardNumber, int pin, String name, CardType cardType, BankName bankName) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.name = name;
        this.cardType = cardType;
        this.bankName = bankName;
    }


    public BankName getBankName() {
        return bankName;
    }

    public CardType getCardType() {
        return cardType;
    }

    public String getName() {
        return name;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", pin=" + pin +
                ", name='" + name + '\'' +
                ", cardType='" + cardType + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}