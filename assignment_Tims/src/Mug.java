public class Mug implements  TimsMerchendies{

    public String toString(){
        return "Mug";
    }
    public String getFeatures(){
        return "This is red color Mug.";
    }

    @Override
    public double getPrice() {
        return 15.50;
    }
}
