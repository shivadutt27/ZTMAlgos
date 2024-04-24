class Tester{
    public static void main(String... args){
        LinkedList ll = new LinkedList();
        ll.addElementAtEnd("Milan");
        ll.addElementAtEnd("Venice");
        ll.addElementAtEnd("Munich");
        ll.addElementAtEnd("Vienna");
        ll.addElementAtStart("Monaco");
        ll.delete("Vienna");
        ll.delete("Munich");

        //ll.insert("Prague","Monaco");
        ll.display();
        

        //Node foundNode = ll.find("Vienna");
        //System.out.println(foundNode);


        
    }
}