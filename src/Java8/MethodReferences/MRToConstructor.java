package Java8.MethodReferences;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class MRToConstructor {

    public static void main(String[] args) {
        check1();
        check2();
        check3();
    }

    static List<Invoices> fakeInvoice(List<BigDecimal> list, Function<BigDecimal, Invoices> func) {
        List<Invoices> result = new ArrayList<>();

        for (BigDecimal amount : list) {
            result.add(func.apply(amount));
        }
        return result;
    }

    public static void check1(){
        List<BigDecimal> list = Arrays.asList(
                BigDecimal.valueOf(9.99),
                BigDecimal.valueOf(2.99),
                BigDecimal.valueOf(8.99));

        // lambda
        List<Invoices> invoices1 = fakeInvoice(list, (price) -> new Invoices(price));

        // method reference
        List<Invoices> invoices2 = fakeInvoice(list, Invoices::new);

        invoices1.forEach(System.out::println);
        invoices2.forEach(System.out::println);
    }

    public static void check2(){
        // lambda
        Supplier<Map> obj1 = () -> new HashMap();
        Map map1 = obj1.get();
        System.out.println(map1);

        // method reference
        Supplier<Map> obj2 = HashMap::new;
        Map map2 = obj2.get();

        // lambda
        Supplier<Invoices> obj3 = () -> new Invoices("World", BigDecimal.valueOf(44.011), 1001);
        Invoices invoice1 = obj3.get();
        System.out.println(invoice1);

        // method reference
        Supplier<Invoices> obj4 = Invoices::new;
        Invoices invoice2 = obj4.get();
        System.out.println(invoice2);
    }

    public static void check3(){
        Function<BigDecimal, Invoices> function = x -> new Invoices(x);
        System.out.println(function.apply(BigDecimal.valueOf(30.9)));
    }
}

class Invoices {

    String no;
    BigDecimal unitPrice;
    Integer qty;

    public Invoices(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Invoices(String no, BigDecimal unitPrice, Integer qty) {
        this.no = no;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public Invoices() {
    }

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

    @Override
    public String toString() {
        return "Invoices{" +
                "no='" + no + '\'' +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                '}';
    }
}