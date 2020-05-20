package moreString;

public class moreString {

    public static void main(String[] args) {

        String s = "Hello World !!!";
        System.out.println(s.equals("Hello World"));
        System.out.println(s.equals("Hello World !!!"));

        String s2 = "Hello";
        System.out.println(s2.equals(s));

        String a = "privet";
        String a1 = "PRIVET";
        System.out.println(a.equals(a1));
        System.out.println(a.equalsIgnoreCase(a1));

        a = "TeXt";
        System.out.println();
        System.out.println(a);
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("Xt"));
        System.out.println();

        a = "Hello World";
        System.out.println(a.contains("World"));
        System.out.println(a.contains("world"));
        System.out.println(a.contains("Hello World"));
        System.out.println(a.length());
        System.out.println(a.startsWith("He"));
        System.out.println(a.startsWith("Wo"));
        System.out.println(a.endsWith("ld"));
        System.out.println(a.endsWith("!"));
        System.out.println();

        a = "hello,world,i'm,your,fan";
        String[] array = a.split(",");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

        a = "privet,mir,i'm,your,fan";
        String[] arrays = new String[10];
        arrays = a.split(",");
            for (int i = 0; i < arrays.length; i++) {
                System.out.println(arrays[i]);
            }
        System.out.println();

        String bio = "My name is %s! I'm %d years old!";  // %s - строка ; %d - целое число
        String name = "Vlad";
        int age = 22;
        System.out.println(String.format(bio, name, age));
        System.out.println(String.format(bio, "Dima", 23));
//        System.out.println(String.format(bio, 23, "Vova")); Error
        System.out.println();

        String str2 = "44";
        int al = Integer.parseInt(str2);
        System.out.println(al * 2);
        System.out.println();

        str2 = "hello, world!";
        System.out.println(str2.substring(1, 8)); // 1 - значение включительно; 2 - нет
        System.out.println(str2.substring(7));
        System.out.println(str2.substring(7, str2.length() - 2) + "\n");
        String str3 = str2.substring(4, 9);
        System.out.println(str3);
        System.out.println();

        String a11= "My name";
        String a12= "is Vlad";
        String a13= "I am 22";
        String res;
        res = a11 + " " + a12 + " " + a13;
        System.out.println(res);

        res = a11.concat(a12).concat(a13);
        System.out.println(res);

    }
}
