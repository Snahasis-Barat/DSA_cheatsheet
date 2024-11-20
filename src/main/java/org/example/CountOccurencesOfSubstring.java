package org.example;

public class CountOccurencesOfSubstring {

    public static int countOccurrences(String str, String subStr) {
        int i=0,count=0;
        while((i=str.indexOf(subStr,i))!=-1)
        {
            i+=subStr.length();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "ABabcBAabc";
        String subStr = "abc";
        System.out.println(countOccurrences(str, subStr));
    }
}
