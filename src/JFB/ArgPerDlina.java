package JFB;

public class ArgPerDlina {

    static void test(int... array) {
        System.out.println("test(int... array)");
        System.out.println("Количество аргументов: " + array.length);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }

    static void test(int a) {
        System.out.println("test(int a)");
        System.out.println();
    }

    static void test(double... array) {
        System.out.println("test(double... array)");
        System.out.println("Количество аргументов: " + array.length);
        for (double a : array) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }

    static void test2(String... array) {
        System.out.println("test(String... array)");
        System.out.println("Количество аргументов: " + array.length);
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }

    static void test3(String message, String... array) {
        System.out.println("test3(String message, String... array)");
        System.out.println(message);
        System.out.println("Количество аргументов: " + array.length);
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        System.out.println();
        test(1.0);
        test(1, 2.0);

        test(3);
        test((int) 1.0);

        test();
        test(1, 2);
        test(new int[]{1, 3, 4, 19});

        test2();
        test2("String");

        test3("Method with message");
        test3("Method with message and parameters", "first", "second", "theart");
        test3("Method with message and parameters", "first");

    }

}