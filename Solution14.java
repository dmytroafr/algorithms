class Solution14 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for(int i : prices){
            if (i > min){
                profit += i - min;
            }
            min = i;
        }
        return profit;
    }

    public static void main(String[] args) {
        
        int[] case1 = {7,1,5,3,6,4};
        int result = maxProfit(case1);
        System.out.println(result);
    }
}