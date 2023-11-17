package eksamen;

public class Oppgave2021_konte_1 {
    /*
    Definer følgende heltalls-array : 20, 34,-4,4,5,11,-23. Lag et Java-program som ved hjelp av en
løkke for hver av deloppgavene:
1. Skriver ut tabellen med mellomrom mellom tallene
2. Skriver ut tabellen baklengs med mellomrom mellom tallene
3. Summerer tabellen
4. Finner gjennomsnittet av tallene i tabellen
5. Skriver ut tallene som er mellom 0 og 20 (ikke inkludert tallene)
     */
    public static void main(String[] args) {
        int[] liste={20, 34,-4,4,5,11,-23};
        /*for (int i=0;i<liste.length-1;i++){
            System.out.print(liste[i]+", ");

        }
        System.out.println(liste[liste.length-1]+".");*/
        /*for (int i=liste.length-1;i>=0;i--){
            System.out.print(liste[i]+" ");
        }*/
        /*int sum=0;
        for (int i=0;i<liste.length;i++){
            sum+=liste[i];
        }
        System.out.println("Summer er "+sum);
        System.out.println(String.format("%.4f",(double) sum/liste.length));*/
        for (int i=0;i<liste.length;i++){
            if ((liste[i]>0) && (liste[i]<20)){
                System.out.print(liste[i]+" ");
            }
        }

    }
}
