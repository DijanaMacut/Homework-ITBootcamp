package Zadatak1;
/*Napraviti sistem klasa koji opisuje knjigu.
Autor poseduje ime, prezime, godinu rodjenja.
Ime, prezime i godina rodjenja se zadaju prilikom kreiranja
i ne mogu da se promene.
Knjiga poseduje naziv, AUTORA (TIPA Autor),
broj strana, godinu izdanja.
Sva polja mogu da se dohvate,
a godina izdanja moze i da se postavi
U programu iskoristi sva polja iz svih kreiranih klasa gde ce se kreirati 3 knjige, a knjige biti
poredjane po godini izdanja.*/
public class Main {

    public static void main(String[] args) {
        Knjiga k1= new Knjiga("Khaled","Hosseini",1965,"Hiljadu cudesnih sunaca", 2007);
        Knjiga k2= new Knjiga("Stephen John", "Watson",1971, "Pre nego sto zaspim",2011);
        Knjiga k3= new Knjiga("Dan","Brown",1964,"Andjeli i demoni",2000);
        //Knjiga [] knjige={k1, k2, k3};


    int a=k1.getGodinaIzdanja();
    int b=k2.getGodinaIzdanja();
    int c=k3.getGodinaIzdanja();
    Sort(a,b,c,k1,k2,k3);
        k3.setGodinaIzdanja(2015);
         c=k3.getGodinaIzdanja();
        Sort(a,b,c,k1,k2,k3);
    }
    public static void Sort( int a, int b, int c, Object k1, Object k2, Object k3){

        System.out.println("Spisak knjiga po opadajucem redosledu godine izdanja je sledeci: ");
        int max=0;
        int mid=0;
        int min=0;
        if(a>b && a>c){
            a=max;
            System.out.println(k1);
            if(b>c){
                b=mid;
                System.out.println(k2);
                c=min;
                System.out.println(k3);
            }else{
                c=mid;
                System.out.println(k3);
                b=min;
                System.out.println(k2);
            }
        }
        else if(b>a && b>c){
            b=max;
            System.out.println(k2);
            if(a>c){
                a=mid;
                System.out.println(k1);
                c=min;
                System.out.println(k3);
            }else{
                c=mid;
                System.out.println(k3);
                a=min;
                System.out.println(k1);
            }
        }
        else if(c>a && c>b){
            c=max;
            System.out.println(k3);
            if(a>b){
                a=mid;
                System.out.println(k1);
                b=min;
                System.out.println(k2);
            }else{
                b=mid;
                System.out.println(k2);
                a=min;
                System.out.println(k1);
            }
        }
    }
    //Ovako sam htela da stavim objekte u niz, ali ne znam kako da sortiram na osnovu jednog parametra objekta
   /* public static void Sort(Object[] obj){
        for(int i=0; i<obj.length/2; i++){

        }*/
    }

