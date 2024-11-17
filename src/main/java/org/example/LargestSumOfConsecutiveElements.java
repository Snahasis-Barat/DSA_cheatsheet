package org.example;

public class LargestSumOfConsecutiveElements {

    public static int findLargestSum(int[] arr,int k) {

        int windowSum=0,maxSum=0;
        for(int i=0;i<k;i++) {
            windowSum+=arr[i];
        }

        for(int i=k;i<arr.length;i++) {
            windowSum=windowSum-arr[i-k]+arr[i];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5, 6, 7, 8, 10};
        int k = 3;
        int largestSum = findLargestSum(arr, k);
        System.out.println("The largest sum of " + k + " consecutive elements is: " + largestSum);
    }
}
