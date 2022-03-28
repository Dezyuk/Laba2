package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random rand = new Random();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        task39();
//        task64();
//        task89();
//        task114();
//        task139();
    }
    /**
     * 39) При поступлении в вуз абитуриенты, получившие двойку на первом экзамене, ко второму не допускаются.
     * В массиве А[n] записаны оценки экзаменующихся, полученные на первом экзамене.
     * Подсчитать, сколько человек не допущено ко второму экзамену.
     */
    public static void task39() {
        int[] A = new int[30];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(4) + 2;
            if (A[i] == 2) {
                count++;
            }
        }
        System.out.println("К второму экзамену не допускаются " + count + " абитуриента.");
    }

    /**
     * 64) Найти сумму элементов массива вещественных чисел, имеющих нечетные номера.
     */
    public static void task64() {
        float[] Array = new float[50];
        float sum = 0.0f;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (float) (Math.random() * 10);
            if (i % 2 == 0) {
                sum += Array[i];
            }
        }
        System.out.println(sum);
    }

    /**
     * Дана последовательность целых чисел а1, a2, ..., а20. Верно ли, что все элементы последовательности равны между собой?
     */
    public static void task89() {
        System.out.print("Задайте размер массива :");
        int[] Array = new int[in.nextInt()];
        boolean flag = true;
        for (int i = 0; i < Array.length; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива :");
            Array[i] = in.nextInt();
            if (i > 0 && Array[i] != Array[i - 1]) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Все элементы последовательности равны между собой.");
        } else {
            System.out.println("Элементы не равны между собой.");
        }
    }

    /**
     * 114 На k-e место одномерного массива целых чисел вставить элемент, равный квадрату суммы 5-го и 10-го элементов.
     */
    public static void task114() {
        System.out.print("Введите значение k :");
        int k = in.nextInt();
        int[] Array = new int[k + 20];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(Array));
        Array = Arrays.copyOf(Array, Array.length + 1);
        for (int i = Array.length - 1; i >= k; i--) {
            Array[i] = Array[i - 1];
        }
        Array[k - 1] = (int) (Math.pow((Array[4] + Array[9]), 2));
        System.out.println(Arrays.toString(Array));
    }

    /**
     * 139) Дана последовательность целых чисел а1, а2, ..., an. Указать пары чисел аi, aj, таких, что ai + Eaj = m.
     */
    public static void task139() {
        int[] Array = new int[20];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = rand.nextInt(50) + 1;
        }
        System.out.println(Arrays.toString(Array));
        int E, m;
        E = rand.nextInt(10) + 1;
        m = rand.nextInt(500) + 1;
        System.out.println("E = " + E + "\nm = " + m);
        for (int i = 0; i < Array.length; i++) {
            for (int j = i; j < Array.length; j++) {
                if (Array[i] + (E * Array[j]) == m) {
                    System.out.println(Array[i] + " + " + (E * Array[j]) + " = " + m);
                }
            }
        }
    }
}
