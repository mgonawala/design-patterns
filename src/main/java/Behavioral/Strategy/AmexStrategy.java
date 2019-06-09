package Behavioral.Strategy;

public class AmexStrategy extends Strategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        if( creditCard.getCardNumber() >= 20)
            return true;
        else return false;
    }
}
