package com.laba3;


import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class laba3 {
    public static void main (String[] args){
        ArrayList<Integer> arrlist = new ArrayList<>();
        LinkedList<Integer> linklist = new LinkedList<>();

        System.out.println("===ADD===");
        Long arrtime = Add(arrlist);
        System.out.println("ArrayList: " + arrtime + " ns");
        Long linktime = Add(linklist);
        System.out.println("LinkedList: " + linktime + " ns");

        System.out.println("===GET===");
        arrtime = Get(arrlist);
        System.out.println("ArrayList: " + arrtime + " ns");
        linktime = Get(linklist);
        System.out.println("LinkedList: " + linktime + " ns");

        System.out.println("===DELETE===");
        arrtime = Del(arrlist);
        System.out.println("ArrayList: " + arrtime + " ns");
        linktime = Del(linklist);
        System.out.println("LinkedList: " + linktime + " ns");

        System.out.println("===DELETE ALL===");
        arrtime = DelAll(arrlist);
        System.out.println("ArrayList: " + arrtime + " ns");
        linktime = DelAll(linklist);
        System.out.println("LinkedList: " + linktime + " ns");
    }

    /**
     * Calculating time adding elements in different types of lists
     * @param list Different types of lists
     * @return Time adding elements
     */
    public static Long Add(List list) {
        Long start = System.nanoTime();
        for (int i = 0; i < 2000; i++) {
            list.add(i+1);
        }
        Long end = System.nanoTime();
        return end - start;
    }

    /**
     * Calculating time getting element from the middle in different types of lists
     * @param list Different types of lists
     * @return Time getting element
     */

    public static Long Get(List list) {
        Long start = System.nanoTime();
        list.get(1000);
        Long end = System.nanoTime();
        return end - start;
    }

    /**
     * Calculating time deleting one element from the middle in different types of lists
     * @param list Different types of lists
     * @return Time deleting element
     */

    public static Long Del(List list) {
        Long start = System.nanoTime();
        list.remove(1000);
        Long end = System.nanoTime();
        return end - start;
    }

    /**
     * Calculating time deleting all elements in different types of lists
     * @param list Different types of lists
     * @return Time deleting elements
     */

    public static Long DelAll(List list) {
        Long start = System.nanoTime();
        list.removeAll(list);
        Long end = System.nanoTime();
        return end - start;
    }

}
