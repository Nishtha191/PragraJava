public class HockeyCards implements  TimsMerchendies{
    public String toString(){
        return "HockeyCard";
    }
    public String getFeatures(){
        return "HockeyCard is having 30$ of balance";
    }

    @Override
    public double getPrice() {
        return 30;
    }
}
