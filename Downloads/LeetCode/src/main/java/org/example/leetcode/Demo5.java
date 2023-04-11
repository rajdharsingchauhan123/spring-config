package org.example.leetcode;

public class Demo5 {

    public  static int removeDuplicates(int a[]){
        int insertIndex=1;
        for(int i=1;i<a.length;i++){
            if(a[i-1]!=a[i]){
                a[insertIndex]=a[i];
                insertIndex++;
            }

        }
        return insertIndex;
    }
    public static void main(String[] args) {
        int a[] = {1, 1, 1, 1, 3, 3, 4, 5};
        int length=removeDuplicates(a);

        for(int i=0;i<length;i++){
            System.out.println(a[i]);
        }




    }}



