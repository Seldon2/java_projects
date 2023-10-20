import java.util.ArrayList;

public class SDCard {
    private final int capacity;

    private final ArrayList<PhoneFile> phoneFiles = new ArrayList<PhoneFile>();

    public SDCard(int capacity) {
        this.capacity = capacity;
    }

    public void saveFile(PhoneFile file){
        phoneFiles.add(file);
    }

    public ArrayList<PhoneFile> getAllFiles(){
        return new ArrayList<PhoneFile>(phoneFiles);
    }

    public int getFreeSpace(){
        int usedSpace = 0;
        for(PhoneFile f: phoneFiles){
            usedSpace += f.getSize();
        }
        return capacity - usedSpace;
    }


}
