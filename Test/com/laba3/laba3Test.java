package com.laba3;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class laba3Test {
    /**
     * Comparing work time with 0. If not equals - method working properly
     */
    @org.junit.jupiter.api.Test
    void add() {
        ArrayList<Integer> arrlist = new ArrayList<>();
        LinkedList<Integer> linklist = new LinkedList<>();
        Long arrtime = laba3.Add(arrlist);
        Long linktime = laba3.Add(linklist);
        assertNotEquals(arrtime, 0);
        assertNotEquals(linktime, 0);
    }
    /**
     * Comparing work time with 0. If not equals - method working properly
     */
    @org.junit.jupiter.api.Test
    void get() {
        ArrayList<Integer> arrlist = new ArrayList<>();
        LinkedList<Integer> linklist = new LinkedList<>();
        Long arrtime = laba3.Add(arrlist);
        Long linktime = laba3.Add(linklist);

        arrtime = laba3.Get(arrlist);
        linktime = laba3.Get(linklist);
        assertNotEquals(arrtime, 0);
        assertNotEquals(linktime, 0);
    }
    /**
     * Comparing work time with 0. If not equals - method working properly
     */
    @org.junit.jupiter.api.Test
    void del() {
        ArrayList<Integer> arrlist = new ArrayList<>();
        LinkedList<Integer> linklist = new LinkedList<>();
        Long arrtime = laba3.Add(arrlist);
        Long linktime = laba3.Add(linklist);

        arrtime = laba3.Del(arrlist);
        linktime = laba3.Del(linklist);
        assertNotEquals(arrtime, 0);
        assertNotEquals(linktime, 0);
    }
    /**
     * Comparing work time with 0. If not equals - method working properly
     */
    @org.junit.jupiter.api.Test
    void delAll() {
        ArrayList<Integer> arrlist = new ArrayList<>();
        LinkedList<Integer> linklist = new LinkedList<>();
        Long arrtime = laba3.Add(arrlist);
        Long linktime = laba3.Add(linklist);

        arrtime = laba3.DelAll(arrlist);
        linktime = laba3.DelAll(linklist);
        assertNotEquals(arrtime, 0);
        assertNotEquals(linktime, 0);
    }
}