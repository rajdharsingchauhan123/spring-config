package org.example.javapep;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in );

        System.out.println("enter a two number");

        Integer a = scanner.nextInt();
        Integer b= scanner.nextInt();

        if(a<b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }


    }
}