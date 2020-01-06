package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        String str = null;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++){
            str = str + list.get(i);
        }
        char[] chars = str.toCharArray();

        for (int i = 0; i < alphabet.size(); i++){
            int count = 0;
            for (int k = 0; k < chars.length; k++){
                if(chars[k] == alphabet.get(i)){
                    count++;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
        }


    }
}
