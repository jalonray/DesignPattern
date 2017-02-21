package com.example;

/**
 * Created by JayRay on 17/02/2017.
 * Info: 操作适配器：适配器
 */

public class OperationAdapter extends Adapter implements ScoreOperation {
    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
