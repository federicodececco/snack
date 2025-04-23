package com.lessons.exercise;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] test = { 3, 4, 1, 5, 2, 2, 6, 71, 1, 312, 5, 32, 645, 8, 12, 435, 64 };
        int[] toast = Sort.Selection(test);
        System.out.println(Arrays.toString(toast));
    }
}