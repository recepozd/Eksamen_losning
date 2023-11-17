package eksamen;

class Person{
    private String navn;
    private String personnummer;
    private int alder;
    //<Skriv en konstruktør for attributtene>

    public Person(String navn, String personnummer, int alder) {
        this.navn = navn;
        this.personnummer = personnummer;
        this.alder = alder;
    }
    public Person(){

    }
    @Override
    //<Skriv en toString() metode>
    public String toString(){
        return "Navn: "+navn+"\nPersonnummer: "+personnummer+"\nAlder: "+alder;
    }
}
class Pasient extends Person{
    private String diagnose;
    //<Skriv en konstruktør>

    public Pasient(String navn, String personnummer, int alder, String diagnose) {
        super(navn, personnummer, alder);
        this.diagnose = diagnose;
    }


    // <Skriv en toString() metode>
    @Override
    public String  toString(){
        return "Pasient : \n" +super.toString()+"\nDiagnos: "+diagnose+"\n";
    }
}
class Lege extends Person{
    //<Opprett et pasient-array med 100 plasser>
    public Pasient[] liste=new Pasient[100];
    //<Opprett en konstruktør>

    public Lege(String navn, String personnummer, int alder ) {
        super(navn, personnummer, alder);

    }

    //<Skriv en toString() metode>
    @Override
    public String toString(){
        String ut="";
        for(Pasient enPasient : liste){
            if(enPasient != null){
                ut += enPasient;
            }
        }
        return "Lege : \n"+
                super.toString()+ut+"\n";
    }

}
public class Oppgave2020_2 {
    public static void main(String[] args) {
        Pasient ole = new Pasient("Ole","01019323456",23,"Diabetes");
        Pasient kari = new Pasient("Kari","01029012345",32,"Migrene");
        Lege Ensar = new Lege("Ensar","12128012345",40);
        Ensar.liste[0]=ole;
        Ensar.liste[1]=kari;
        System.out.println(Ensar);
    }
}
