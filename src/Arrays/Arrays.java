package Arrays;

public class Arrays {

    public static void main(String[] args) {

        String[] names;
        names = new String[100];
        names[0] = "Hello";
        names[1] = "World!";
        System.out.println(names[0] + " " + names[1] + "\n");

        String[] surnames = new String[5];
        surnames[0] = "Petrov";
        surnames[1] = "Ivanov";
        surnames[2] = "Bistrov";
        System.out.println(surnames[0] + " " + surnames[1] + " " + surnames[2] + "\n");

        int[] arr = new int[10];
        arr[0] = 100;
        arr[1] = 101;

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + "\n");

        String[] dict = {"Привет", "меня зовут", "Паша", "27"};
        System.out.println(dict[0]);
        System.out.println(dict[1]);
        System.out.println(dict[2]);
        System.out.println(dict[3] + "\n");

        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        System.out.println();

        String[] cikl = {"abc", "def", "ghi", "jkl", "mno"};
        int j = 0;
            while (j < cikl.length) {
                System.out.println(cikl[j]);
                j++;
            }
        System.out.println();

        int[] num = new int[12];
            for (int i = 1; i < num.length - 1; i++) {
                num[i] = i * 10;
                System.out.println(num[i]);
            }

        System.out.println();
        System.out.println(num.length);
        System.out.println(num[num.length - 1]);

    }
}
