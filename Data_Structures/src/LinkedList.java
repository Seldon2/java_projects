public class LinkedList implements List {
    public Node head;

    @Override
    public void add(int num) {
        Node newNode = new Node();
        newNode.data = num;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    @Override
    public int get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return(temp.data);
    }


    @Override
    public void remove(int index) {
        if(index == 0){
            head = head.next;
            return;
        }else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    @Override
    public void print() {
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public LinkedList(){

    }
}
