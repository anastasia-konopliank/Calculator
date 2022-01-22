package by.it.kanaplianikhomework;

import java.util.Scanner;

public class NumberA {
    private boolean isIncorrect;
    private double parseDiv1;
    private Sign sign;

    public NumberA(String something) {

        sign = new Sign(something);
    }

    public void scan() {

        System.out.println("Введите " + sign.firstArgName() + ":");

        Scanner scanner = new Scanner(System.in);
        String somethingToDivide1 = scanner.nextLine();

        try {
            parseDiv1 = Double.parseDouble(somethingToDivide1);
            Double d1 = new Double(parseDiv1);
            if (d1.isInfinite()) {
                System.out.println("Данная программа не рассчитана для работы с очень большими цифрами");
                isIncorrect = true;
                return;
            }
            isIncorrect = false;
        } catch (Exception exDiv1) {
            System.out.println("Невозможно распарсить " + sign.firstArgName());
            isIncorrect = true;
        }
    }

    public boolean isIncorrect() {
        return isIncorrect;
    }

    public double getValue() {
        return parseDiv1;
    }
}

