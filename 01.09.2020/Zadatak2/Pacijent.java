package Zadatak2;
/*
 # Pacijent
         Pacijent je `Osoba` koja poseduje broj knjizice (LIB). Broj knjizice se zadaje prilikom kreiranja i moze da se dohvati i postavi
*/
public class Pacijent extends Osoba{
    public static final int LIB_LENGTH=11;
    private String LIB;

    public Pacijent(String naziv, String JMBG, int godinaRodjenja, String LIB) {
        super(naziv, JMBG, godinaRodjenja);
        if(LIB.length()==LIB_LENGTH) {
            this.LIB = LIB;
        }
    }

    public String getLIB() {
        return LIB;
    }

    public void setLIB(String LIB) {
        if(LIB.length()==LIB_LENGTH){
            this.LIB = LIB;
        }
    }

    // Ispis: [OSOBA] - LIB




    @Override
    public String toString() {
        StringBuilder novi= new StringBuilder();
        novi.append("Pacijent [");
        novi.append(super.toString());
        novi.append("] - ");
        novi.append(getLIB());
        return novi.toString();
    }
}
