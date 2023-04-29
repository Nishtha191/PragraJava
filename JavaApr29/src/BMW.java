import java.time.Year;

public class BMW {
    String nameOfCar;
    int year;

    BMW(String nameOfCar, int year){
        this.nameOfCar = nameOfCar;
        this.year =year;
    }

    String drive(){
        return  "I am driving " + nameOfCar + " " + year;
    }
}
