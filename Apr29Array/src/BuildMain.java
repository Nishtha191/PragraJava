public class BuildMain {
    public static void main(String[] args){
        PragraStringBuilder text = new PragraStringBuilder("I am Learning");
        text.modify("I am Playing");
        text.modify("I am working");
        System.out.println(text.str);
    }
}
