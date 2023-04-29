import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean count = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                count = true;
            }
        }

        if (!count)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

}