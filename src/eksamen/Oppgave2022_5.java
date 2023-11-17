package eksamen;

import java.util.ArrayList;

class Bok{
    private String tittel;
    private String forfatter;
    private double pris;
    public Bok(String tittel,String forfatter,double pris){
        this.tittel=tittel;
        this.forfatter=forfatter;
        this.pris=pris;
    }
    @Override
    public String toString(){
        return "Tittel: "+tittel+"\nForfatter: "+forfatter+"\nPris: "+pris;
    }
}
class Papirbok extends Bok{
    private int ISBN;

    public Papirbok(String tittel, String forfatter, double pris, int ISBN) {
        super(tittel, forfatter, pris);
        this.ISBN = ISBN;
    }

    @Override
    public String toString(){
        return super.toString()+"\nISBN: "+ISBN;
    }
}
class Lydbok extends Bok{
    private int lengdelminutter;

    public Lydbok(String tittel, String forfatter, double pris, int lengdelminutter) {
        super(tittel, forfatter, pris);
        this.lengdelminutter = lengdelminutter;
    }

    @Override
    public String toString(){
        return super.toString()+"\nLengdelminutter: "+lengdelminutter;
    }
}
public class Oppgave2022_5 {
    public static void main(String[] args) {
        ArrayList<Bok> liste=new ArrayList<>();
        Bok[][] liste2=new Bok[10][4];
        Lydbok lydbok=new Lydbok("prizma","MFG",150,20);
        Papirbok papirbok=new Papirbok("prizma","MFG",150,1122334455);
        liste.add(lydbok);
        liste.add(papirbok);
        for (Bok i:liste) {
            System.out.println(i.toString());
        }

        }
}

