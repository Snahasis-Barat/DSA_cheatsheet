package org.example;

import java.util.*;

public class FindAnagramsOfSubstring {

    public static List<Integer> areAnagrams(String str, String substr) {
        List<Integer> anagram=new ArrayList<Integer>();
        Map<Character,Integer> count1=new HashMap<>();
       Map<Character,Integer> count2=new HashMap<>();
        int start=0,end=0;
        String tempString="";
        if(substr.length()>str.length())
        {
            return anagram;
        }
        count2=countFrequency(substr);
        for(end=0;end<str.length();end++) {

            if(tempString.length()!=substr.length())
            {
                tempString+=str.charAt(end);

            }
            else{

                count1=countFrequency(tempString);

                if(count1.equals(count2))
                {
                    anagram.add(start);
                }

                
                start++;


            }

        }
      return anagram;
    }

    private static Map<Character, Integer> countFrequency(String tempString) {

        Map<Character, Integer> windowMap = new HashMap<>();
        for(char c:tempString.toCharArray()){
            windowMap.put(c,windowMap.getOrDefault(c,0)+1);
        }
           return windowMap;
    }
    public static void main(String[] args) {
        String substr = "abc";
        String str = "cbabcacab";
        System.out.println(areAnagrams(str, substr));
    }
}
