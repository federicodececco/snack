package com.lessons.exercise;

import java.util.*;

public class Sort {
  



    public static int[] Selection(int[] arr) {
        int[] newArr=arr;
        for (int i = 0; i < newArr.length-1; i++) {
            int init = newArr[i];
            int index = i;
            for (int j = i; j < newArr.length; j++) {
                if (newArr[j] < init) {
                    init = newArr[j];
                    index = j;
                }
            }
            int tmp = newArr[i];
            newArr[i] = init;
            newArr[index] = tmp;

        }
        return newArr;
    }
}
