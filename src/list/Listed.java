package list;

public class Listed {
    private LinkedList head;
    private LinkedList start;
    private int size = 0;

    public Listed() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        LinkedList temp = new LinkedList(data);
        head.next = temp;
        temp.next = null;
        temp.prev = head;
        head = temp;
        System.out.println(temp.prev);
        System.out.println(head);
        System.out.println(temp.next);
        
        size++;
    }

    public void print() {
        LinkedList temp = head;
        while (temp != null) {
            System.out.println(temp.date);
            temp = temp.prev;
        }
    }
}
