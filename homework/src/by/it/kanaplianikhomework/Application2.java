package by.it.kanaplianikhomework;

public class Application2 {
    private Console console;

    public static void main(String[] args) {
        new Application2(new SystemConsole()).start();
    }

    public Application2(Console console) {

        this.console = console;
    }

    public void start() {
        console.println("Введите два числа: ");
        var first = Integer.parseInt(console.nextLine());
        var second = Integer.parseInt(console.nextLine());
        if (second == 0) {
            console.println("На ноль делить нельзя!");
            return;
        }
        var div = first / second;
        console.println(Integer.toString(div));
    }
}
