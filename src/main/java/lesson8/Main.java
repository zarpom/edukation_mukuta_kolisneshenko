package lesson8;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Math.pow(8, 2));
//        for (int i = 0; i <= 10; i++) {///0 1 2 3 4 5
//            System.out.println(Math.pow(8, i));
//        }

//        System.out.println( 1/2D);
        var number = 1d;
        var eps = 0.6;
        int i = 2;

        while ((1d / i) > eps) {
            double dod = 1d / i;
            number += dod;
            i *= 2;
        }

        System.out.println(number);
    }
}
