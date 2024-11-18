package org.example;

import java.util.*;

public class LongestSubstringWithTwoDistinct {
    public static int lengthOfLongestSubstring(String s) {
        // HashMap to store the frequency of characters in the window
        Map<Character, Integer> map = new HashMap<>();
        int start = 0; // Start of the sliding window
        int maxLength = 0;

        // Iterate with the end pointer
        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            // Add the current character to the map
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);

            // If there are more than 2 distinct characters, shrink the window
            while (map.size() > 2) {
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                start++;
            }

            // Update the maximum length of the valid window
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String s = "eceba";
        System.out.println("Longest substring with at most two distinct characters: " + lengthOfLongestSubstring(s));
    }

}

