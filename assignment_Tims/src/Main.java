import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TimsItem[] tims = new TimsItem[100];

        int orderCounter = 0;
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Merchandise");
            System.out.println("2. Consumables");
            System.out.println("3. Checkout");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println(" ");

                    }
                    break;
                case 2:
                    System.out.println("");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("");

                    }
                    break;
                case 3:
                    System.out.println(" d");
                    break;

                default:
                    System.out.println(" ");
            }

        }

    }
}