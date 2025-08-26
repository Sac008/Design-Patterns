package ATMMachine_StateDesignPattern.services;

import ATMMachine_StateDesignPattern.models.Card;

public class CreditCardManagerService implements ICardManagerService{
    @Override
    public boolean validateCard(Card card, String pin) {
        return true;
    }

    @Override
    public boolean validateWithdrawal(int transactionId, double amount) {
        return true;
    }

    @Override
    public boolean doTransaction(Card card, int amount , int transactionId) {
        return true;
    }
}
