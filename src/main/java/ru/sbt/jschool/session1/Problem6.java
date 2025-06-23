package ru.sbt.jschool.session1;


public class Problem6 {
    public static String sumOfBinary(String b1, String b2) {
        long number1 = Long.parseLong(b1, 2);
        long number2 = Long.parseLong(b2, 2);
        long sum = number1 + number2;
        return Long.toBinaryString(sum);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Введите два бинарных числа");
            return;
        }
        try {
            String result = sumOfBinary(args[0], args[1]);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка, неправильный ввод");
        }
    }
}
