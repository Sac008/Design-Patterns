package ATMMachine_StateDesignPattern.services;

import ATMMachine_StateDesignPattern.DTOs.GetATMAmountRequestDTO;
import ATMMachine_StateDesignPattern.apis.IBackendAPI;
import ATMMachine_StateDesignPattern.apis.NodeBackendAPI;
import ATMMachine_StateDesignPattern.models.ATM;

public class CashDispenseServiceImpl implements ICashDispenseService {

    private final IBackendAPI backendAPI;

    public CashDispenseServiceImpl() {
        this.backendAPI = new NodeBackendAPI();
    }

    @Override
    public void dispenseCash(ATM atm , double amount) {

        int atmAmount = this.backendAPI.getATMAmount(new GetATMAmountRequestDTO(atm.getAtm_id()));
        if(atmAmount < amount) {
            throw new RuntimeException("ATM does not have enough money");
        }

        System.out.println("Dispense Cash: " + amount);
    }
}
