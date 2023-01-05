package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
        List<String>list =new ArrayList<String>();
        //List list = Arrays.asList("raj","monleu");
//        list.add("hello");
//        list.add("raj");
//        list.add("monkey");
        arraylist.add("rah");
        arraylist.add("rahul");
        arraylist.add("ravi");
        System.out.println("arraylist = " + arraylist);
        for(String name:arraylist){

            System.out.println("name = " + name);

            //System.out.println("name = " + name);
        }

        
        

      //  System.out.println("list = " + list);


    }
}
