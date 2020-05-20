package Variables;

public class Variables {

    public static void main(String[] args) {

        byte a = 10 ; // -128 -> 127
        short b = -100; // -32768 -> 32767
        int c = 1000000;
        long d;
        d = -123456789;

        System.out.println();
        System.out.println("byte: " + a);
        System.out.println("shprt: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);

        double d1 = 249.15;
        System.out.println();
        System.out.println("double: " + d1);

        float f1 = 123.12f;
        System.out.println("float: " + f1);

        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1);
        System.out.println(flag2);

        boolean flag3 = 2 + 3 > 9;
        boolean flag4 = 2 + 3 > 1;
        boolean flag5 = 2 + 3 > 5;
        System.out.println();
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);

        String str = "My name is";
        String str2 = "Vlad";
        String str3 = str + " " + str2;
        System.out.println();
        System.out.println(str + " " + str2 + "!");
        System.out.println("String: " + str3);

        char ch1 = 'w';
        System.out.println("char: " + ch1);

        String list = "Hello";
        char ch = list.charAt(0);
        System.out.println(ch);

        String list2 = "H";
        System.out.println(list2.matches("[a-zA-z]{1}"));
        System.out.println(list2.matches("\\p{L}"));

        String personName;
        int age;

    }

}
