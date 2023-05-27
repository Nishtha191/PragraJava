import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserDetails userDetails = new UserDetails();
        User user = userDetails.GetUserData();
        System.out.println("User details: " + user.toString());

    }
}