package by.it.kanaplianikhomework;

public class Sign {

    private String sign;

    public Sign(String sign) {

        this.sign = sign;
    }

    public String firstArgName() {
        switch (sign) {
            case ("/"):
                return "делимое";
            case ("*"):
                return "множитель";
            case ("+"):
                return "слагаемое";
            case ("-"):
                return "уменьшаемое";
        }

        return "unknown";
    }

    public String secondArgName() {
        switch (sign) {
            case ("/"):
                return "делитель";

            case ("*"):
                return "второй множитель";

            case ("+"):
                return "второе слагаемое";

            case ("-"):
                return "вычитаемое";

            default:
                return "undefined";
        }
    }

    public String getValue() {
        return sign;
    }

    public String resultName() {
        switch (sign) {
            case ("/"):
                return "Частное";
            case ("*"):
                return "Произведение";
            case ("+"):
                return "Сумма";
            case ("-"):
                return "Разность";
            default:
                return "Вы ввели не знак операции";
        }
    }
}
