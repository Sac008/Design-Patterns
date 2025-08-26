package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.ATM;
import ATMMachine_StateDesignPattern.models.Card;

public class EjectingCardState implements State {

    private final ATM atm;

    public EjectingCardState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("cannot initiate transaction while ejecting card");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("cannnot read card details and pin while ejecting card");
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {
        throw new IllegalStateException("cannot dispense cash while ejecting card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting Card");
    }

    @Override
    public boolean readCashWithdrawalDetails(Card card, int transactionId, int amount) {
        throw new IllegalStateException("cannot read cash withdrawal details while ejecting card");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        this.atm.changeState(new ReadyForTransactionState(this.atm));
        return true;
    }

    @Override
    public ATMState getATMState() {
        return ATMState.EJECTING_CARD;
    }
}
