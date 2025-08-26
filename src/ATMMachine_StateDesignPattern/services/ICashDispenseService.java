package ATMMachine_StateDesignPattern.services;

import ATMMachine_StateDesignPattern.models.ATM;

public interface ICashDispenseService {

    void dispenseCash(ATM atm , double amount);
}
