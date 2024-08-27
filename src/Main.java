import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summe = 0;
        int anzahlZahlen = 0;

        System.out.println("Bitte geben Sie die Zahlen ein (Trennzeichen ',' oder Leerzeichen):");

        String eingabe = scanner.nextLine();

        String[] zahlenStringArray = eingabe.split("[,\\s]+");

        for (String zahlString : zahlenStringArray) {
            try {
                int zahl = Integer.parseInt(zahlString);
                summe += zahl;
                anzahlZahlen++;
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe gefunden: '" + zahlString + "'. Diese wird übersprungen.");
            }
        }

        System.out.println("Die Summe der gültigen eingegebenen Zahlen beträgt: " + summe);
        System.out.println("Anzahl der gültigen eingegebenen Zahlen: " + anzahlZahlen);
    }
}
