import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuAuswahl = 0;
        Sim sim = new Sim(12, "+436601066671");
        Camera cam = new Camera(48);
        SDCard card = new SDCard(100);
        Phone iPhone14 = new Phone("grey",card, cam, sim);
        System.out.println("Menü: ");
        System.out.print(" 1. Foto machen\n 2. Anrufen\n 3. verfügbarer Speicherplatz anzeigen\n 4. alle Dateien ausgeben\n");
        menuAuswahl = scan.nextInt();
        switch(menuAuswahl){
            case 1:
                iPhone14.takePicture();
                break;
            case 2:
                String cellNumber = "";
                System.out.println("Telefonnummer eingeben: ");
                scan.nextLine(); // to consume the "\n"
                cellNumber = scan.nextLine();
                System.out.println(cellNumber);
                iPhone14.makeCall(cellNumber);
                break;
            case 3:
                iPhone14.getFreeSpace();
                break;
            case 4:
                iPhone14.printAllFiles();
                break;
        }


    }
}