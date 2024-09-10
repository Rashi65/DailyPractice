package ArraysPackage;

public class MinimumWindowSubarraySum {

	public static void main(String args[]) {
		int arr[] = { 2, 3, 1, 2, 4, 3 };
		int target = 9;
		minWindowPrintAndLength(arr, target);
	}

	public static void minWindowPrintAndLength(int arr[], int target) {
		int l = 0, r = 0, minLen = Integer.MAX_VALUE, tarSum = 0, start = 0, end = 0;
		while (r < arr.length) {
			tarSum += arr[r];
			while (tarSum >= target) {
				if ((r - l + 1) < minLen) {
					minLen = r - l + 1;
					start = l;
					end = r;
				}
				tarSum -= arr[l];
				l++;
			}
			r++;
		}
		if (minLen != Integer.MAX_VALUE) {
			for (int i = start; i <= end; i++) {
				System.out.println(arr[i] + "\n");
			}
		}
	}
}
