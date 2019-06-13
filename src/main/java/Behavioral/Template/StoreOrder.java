package Behavioral.Template;

public class StoreOrder extends OrderTemplate {
    @Override
    protected void doDelivery() {
        System.out.println("Delivering Store order");
    }

    @Override
    public void doCheckout() {
        System.out.println("Checking out Store order");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment of Store order");
    }

    @Override
    public void doReceipt() {
        System.out.println("Receipt of Store order");
    }
}
