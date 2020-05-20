package Сycles;

public class Сycles {
    public static void main(String[] args) {

        int[] chisla = new int[10];
        for (int i = 0; i < chisla.length; i++){
            chisla[i] = (i + 1) * 10;
            System.out.println(chisla[i]);
        }

        for (int element : chisla ){
            element = element - 9;
            System.out.println(element);
        }

        int j = 5;
        boolean flag = true;
        while (flag != false){
            j--;
            if (j == -2) {
                flag = false;
                break;
            }
            System.out.println(j);
        }

        int l = 0;
        do {
            System.out.println("l = " + l);
            l++;
        } while ( l < 5 );
        System.out.println(l);
    }
}
