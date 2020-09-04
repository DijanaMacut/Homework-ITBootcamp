package Zadatak1;
/*Knjiga poseduje naziv, AUTORA (TIPA Autor),
broj strana, godinu izdanja.
Sva polja mogu da se dohvate,
a godina izdanja moze i da se postavi*/
public class Knjiga extends Autor {
    private int godinaIzdanja;
    private final String naziv;
    public Knjiga(String ime, String prezime, int godRodjenja,String naziv ,int godinaIzdanja) {
        super(ime, prezime, godRodjenja);
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
    }
    public String getNaziv() {
        return naziv;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }



    @Override
    public String toString() {
        return " '"+getNaziv()+"'"+"," + super.toString()+ ", godina izdanja "+ getGodinaIzdanja();
    }
}
