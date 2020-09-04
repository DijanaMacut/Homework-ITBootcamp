package Zadatak1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Napraviti klasu Ocena. Potrebno je da sadrzi broj poena koje je neko imao na ispitu,
 * i metodu koja vraca koja ocena je u pitanju. Sadrzi naziv predmeta, i rok u kom je odrzan.
 * Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena koja racuna i vraca prosek.
 * Prethodnu klasu testirati.
 */
public class Ocena {
    private double brPoena;
    private String nazivPredmeta;
    private String rok;
    private double[] ocena;
    private double prosek;


    public Ocena(String nazivPredmeta, String rok) {
        this.nazivPredmeta = nazivPredmeta;
        this.rok = rok;
    }

    public double getBrPoena() {
        return brPoena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public String getRok() {
        return rok;
    }


    public double getProsek(double[] ocena) {
        this.ocena = ocena;

         Scanner in = new Scanner(System.in);
        double suma = 0;
        for (int i = 0; i < ocena.length; i++) {
             System.out.println("Unesite broj poena kako bi izracunali " + (i + 1) + ". ocenu");
              this.brPoena = in.nextDouble();
            ocena[i] = VratiOcenu(this.brPoena);
            suma += ocena[i];
        }
        double prosek=suma / ocena.length;
        this.prosek=prosek;
        return prosek;

    }

    public double[] getOcena() {
        return ocena;
    }

    public double VratiOcenu(double brPoena) {
        this.brPoena = brPoena;
        double ocena = 0;
        if (brPoena >= 0 && brPoena <= 100) {

            if (brPoena < 51) {
                return ocena = 5;
            } else if (brPoena >= 51 && brPoena < 61) {
                return ocena = 6;
            } else if (brPoena >= 61 && brPoena < 71) {
                return ocena = 7;
            } else if (brPoena >= 71 && brPoena < 81) {
                return ocena = 8;
            } else if (brPoena >= 81 && brPoena < 91) {
                return ocena = 9;
            } else if (brPoena >= 91 && brPoena <= 100) {
                return ocena = 10;
            }
        } else System.out.println("Broj bodova ne moze biti negativan broj, niti moze biti veci od 100.");
        return ocena;
    }

    @Override
    public String toString() {

        return "Za predmet " +
                getNazivPredmeta() +
                ", u roku " +
                getRok() +
                ", prosecna ocena na osnovu unetih ocena " +
                Arrays.toString(getOcena()) +
                " iznosi: " +
                prosek;
    }



}
