package Zadatak1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ocena o = new Ocena("Statistika", "Oktobar 2");
        Scanner in = new Scanner(System.in);
        System.out.println("Koliko ocena zelite da unesete?");
        int n = in.nextInt();
        while (n <= 0) {
            System.out.println("Morate uneti pozitivnu vrednost vecu od nule. pokusajte ponovo.");
            n = in.nextInt();
        }
        double[] ocena = new double[n];

       System.out.println(o.getProsek(ocena));
        System.out.println(Arrays.toString(ocena));
        System.out.println(o);
    }
}

