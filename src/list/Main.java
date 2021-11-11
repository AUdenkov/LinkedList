package list;
import java.awt.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Listed listed=new Listed();
        listed.add(201);
        listed.add(30);
        listed.add(25);
        listed.print();
        List list=new List();
        list.add("S");
        list.add("bz");
        System.out.println(list);
        listed.remove(20);
        listed.print();
    }
}
