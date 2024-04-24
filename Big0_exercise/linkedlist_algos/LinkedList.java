
class LinkedList{
    private Node head; //This is null at this moment
    private Node tail; //This is null at this moment
    private int size = 0;
    
    private boolean isLinkedListEmpty(){
        if(this.head == null) return true;
        else return false;
    }

    public void addElementAtEnd(String data){
        Node node = new Node(data); // Initialize the node to be added
        if(isLinkedListEmpty()){
            //this.tail = node;
            //this.head = this.tail;
            //this.head.setNext(this.tail);
            this.head = this.tail = node;
        }
        else{
            this.tail.setNext(node);
            this.tail = node;
        }
        this.size+=1;
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
        this.size+=1;
    }

    public Node find(String data){
        Node foundNode = null;
        if(!isLinkedListEmpty()){
            if(this.head.getData()==data){
                return this.head;
            }else if(this.tail.getData()==data){
                return this.tail;
            }else{
                Node runner = this.head; //Initialize the temp node with this.head
                while(runner != null){
                    if(runner.getData()==data){
                        foundNode = runner;
                        break;
                    }
                    runner = runner.getNext();
                } 
            }
        }
        return foundNode;
    }

    public void insert(String data, String dataBefore){
        Node currNode = new Node(data);
        Node nodeBefore = find(dataBefore);
        if(nodeBefore!=null){
            currNode.setNext(nodeBefore.getNext());
            nodeBefore.setNext(currNode);
        }else{System.out.println("Enter the correct node");}
        this.size+=1;
    }

    public boolean delete(String data){
        boolean result = false;
        if(!isLinkedListEmpty()){
            if(this.head.getData()==data){
                this.head = this.head.getNext();
            }else{
                Node runner = this.head;
                while(runner.getNext() != null){
                    if(runner.getNext().getData()==data){
                        runner.setNext(runner.getNext().getNext());
                        result = true;
                        break;
                    }
                    runner = runner.getNext();
                }
            }
        }
        size-=1;
        return result;
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
        System.out.println("Size of LinkedList is: "+ this.size);
    }
}

class Node{
    private String data; private Node next;
    
    public Node(String data) {this.data = data; this.next = null;}
        
    public void setNext(Node next) {this.next = next;}

    public Node getNext() {return this.next;}

    public String getData() {return this.data;}

    @Override
    public String toString(){
        return "Data: "+this.data+" Next node is: "+this.next;
    }
}
