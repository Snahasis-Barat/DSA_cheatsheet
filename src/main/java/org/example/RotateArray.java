package org.example;

import java.util.Arrays;

public class RotateArray {

    public static void rotateArray(int[] array, int k)
    {
        int rotatedArray []= new int[array.length];
        int n=array.length;
        for(int i=0; i<array.length; i++)
        {
            rotatedArray[(i+k)%n]=array[i];

        }
        System.arraycopy(rotatedArray,0,array,0,n);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 14;

        System.out.println("Original array: " + Arrays.toString(arr));

        rotateArray(arr, k);

        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
