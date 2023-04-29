public class PragraStringBuilder {
    int length;
    char[] str;

    public PragraStringBuilder(String s) {
        str = s.toCharArray();
        length=s.length();
    }

    public void modify(String s){
        str = s.toCharArray();
    }

}
