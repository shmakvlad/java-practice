package JFB;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(4) + "\n");
        count(5);
    }

    public static int factorial(int id){
        if (id == 1)
            return 1;

        return id * factorial(id - 1);
    }

    public static void count(int n){
        if (n == 0) return;
        System.out.println(n);
        count(n - 1);
    }
}
