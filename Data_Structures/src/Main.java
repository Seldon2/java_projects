public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(4);
        list.add(3432);
        System.out.println(list.get(2));
        list.print();
        list.remove(2);
        list.print();
    }
}