package com.copra.BasicsCoding;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {0,1,8,10};
        int[] arr2 = {2,4,11,15,20};
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[m+n];

        int i=0 , j =0 , k =0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
                // k++;
            }else{
                result[k] = arr2[j];
                j++;
                // k++;
            }
            k++;
        }

        while(i < n){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j < m){
            result[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(result));


    }
}
