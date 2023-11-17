package eksamen;

import static javax.swing.JOptionPane.*;

public class Oppgave2021_konte_2 {
    /*
    Det skal lages et program som regner ut BMI (Body Mass Index). Det skal brukes input-
    dialo og meldingsboks fra Swing-bibliotektet.
    Først skal det leses inn vekten (i kg) og deretter høyden (i cm).
    Så skal BMI'en regnes ut med følgende formel:
    ( 1,3 * vekt) / ( høyde/100)^ 2,5 )
    ^2,5 står for "opphøyd i". Bruk Math.pow(a,b) der a er grunntalllet og b eksponenten.
    Resultatet skal så skrives ut i en meldingsboks med passende ledetekst.
    Dersom det skrives inn noe annet enn tall skal det skrives ut en feilmelding i meldingsboksen
    isteden for beregningen.
     */
    public static void main(String[] args) {
        double vekt;
        int høy;
        try {
            vekt=Double.parseDouble(showInputDialog("Skriv inn vekten: "));
            høy=Integer.parseInt(showInputDialog("Skriv inn høyden: "));
        }catch (Exception e){
            showMessageDialog(null,"Det er ikke gyldig.");
            vekt=0;
            høy=0;
        }
        double BMI=(1.3*vekt)/(Math.pow( høy/100,2.5));
        showMessageDialog(null, "BMI er "+BMI);
    }
}
