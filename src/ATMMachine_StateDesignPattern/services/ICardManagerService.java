package ATMMachine_StateDesignPattern.services;

import ATMMachine_StateDesignPattern.models.Card;

public interface ICardManagerService {

    boolean validateCard(Card card , String pin);

    boolean validateWithdrawal(int transactionId , double amount);

    boolean doTransaction(Card card , int amount, int transactionId);

}
