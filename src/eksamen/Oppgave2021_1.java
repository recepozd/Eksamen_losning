package eksamen;

public class Oppgave2021_1 {
    /*
    a) Skriv kode for å summere hvert 5 tall fra og med 5 til og med 100. Det skal brukes en for-løkke.
    Resultatet skal skrives ut på System.out. Skriv kode for å finne gjennomsnittet også.
    b) Skriv tilsvarende kode som over med bruk av en while-løkke.
         */
    public static void main(String[] args) {
        int sum=0;
        int taller=0;
        /*for (int i=5;i<=100;i+=5){
            sum+=i;
            taller++;
        }
        System.out.println("Summen er "+sum);
        System.out.println("Gjennomsnitt er "+(double)sum/(double) taller);*/
        int i=5;
        while (i<=100){

            sum+=i;
            taller++;

            i+=5;
        }
        System.out.println("Summen er "+sum);
        System.out.println("Gjennomsnitt er "+(double)sum/(double) taller);
    }
}
