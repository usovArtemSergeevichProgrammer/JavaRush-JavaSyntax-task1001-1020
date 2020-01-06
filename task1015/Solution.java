package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] array = new ArrayList[3];
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("World");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("!");
        array[0] = list1;
        array[1] = list2;
        array[2] = list3;
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}