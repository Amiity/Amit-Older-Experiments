package com.copra.DataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingApplication {

    public static void main(String[] args) {

        linearSearch();

        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        int target = 3;
        int n = binarySearch(arr, target);

        System.out.println(n);



    }

    private static int binarySearch(int[] arr, int target) {

       Arrays.sort(arr);
       int low = 0, high = arr.length-1, mid = 0 ;

        while(low <= high){
            mid = (low+high)/2;
            if(target == arr[mid]) return mid;
            if(target < arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    private static void linearSearch() {

        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        int target = 3;
        int index = 0;
        for(int i = 0; i < arr.length ; i++){
            if(target == arr[i]);
            index = i;
        }
        System.out.println(index);

        List<Integer> list = Arrays.asList(2, 13, 4, 1, 3, 6, 28);
        int indexList = 0;
        for(int i : list){
            if(target == i);
            indexList = list.indexOf(i);
        }
        System.out.println(indexList);

    }

}
