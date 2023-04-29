public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to world of Array!");
        int[] prices = new int[10];
        for(int i = 0 ; i < prices.length ; i++){
            prices[i] = i *10;
        }
        for(int i = 0 ; i < prices.length ; i++){
            System.out.println("Value of index " + i + " is " + prices[i]);
        }

        for(int temp:prices){
            temp = temp +5;
            System.out.println(temp);
        }
    }
}