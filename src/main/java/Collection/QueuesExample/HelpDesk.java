package Collection.QueuesExample;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Here
 * Priority queue will order elements according to the order declared in Enum declaration.
 */
public class HelpDesk {

    private final Comparator comparator = new Comparator<Enquiry>(){

        @Override
        public int compare(Enquiry o1, Enquiry o2) {
            return o1.getQueryType().compareTo(o2.getQueryType());
        }
    };

    private Queue<Enquiry> enquiries = new PriorityQueue<>(comparator);

    public void enquire(String customer, Category type){
        enquiries.offer(new Enquiry(customer,type));
    }

    public void processAllEnquiries(){
        Enquiry query;
        while ( ( query = enquiries.poll()) != null){
            System.out.println(query.getCustomerName() + ":" + query.getQueryType());

        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire("Mohini", Category.CPU);
        helpDesk.enquire("Akshat",Category.MONITOR);
        helpDesk.enquire("Rajeshree", Category.MOUSE);
        helpDesk.enquire("Girish",Category.PRINTER);

        helpDesk.processAllEnquiries();
    }
}
