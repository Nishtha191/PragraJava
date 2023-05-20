public class Bagel implements TimsConsumable{
    public String toString(){
        return "Bagel";
    }
    @Override
    public int getCalories() {
        return 350;
    }

    @Override
    public double getPrice() {
        return 4.3;
    }
}
