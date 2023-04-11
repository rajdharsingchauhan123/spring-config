package org.example.leetcode;

import java.util.HashMap;

public class Demo3 {
    public static void main(String[] args) {
        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        System.out.println(hash_map.containsKey(20));
        System.out.println(hash_map.get(20));
    }
}
