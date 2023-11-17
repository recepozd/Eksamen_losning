package eksamen;
class Metod{
    int største(int[] liste){
        int største=liste[0];
        for (int i:liste) {
            if(i>største){
                største=i;
            }
        }
        return største;
    }
    int minste(int[] liste){
        int minste=liste[0];
        for (int i=0;i<liste.length;i++) {
            if(liste[i]<minste){
                minste=i;
            }
        }
        return minste;
    }

}
public class Oppgave2021_3 {
    /*
    Det skal lages en klasse med to metoder kalt "storst" og "minst". Disse metodene skal ta inn en
    ArrayListe av heltall og returnere henholdsvis det største og minste tallet.
    Lag så en "main" metode som gjør følgende:
    Instansierer den nevnte klassen over
    Oppretter en liste av heltall
    Legger inn noen heltall i listen
    Skriver ut på System.out det største og minste tallet i listen ved hjelp av kallet til de to
    metodene.
     */
    public static void main(String[] args) {
        Metod k=new Metod();
        int[] liste={1,2,3,4,5,6,7,8,9};
        System.out.println("Største tallet i liste er "+k.største( liste));
        System.out.println("Minste tallet i liste er "+k.minste(liste));
    }
}
