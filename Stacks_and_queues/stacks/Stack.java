class Stack{

    class Node{
        private String value;
        private Node next;

        public Node(String value){
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString(){
            return value+" --> "+next;
        }
    }

    private Node top;
    private Node bottom;
    private int length;

    public Stack(){
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public int getLength(){
        return length;
    }

    public Node getTop(){
        return this.top;
    }

    public Node getBottom(){
        return this.bottom;
    }

    public void push(String data){
        Node newNode = new Node(data);
        Node runner;
        if(top==null && bottom==null){
            bottom = newNode;
            top = newNode;
        }else{
            runner = newNode;
            top.next = runner;
            top = top.next;
            runner= null;
        }
        length++;
    }

    public void pop(){
        if(length != 0){
            Node runner = bottom;
            while(runner.next != top){
                runner = runner.next;
            }
            top = runner;
            top.next = null;
            runner = top.next;
            length--;
        }
    }

    public void peek(){
        System.out.println(top);
    }
}