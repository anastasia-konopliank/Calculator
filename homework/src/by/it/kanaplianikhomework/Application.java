package by.it.kanaplianikhomework;

import java.text.DecimalFormat;

public class Application {
    private Console console;

    public static void main(String[] args) {
        new Application(new SystemConsole()).start();
    }

    public Application(Console console) {

        this.console = console;
    }

    public void start() {
        Sign sign = new Sign(console);
        do {
            sign.scan();
        } while (sign.isIncorrect());

        NumberA numberA = new NumberA(sign, console);
        do {
            numberA.scan();
        } while (numberA.isIncorrect());


        if (numberA.isIncorrect()) {
            return;
        }

        NumberB numberB = new NumberB(sign, console);
        do {
            numberB.scan();
        } while (numberB.isIncorrect());



        if (numberB.isIncorrect()) {
            return;
        }

        switch (sign.getValue()) {
            case ("/"):

                double divResult = numberA.getValue() / numberB.getValue();
                String formattedDuvResult = new DecimalFormat("#0.00").format(divResult);
                console.println("Частное: " + formattedDuvResult);

                break;
            case ("*"):

                double mulResult = numberA.getValue() * numberB.getValue();
                String formattedMulResult = new DecimalFormat("#0.00").format(mulResult);
                console.println("Произведение: " + formattedMulResult);
                break;
            case ("+"):
                double addResult = numberA.getValue() + numberB.getValue();
                String formattedAddResult = new DecimalFormat("#0.00").format(addResult);
                console.println("Сумма: " + formattedAddResult);
                break;
            case ("-"):

                double subResult = numberA.getValue() - numberB.getValue();
                String formattedSubResult = new DecimalFormat("#0.00").format(subResult);
                console.println("Разность: " + formattedSubResult);
                break;
            default:
                console.println("Вы ввели не знак операции");
                break;
        }
    }
}
