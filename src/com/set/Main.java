// HashSet and TreeSet with own methods to store unic elements
package com.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to set
        set.add("Germany");
        set.add("Czech");
        set.add("Poland");
        set.add("USA");
        set.add("Korea");
        set.add("Egypt");

        // Printing elements of set to console
        System.out.println(set);

        // Trying to add duplicate with value "Egypt"
        set.add("Egypt");

        // Printing elements of set to console to check if Egypt is there twice
        System.out.println(set); // Element is met only once

        // Sorting elements of set in alphabetical order and printing
        TreeSet<String> set1 = new TreeSet<>();
        set1.addAll(set);
        System.out.println(set1);
    }
}