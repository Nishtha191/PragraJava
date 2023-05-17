public class Car {
    String model;
    String engineType;
    int tire;
    String color;
    int make;

    public Car(String model, String engineType, int tire, String color, int make) {
        this.model = model;
        this.engineType = engineType;
        this.tire = tire;
        this.color = color;
        this.make = make;
    }

    public String toString(){
        return "Model name : " + model + " Engine Type : " + engineType + " Tires : " + tire + " Color is " + color + " Make in " + make;
    }
}
