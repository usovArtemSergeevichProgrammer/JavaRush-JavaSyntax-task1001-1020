package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age;
        private String name;
        private double price;
        private boolean sex;
        private char num;
        private long distatnge;

        public Human(int age, String name, double price, boolean sex, char num, long distatnge) {
            this.age = age;
            this.name = name;
            this.price = price;
            this.sex = sex;
            this.num = num;
            this.distatnge = distatnge;
        }

        public Human() {
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(double price) {
            this.price = price;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(char num) {
            this.num = num;
        }

        public Human(long distatnge) {
            this.distatnge = distatnge;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age, String name, double price) {
            this.age = age;
            this.name = name;
            this.price = price;
        }
    }
}
