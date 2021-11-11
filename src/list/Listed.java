package list;

public class Listed {
    private LinkedList head;
    private LinkedList treem;
    private LinkedList treems;
    private int size = 0;

    public Listed() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        LinkedList temp = new LinkedList(data);
        if (size > 0) {
            treem = head;
            treem.next = temp;
            head.next = treem.next;
        }
        temp.next = null;
        temp.prev = head;
        head = temp;
        System.out.println(temp.prev);
        System.out.println(head);
        System.out.println(temp.next);
        size++;
    }

    public void remove(int data) {
        LinkedList next = head;
        LinkedList prev=head;
        while (next.date != data) {
            if(next.date==data){
            }
        }
    }

    public void print() {
        LinkedList temp = head;
        while (temp != null) {
            System.out.println(temp.date);
            temp = temp.prev;
        }
    }
}
