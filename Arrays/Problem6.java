import java.util.*;

public class Problem6 {

    public static int maximumProfit(ArrayList<Integer> prices) {
        int minPrice = prices.get(0);
        int profit = 0;
        for (int i = 1; i < prices.size(); i++) {
            int priceDiff = prices.get(i) - minPrice;
            profit = Math.max(profit, priceDiff);
            minPrice = Math.min(minPrice, prices.get(i));
        }
        return profit;
    }

    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(1);
        prices.add(2);
        prices.add(3);
        prices.add(4);
        System.out.println(maximumProfit(prices));
    }
}
