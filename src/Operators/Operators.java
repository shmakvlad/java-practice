package Operators;

public class Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        int c, d;
        c = d = b;
        System.out.println("a = " + a +  " b = " + b + " c = " + c + " d = " + d + "\n");

        a = b + c * d;
        System.out.println(a);
        a = (b + c) * d;
        System.out.println(a + "\n");

        a = 13;
        b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        double n = 12.54;
        double m = 1.55;
        System.out.println(n / m);
        System.out.println(a / m + "\n");

        System.out.println(a % b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a - 8 <= b);
        System.out.println(a - 9 >= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println();
        System.out.println(a + 1 >= b + 20);
        System.out.println(!(a + 1 >= b + 20));
        System.out.println();

        int j = 2;
        System.out.println(j++);
        System.out.println(j);

        int z = 5;
        System.out.println(++z);
        System.out.println(z);

        j = 10;
        z = j++;
        System.out.println(z);

        j = 10;
        z = ++j;
        System.out.println(z + "\n");

        a = 10;
        b = 20;
        System.out.println(a < b || a > b);
        System.out.println(a + 15 < b || a > b);
        System.out.println(a < b && a > b);
        System.out.println(a < b && a + 15 > b);
        System.out.println(a < b && a + 15 > b && m == 1.55);
        System.out.println("\n" + "Сначала приоритет у оператора && далее у ||:");
        System.out.println(a + 10 <= b || a + 15 < b && m == 2);
        System.out.println(a + 10 < b || a + 15 < b && m == 2);
        System.out.println(a + 10 <= b || a + 15 > b && m == 1.55);
        System.out.println(a + 10 < b || a + 15 > b && m == 1.55);
        System.out.println();
        System.out.println(a + 10 < b || a + 15 > b && m == 2);
        System.out.println(a + 10 <= b || a + 15 > b && m == 2);
        System.out.println(!(a + 10 <= b || a + 15 > b && m == 2));
        System.out.println();

        a = 16;
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, 2));
        System.out.println(Math.max(a, 20));
        System.out.println(Math.min(a, m));
        System.out.println();

        a = a + 5;
        System.out.println(a);
        System.out.println();

        a = b = c = d = 15;
        a += 5;
        b -= 5;
        c *= 5;
        d /= 5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println();

        a = 10;
        System.out.println(a);
        a %= 3;
        System.out.println("a %3= " + a);

        a = 10;
        a %= 5;
        System.out.println("a %5= " + a);

        a = 10;
        a %= 6;
        System.out.println("a %6= " + a);

        a = 10;
        a %= 11;
        System.out.println("a %11 = " + a);

        a = 10;
        a %= 20;
        System.out.println("a %20 = " + a);

        a = 10;
        a %= 33;
        System.out.println("a %33 = " + a);

        a = 10;
        a %= 10;
        System.out.println("a %10 = " + a);

        a = 10;
        a %= 2;
        System.out.println("a %2 = " + a);
        System.out.println();

        a = 10;
        a %= a + 2;
        System.out.println("a +%2 = " + a);

        a = 10;
        a = a % (a + 3);
        System.out.println("a +%3 = " + a);

        a = 10;
        System.out.println(a % (a + 3));
        System.out.println();

        // Repeat
        String[] vocabl = {"board", "mobile", "picture"};
            for (int i = 0; i < vocabl.length; i++){
                System.out.println(vocabl[i]);
            }
        System.out.println();

        String[] world = new String[10];
        int[] page = {1, 5, 48, 214, 540};
        for (int i = 0; i < page.length - 2; i++){
            world[i] = vocabl[i] + "!";
            System.out.println(world[i]);
        }

    }
}
