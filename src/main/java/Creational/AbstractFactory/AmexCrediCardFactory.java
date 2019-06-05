package Creational.AbstractFactory;

public class AmexCrediCardFactory extends CreditCardFactory {
    @Override
    public AbstractCreditCard getCreditCard(String type) {
        if(type.equals("GOLD"))
            return new GoldCrediCard();
        else
            return new PlatinumCreditCard();
    }
}
