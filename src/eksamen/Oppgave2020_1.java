package eksamen;

import static javax.swing.JOptionPane.*;

public class Oppgave2020_1 {
    /*
    Det skal lages en enkel løsning med inputbokser og meldingboks for å konvertere fra celcius grader (C)
    til fahrenheit (F) og motsatt.
    Løsningen skal gjøre følgende :
    Lese inn en streng fra en inputdialogboks hvor det skal oppgis hva det skal konverteres FRA (C eller F
    skal skrives inn)
    Lese så inn gradene fra en ny inputdialogboks
    Konvertere gradene til en double
    Avhengig av hva som er skrevet inn i den første inputboksen regne ut resultatet via følgende formler:
    Fra Celcius til Fahrenheit: F = C * 1.8 + 32
    fra Fahrenheit til Celcius: C = (F - 32) / 1.8
    Skriv tilslutt ut resultatet med passende ledetekst med to desimaler i en meldingsboks.
    Dersom det ikke er skrevet inn hverken C eller F i den første inputboksen skal det ikke regnes ut noe, men
    skrives ut i meldingsboksen at det må skrives inn enten C eller F
     */
    public static void main(String[] args) {
        double celcius, fahrenheit;
        String innCelcius = showInputDialog("Skriv inn celsius: ");
        try {
            celcius = Double.parseDouble(innCelcius);
        } catch (Exception e) {
            showMessageDialog(null, "Det er ikke gyldig.");
            celcius = 0;
        }

        String innFahrenheit = showInputDialog("Skriv inn fahrenheit: ");
        try {
            fahrenheit = Double.parseDouble(innFahrenheit);
        } catch (Exception e) {
            showMessageDialog(null, "Det er ikke gyldig.");
            fahrenheit = 0;
        }
        showMessageDialog(null, "Fahrenheit er "+String.format("%.2f",celcius * 1.8 + 32)+"\nCelsius er "+String.format("%.2f",(fahrenheit - 32) / 1.8));

    }
}
