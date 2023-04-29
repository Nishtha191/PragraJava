import java.util.Scanner;

public class forLoop {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            for(int i = 0 ; i <= 5; i++){
                System.out.print(" ");
                for(int j = 0 ; j <= i; j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }


            /*

            *
            **
            ***
            ****
            *****
            ******

             */
        }
}


