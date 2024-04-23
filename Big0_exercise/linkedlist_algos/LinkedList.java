
import java.lang.StringBuilder;
class LinkedList{
    private Node head; //This is null at this moment
    private Node tail; //This is null at this moment

    private boolean isLinkedListEmpty(){
        if(this.head == null) return true;
        else return false;
    }

    public void addElementAtEnd(String data){
        Node node = new Node(data); // Initialize the node to be added
        if(isLinkedListEmpty()){
            this.tail = node;
            this.head = this.tail;
            this.head.setNext(this.tail);
        }
        else{
            this.tail.setNext(node);
            this.tail = node;
        }
        //System.out.println(this.head.getData());
        //System.out.println(this.tail.getData());
    }

    public void addElementAtStart(String data){
        Node newNode = new Node(data);
        if(!isLinkedListEmpty()){
            newNode.setNext(this.head);
            this.head = newNode; 
        }
        else{
            this.head = newNode;
            this.head.setNext(this.tail);
            
        }
    }

    public void display(){
        Node runner = this.head;
        if(!isLinkedListEmpty()){
            while(runner != null){
                System.out.println(runner.getData());
                runner = runner.getNext();
            }
        }
        else{
            System.out.println("List is empty");
        }
    }
}

class Node{
    private String data;
    private Node next;

    public Node(String data){
        this.data = data;
        this.next = null;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public String getData(){
        return this.data;
    }

}
