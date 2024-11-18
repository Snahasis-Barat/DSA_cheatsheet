package org.example;

public class MaxWaterContainer {

    public static int maxArea(int[] height) {
        int maxArea=0,left=0,right=height.length-1;
        while(left<right)
        {

            int area=Math.min(height[right],height[left])*(right-left);
            maxArea=Math.max(area,maxArea);
            if(height[left]<height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum water that can be trapped is: " + maxArea(height));
    }
}
