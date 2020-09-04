package Zadatak2;

public class Tehnicar extends Zaposleni{
    private Doktor refDoktora;

    public Tehnicar(String naziv, String JMBG, int godinaRodjenja) {
        super(naziv, JMBG, godinaRodjenja);
    }

    public Doktor getRefDoktora() {
        return refDoktora;
    }

    public void setRefDoktora(Doktor refDoktora) {
        this.refDoktora = refDoktora;
    }
    //  Ispis: Tehnicar [Zaposleni] radi za `Doktor`

    @Override
    public String toString() {
        StringBuilder n= new StringBuilder();
        n.append("Tehnicar [").append(super.toString()).append("] radi za ").append(refDoktora);
        return n.toString(); // Nedostaje: Proveriti da li je `refDoktora` `null`
    }
}
