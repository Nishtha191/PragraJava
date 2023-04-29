public class StringApplications {
    public static void main(String[] args){
        String s = "I love Java";
        char[] charArray = new char[5];
        charArray[0] = 'a';
        charArray[1] = 'b';
        charArray[2] = 'c';
        charArray[3] = 'd';
        charArray[4] = 'd';


        char[] newArray = {'a','b','c'};
        String s3= "I love Java";
        s3 = s3.concat(" from 2014");
        System.out.println(s3);
        System.out.println(s3.length());




        String s1 = new String("I love Java");
        String s2 = new String("I love Java");

//        if(!s1.equals(s2)){
//            System.out.println("We are having same memory address so we are same");
//        }
//        else{
//            System.out.println("We are different");
//        }
        //love J
        System.out.println(s1.substring(2,8));

        System.out.println(s1.split(" "));

    }
}
