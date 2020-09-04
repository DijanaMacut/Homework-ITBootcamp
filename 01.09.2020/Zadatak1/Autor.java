package Zadatak1;
/*Autor poseduje ime, prezime, godinu rodjenja.
Ime, prezime i godina rodjenja se zadaju prilikom kreiranja
i ne mogu da se promene.*/
public class Autor {
    private final String ime;
    private final String prezime;
    private final int godRodjenja;

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public Autor(String ime, String prezime, int godRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godRodjenja = godRodjenja;
    }

    @Override
    public String toString() {
        return getPrezime() + "," + getIme()+ ","+ getGodRodjenja();
    }
}
