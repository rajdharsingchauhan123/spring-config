package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {

    public static int []sumAdd(int nums[], int target){
        Map<Integer ,Integer>map=new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i );
        }
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                return new int[]{i,map.get(complement)};


            }
        }
        return null;
    }
    public static void main(String[] args) {
        int nums[] = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(sumAdd(nums, target)));

    }
}
