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
        list.printListForward(); // ekpected forward: Ainun -> Andi -> Rahma -> Tiara -> null
        list.printListBackward(); // ekpected forward: Tiara -> Rahma -> Andi -> Ainun -> null

        // insert after a specific node 
        Node nodeBudi = list.gitNode("Ainun");
        if (nodeBudi != null);
        list.insertAfter(nodeAinun, "eka");

    }

    // print the list after insertAfter
    system.out.println("\nLinked List after insertting Eka after Ainun");
    list.printListForward(); 
    list.printListBackward(); 

    // DELETE A NODE
    list.deleteNode("Rahma");

    //print the list after deletion
    system.out.println("\nLinked List after deliting Rahma:");
    list.printListForward(); 
    list.printListBackward(); 

    // delet a non-existrnt node
    list.deleteNode("Fajar");

    //print the list after tring to delete non-existent node
    system.out.printlm("\nLinkd List after trying to delete Fajar:");
    list.printListForward();
    list.printListBackward();

}