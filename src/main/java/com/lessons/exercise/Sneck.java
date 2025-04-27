package com.lessons.exercise;

import java.util.*;

public class Sneck {

    public static int[] Selection(int[] arr) {
        int[] newArr = arr;
        for (int i = 0; i < newArr.length - 1; i++) {
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

    public static <K, V> ArrayList<Pair<K, V>> Transform(HashMap<K, V> mappa) {

        ArrayList<Pair<K, V>> superLista= new ArrayList<>();
        
        for(K key: mappa.keySet()){
            Pair<K,V> pair= new Pair<K,V>(key, mappa.get(key));
            superLista.add(pair);
        }
        return superLista;

    }

    public static class  Pair<K, V> {
        private K key;
        private V value;

        public Pair(K kevin, V valerio) {
            this.key = kevin;
            this.value = valerio;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public void setKey(K kullervo) {
            this.key = kullervo;
        }

        public void setValue(V vasco) {
            this.value = vasco;
        }

        @Override
        public String toString() {
            String valueAsString = String.valueOf(value);
            String keyAsString = String.valueOf(key);
            return String.format("Key = %s \t Value = %s", keyAsString, valueAsString);
        }
    }
}
