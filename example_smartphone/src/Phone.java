import java.util.ArrayList;
import java.util.Scanner;

public class Phone {

    private final SDCard card;
    public final Camera cam;
    public final Sim sim;

    public Phone(String color, SDCard card, Camera cam, Sim sim) {
        this.card = card;
        this.cam = cam;
        this.sim = sim;
    }

    public void takePicture(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Resolution of your camera: " + this.cam.getResolution() + "MP");

        System.out.println("Filename: ");
        String fileName = scan.nextLine();

        System.out.println("Extension: ");
        String extension = scan.nextLine();

        System.out.println("Size in MB: ");
        int size = scan.nextInt();

        PhoneFile file = this.cam.makePicture(extension, size, fileName);
        this.card.saveFile(file);
    }
    public void makeCall(String cellNumber){

    }

    public int getFreeSpace(){
        return this.card.getFreeSpace();
    }

    public void printAllFiles(){
        ArrayList<PhoneFile> files = this.card.getAllFiles();
        for(PhoneFile f: files){
            f.getInfo();
        }
    }
}
