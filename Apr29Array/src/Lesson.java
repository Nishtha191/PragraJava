import java.util.Scanner;
public class Lesson {
    public static void main(String args[]) {
//        String[] studentNames = new String[7];
//        studentNames[0] = "Nishtha";
//        studentNames[1] = "Chintan";
//        studentNames[2] = "Sam";
//        studentNames[3] = "Sam";
//        studentNames[4] = "Sam";
//        studentNames[5] = "Sam";
//        studentNames[6] = "Sam";
        Scanner sc = new Scanner(System.in);
        int[] orderPrice = new int[10];
        int index = 0;
        System.out.println("Using Loop");
        for (int j=0;j<orderPrice.length;j++){
            if(j == 2 || j == 5 || j == 6 || j == 9){
                System.out.println("Please enter value of index " + j );
                index = sc.nextInt();
                orderPrice[j]+= index;
            }
            System.out.println("Value of index " + j + " is " + orderPrice[j]);
//            if(j == 2 || j == 5 || j == 6 || j == 9){
//                 = sc.nextInt();
//                orderPrice[j]+= 5;
//            }
//            else if(j == 5){
//                orderPrice[j]+=8;
//            }
//            else if(j == 6){
//                orderPrice[j]+=4;
//            }
//            else if(j == 9){
//                orderPrice[j]+=9;
//            }
//            System.out.println("Value of index " + j + " is " + orderPrice[j]);
        }
        System.out.println("Without Loop");
        for (int j=0;j<orderPrice.length;j++){
          orderPrice[j] = 0;
        }

        orderPrice[2]+= 5;
        orderPrice[5]+=8;
        orderPrice[6]+=4;
        orderPrice[9]+=9;

        for (int j=0;j<orderPrice.length;j++){
            System.out.println("Value of index " + j + " is " + orderPrice[j]);
        }




//        for (int i = 0 ;i < studentNames.length ; i++) {
//            System.out.println(studentNames[i]);
//        }
    }
}
