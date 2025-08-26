package ATMMachine_StateDesignPattern.DTOs;

import ATMMachine_StateDesignPattern.Enums.ATMState;

public class UpdateATMStateDTO {

    private final ATMState atmState;

    private final String atmId;

    public UpdateATMStateDTO(ATMState atmState, String atmId) {
        this.atmState = atmState;
        this.atmId = atmId;
    }

    public ATMState getATMState() {
        return atmState;
    }

    public String getATMId() {
        return atmId;
    }
}
