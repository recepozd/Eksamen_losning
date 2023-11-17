package eksamen;

import java.util.ArrayList;

/*Det skal lages et oppslag for valuta hvor man skal kunne finne en valutasort (som USD, DKK, EUR) for så vise
        kursen til valutaen. Feks:
        100 norske kroner vill gi 11.5 amerikanske dollar (USD)
        100 norske kroner vil gi 75 danske kroner (DKK)
        Disse verdiene skal lagres i en ArrayList via en klasse Valuta som inneholder valuta og kurs.
        Her er koden for Valuta-klasen:*/
class Valuta{
    private String valuta;
    private double kurs;
    public Valuta(String valuta, double kurs) {
        this.valuta = valuta;
        this.kurs = kurs;
    }
    public String getValuta() {
        return valuta;
    }
    public double getKurs() {
        return kurs;
    }
}
    //Kopier skall-koden under og fullfør denne. La konstruktøren initsiere arrayet med verdier.
class ValutaKalkulator {
    private ArrayList<Valuta> valutakurser = new ArrayList<>();
    public ValutaKalkulator(){
        Valuta usd=new Valuta("USD",8.60);
        valutakurser.add(usd);
        Valuta dkk=new Valuta("DKK",13.3);
        valutakurser.add(dkk);

    }

    public double beregnKurs(String valuta,double a) {
        for(Valuta kurs:valutakurser) {
            if (kurs.getValuta().equals(valuta)) {
                return kurs.getKurs()*a;
            }
        }
        return 0;
    }
}

   class Oppgave2 {
      public static void main(String[] args) {
        ValutaKalkulator k=new ValutaKalkulator();
          System.out.println("USD er "+k.beregnKurs("USD",100)+" kr.");
      }
}
