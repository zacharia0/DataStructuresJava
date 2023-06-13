package LinkedList;

public class LinkedList {
    CreateNode head;
    CreateNode tail;
    int length;

    public LinkedList(String value ) {
        CreateNode nodeNew = new CreateNode(value);
        head = nodeNew;
        tail = nodeNew;
        length = 1;
    }

    public void displayLinkedList(){
        CreateNode temp = head;
        while(temp != null){
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead(){
        System.out.println("Head:-> " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: -> " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void append(String value){
        CreateNode newNode = new CreateNode(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        length += 1;
    }

//    public CreateNode removeLastItem(){
//        CreateNode temp = head;
//        CreateNode pre = head;
//        if(length == 0){
//            return null;
//        }
//        if(length == 1){
//            head = null;
//            tail = null;
//            return temp;
//
//        }
//
//
//        while(temp.next != null){
//            pre = temp;
//            temp = temp.next;
//        }
//
//        tail = pre;
//        tail.next = null;
//        length--;
//        if(length == 0){
//            head = null;
//            tail = null;
//        }
//
//        return temp;
//    }

//    A ->B ->c ->d ->e ->
    public CreateNode removeLastNode(){
        CreateNode temp = head;
        CreateNode pre = head;
        if(length == 0){
            return null;
        }else{
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if(length == 0){
                head = null;
                tail = null;
            }
            return temp;
        }

    }

}
