package ru.sbt.jschool.session1;

import java.util.ArrayList;

public class Problem7 {
    public static long[] intersection(long[] arr1, long[] arr2){
        ArrayList<Long> list = new ArrayList<>();
        for (long num1 : arr1) {
            for (long num2 : arr2) {
                if (num1 == num2 && !list.contains(num1)) {
                    list.add(num1);

                }
            }
        }
        long[] result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Введите два массива значений(через запятую)");
            return;
        }
        String[] first = args[0].split(",");
        String[] second = args[1].split(",");
        long[] arr1 = new long[first.length];
        long[] arr2 = new long[second.length];
        for (int i = 0; i < first.length; i++) {
            arr1[i] = Long.parseLong(first[i]);
        }
        for (int i = 0; i < second.length; i++) {
            arr2[i] = Long.parseLong(second[i]);
        }
        long[] intersection = intersection(arr1, arr2);
        System.out.println("Общие элементы массивов");
        for (long num : intersection) {
            System.out.println(num);
        }
    }
}
