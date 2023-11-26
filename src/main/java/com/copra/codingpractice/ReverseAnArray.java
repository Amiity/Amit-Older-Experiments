package com.copra.codingpractice;

import java.net.SocketOption;
import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseArray(6, new int[]{3, 1, 1, 2, 6, 11})));
    }

    public static int[] reverseArray(int n, int []nums) {
        int start = 0;
        int end = n-1;
        int mid = n/2;
        for (int i = 0; i < mid; i++) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

}
