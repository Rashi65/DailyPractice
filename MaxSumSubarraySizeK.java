package ArraysPackage;

public class MaxSumSubarraySizeK {
 
	public static void main(String args[]) {
		int arr[]= {2,1,5,1,3,2};
		int k=4;
		maxSum(arr,k);
	}
	
	public static void maxSum(int arr[], int k) {
		
		int l=0, r=0, maxSum=0, currSum=0;
		while(r<arr.length) {
			currSum+=arr[r];
			if((r-l+1) == k) {
				maxSum=Math.max(currSum, maxSum);
				currSum-=arr[l];
				l++;
			}
			r++;
		}
		System.out.println(maxSum);
	}
}











