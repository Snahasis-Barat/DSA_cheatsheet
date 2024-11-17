package org.example;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2,3, 5, 7, 9};
        int[] array2 = {4, 6, 8, 10};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println(Arrays.toString(mergedArray));
    }

    private static int[] mergeArrays(int[] array1, int[] array2) {

        int[] mergedArray = new int[array1.length + array2.length];
        int c1=0,c2=0,i=0;
        while(c1<array1.length && c2<array2.length)
        {
            if(array1[c1]<array2[c2])
            {
                mergedArray[i++]=array1[c1++];
            }
            else{
                mergedArray[i++]=array2[c2++];
            }
        }
        while(c1<array1.length)
        {
            mergedArray[i++]=array1[c1++];
        }
        while(c2<array2.length)
        {
            mergedArray[i++]=array2[c2++];
        }

            return mergedArray;
        }
    }


