package org.example.leetcode;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo4 {
    public static  int [] sumAdd(int []nums,int target){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            // cur+x =target
            int x =target-cur;

            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(cur,i);
        }
        return null;
    }
    public static void main(String[] args) {
       int nums []={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sumAdd(nums, target)));

    }
}
