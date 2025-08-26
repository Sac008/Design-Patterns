package ATMMachine_StateDesignPattern.factories;

import ATMMachine_StateDesignPattern.Enums.CardType;
import ATMMachine_StateDesignPattern.services.CreditCardManagerService;
import ATMMachine_StateDesignPattern.services.DebitCardManagerService;
import ATMMachine_StateDesignPattern.services.ICardManagerService;

public class CardManagerFactory {

    public static ICardManagerService getCardManagerService(CardType type) {
        ICardManagerService cardManagerService = null;
        if(type.equals(CardType.Debit)) {
            cardManagerService = new DebitCardManagerService();
        }
        else if(type.equals(CardType.Credit)) {
            cardManagerService = new CreditCardManagerService();
        }
        else {
            throw new RuntimeException("Invalid card type");
        }
        return cardManagerService;
    }
}
