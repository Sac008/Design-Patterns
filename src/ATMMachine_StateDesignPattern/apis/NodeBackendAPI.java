package ATMMachine_StateDesignPattern.apis;

// Should only be responsible for connecting to backend and returning the response

import ATMMachine_StateDesignPattern.DTOs.CreateTransactionDTO;
import ATMMachine_StateDesignPattern.DTOs.GetATMAmountRequestDTO;
import ATMMachine_StateDesignPattern.DTOs.UpdateATMStateDTO;

public class NodeBackendAPI implements IBackendAPI {
    @Override
    public int createTransaction(CreateTransactionDTO createTransactionDTO) {
        if(createTransactionDTO.getAtmId() == null || createTransactionDTO.getAtmId().isEmpty())
            throw new IllegalArgumentException("ATM ID cannot be null or empty");

        // Assume connected to backend
        // To mimic the backend call let's return a new random transaction id
        int txnId = (int)(Math.random()*1000);
        // Return the response
        return txnId;
    }

    @Override
    public boolean updateState(UpdateATMStateDTO updateATMStateDTO) {
        // Assume that implementation is present that calls the backend

        // Mimicked response
        return true;
    }

    @Override
    public int getATMAmount(GetATMAmountRequestDTO atmId) {
        return 100000;
    }


}
