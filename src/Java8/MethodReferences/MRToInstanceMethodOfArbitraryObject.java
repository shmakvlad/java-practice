package Java8.MethodReferences;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MRToInstanceMethodOfArbitraryObject {

    public static void main(String[] args) {
        MethodOfArbitraryObject1();
        MethodOfArbitraryObject2();
    }

    static <R> R playOneArgument(String s1, Function<String, R> func) {
        return func.apply(s1);
    }

    static Boolean playTwoArgument(String s1, String s2, BiPredicate<String, String> func) {
        return func.test(s1, s2);
    }

    public static void MethodOfArbitraryObject1() {
        // lambda
        int result = playOneArgument("mkyong", x -> x.length());
        System.out.println(result);

        // method reference
        int result2 = playOneArgument("mkyong", String::length);

        // lambda
        Boolean result3 = playTwoArgument("mkyong", "y", (a, b) -> a.contains(b));

        // method reference
        Boolean result4 = playTwoArgument("mkyong", "y", String::contains);

        // lambda
        Boolean result5 = playTwoArgument("mkyong", "1", (a, b) -> a.startsWith(b));

        // method reference
        Boolean result6 = playTwoArgument("mkyong", "m", String::startsWith);
        System.out.println(result6);
    }

    public static void MethodOfArbitraryObject2() {
        Invoice obj = new Invoice("A002", BigDecimal.valueOf(2.99), 4);
        InvoiceCalculator formula = new InvoiceCalculator();

        // lambda
        BigDecimal result = calculate(formula, obj, (f, o) -> f.normal(o));

        // method reference
        BigDecimal result2 = calculate(formula, obj, InvoiceCalculator::normal);

        // lambda
        BigDecimal result3 = calculate(formula, obj, (f, o) -> f.promotion(o));

        BiFunction<InvoiceCalculator, Invoice, BigDecimal> func33 = InvoiceCalculator::promotion;

        // method reference
        BigDecimal result4 = calculate(formula, obj, InvoiceCalculator::promotion);

        BiFunction<InvoiceCalculator, Invoice, BigDecimal> func1 = (f, o) -> f.promotion(o);
        BiFunction<InvoiceCalculator, Invoice, BigDecimal> func2 = InvoiceCalculator::promotion;
        System.out.println(func1.apply(new InvoiceCalculator(), new Invoice("A002", BigDecimal.valueOf(0.99), 5)));
        System.out.println(func2.apply(formula, obj));
    }

    static BigDecimal calculate(InvoiceCalculator formula, Invoice s1, BiFunction<InvoiceCalculator, Invoice, BigDecimal> func) {
        return func.apply(formula, s1);
    }

}

class InvoiceCalculator {

    public BigDecimal normal(Invoice obj) {
        return obj.getUnitPrice().multiply(BigDecimal.valueOf(obj.qty));
    }

    public BigDecimal promotion(Invoice obj) {
        return obj.getUnitPrice()
                .multiply(BigDecimal.valueOf(obj.qty))
                .multiply(BigDecimal.valueOf(0.9))
                .setScale(2, RoundingMode.HALF_UP);
    }
}

class Invoice {

    String no;
    BigDecimal unitPrice;
    Integer qty;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Invoice(String no, BigDecimal unitPrice, Integer qty) {
        this.no = no;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public Invoice() {
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "no='" + no + '\'' +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                '}';
    }
}
