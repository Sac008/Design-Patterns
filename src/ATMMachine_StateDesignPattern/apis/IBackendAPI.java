package ATMMachine_StateDesignPattern.apis;

import ATMMachine_StateDesignPattern.DTOs.CreateTransactionDTO;
import ATMMachine_StateDesignPattern.DTOs.GetATMAmountRequestDTO;
import ATMMachine_StateDesignPattern.DTOs.UpdateATMStateDTO;

public interface IBackendAPI {

    int createTransaction(CreateTransactionDTO createTransactionDTO);

    boolean updateState(UpdateATMStateDTO updateATMStateDTO);

    int getATMAmount(GetATMAmountRequestDTO atmId);
}
