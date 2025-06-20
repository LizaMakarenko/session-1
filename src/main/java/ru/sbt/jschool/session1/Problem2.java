package ru.sbt.jschool.session1;

import java.util.Map;

public class Problem2 {
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        for (Map.Entry<String, String> entry : env.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
