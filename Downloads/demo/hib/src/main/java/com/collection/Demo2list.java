package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo2list {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("list = " + list);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
        arrayList.add(12);
        arrayList.set(2, 23);
        System.out.println("arrayList = " + arrayList);
        for (Integer i : list) {
            System.out.println("i = " + i);

            Iterator<Integer> iterator =arrayList.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
                System.out.println("hello");
            }

        }
    }
}