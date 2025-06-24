package ru.sbt.jschool.session1;

import java.util.HashSet;
import java.util.Set;

public class Problem7 {
    public static long[] intersection(long[] arr1, long[] arr2) {
        Set<Long> list1 = new HashSet<>();
        Set<Long> resultSet = new HashSet<>();

        for (long num : arr1) {
            list1.add(num);
        }

        for (long num : arr2) {
            if (list1.contains(num)) {
                resultSet.add(num);
            }
        }
        long[] result = new long[resultSet.size()];
        int i = 0;
        for (Long num : resultSet) {
            result[i++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        if (args.length <2 ) {
            System.err.println("Введите два массива(через запятую)");
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
        System.out.println("Общие элементы массивов:");
        for (long num : intersection) {
            System.out.println(num);
        }
    }
}