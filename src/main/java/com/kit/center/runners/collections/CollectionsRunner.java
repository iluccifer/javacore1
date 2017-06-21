package com.kit.center.runners.collections;


import java.util.ArrayList;


public class CollectionsRunner {
    public static void main(String[] args) {
        String abc = "abc";
        String abc2 = "abc2";
        String abc3 = "abc3";
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(abc);
        arrayList.add(0,abc2);
        arrayList.remove(abc3);
        arrayList.get(1);
        boolean contain = arrayList.contains(abc);
        boolean empty = arrayList.isEmpty();
        int size = arrayList.size();
        int index = arrayList.indexOf(abc);
        System.out.println(size);
        System.out.println(arrayList);
        System.out.println(contain);
        System.out.println(empty);
        System.out.println(index);
    }
}
