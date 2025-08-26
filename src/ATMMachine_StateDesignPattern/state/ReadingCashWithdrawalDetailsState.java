package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Enums.CardType;
import ATMMachine_StateDesignPattern.factories.CardManagerFactory;
import ATMMachine_StateDesignPattern.models.ATM;
import ATMMachine_StateDesignPattern.models.Card;
import ATMMachine_StateDesignPattern.services.ICardManagerService;

public class ReadingCashWithdrawalDetailsState implements State {

    private final ATM atm;

    public ReadingCashWithdrawalDetailsState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        return 0;
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("cannot read card details without inserting the card");
    }

    @Override
    public int dispenseCash(Card card , int amount ,int transactionId) {
        throw new IllegalStateException("cannot dispense cash without reading card details and pin");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("cannot eject card without reading card details and pin");
    }

    @Override
    public boolean readCashWithdrawalDetails(Card card , int transactionId, int amount) {
        ICardManagerService cardManagerService = CardManagerFactory.getCardManagerService(card.getCardType());
        boolean isWithdrawValid = cardManagerService.validateWithdrawal(transactionId , amount);
        if(isWithdrawValid) {
            this.atm.changeState(new DispensingCashState(this.atm));
        }
        else {
            this.atm.changeState(new EjectingCardState(this.atm));
        }
        return isWithdrawValid;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        this.atm.changeState(new ReadyForTransactionState(this.atm));
        return true;
    }

    @Override
    public ATMState getATMState() {
        return null;
    }
}
