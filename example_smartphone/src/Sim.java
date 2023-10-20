public class Sim {
    private final int id;

    private final String number;

    public Sim(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void doCall(String cellNumber){
        System.out.println("Your cell number: " + this.number);
        System.out.println("You're calling: " + cellNumber);
    }
}
