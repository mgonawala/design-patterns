package Codility;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        int[] dayWiseStock = { 23171, 21011,21123,21366,21013,21367};
        StockAudit stockAudit = new StockAudit(6, dayWiseStock);

        System.out.println(Application.sum(stockAudit));


    }

    public static int sum(StockAudit stockAudit){

        int minIndex = stockAudit.getMin().getIndex();
        int maxIndex = stockAudit.getMax().getIndex();

        if( minIndex > maxIndex){
            stockAudit.getDayWisePrice().remove(stockAudit.getMax());
            sum(stockAudit);
        }

            return stockAudit.getMax().getValue() - stockAudit.getMin().getValue();

    }
}

class StockAudit{

    private int size;

    private TreeSet<ValueIndex> dayWisePrice = new TreeSet<ValueIndex>();

    private int maxIndex = 0;

    private int minIndex = 0;

    public StockAudit(int size, int[] dayWisePrice){

        for(int i=0 ; i<size ; i++){
            if( dayWisePrice[i]>200000 || dayWisePrice[i]<0)
                throw new IllegalArgumentException("Value should be within the range");
            ValueIndex valueIndex = new ValueIndex();
            valueIndex.setIndex(i);
            valueIndex.setValue(dayWisePrice[i]);
            this.dayWisePrice.add(valueIndex);
        }
        this.size = size;
    }

    public ValueIndex getMax(){
        return dayWisePrice.last();
    }

    public ValueIndex getMin(){
       return dayWisePrice.first();
    }

    public TreeSet<ValueIndex> getDayWisePrice(){
        return this.dayWisePrice;
    }
}
