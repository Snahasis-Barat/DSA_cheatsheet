package org.example;

import java.util.*;

public class FindDuplicates {

    public static void findDuplicates(int[] array) {

        Set<Integer> duplicates = new HashSet<Integer>();
        Set<Integer> seen = new HashSet<Integer>();
        for(int i=0;i<array.length;i++)
        {
            if(seen.contains(array[i]))
            {
               duplicates.add(array[i]);
            }
            else{
               seen.add(array[i]);
            }
        }
        System.out.println("Duplicates are :"+duplicates);


       Arrays.stream(array).distinct().forEach(System.out::println);//printing distinct elemnts
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        findDuplicates(array);
    }
}
