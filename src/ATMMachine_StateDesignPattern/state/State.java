package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.Card;

public interface State {

    int initTransaction();

    boolean readCardDetailsAndPin(Card card, String pin);

    int dispenseCash(Card card , int amount, int transactionId);

    void ejectCard();

    boolean readCashWithdrawalDetails(Card card , int transactionId , int amount);

    boolean cancelTransaction(int transactionId);

    ATMState getATMState();
}
