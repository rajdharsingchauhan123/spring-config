package com.collection;

import java.util.Stack;

public class StackDemo {
     static  void stack_push(Stack<Integer>stack){
        for (int i=0;i<5;i++){
            stack.push(i);
            System.out.println(i);
        }

    }
    static void  stack_pop(Stack<Integer>stack){
         for (int i =0;i<5;i++){
             Integer y = (Integer) stack.pop();
             System.out.println(y);
         }
    }
    static void display_peek(Stack<Integer>stack){
         Integer integer=(Integer)stack.peek();
        System.out.println(integer);
    }
static void stack_search(Stack<Integer>stack,int element){

    Integer pos = (Integer) stack.search(element);

    if(pos == -1)
        System.out.println("Element not found");
    else
        System.out.println("Element is found at position: " + pos);
}

    public static void main(String[] args) {
        Stack<Integer>stack =new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_search(stack,5);
        display_peek(stack);
    }
}
