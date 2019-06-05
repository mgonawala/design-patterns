package Creational.AbstractFactory;

public class VisaCreditCardFactory extends CreditCardFactory {
    @Override
    public AbstractCreditCard getCreditCard(String type) {
        if( type.equals("GOLD"))
            return new GoldCrediCard();
        else
            return new PlatinumCreditCard();
    }
}
