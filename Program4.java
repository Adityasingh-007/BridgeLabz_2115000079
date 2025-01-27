public class Program4 {
    public static void main(String[] args) {
        int cp = 129;
        int sp = 191;
        int profit = sp - cp;
        double profitpercent = (profit / (double) cp) * 100;

        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitpercent + "%");
    }
}
