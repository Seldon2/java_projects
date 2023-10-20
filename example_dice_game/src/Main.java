import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int sumPlayer = 0;
        int sumCPU = 0;
        int randIntPlayer = 0;
        int randIntCPU = 0;
        int menuSelection = 0;
        Random rand = new Random();
        Scanner console = new Scanner(System.in);

        while (menuSelection != 3) {
            System.out.print("Wollen sie 6 Würfe automatisiert oder von Hand durchführen :\n"
                    + " 1. automatisiert\n"
                    + " 2. von Hand\n"
                    + " 3. Ende\n"
            );
            System.out.print("Auswahl: ");
            menuSelection = console.nextInt();
            if (menuSelection == 1) {
                sumPlayer = 0;
                sumCPU = 0;
                for (int i = 1; i <= 6; i++) {
                    randIntPlayer = rand.nextInt(7-1) + 1;
                    sumPlayer += randIntPlayer;
                    System.out.printf("\nIhr %d. Würfel: \n", i);
                    System.out.println(randIntPlayer);
                    TimeUnit.SECONDS.sleep(1);

                    randIntCPU = rand.nextInt(7-1) + 1;
                    sumCPU += randIntCPU;
                    System.out.printf("\nCPU's %d. Würfel: \n", i);
                    System.out.println(randIntCPU);
                    TimeUnit.SECONDS.sleep(1);
                }
                System.out.printf("\nIhre Augensumme: %d\n", sumPlayer);
                System.out.printf("CPU Augensumme: %d\n", sumCPU);
                if(sumPlayer == sumCPU){
                    System.out.println("Unentschieden\n");
                }else {
                    System.out.println(sumPlayer > sumCPU ? "Sie haben gewonnen\n" : "Sie haben verloren\n");
                }
            } else if(menuSelection == 2){
                sumPlayer = 0;
                sumCPU = 0;
                for(int i = 1; i <= 6; i++){
                    System.out.println("\nEnter um zu würfeln");
                    try{
                        System.in.read();
                    }catch(Exception e){}
                    randIntPlayer = rand.nextInt(7-1) + 1;
                    sumPlayer += randIntPlayer;
                    randIntCPU = rand.nextInt(7-1)+1;
                    sumCPU += randIntCPU;
                    System.out.println(randIntPlayer);
                }
                System.out.printf("\nIhre Augensumme: %d\n", sumPlayer);
                System.out.printf("CöPU Augensumme: %d\n\n", sumCPU);
                if(sumPlayer == sumCPU){
                    System.out.println("Unentschieden\n");
                }else {
                    System.out.println(sumPlayer > sumCPU ? "Sie haben gewonnen\n" : "Sie haben verloren\n");
                }
            }
        }
    }
}