package Behavioral.Template;

public class WebOrder extends OrderTemplate {
    @Override
    protected void doDelivery() {
        System.out.println("Delivering Web order");
    }

    @Override
    public void doCheckout() {
        System.out.println("Checking out Web order");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment of Web order");
    }

    @Override
    public void doReceipt() {
        System.out.println("Receipt of Web order");
    }
}
