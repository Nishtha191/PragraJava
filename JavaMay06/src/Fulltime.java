public class Fulltime extends Employee {
    String perks;
    String position;
    int salary = 10000;

    public Fulltime(String perks,String position, int salary){
        this.perks = perks;
        this.position = position;
        this.salary = salary;
    }

@Override
    public int calculateSalary(){
        return salary;
    }

}
