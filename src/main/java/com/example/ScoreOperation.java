package com.example;

/**
 * Created by JayRay on 17/02/2017.
 * Info: 抽象操作类，用于 Adapter 模式
 */

public interface ScoreOperation {
    int[] sort(int array[]); // 成绩排序
    int search(int array[], int key); // 成绩查找
}
