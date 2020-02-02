package practice;

public class MaxProfitOnApp {
	
//	public static int maximumProfit(int budget[]) {
//		int maxprofit = Integer.MIN_VALUE;
//		for(int i = 0; i < budget.length;i++) {
//			int count = 0;
//			for(int j = 0; j < budget.length; j++) {
//				if(budget[j] >= budget[i]) {
//					count++;
//				}
//			}
//			if (count * budget[i] > maxprofit) {
//				maxprofit = count * budget[i];
//			}
//		}
//		return maxprofit;
//	}
	
	private static int maximumProfit(int budget[],int index) {
		if(index >= budget.length) {
			return 0;
		}
		int smallans = maximumProfit(budget, index + 1);
		int ans = 0;
		for (int i = 0; i < budget.length; i++) {
			if(budget[i] >= budget[index]) {
				ans = ans + budget[index];
			}
		}
		if (ans > smallans) {
			return ans;
		}
		return smallans;
	}
	
	public static int maximumProfit(int[] budget) {
		return maximumProfit(budget,0);
	}

	public static void main(String[] args) {
		int[] arr = {34,78,90,15,67};
		System.out.println(maximumProfit(arr,0));

	}

}
