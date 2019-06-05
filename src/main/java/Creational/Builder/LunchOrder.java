package Creational.Builder;

public class LunchOrder {

    private String meat;
    private String bread;
    private String dressing;
    private String condiments;

    private Builder builder;

    public static class Builder{

        private String bread;
        private String condiments;
        private String meat;
        private String dressing;

        public Builder(){

        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }


        public LunchOrder buildSandwich(){
            return new LunchOrder(this);
        }
    }

    public LunchOrder(Builder builder) {
        this.meat = builder.meat;
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
    }


    @Override
    public String toString() {
        return "LunchOrder{" +
                "meat='" + meat + '\'' +
                ", bread='" + bread + '\'' +
                ", dressing='" + dressing + '\'' +
                ", condiments='" + condiments + '\'' +
                '}';
    }
}


