package org.example.leetcode;

import java.util.Arrays;

public class Demo1 {

    public static int [] twoSum(int [] nums,int target){
        int i;
        int j=0;
        for( i=0;i<nums.length;i++){
            for( j=+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){

                    return new int[]{i,j};

                }

            }
        }

        return null;
    }
    public static void main(String[] args) {
        int nums[] = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));


    }
}