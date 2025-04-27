package com.lessons.exercise;

import java.util.*;

import com.lessons.exercise.Sneck.Pair;

public class Main {
    public static void main(String[] args) {
        // int[] test = { 3, 4, 1, 5, 2, 2, 6, 71, 1, 312, 5, 32, 645, 8, 12, 435, 64 };
        // int[] toast = Sneck.Selection(test);
        // System.out.println(Arrays.toString(toast));
        HashMap<String, Integer> fruttio = new HashMap<>();
        fruttio.put("melo", 3);
        fruttio.put("banano", 5);
        fruttio.put("cigliegio", 7);
        ArrayList<Sneck.Pair<String, Integer>> test = Sneck.Transform(fruttio);
        for (Pair<String, Integer> pair : test) {
            System.out.println(pair);
        }
    }

}