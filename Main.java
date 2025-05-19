public class Main{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
haloo
        //insert element
        list.insertAtEnd("Dewa");
        list.insertAtBeginning("Michael");
        list.insertAtEnd("Miftah");
        list.insertAtEnd("ICANNN");

        // print the list
        System.out.println("Linked List jika datanya sudah dimasukkan");
        list.printList(); // semoga : Michael > Dewa > Miftah > Icannn > null
        
        // insert after a specific node
        Node nodeDewa = list.getNode("Dewa");
        if (nodeDewa != null) {
            list.insertAfter(nodeDewa, "tipp");
        }

        // print the list after insertAfter
        System.out.println("\nLinked List after inserting tipp after Dewa:");
        list.printList();

        // delete a node
        list.deleteNode("Miftah");

        // print the list after deletion
        System.out.println("\nLinked List after deleting Miftah:");
        list.printList(); // semoga : Michael > Dewa > tipp > Icannn > null

        // delete a non-existent node
        list.deleteNode("Garry");

        // print the list after trying to delete non-existent node
        System.out.println("\nlinked List after trying to delete Garry:");
        list.printList(); // semoga : Michael > dewa > tipp > icannn
    }
}