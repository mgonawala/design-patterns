package Codility;

public class ValueIndex  implements  Comparable{


    private int value;

    private int index;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int compareTo(Object o) {
        return this.getValue() - ((ValueIndex) o).getValue();
    }
}
