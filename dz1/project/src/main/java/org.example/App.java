package org.example;

import org.example2.Controller;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Character> test = Controller.getUniqueChars(List.of("Hello World!12132"));
        System.out.println(test);
    }
}
