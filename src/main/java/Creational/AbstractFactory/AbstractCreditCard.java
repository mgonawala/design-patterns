package Creational.AbstractFactory;

// Abstract Product defines the common properties
public abstract class AbstractCreditCard {

    private int cardNumber ;
    private int cvvNumber;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(int cvvNumber) {
        this.cvvNumber = cvvNumber;
    }
}
