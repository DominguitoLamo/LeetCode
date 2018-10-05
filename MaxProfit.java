public class MaxProfit{
public int maxprofit(int k, int[] num){
    if(num == null || k < 2)
        return 0;
	//local store the k transaction of maximun profit.
	int[] local = new int[k + 1];
	int[] global = new int[k + 1];
	for(int i = 1; i < num.length; i++){
		int diff = num[i] - num[i - 1];
		for(int j = 0; j <= k; j++){
			//local records the difference of each transaction.
			local[j] = Math.max(global[j - 1] + Math.max(0,diff),local[j - 1] + diff);
			global[j] = Math.max(global[j - 1], local[j]);
		}
	}
    
}
}
