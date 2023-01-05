package com.collection;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        String[]arrys = new String[6];
        List<String>list=new ArrayList<String>();

        list.add("raj");
        list.add("monkye");
        list.add("donkey");
//        String[] strings = list.toArray(new String[list.size()]);
//
//        String string = Arrays.toString(strings);
//        System.out.println("strings = " + string);
//        Collections.sort(list);
//        for(String name:list)
//            System.out.println("name = " + name);
        Set set = new HashSet(list);
        System.out.println("set = " + set);
    }

}
