package ru.sbt.jschool.session1;

import javax.swing.*;

public class Problem5 {
    public static long binaryToDec(String binary) {
        return Long.parseLong(binary, 2);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Бинарное число:");
            return;
        }
        for (String arg : args) {
            try {
                long decimal = binaryToDec(arg);
                System.out.println(arg + " →  " + decimal);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка:" + arg);
            }
        }
    }
}
