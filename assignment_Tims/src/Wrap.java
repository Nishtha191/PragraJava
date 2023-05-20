public class Wrap implements TimsConsumable{
    public String toString(){
        return "Wrap";
    }
    @Override
    public int getCalories() {
        return 350;
    }

    @Override
    public double getPrice() {
        return 9.50;
    }
}
