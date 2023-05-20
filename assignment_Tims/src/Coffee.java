public class Coffee implements TimsConsumable{
    public String toString(){
        return "Coffee";
    }
    @Override
    public int getCalories() {
        return 200;
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
