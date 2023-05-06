public class Main {
    public static void main(String[] args) {

//        Car c = new Car();
//        BMW bmw = new BMW();
//        c.drive();
//        bmw.drive();


        Fulltime ft = new Fulltime("ABC","Developer",100000);
        Parttime pt = new Parttime(40,78);
        Contractors ct = new Contractors("CDF","Developer", 100000,10000,7800);

        System.out.println("Fulltime Employee's salary is " + ft.calculateSalary());
        System.out.println("Parttime Employee's salary is " + pt.calculateSalary());
        System.out.println("Contract Employee's salary is " + ct.calculateSalary());


    }
}