import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TimItem[] tim = new TimItem[100];

        int orderCounter = 0;
        int choice = 0;
        double totalPrice = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Merchandise");
            System.out.println("2. Consumables");
            System.out.println("3. Checkout");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Mugs");
                    System.out.println("2. CoffeePowder");
                    System.out.println("3. Gift Cards");
                    System.out.println("4. HockeyCards");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            Mug mug = new Mug();
                            System.out.println("Mug Price is : " + mug.getPrice());
                            System.out.println("Feature is : " + mug.getFeatures());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                                if (choice == 1){
                                    tim[orderCounter++] = mug;
                                    totalPrice +=  mug.getPrice();

                                }
                            break;
                        case 2:
                            CoffeePowder coffeePowder = new CoffeePowder();
                            System.out.println("CoffeePowder Price is : " + coffeePowder.getPrice());
                            System.out.println("Feature is : " + coffeePowder.getFeatures());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1){
                                tim[orderCounter++] = coffeePowder;
                                totalPrice +=  coffeePowder.getPrice();
                            }
                            break;
                        case 3:
                            GiftCards giftCards = new GiftCards();
                            System.out.println("Gift card price is : " + giftCards.getPrice());
                            System.out.println("Gift card feature is : " + giftCards.getFeatures());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1){
                                tim[orderCounter++] = giftCards;
                                totalPrice +=  giftCards.getPrice();
                            }
                            break;
                        case 4:
                            HockeyCards hockeyCards =new HockeyCards();
                            System.out.println("HockeyCard price is : " + hockeyCards.getPrice());
                            System.out.println("HockeyCard feature is : " + hockeyCards.getFeatures());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1){
                                tim[orderCounter++] = hockeyCards;
                                totalPrice +=  hockeyCards.getPrice();
                            }
                            break;
                        default:
                            System.out.println("  ");

                    }
                    break;
                case 2:
                    System.out.println("1. Donut");
                    System.out.println("2. Bagel");
                    System.out.println("3. Coffee");
                    System.out.println("4. Wrap");
                    System.out.println("5. Sandwich");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            Donut donut = new Donut();
                            System.out.println("Donut Price is : " + donut.getPrice());
                            System.out.println("Calorie is : " + donut.getCalories());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1){
                                tim[orderCounter++] = donut;
                                totalPrice +=  donut.getPrice();
                            }
                            break;
                        case 2:
                            Bagel bagel = new Bagel();
                            System.out.println("Bagel Price is : " + bagel.getPrice());
                            System.out.println("Calorie is : " + bagel.getCalories());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1){
                                tim[orderCounter++] = bagel;
                                totalPrice +=  bagel.getPrice();
                            }
                            break;
                        case 3:
                            Coffee coffee = new Coffee();
                            System.out.println("Coffee Price is : " + coffee.getPrice());
                            System.out.println("Calorie is : " + coffee.getCalories());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1){
                                tim[orderCounter++] = coffee;
                                totalPrice +=  coffee.getPrice();
                            }
                            break;
                        case 4:
                            Wrap wrap = new Wrap();
                            System.out.println("Wrap Price is : " + wrap.getPrice());
                            System.out.println("Calorie is : " + wrap.getCalories());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1){
                                tim[orderCounter++] = wrap;
                                totalPrice +=  wrap.getPrice();
                            }
                            break;
                        case 5:
                            Sandwich sandwich = new Sandwich();
                            System.out.println("Sandwich Price is : " + sandwich.getPrice());
                            System.out.println("Calorie is : " + sandwich.getCalories());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1){
                                tim[orderCounter++] = sandwich;
                                totalPrice +=  sandwich.getPrice();
                            }
                            break;
                        default:
                            System.out.println("");

                    }
                    break;
                case 3:
                    System.out.println(" Done with ordering");
                    System.out.println("No. of items ordering : " + (orderCounter++));
                    System.out.println("Total Price is : " + totalPrice);
                    System.out.println("1. Continue Checkout Online");
                    System.out.println("2. Checkout At Counter");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Welcome to Online Payment");
                            break;
                        case 2:
                            System.out.println("Thank you for selecting at counter payment. \n Your order will be ready at pick up counter shortly! \n Your total is : " + totalPrice);
                        default:
                            return;
                    }

                    break;

                default:
                    System.out.println(" ");
                    return;
            }

        }

    }
}