package ATMMachine_StateDesignPattern;

import ATMMachine_StateDesignPattern.Enums.CardType;
import ATMMachine_StateDesignPattern.models.ATM;
import ATMMachine_StateDesignPattern.models.BankName;
import ATMMachine_StateDesignPattern.models.Card;
import ATMMachine_StateDesignPattern.state.ReadyForTransactionState;

public class ATMDriver {

    public static void main(String[] args) {
        ATM atmMachine = new ATM("atm_noida_axis_72");
        Card newCard = new Card(22832323723l , 234567 , "money back" , CardType.Debit, BankName.ICICI);
        System.out.println(newCard.toString());
        atmMachine.getState().initTransaction();
        atmMachine.getState().readCardDetailsAndPin(newCard , "234567");
        atmMachine.getState().readCashWithdrawalDetails(newCard , 43749374 , 10000);
        atmMachine.getState().dispenseCash(newCard , 10000 , 3828323);
    }
}
