package org.example2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Controller
{
    public static List<Character> getUniqueChars(List<String> strsList) {
        Set<Character> charSet = new HashSet<>();

        for (String str : strsList) {
            for (int i = 0; i < str.length(); i++) {
                charSet.add(str.charAt(i));
            }
        }
        return new ArrayList<>(charSet);
    }
}
