package com.example;

/**
 * Created by JayRay on 17/02/2017.
 * Info: 快速排序类，适配者
 */

public class QuickSort {
    public int[] quickSort(int array[]) {
        sort(array, 0, array.length - 1);
        return array;
    }

    private void sort(int[] array, int p, int r) {
        if (p >= r) {
            return;
        }
        int temp = array[p];
        int i = p;
        int j = r;
        while (i < j) {
            while (i < j && temp <= array[j]) {
                j--;
            }
            array[i] = array[j];
            while (i < j && temp >= array[i]) {
                i++;
            }
            array[j] = array[i];
        }
        array[i] = temp;
        sort(array, p, i - 1);
        sort(array, i + 1, r);
    }
}
