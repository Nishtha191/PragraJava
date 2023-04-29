public class Toyata {
    String nameOfCar;
    int year;

    Toyata(String nameOfCar, int year){
        this.nameOfCar = nameOfCar;
        this.year =year;
    }

    String drive(){
        return  "I am driving " + nameOfCar + " " + year;
    }
}
