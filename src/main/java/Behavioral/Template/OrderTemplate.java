package Behavioral.Template;


public abstract class OrderTemplate {

    // This is the template method.
    public final void processOrder(){
        doCheckout();
        doPayment();
        if(this.isGift){
            wrapGift();
        }
        else{
            doReceipt();
        }
        doDelivery();
    }

    protected abstract void doDelivery();

    public boolean isGift;
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract  void doReceipt();

    public final void wrapGift(){
        System.out.println("Your gift is wrapped.");
    }

}
