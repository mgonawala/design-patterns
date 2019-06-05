package Creational.Factory;

/**
 *
 * It doesnt expose construction logic.
 * It only exposes a common interface which is used to get the required object.
 * Object initiation is often deferred to a subclass.
 *
 * Ex: Calender
 *
 * Factory is responsible for creation lifeCycle.
 *
 * WebsiteFactory is creating a website based on type of website you want.
 * getWebsite is static factory method which will delegate to appropriate
 * construction method for object creation.
 *
 * Website is the abstract class which defines the contract of website.
 * Blog provides the actuall implementation of Createion of Blog type website
 * Shop provides the actual implementation of creation of Shop type website.
 *
 * based on type, any of these will be initiaized and returned by factory method.
 *
 *
 */
public class FactoryDesignPattern {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite("");
        System.out.println(website);
    }
}
