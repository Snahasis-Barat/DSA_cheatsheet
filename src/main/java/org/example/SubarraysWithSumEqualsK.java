package org.example;

import java.util.*;

public class SubarraysWithSumEqualsK {

    public static List<List<Integer>> subarraysWithSum(int[] nums, int k) {

        int start=0,currentSum=0;
        List<List<Integer>> result = new ArrayList<>();
        for(int end = 0; end<nums.length; end++)
        {
            currentSum+=nums[end];
            while(currentSum>k && start<=end)
            {
               currentSum=currentSum-nums[start];
               start++;
            }
            if(currentSum==k)
            {
                result.add(Arrays.asList(start, end));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 8, 10};
        int k = 9;

        List<List<Integer>> subarrays = subarraysWithSum(nums, k);

        System.out.println("Subarrays with sum equal to " + k + ":");
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
}
