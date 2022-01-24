package by.it.kanaplianikhomework;

public class Tests {

    public static void main(String[] args) {
        /* try
        {
            twoNumbersShoulBeDividedCorrrectly();
            System.out.println("twoNumbersShoulBeDividedCorrrectly passed");
        } catch (Exception ex) {
            System.out.println("twoNumbersShoulBeDividedCorrrectly failed");
        }



        try
        {
            divideToZeroIsNotAllowed();
            System.out.println("divideToZeroIsNotAllowed passed");
        } catch (Exception ex) {
            System.out.println("divideToZeroIsNotAllowed failed");
        }




        try
        {
            twoNumbersShouldBeAddedCorrectly();
            System.out.println("twoNumbersShouldBeAddedCorrectly passed");
        } catch (Exception ex) {
            System.out.println("twoNumbersShouldBeAddedCorrectly failed");
        }

         */
        try
        {
            askingToPutCorrectSignAgain();
            System.out.println("askingToPutCorrectSignAgain passed");
        } catch (Exception ex) {
            System.out.println("askingToPutCorrectSignAgain failed");
        }
    }

    private static void twoNumbersShouldBeAddedCorrectly() throws Exception {
        // arrange
        var console = new ConsoleFake();
        console.i.add("+");
        console.i.add("22");
        console.i.add("11");
        var app = new Application(console);

        // act
        app.start();

        // assert
        assertEqual(console.o.get(0), "Введите знак операции: ");
        assertEqual(console.o.get(1), "Введите слагаемое:");
        assertEqual(console.o.get(2), "Введите второе слагаемое:");
        assertEqual(console.o.get(3), "Сумма: 33,00");
    }

    private static void twoNumbersShoulBeDividedCorrrectly() throws Exception {
        // arrange
        var console = new ConsoleFake();
        console.i.add("12");
        console.i.add("3");
        var app = new Application2(console);

        // act
        app.start();

        // assert
        assertEqual(console.o.get(0), "Введите два числа: ");
        assertEqual(console.o.get(1), "4");
    }

    private static void assertEqual(String s1, String s2) throws Exception {
        if (!s1.equals(s2)) {
            System.out.println("Expected '" + s2 + "' but was '" + s1 + "'");
            throw new Exception("Failed");
        }
    }

    private static void divideToZeroIsNotAllowed() throws Exception {
        // arrange
        var console = new ConsoleFake();
        console.i.add("12");
        console.i.add("0");
        var app = new Application2(console);

        // act
        app.start();

        // assert
        assertEqual(console.o.get(0), "Введите два числа: ");
        assertEqual(console.o.get(1), "На ноль делить нельзя!");
    }

    private static void askingToPutCorrectSignAgain() throws Exception {
        // arrange
        var console = new ConsoleFake();
        console.i.add("H");
        console.i.add("/");
        console.i.add("10");
        console.i.add("2");

        var app = new Application(console);

        // act
        app.start();

        // assert
        assertEqual(console.o.get(0), "Введите знак операции: ");
        assertEqual(console.o.get(1), "Это не знак операции!!!");
        assertEqual(console.o.get(2), "Введите знак операции: ");
    }
}


