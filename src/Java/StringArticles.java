package Java;

public class StringArticles {
    public static void main(String[] args) {
        String testString = "котёнок";
        System.out.println(testString.indexOf('ё'));

        String testString2 = "У окошка";
        System.out.println(testString2.indexOf("кошка"));

        System.out.println(testString.hashCode());

        String testString3 = "У окошка";
        String testString4 = "";
        String testString5 = new String();
        System.out.println(testString3.isEmpty());
        System.out.println(testString4.isEmpty());
        System.out.println(testString5.isEmpty());

        String a = null;
        String message = String.join("-", "Cat", "is", "cool", a); // Cat-is-cool
        System.out.println(message);

        String testString6 = "кит";
        System.out.println(testString6.replace('и', 'о'));

        int i = Integer.parseInt("kitty1243".replaceAll("[\\D]",""));
        String l = "string1243".replaceAll("[\\d]","");
        int j = Integer.parseInt("123kitty".replaceAll("[\\D]",""));
        int k = Integer.parseInt("1k2it3ty".replaceAll("[\\D]",""));
        System.out.println(i);
        System.out.println(l);
        System.out.println(j);
        System.out.println(k);

        String s = "001234-cat";
        String b = s.replaceFirst ("^0*", "");
        System.out.println(b);

        String catNames = "Васька Рыжик Мурзик Барсик";
        String aCats[] = catNames.split(" ");
        for (String sl : aCats){
            System.out.print(sl + " ");
        }
        System.out.println(aCats[0]);
        String[] words = catNames.split("\\s+"); // учитывать любые типы пробелов, включая двойные и более

        System.out.println();
        String str1 = "котлета";
        if(str1.startsWith("кот"))
            System.out.println("Слово содержит кота");
        else
            System.out.println("Плохое слово. Нет смысла его использовать");

        String testString7 = "скотина";
        System.out.println(testString7.substring(1,5));

        String unusualCat = "Котёнок по имени Гав";

        System.out.println();
        char[] yomoe = unusualCat.toCharArray();
        for (Character c : yomoe){
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println(String.valueOf(yomoe));
        System.out.println(String.valueOf(yomoe[3]));

        System.out.println();
        int catAge = 7;
        String so = "ola";
        System.out.println(String.valueOf(catAge));
        System.out.println(String.valueOf(so));

        String str = "   Hello Kitty  ".trim();
        String str11 = "   Hello Kitty  ";
        System.out.println(str);
        System.out.println(str11);
    }
}
