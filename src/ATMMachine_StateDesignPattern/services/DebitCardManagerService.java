package ATMMachine_StateDesignPattern.services;

import ATMMachine_StateDesignPattern.models.Card;

public class DebitCardManagerService implements ICardManagerService{
    @Override
    public boolean validateCard(Card card, String pin) {
        // Should also connect to api for validation
        return true;
    }

    @Override
    public boolean validateWithdrawal(int transactionId, double amount) {
        // Should also connect to api for validation
        return true;
    }

    @Override
    public boolean doTransaction(Card card, int amount, int transactionId) {
        // Should also connect to api for validation
        return true;
    }
}
