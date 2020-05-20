package TryCatch;

public class TryCatch {
    public static void main(String[] args) {

        System.out.println();
        devider(10,2);

        System.out.println();
        try {
            deviderTwo(10, 2);
        } catch (ArithmeticException e){
            System.out.println("Please, input a number!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void devider(int a, int b){

       try {
           System.out.println("Result is: " + a / b);
       } catch (ArithmeticException e) {
           System.out.println("Problem, please try one more time !");
       } finally {
           System.out.println("Wish you a good day!");
       }

    }

    public static void deviderTwo(int a, int b) throws Exception {

        char ch = '1';
        if (b == 0){
            throw new Exception("Can not devide by zero.");
        } else if (Character.isLetter(ch)) {
            throw new ArithmeticException();
        } else {
            System.out.println("Result is: " + a / b);
        }

    }
}
