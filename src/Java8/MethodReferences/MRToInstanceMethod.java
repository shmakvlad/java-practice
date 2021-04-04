package Java8.MethodReferences;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MRToInstanceMethod {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("mkyong", 38, BigDecimal.valueOf(3800)),
                new Employee("1zilap", 5, BigDecimal.valueOf(100)),
                new Employee("ali", 25, BigDecimal.valueOf(3)),
                new Employee("unknown", 28, BigDecimal.valueOf(9999)));

        mR1(list);
        mR2(list);
        list.forEach(System.out::println);
    }

    public static void mR1(List list) {
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge()-o2.getAge();
            }
        });
    }

    public static void mR2(List<Employee> list) {
        ComparatorProvider provider = new ComparatorProvider();

        // lambda
        list.sort((o1, o2) -> provider.compareByAge(o1, o2));

        list.sort(provider::compareBySalary);
        list.sort(new ComparatorProvider()::compareByName);
    }
}



class ComparatorProvider {

    public int compareByAge(Employee o1, Employee o2) {
        return o1.getAge().compareTo(o2.getAge());
    }

    public int compareByName(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public  int compareBySalary(Employee o1, Employee o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }

}

class Employee {

    String name;
    Integer age;
    BigDecimal salary;

    public Employee(String name, Integer age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
