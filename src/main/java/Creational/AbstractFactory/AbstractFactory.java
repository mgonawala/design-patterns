package Creational.AbstractFactory;

/**
 *
 * Factory of factory.
 *
 * Example: DocumentBuilder
 *
 * It is combination of AbstractFactory, Factory and Product
 *
 * An Abstract factory of CreditCard, which returns either AmexCreditCardFactory
 * or PlatinumCreditCardFactory based on credit score passed.
 *
 * Now this factory returns a credit card Visa or Gold based on what type is passed.
 *
 */
public class AbstractFactory {

    public static void main(String[] args) {

        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(550);
        System.out.println(creditCardFactory.getClass());
        AbstractCreditCard gold = creditCardFactory.getCreditCard("GOLD");
        System.out.println(gold.getClass());
        PlatinumCreditCard visa = (PlatinumCreditCard)creditCardFactory.getCreditCard("PLATINUM");
        System.out.println(visa.getClass());



         creditCardFactory = CreditCardFactory.getCreditCardFactory(700);
        System.out.println(creditCardFactory.getClass());
         gold = creditCardFactory.getCreditCard("GOLD");
        System.out.println(gold.getClass());
         PlatinumCreditCard platinum = (PlatinumCreditCard)creditCardFactory.getCreditCard("PLATINUM");
        System.out.println(platinum.getClass());
    }
}
