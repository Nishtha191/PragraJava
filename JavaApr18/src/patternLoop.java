import java.util.Scanner;

public class patternLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 5 ; i >= 0 ; i--){
            System.out.print(" ");
            for(int j = 0 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
/*
 *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 * */


