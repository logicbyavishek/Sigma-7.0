public class Buy_and_Sell_Stock {
    public static int Stock(int prices[]){
        int BuyStock = Integer.MAX_VALUE; // Intialise BuyStock Maximum beacause we want to buy in lowest price
        int MaxProfit = 0; // our maximum price 

        for(int i =0 ; i<prices.length ; i++){
            //prices[i] = today price 
            if(BuyStock<prices[i]){ // today stock price comparison
                int profit = prices[i]-BuyStock; // today profit 
                MaxProfit = Math.max(MaxProfit, profit); // all over profit that is maximum
            }else{
                BuyStock = prices[i]; // if buy price maximu then today stock price then not go for sell buy the stock
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,3,5,6,4}; // consider this array as a stock price graph

        // call our stock function for maximum profit
        System.out.println("The maximum profit earn from this stock is : "+Stock(prices)+"/- Rs Only");  
    }    
}
