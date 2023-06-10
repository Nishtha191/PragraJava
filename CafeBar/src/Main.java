import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<Merchandise, Integer> order = new HashMap<>();

        int orderCounter = 0;
        int choice = 0;
        double totalPrice = 0;
        int q = 0;
        int quantity = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Coffee");
            System.out.println("2. Mug");
            System.out.println("3. HockeyCards");
            System.out.println("4. GiftCard");
            System.out.println("5. Cart");
            System.out.println("6. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    CoffeePowder cf = new CoffeePowder();
                    System.out.println("Coffee price is : " + cf.getPrice());
                    System.out.println("Feature is : " + cf.getFeature());
                    System.out.println("Coffee is available at location " + cf.getStoreAddress());
                    System.out.println("1. Order");
                    System.out.println("2. Continue with another products");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("How many coffee wants to order ?");
                        int temp = sc.nextInt();
                        if (order.containsKey(cf)) {
                            quantity += temp;
                            order.put(cf, quantity);
                            totalPrice += temp * cf.getPrice();
                        } else {
                            quantity = temp;
                            order.put(cf, temp);
                            totalPrice += temp * cf.getPrice();
                        }
                    }
                    break;

                case 2:
                    Mug mug = new Mug();
                    System.out.println("Mug price is : " + mug.getPrice());
                    System.out.println("Feature is : " + mug.getFeature());
                    System.out.println("Mug is available at location " + mug.getStoreAddress());
                    System.out.println("1. Order");
                    System.out.println("2. Continue with another products");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("How many Mug wants to order ?");
                        int temp = sc.nextInt();
                        if (order.containsKey(mug)) {
                            quantity += temp;
                            order.put(mug, quantity);
                            totalPrice += temp * mug.getPrice();
                        } else {
                            quantity = temp;
                            order.put(mug, temp);
                            totalPrice += temp * mug.getPrice();
                        }
                    }
                    break;

                case 3:
                    HockeyCards hc = new HockeyCards();
                    System.out.println("HockeyCards price is : " + hc.getPrice());
                    System.out.println("Feature is : " + hc.getFeature());
                    System.out.println("HockeyCards is available at location " + hc.getStoreAddress());
                    System.out.println("1. Order");
                    System.out.println("2. Continue with another products");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("How many HockeyCards wants to order ?");
                        int temp = sc.nextInt();
                        if (order.containsKey(hc)) {
                            quantity += temp;
                            order.put(hc, quantity);
                            totalPrice += temp * hc.getPrice();
                        } else {
                            quantity = temp;
                            order.put(hc, temp);
                            totalPrice += temp * hc.getPrice();
                        }
                    }
                    break;

                case 4:
                    GiftCards gc = new GiftCards();
                    System.out.println("GiftCards price is : " + gc.getPrice());
                    System.out.println("Feature is : " + gc.getFeature());
                    System.out.println("GiftCards is available at location " + gc.getStoreAddress());
                    System.out.println("1. Order");
                    System.out.println("2. Continue with another products");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("How many GiftCards wants to order ?");
                        int temp = sc.nextInt();
                        if (order.containsKey(gc)) {
                            quantity += temp;
                            order.put(gc, quantity);
                            totalPrice += temp * gc.getPrice();
                        } else {
                            quantity = temp;
                            order.put(gc, temp);
                            totalPrice += temp * gc.getPrice();
                        }
                    }
                    break;


                case 5:
                    System.out.println("Done with ordering!");
                    System.out.println("###########################################################");

                    for (Map.Entry<Merchandise, Integer> entry : order.entrySet()) {
                        System.out.println("You have ordered : " + entry.getKey());
                        System.out.println("Number of quantity : " + entry.getValue());
                        System.out.println("###########################################################");
                    }
                    System.out.println("Total Price is : " + totalPrice);
                    return;
            }

        }
    }
}
