package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.factories.CardManagerFactory;
import ATMMachine_StateDesignPattern.models.ATM;
import ATMMachine_StateDesignPattern.models.Card;
import ATMMachine_StateDesignPattern.services.CashDispenseServiceImpl;
import ATMMachine_StateDesignPattern.services.ICardManagerService;
import ATMMachine_StateDesignPattern.services.ICashDispenseService;

public class DispensingCashState implements State {

    private final ATM atm;

    private final ICashDispenseService dispenseService;

    public DispensingCashState(ATM atm) {
        this.atm = atm;
        this.dispenseService = new CashDispenseServiceImpl();
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("cannot init transaction while dispensing cash");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("cannot read card details and pin while dispensing cash");
    }

    @Override
    public int dispenseCash(Card card , int amount , int transactionId) {
        ICardManagerService cardManagerService = CardManagerFactory.getCardManagerService(card.getCardType());
        boolean isTxnSuccess = cardManagerService.doTransaction(card , amount , transactionId);
        if(isTxnSuccess) {
            this.dispenseService.dispenseCash(this.atm , amount);
            this.atm.changeState(new EjectingCardState(this.atm));
        }
        else {
            System.out.println("Something went wrong");
            this.atm.changeState(new EjectingCardState(this.atm));
        }
        return amount;
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("cannot eject card while dispensing cash");
    }

    @Override
    public boolean readCashWithdrawalDetails(Card card, int transactionId, int amount) {
        throw new IllegalStateException("cannot read cashwithdraw details while dispensing cash");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while dispensing cash");
    }

    @Override
    public ATMState getATMState() {
        return ATMState.DISPENSING_CASH;
    }
}
