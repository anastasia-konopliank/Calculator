package by.it.kanaplianikhomework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите знак операции:");
        Scanner scanner = new Scanner(System.in);
        String something = scanner.nextLine();

        NumberA numberA = new NumberA(something);
        numberA.scan();

        if (numberA.isIncorrect()) {
            return;
        }

        NumberB numberB = new NumberB(something);
        numberB.scan();

        if (numberB.isIncorrect()) {
            return;
        }

        switch (something) {
            case ("/"):

                double divResult = numberA.getValue() / numberB.getValue();
                String formattedDuvResult = new DecimalFormat("#0.00").format(divResult);
                System.out.println("Частное: " + formattedDuvResult);

                break;
            case ("*"):

                double mulResult = numberA.getValue() * numberB.getValue();
                String formattedMulResult = new DecimalFormat("#0.00").format(mulResult);
                System.out.println("Произведение: " + formattedMulResult);
                break;
            case ("+"):
                double addResult = numberA.getValue() + numberB.getValue();
                String formattedAddResult = new DecimalFormat("#0.00").format(addResult);
                System.out.println("Сумма: " + formattedAddResult);
                break;
            case ("-"):

                double subResult = numberA.getValue() - numberB.getValue();
                String formattedSubResult = new DecimalFormat("#0.00").format(subResult);
                System.out.println("Разность: " + formattedSubResult);
                break;
            default:
                System.out.println("Вы ввели не знак операции");
                break;
        }
    }
}
