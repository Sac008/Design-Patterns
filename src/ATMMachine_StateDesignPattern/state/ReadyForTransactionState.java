package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.DTOs.CreateTransactionDTO;
import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.apis.IBackendAPI;
import ATMMachine_StateDesignPattern.apis.NodeBackendAPI;
import ATMMachine_StateDesignPattern.models.ATM;
import ATMMachine_StateDesignPattern.models.Card;

public class ReadyForTransactionState implements State{

    private ATM atm;

    private IBackendAPI backendAPI;

    private static int transactionID;

    public ReadyForTransactionState(ATM atm) {
        this.atm = atm;
        this.backendAPI = new NodeBackendAPI();
    }
    @Override
    public int initTransaction() {
        int transactionId = this.backendAPI.createTransaction(new CreateTransactionDTO(this.atm.getAtm_id()));
        if(transactionId == -1 || transactionId == 0) {
            throw new RuntimeException("Transaction could not be created");
        }

        // Now that we have the transaction id from backend, we should move the ATM to the next state
        this.atm.changeState(new ReadCardDetailsAndPinState(atm));
        System.out.println("transactionId: " + transactionId);
        return transactionId;
    }

    @Override
    public boolean readCardDetailsAndPin(Card card , String pin) {
        throw new IllegalStateException("Cannot read card details and pin without inserting the card");
    }

    @Override
    public int dispenseCash(Card card , int amount ,int transactionId) {
        throw new IllegalStateException("Cannot dispense cash without reading card details and pin");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card without reading card details and pin");
    }

    @Override
    public boolean readCashWithdrawalDetails(Card card , int transactionId, int amount) {
        throw new IllegalStateException("cannot read cash withdrawal details without transaction");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("cannot cancel transaction");
    }

    @Override
    public ATMState getATMState() {
        return ATMState.READY_FOR_TRANSACTION;
    }

    public static int getTranxId() {
        return transactionID;
    }
}
