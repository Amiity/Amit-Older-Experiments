package com.copra.codingpractice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args){

        int[] nums = {2,7,11,15};
        int target = 9;
        Solution.twoSum(nums, target);

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

    public static int[] twoSum(int[] nums, int target) {
        int[] a  = null;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1 ; j< nums.length; j++ ){
                if(nums[i] + nums [j] == target){
                    return a = new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

}

