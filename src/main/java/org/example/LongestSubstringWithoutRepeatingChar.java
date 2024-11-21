package org.example;

import java.util.*;

public class LongestSubstringWithoutRepeatingChar {

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> charSet = new HashSet<>();
        int start=0,maxLength=0;
        for(int end=0;end<s.length();end++) {
           if(!charSet.contains(s.charAt(end))) {
               charSet.add(s.charAt(end));
               maxLength=Math.max(maxLength,end-start+1);
           }
           else{
               while(charSet.contains(s.charAt(end)))
               {
                   charSet.remove(s.charAt(start));
                   start++;
               }
           }
        }
        System.out.println(charSet);
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcbdfghuij";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}
