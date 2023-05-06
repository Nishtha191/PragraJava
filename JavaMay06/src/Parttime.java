public class Parttime extends Employee{
    int hours;

    int hourlywage;

    public Parttime(int hours, int hourlywage) {
        this.hours = hours;
        this.hourlywage = hourlywage;
    }
@Override
    public int calculateSalary(){
        return (hours*hourlywage*52);
    }


}
