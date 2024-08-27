import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summe = 0;

        System.out.println("Bitte geben Sie die Zahlen ein(Trennzeichen , oder Leerzeichen):");

        String eingabe = scanner.nextLine();

        String[] zahlenStringArray = eingabe.split("[,\\s]+");

        int anzahlZahlen = zahlenStringArray.length;

        for (String zahlString : zahlenStringArray) {
            int zahl = Integer.parseInt(zahlString);  // Umwandlung in eine Ganzzahl
            summe += zahl;
        }

        System.out.println("Die Summe der eingegebenen Zahlen beträgt: " + summe);
        System.out.println("Anzahl der eingegebenen Zahlen: " + anzahlZahlen);
    }
}
