package by.it.kanaplianikhomework;

import java.util.Scanner;

public class NumberB {
    private boolean isParsingIncorrect;
    private double parseDiv2;
    private Sign sign;

    public NumberB(String something) {
        sign = new Sign(something);
    }

    public void scan() {
        System.out.println("Введите " + sign.secondArgName() + ":");
        Scanner scanner = new Scanner(System.in);
        String somethingToDivide1 = scanner.nextLine();

        try {
            parseDiv2 = Double.parseDouble(somethingToDivide1);
            Double d2 = new Double(parseDiv2);
            if (d2.isInfinite()) {
                System.out.println("Данная программа не рассчитана для работы с очень большими цифрами");
                isParsingIncorrect = true;
                return;


            }
            isParsingIncorrect = false;
        } catch (Exception exDiv2) {
            System.out.println("Невозможно распарсить " + sign.secondArgName());
            isParsingIncorrect = true;
        }
    }

    public boolean isIncorrect() {
        if (!isParsingIncorrect && parseDiv2 == 0) {
            System.out.println("Нельзя делить на ноль");
            return true;
        }

        return isParsingIncorrect;
    }

    public double getValue() {
        return parseDiv2;
    }
}
