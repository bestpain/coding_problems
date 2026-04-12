package DSA;

public class MaxSumSubarraySizeK {

    public static void main(String[] args) {
        int[] input = new int[]{1,4,2,10,23,3,1,0,20};
        System.out.println(maximumSumSubarrayOfSizeK(input, 4));
    }

    public static int maximumSumSubarrayOfSizeK(int[] input, int k) {
        int maxSum = 0;
        int windowSum = 0;
        // nums = [2,1,5,1,3,2]
        for (int i = 0; i < k; i++) {
            windowSum += input[i];
        }
        maxSum = windowSum;

        for (int right = k; right < input.length; right++) {
            windowSum += input[right];
            windowSum -= input[right - k];
            maxSum = Math.max(maxSum, windowSum);

        }

        return maxSum;
    }


}
