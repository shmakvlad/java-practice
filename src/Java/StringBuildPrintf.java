package Java;

public class StringBuildPrintf {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my").append(" dear").append(" friend!");
        System.out.println(sb);

        System.out.printf("%s , hello I am your fan since %d, i give you %f marks", "Dima", 12, 44.3);
        System.out.printf("\n" + "String: %.4f", 23.456734);

    }
}
