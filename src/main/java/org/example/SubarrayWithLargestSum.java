package org.example;

public class SubarrayWithLargestSum {

    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : arr) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1,4};
        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
