package list;

public class LinkedList {
    public int date;
    public LinkedList next;
    public LinkedList prev;

    public LinkedList(int date){
        this.date=date;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "date=" + date +
                '}';
    }
}
