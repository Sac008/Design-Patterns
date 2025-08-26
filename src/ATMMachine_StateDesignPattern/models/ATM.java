package ATMMachine_StateDesignPattern.models;

import ATMMachine_StateDesignPattern.DTOs.UpdateATMStateDTO;
import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.apis.IBackendAPI;
import ATMMachine_StateDesignPattern.apis.NodeBackendAPI;
import ATMMachine_StateDesignPattern.state.ReadyForTransactionState;
import ATMMachine_StateDesignPattern.state.State;

public class ATM {

    private final String atm_id;
    private State state;
    private IBackendAPI backendAPI;

    public ATM(String atm_id) {
        this.atm_id = atm_id;
        this.backendAPI = new NodeBackendAPI();
        this.state = new ReadyForTransactionState(this);
    }

    public String getAtm_id() {
        return atm_id;
    }

    public void changeState(State newState) {
        this.state = newState;
        // Now call the server to persist the state on server also
        this.backendAPI.updateState(new UpdateATMStateDTO(newState.getATMState() , this.atm_id));
    }

    public State getState() {
        return state;
    }

}
