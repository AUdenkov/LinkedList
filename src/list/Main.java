package list;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList =new LinkedList();
        linkedList.add(201);
        linkedList.add(30);
        linkedList.add(25);
        int siz=linkedList.getSize();
        System.out.println(siz);
        linkedList.oneNode(255);
        linkedList.print();
        linkedList.setElement(201);
        linkedList.remove(201);
        linkedList.print();

//        List list=new List();
//        list.add("S");
//        list.add("bz");
//        System.out.println(list);
//        listed.remove(20);
//        listed.print();
    }
}
