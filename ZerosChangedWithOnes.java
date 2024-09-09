package ArraysPackage;

public class ZerosChangedWithOnes {

	public static void main(String args[]) {
		int arr[] = { 1, 1, 0, 0, 1, 1, 1, 0, 1, 1 };
		int k = 3;
		zerosToOnes(arr, k);
	}

	public static void zerosToOnes(int arr[], int k) {

		int l = 0, r = 0, maxZeros = 0, maxLen = 0;
		while (r < arr.length) {
			if (arr[r] == 0)
				maxZeros += 1;
			if (maxZeros > k) {
				if (arr[l] == 0) {
					maxZeros--;
				}
				l++;
			}
			maxLen = Math.max(r - l + 1, maxLen);
			r++;
		}
		System.out.println(maxLen);
	}
}
