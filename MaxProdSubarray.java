package ArraysPackage;

public class MaxProdSubarray {

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        int result = maxProduct(arr);
        System.out.println("Maximum Product Subarray: " + result);
    }

    public static int maxProduct(int[] arr) {
        if (arr.length == 0) return 0;

        // Initialize variables
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        // Traverse through the array
        for (int i = 1; i < arr.length; i++) {
            // If the current element is negative, swap max and min
            if (arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Calculate max and min product up to the current index
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            // Update the result with the maximum product found so far
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
