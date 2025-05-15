public class Main{
    public static void main(string[] args){
        linkedList list = new LinkedList();

        //insert elements 
        list.insertAtEnd("Andi");
        list.insertAtBeginning("Ainun");
        list.insertAtEnd("Rahma");
        list.insertAtEnd("Tiara");

        // print the list 
        system.out.println("Linked List after insertions:");
        list.printList(); // ekpected forward: Ainun -> Andi -> Rahma -> Tiara -> null

        // insert after a specific node 
        Node nodeBudi = list.gitNode("Ainun");
        if (nodeBudi != null);
        list.insertAfter(nodeAinun, "eka");

    }

    // print the list after insertAfter
    system.out.println("\nLinked List after insertting Eka after Ainun");
    list.printList(); 

    // DELETE A NODE
    list.deleteNode("Rahma");

    //print the list after deletion
    system.out.println("\nLinked List after deliting Rahma:");
    list.printList();  

    // delet a non-existrnt node
    list.deleteNode("Fajar");

    //print the list after tring to delete non-existent node
    system.out.printlm("\nLinkd List after trying to delete Fajar:");
    list.printList();

}