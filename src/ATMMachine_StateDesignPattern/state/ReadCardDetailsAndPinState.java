package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.factories.CardManagerFactory;
import ATMMachine_StateDesignPattern.models.ATM;
import ATMMachine_StateDesignPattern.models.Card;
import ATMMachine_StateDesignPattern.services.ICardManagerService;

public class ReadCardDetailsAndPinState implements State {

    private ATM atm;

    public ReadCardDetailsAndPinState(ATM atm) {
        this.atm = atm;
    }
    @Override
    public int initTransaction() {
        throw new IllegalStateException("Transaction is already in progress");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card , String pin) {
        ICardManagerService cardManagerService = CardManagerFactory.getCardManagerService(card.getCardType());
        boolean isCardValid = cardManagerService.validateCard(card , pin);
        if (isCardValid) {
            this.atm.changeState(new ReadingCashWithdrawalDetailsState(this.atm));
        }
        else this.atm.changeState(new EjectingCardState(this.atm));
        return isCardValid;
    }

    @Override
    public int dispenseCash(Card card , int amount ,  int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while reading card details and pin state");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while reading details and pin state");
    }

    @Override
    public boolean readCashWithdrawalDetails(Card card , int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cashWithdrawal while reading card details and pin state");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        this.atm.changeState(new ReadyForTransactionState(this.atm));
        return true;
    }

    @Override
    public ATMState getATMState() {
        return ATMState.READ_CARD_DETAILS_AND_PIN;
    }
}
