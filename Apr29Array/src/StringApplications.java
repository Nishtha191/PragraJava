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
        String s1= "I love Java";
        s1 = s1.concat(" from 2014");
        System.out.println(s1);
        System.out.println(s1.length());
    }
}
