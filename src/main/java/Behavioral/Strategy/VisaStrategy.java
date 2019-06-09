package Behavioral.Strategy;

public class VisaStrategy extends Strategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        if( creditCard.getCardNumber() >= 30)
            return false;
        else
            return true;
    }
}
