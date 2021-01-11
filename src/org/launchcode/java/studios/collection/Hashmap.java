package org.launchcode.java.studios.collection;
import java.io.*;
import java.util.*;

public class Hashmap {
    static void characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {

            if (Character.isLetter(c) == true) {

                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scanner.nextLine();
        characterCount(str);
        scanner.close();
    }
}
