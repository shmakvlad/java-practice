package Java;

public class PreobrazovanieTipov {

    public static void main(String[] args) {

        float fl = (float) 123.12;
        float fl2 = 123.12f;

        int a = 12;
        long b = a;
        long big = 1231233123212311112L;
        int c = (int) big;
        double dr = fl;
        double er = 123.123;

        int x = 44;
        Integer x1 = x;
        int x3 = x1;

        String s = "преобразование";
        Object o = new Object();
        o = s;
        s = (String) o;

        Object obj1 = 123;

        if (obj1 instanceof Integer){
            Integer str1 = (Integer) obj1;
            System.out.println("Integer: " + str1);
        } else if (obj1 instanceof Float){
            Float str1 = (Float) obj1;
            System.out.println("Float: " + str1);
        } else if (obj1 instanceof String){
            String str1 = (String) obj1;
            System.out.println("String: " + str1);
        }

//        Exeption
//        Object obj2 = 12.3f;
//        Integer str2 = (Integer) obj2;
//        System.out.println(str2);

//        Exeption
//        Object obj = new File("ola");
//        String str = (String) obj;
//        System.out.println(str);

        Integer in = 125;
        Object io = in;
        Integer in2 = (Integer) io;
        System.out.println(in2.intValue());
        System.out.println();

//        Exeption
//        Object t = new Object();
//        Integer olo = (Integer) t;
//        System.out.println(olo.intValue());

    }

}
