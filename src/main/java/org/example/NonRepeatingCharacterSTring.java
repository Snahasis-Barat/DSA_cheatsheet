package org.example;

import java.util.*;

public class NonRepeatingCharacterSTring {

    public static char findNonRepeatingCharacter(String str) {

        String lowerStr = str.toLowerCase();
        HashMap<Character, Integer> charCount = new LinkedHashMap<>();
        // Count frequencies of each character (ignoring spaces)
        for (char c : lowerStr.toCharArray()) {
            if (c != ' ') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        Character ch=charCount.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).findFirst().orElseThrow(NoSuchElementException::new);

        return ch;
    }

    public static void main(String[] args) {

        String str = "This is stream";
        System.out.println("The first non-repeating character in the string '"+str+"' is: " + findNonRepeatingCharacter(str));
    }
}
