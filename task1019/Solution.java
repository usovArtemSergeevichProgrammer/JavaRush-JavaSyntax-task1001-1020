package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String idString = null;
        int idInteger = 0;
        String name = null;
        HashMap<String,Integer> hashMap = new HashMap<>();
        while (!(idString = reader.readLine()).equals("")) {
            name = reader.readLine();
            idInteger = Integer.parseInt(idString);
            hashMap.put(name, idInteger);
        }

        for (Map.Entry<String,Integer> par:hashMap.entrySet()) {
            System.out.println(par.getValue() + " " + par.getKey());
        }
    }
}
