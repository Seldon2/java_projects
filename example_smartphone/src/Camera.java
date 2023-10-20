public class Camera {
    private final int resolution;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public PhoneFile makePicture(String extension, int size, String name){
        return new PhoneFile(name, size, extension);
    }
}
