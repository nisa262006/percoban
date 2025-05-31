public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        // Insert element
        list.insertAtEnd("Ainun");
        list.insertAtBeginning("Rahma");
        list.insertAtEnd("Tiara");
        list.insertAtEnd("Amanda");

        // Print the list
        System.out.println("Linked List after insertions:");
        list.printList(); 
        // Insert after a spesific node
        Node nodeBudi = list.getNode("Budi");
        if (nodeBudi != null) {
            list.insertAfter(nodeBudi, "Eka");
        }

        // Print the list after insertAfter
        System.out.println("\nLinked List after inserting Eka after Budi:");
        list.printList(); 

        // Delete a node
        list.deleteNode("Citra");

        // Print the list after detetion
        System.out.println("\nLinked List after deleting Citra:");
        list.printList(); 

        // Deleting a non-existent node
        list.deleteNode("Fajar");

        // Print the list after trying to delete non-existent node
        System.out.println("\nLinked List after trying yo deletie Fajar:");
        list.printList(); 
    }
}        