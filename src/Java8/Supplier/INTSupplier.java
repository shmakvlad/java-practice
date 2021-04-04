package Java8.Supplier;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class INTSupplier {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public static void main(String[] args) {
        Supplier1();
        Supplier2();
    }

    public static void Supplier1() {
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time1 = s.get();
        System.out.println(time1);

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();
        System.out.println(time2);

        Supplier<List<String>> list1 = ArrayList::new;
        Supplier<LinkedList<String>> list2 = () -> new LinkedList<String>();
        List run = list1.get();
        List run2 = list2.get();
        System.out.println(run);
        System.out.println(run2);
    }

    public static void Supplier2() {
        Developer obj = factory(Developer::new);
        System.out.println(obj);
        Developer obj2 = factory(() -> new Developer("mkyong"));
        System.out.println(obj2);
    }

    public static Developer factory(Supplier<? extends Developer> s) {
        Developer developer = s.get();
        if (developer.getName() == null || "".equals(developer.getName())) {
            developer.setName("default");
        }
        developer.setSalary(BigDecimal.ONE);
        developer.setStart(LocalDate.of(2017, 8, 8));
        return developer;
    }

}

class Developer {

    String name;
    BigDecimal salary;
    LocalDate start;

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", start=" + start +
                '}';
    }

    public Developer() {
    }

    public Developer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

}
