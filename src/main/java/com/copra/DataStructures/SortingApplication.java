package com.copra.DataStructures;


import java.util.Arrays;

public class SortingApplication {

    public static void main(String[] args) {

        selectionSort();
        bubbleSort();
        insertionSort();
        mergeSortAlgo();

    }

    private static void mergeSortAlgo() {

        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("MergeSort :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }


    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {

            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merger(arr, mid, l, r);
        }


    }

    public static void merger(int[] arr, int mid, int l, int r) {

        int merged[] = new int[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }

        while (j <= r) {
            merged[k] = arr[j];
            j++;
            k++;
        }

        for (int in = 0; in < merged.length; in++) {
            arr[l + in] = merged[in];
        }
    }

    private static void insertionSort() {

        int[] arr = {2, 13, 4, 1, 3, 6, 28};

        for (int i = 0; i <= arr.length - 1; i++) {
            int current = i;
            while (current > 0 && arr[current - 1] > arr[current]) {
                int temp = arr[current - 1];
                arr[current - 1] = arr[current];
                arr[current] = temp;
                current--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    private static void bubbleSort() {

        //  int[] a = {8, 6, 2, 5, 1};
        int[] a = {41, 467, 334, 500, 169, 724, 478, 358, 962, 464};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }


    private static void selectionSort() {

        int[] a = {8, 6, 2, 5, 1};

        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

}
