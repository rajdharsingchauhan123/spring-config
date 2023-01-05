package com.collection;

import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack stack =new Stack();
        stack.push(12);
        stack.push("rja");
        stack.add("rja");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.set(1,"3ajjaj");
        System.out.println(stack);
        stack.search(23);
    }
}
