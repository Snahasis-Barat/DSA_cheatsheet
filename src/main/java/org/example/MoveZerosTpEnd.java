package org.example;

import java.util.Arrays;

public class MoveZerosTpEnd {

    public static int[] moveZerosToEnd(int[] nums) {
        int nonZeros = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            nums[nonZeros++]=nums[i];

        }
        while(nonZeros<nums.length)
        {
            nums[nonZeros++]=0;
        }
   return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println(Arrays.toString( moveZerosToEnd(nums)));
    }
}
