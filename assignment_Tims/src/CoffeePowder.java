public class CoffeePowder implements  TimsMerchendies{
    public String toString(){
        return "CoffeePowder";
    }
    public String getFeatures(){
        return  " It is 0.5 lb pack of coffee powder. ";
    }

    @Override
    public double getPrice() {
        return 23.45;
    }
}
