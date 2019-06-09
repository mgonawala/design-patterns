package Behavioral.Strategy;


/**
 *
 * Use it when you want to eliminate conditional statements.
 *
 * Client is aware of the startegy in this patter.
 *
 * Example: theres an abstarct ValidationStrategy, which CreditCard is aware of
 * & used composition to call it's valid method to validate creditcard.
 *
 * Behavior is encapsulated in the class.
 *
 * Example: Java.util.Comparator.
 *
 * It's made of Strategy, ConcreteStrategy, Context
 */
public class StrategyPattern {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(new AmexStrategy());
        creditCard.setCardNumber(15);
        System.out.println(creditCard.isValid());

        CreditCard visa = new CreditCard(new VisaStrategy());
        visa.setCardNumber(15);
        System.out.println(visa.isValid());
    }

}
