public class Main {
    public static void main(String[] args){

        // 5
        // syntax of declaring variable
        // datatype variableName;
        // numbers -> integer type of numbers = - + , numbers
        // short int long
        // text or words --> string
        // decimal numbers -> float, double, big decimal
        // single character -> char
        // boolean values -> store 2 types -> false / true
        // Declaration
        // Java is type strict language
        // within same scope you cannot declare

        short id;
        int marks;
        long phoneNumber;
        String name;
        float averageMarks;
        char attend;
        boolean isOnline;


        // usage of it -> initialization
        // '=' -> assignment operator -> works from right to left

        marks = 50;
        System.out.println(marks);
        marks = marks + 5;
        System.out.println(marks);

        id=123;
        System.out.println(id);
        phoneNumber = 1234567890;
        System.out.println(phoneNumber);

    }

    public static void method(){
        int marks;
    }

}