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
                    System.out.println("Done with ordering!");
                    System.out.println("###########################################################");
                    System.out.println("No. of items ordered: " + (orderCounter++));
                    if (orderCounter-1 == 0){
                        System.out.println("You haven't ordered anything!");
                        System.out.println("################See You Again. Have a nice day.##################");
                    }
                    else {
                        System.out.println("###########################################################");
                        System.out.println("You have ordered : ");
                        for (int i = 0; i < orderCounter - 1; i++) {
                            System.out.println(tim[i]);
                        }
                        System.out.println("###########################################################");
                        System.out.println("Total Price is : " + totalPrice);
                        System.out.println("1. Continue Checkout Online");
                        System.out.println("2. Checkout At Counter");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Welcome to Online Payment");
                                Wallet wallet = new Wallet();
                                System.out.println("Enter 10 Digit Card Number : ");
                                int cn = sc.nextInt();
                                System.out.println("Enter Month & Year :");
                                String my = sc.next();
                                System.out.println("Enter CVV : ");
                                int cvv = sc.nextInt();
                                if(cn == wallet.creditCardNumber  && cvv == wallet.cvv){
                                    if(wallet.balance >= totalPrice){
                                        wallet.balance -= totalPrice;
                                        System.out.println("###########################################################");
                                        System.out.println("Available balance in wallet is : " + wallet.balance);
                                        System.out.println("Total deducted amount is : " + totalPrice);
                                        System.out.println("###########################################################");
                                        System.out.println("Remaining Balance is : " + wallet.balance);
                                        System.out.println("###########################################################");
                                        System.out.println("Your order will be ready at pick up counter shortly!");
                                        System.out.println("Have a nice Day. See you again!");
                                        return;
                                    }
                                    else {
                                        System.out.println("Insufficient Balance! Try at Counter Payment.");
                                        System.out.println("###########################################################");
                                        System.out.println("Thank you!");
                                        return;
                                    }
                                }
                                else {
                                    System.out.println("###########################################################");
                                    System.out.println("Information is incorrect. Try again!");
                                    System.out.println("Payment Failed! \n");
                                }
                                break;
                            case 2:
                                System.out.println("Thank you for selecting at counter payment. \n Your order will be ready at pick up counter shortly! \n Your total is : " + totalPrice);
                                System.out.println("Have a nice Day. See you again!");
                            default:
                                return;
                        }

                        break;
                    }

                default:
                    System.out.println(" ");
                    return;
            }

        }

    }
}