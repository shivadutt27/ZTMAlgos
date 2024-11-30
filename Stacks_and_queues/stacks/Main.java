public class Main {
    public static void main(String[] args){
        Stack stack1 = new Stack();
        stack1.push("facebook");
        stack1.push("google");
        stack1.push("discord");
        stack1.push("Instagram");
        stack1.pop();
        //stack1.pop();
        stack1.peek();
        System.out.println("Top node is: "+stack1.getTop());
        System.out.println("Bottom Node is: "+stack1.getBottom());
        System.out.println(stack1.getLength());
    }
}
