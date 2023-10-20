import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kontostand = 0;
        int menuSelection = 0;
        int amount = 0;
        Scanner console = new Scanner(System.in);

        while(menuSelection != 4) {
            System.out.print("\nWählen Sie die gewünschte Funktion aus: \n " +
                    "1. Einzahlen\n " +
                    "2. Abheben\n " +
                    "3. Kontostand\n " +
                    "4. Ende\n "
            );
            System.out.print("Auswahl: ");
            menuSelection = console.nextInt();
            if (menuSelection == 1) {
                System.out.print("Geben Sie den Betrag an, den Sie einzahlen möchten: ");
                amount = console.nextInt();
                kontostand += amount;
                System.out.printf("Sie haben %d€ eingezahlt", amount);
            } else if (menuSelection == 2) {
                System.out.print("Geben Sie den Betrag an, den Sie abheben möchten: ");
                amount = console.nextInt();
                kontostand -= amount;
                System.out.printf("Sie haben %d€ von ihrem Konto abgehoben", amount);
            } else if (menuSelection == 3) {
                System.out.printf("Ihr Kontostand beträgt derzeit %d€", kontostand);
            } else {
                System.out.print("Keine gültige Auswahl\n");
            }
        }
    }
}