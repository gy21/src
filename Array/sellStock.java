package Array;

public class sellStock {

//	Say you have an array for which the ith element is the price of a given stock on day i.
//	If you were only permitted to complete at most one transaction (ie, 
//	buy one and sell one share of the stock), design an algorithm to find 
	//the maximum profit.
	
	
	//The question is equivalent to the following:
	//Find i and j that maximizes Aj ¨C Ai, where i < j
	//Brute and Force method O(n^2)
	static int maxProfit(int[] prices){
		if(prices == null) return 0;
		int diff = 0;
		for(int i=0;i<prices.length -1 ; i++){
			for(int j = i+1; j< prices.length; j++){
				if(prices[j] - prices[i] > diff){
					diff = prices[j] - prices[i];
					
				}
			}
		}
		return diff;
	}
	
	//Efficient way O(n)
	static int maxPricesDiff(int [] prices){
		    int buy = 0;
		    int sell = 0;
		    int min = 0;
		    int maxdiff = 0;
		    for(int i=0; i<prices.length; i++){
		        if(prices[i] < prices[min]){
		            min = i;
		        }
		        int diff = prices[i] - prices[min];
		        if(diff > maxdiff){
		            buy = min;
		            sell = i;
		            maxdiff = diff;
		        }
		    }
		    return maxdiff;
	}
	public static void main(String[] args) {
		int [] a= {12,27,30,26,29,23,25};
		System.out.println(maxProfit(a));
		System.out.println(maxPricesDiff(a));
		
	}

}
