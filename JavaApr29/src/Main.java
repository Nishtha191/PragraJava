import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BMW car1 = new BMW("X5", 2010 );
        Honda car2 = new Honda("Civic", 2020);
        Toyata car3 = new Toyata("GR86", 2020);


        int option = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select company name : ");
        System.out.println("1. BMW");
        System.out.println("2. Honda");
        System.out.println("3. Toyata ");

        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("You have selected BMW !");
                System.out.println(car1.drive());
                break;
            case 2:
                System.out.println("You have selected Honda !");
                System.out.println(car2.drive());
                break;
            case 3:
                System.out.println("You have selected Toyata !");

                System.out.println(car3);
                System.out.println(car3.drive());
            break;

        }
        }
}