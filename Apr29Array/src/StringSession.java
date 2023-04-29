public class StringSession {
    public static void main(String[] args) {

    //ToString left
    String s = "I";
    System.out.println(s);
    s = s.concat(" Love");
    s = s.concat(" Java");

    System.out.println(s);

    StringBuilder text = new StringBuilder("I");
    text.append(" Love");
    text.append(" Java");
    System.out.println(text);

    }
}
