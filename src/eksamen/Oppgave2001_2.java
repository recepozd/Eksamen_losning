package eksamen;

public class Oppgave2001_2 {
    /*
    Det skal opprettes en statisk metode kalt funnetTall. Denne metoden skal ta inn et heltallsarray
    og et heltall. Metoden skal så sjekke om tallet som kommer inn i metoden ligger i arrayet og
    dersom det gjør det skal det returneres en boolean lik true. Dersom tallet ikke finnes i arrayet skal
    det returneres false.
    Opprett så i main metoden (se under) et heltallsarray og legg inn noen heltall i dette arrayet. Kall
    så metoden med et heltall. Skriv så ut på System.out om tallet ligger i arrayet eller ikke.
     */
    static boolean funnetTall(int[] liste,int tall){
        boolean check=false;
        for (int i:liste) {
            if(i==tall){
                check=true;
                return check;
            }

        }
        return check;
    }
    public static void main(String[] args) {
        int[] liste={3,5,7,9,11,13,15};
        System.out.println(funnetTall(liste,9));
    }
}
