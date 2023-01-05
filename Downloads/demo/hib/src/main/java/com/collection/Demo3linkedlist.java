package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo3linkedlist {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("rajdhar");
        linkedList.add("ravi");
        linkedList.add(3);
        linkedList.add(5.4);
        System.out.println(linkedList);
        linkedList.set(3,"raj");
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        Iterator iterator =linkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
