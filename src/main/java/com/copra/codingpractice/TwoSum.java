package com.copra.codingpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args){

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] a = Solution.twoSum(nums, target);
        System.out.println(Arrays.toString(a));
        int[] b = twoSumBrute(nums, target);
        System.out.println(Arrays.toString(b));

    }
    class Solution {
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0 ; i < nums.length; i++){
                int complement = target - nums[i];
                if(map.containsKey(complement)){
                    return new int[] {i, map.get(complement)};
                }
                map.put(nums[i], i);
            }
            return new int [] {};
        }
    }

    // int[] nums = {2,7,11,15};
    // int target = 9;
    public static int[] twoSumBrute(int[] nums, int target) {
        int[] a  = null;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1 ; i < nums.length ; j++){
                if(target == nums[i] + nums[j]){
                    return new int[] {i, j};
                }
            }

        }
        return new int[] {};
    }

}

