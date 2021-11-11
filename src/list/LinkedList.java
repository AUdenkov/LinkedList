package list;

public class LinkedList {
    private Node head;
    private int size = 0;

    public LinkedList() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(Object data) {
        if (head == null) {
            Node node = new Node(data);
            head = node;
            size++;
            node.setIndex(size);
        } else {
            boolean cheak = true;
            Node temp = head;
            while (cheak) {
                if (temp.getNext() == null) {
                    cheak = false;
                    break;
                }
                temp = temp.getNext();
            }
            Node node = new Node(data);
            temp.setNext(node);
            node.setPrev(temp);
            size++;
            node.setIndex(size);
        }
    }

    public void oneNode(Object object) {
        if (head == null) {
            Node node = new Node(object);
            head = node;
            size++;
            node.setIndex(size);
        } else {
            Node node = new Node(object);
            Node temp = head;
            node.setNext(temp);
            temp.setPrev(node);
            head = node;
            size++;
            node.setIndex(size);
        }
    }

    public void setElement(Object object) {
        if (head == null) {
            System.out.println("Not element");
        } else {
            Node node = head;
            Node found = new Node(object);
            boolean cheak = true;
            while (cheak) {
                if (node.getObject() == found.getObject()) {
                    System.out.println("Yes");
                    break;
                }
                if (node.getNext() == null) {
                    System.out.println("No");
                    break;
                }
                node = node.getNext();
            }
        }
    }

    public void remove(Object object) {
        if (head == null) {
            System.out.println("Not element");
        } else {
            Node node = head;
            Node temp = new Node(object);
            while (node != null) {
                if (node.getObject() == temp.getObject()) {
                    System.out.println("a");
                    break;
                }
                node = node.getNext();
            }
//            Node tempPrev=node.getPrev();
//            Node tempNext=node.getNext();
//            tempPrev.setPrev(tempNext);
//            tempNext.setPrev(tempPrev);
        }
        size--;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getObject());
            node = node.getNext();
        }
    }
}
