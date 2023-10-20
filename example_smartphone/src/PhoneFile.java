public class PhoneFile {
    private final String extension;
    private final int size;
    private final String name;

    public PhoneFile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public void getInfo(){
        System.out.println("Filename: " + this.name + "." + this.extension + ", Size: " + this.size + "MB");
    }

    public int getSize() {
        return size;
    }
}
