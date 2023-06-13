package LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList linked = new LinkedList("A");



        linked.append("B");
        linked.append("c");
        linked.append("d");
        linked.append("e");
        linked.displayLinkedList();


//        linked.getHead();
//        linked.getTail();
//        linked.getLength();
        linked.removeLastNode();
        linked.displayLinkedList();
//        CreateNode links =  linked.removeLastItem();

//        System.out.println(linked.removeLastItem());


    }

}
