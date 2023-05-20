public class Sandwich implements TimsConsumable{
    public String toString(){
        return "Sandwich";
    }
    @Override
    public int getCalories() {
        return 350;
    }

    @Override
    public double getPrice() {
        return 8.50;
    }
}
