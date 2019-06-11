package Collection.QueuesExample;

public class Enquiry {

    private String customerName;

    private Category queryType;

    public Enquiry(String customerName, Category queryType) {
        this.customerName = customerName;
        this.queryType = queryType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Category getQueryType() {
        return queryType;
    }

    public void setQueryType(Category queryType) {
        this.queryType = queryType;
    }





}


