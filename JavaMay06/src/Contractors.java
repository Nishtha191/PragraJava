public class Contractors extends Fulltime {

    int bonus;
    int extraSalary;

    public Contractors(String perks, String position, int salary, int bonus, int extraSalary) {
        super(perks, position, salary);
        this.bonus = bonus;
        this.extraSalary = extraSalary;
    }
@Override
    public int calculateSalary(){
        return salary+bonus+extraSalary;
    }

}
