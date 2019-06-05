package Creational.AbstractFactory;

// Abstract credit card factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore){
        if( creditScore>650){
            return new VisaCreditCardFactory();
        }
        else
            return new AmexCrediCardFactory();
    }

    public abstract AbstractCreditCard getCreditCard(String type);

}
