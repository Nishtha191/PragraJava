public class GiftCards implements  TimsMerchendies{
    public String getFeatures(){
            return "Gift card is having 20$ balance";
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
