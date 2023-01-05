package com;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        int n =5;
        Vector<Integer>vector =new Vector();
        for (int i=0;i<n;i++)
            vector.add(i);
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
        for (int i =0;i<vector.size(); i++)
            System.out.println(vector.get(i));

    }


}
