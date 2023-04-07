package org.example.javapractise;

public class Person {
    int a=20;
    static int b=50;
     volatile  int c=14;
}
class Child extends Person{
//    int a=20;
// int b=50;
//    volatile int c=14;

    public static void main(String[] args) {
//        Person c =new Child();
//        System.out.println(c.a);
//        System.out.println(c.b);
//        System.out.println(c.c);
        System.out.println(b);
//        System.out.println(c);
    }

}

