public class Donut implements TimsConsumable{
    public String toString(){
        return "Donut";
    }
    @Override
    public int getCalories() {
        return 450;
    }

    @Override
    public double getPrice() {
        return 2.75;
    }
}
