package org.example.leetcode;

import java.io.*;

public class MainDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee=new Employee();
        employee.setId(0);
        employee.setName("rah");

        // serialize

        FileOutputStream fileOutputStream=new FileOutputStream("/home/rajdhar/SerializationDemo/CodeDecodeFile.ser");
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOutputStream.close();


        //Deserialize
        FileInputStream fileInputStream =new FileInputStream("/home/rajdhar/SerializationDemo/CodeDecodeFile.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

        Employee reCreateObj= (Employee)objectInputStream.readObject();

        System.out.println(reCreateObj.getName());
        System.out.println(reCreateObj.getId());
        fileInputStream.close();
        objectInputStream.close();


    }
}
