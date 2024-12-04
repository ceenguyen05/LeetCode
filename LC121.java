
class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE ; // low buy price 
        int highProfit = 0 ; // profit 
        // go through array 
        // this checks each index and calculates low and high profit 
        // checks if the price is lowest first , if it is then replaces low 
        // if not then calculates the max profit with that price and current low
        for (int price : prices) {
            if (price < low) {
                low = price ;
            } else {
                int profit = price - low ;
                if (profit > highProfit) {
                    highProfit = profit ;
                }
            }
        }
        return highProfit ;
    }
}
