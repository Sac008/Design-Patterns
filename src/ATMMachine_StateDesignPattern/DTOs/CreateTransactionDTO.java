package ATMMachine_StateDesignPattern.DTOs;

public class CreateTransactionDTO {

    String atmId;

    public CreateTransactionDTO(String atmId) {
        this.atmId = atmId;
    }

    public String getAtmId() {
        return atmId;
    }
}
