package org.example;



public class PairEqualToGivenSum {

    public static void pairWithGivenSumInSortedArray(int[] arr, int sum) {
        int left=0,right=arr.length-1;
        while(left<right)
        {
            if(arr[left]+arr[right]>sum)
            {
                right--;
            }
            else if(arr[left]+arr[right]<sum){

                    left++;
            }
                else{
                    if(arr[left]+arr[right]==sum)
                    {
                        System.out.println("Pair found :"+arr[left]+","+arr[right]);
                        left++;
                        right--;
                    }
                }
            }


    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 10};
        int sum = 11;
        pairWithGivenSumInSortedArray(arr, sum);
    }
}
