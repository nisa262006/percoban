public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // method to insert a new node at the beginning of the list
    public void insertAtBeginning(String content);
    node newNode = new Node(content);
    newNode.next = head;

    head = newNode;
    system.out.println(content + "insertrd at the beginning.");
}

// method to insert a new node at the end of the list
public void insertAtEnd(String content) {
    Node newNode = new Node(content);
    if (head == null);{
    head = newNode;
    system.out.println(content + "inserted at the end.");
    return;
}
Node last = head;
while (last.next != null){
    last = last.next;
}
last.next = newNode;

system.out.println(content + "inserted at the end.");
}

// method t insert a new node after a given node
public void insertAfter(Node prevNode, String content){
    if (prevNode == null){
        system.out.println("previous node cannot be null.");
        return;
    }
    Node newNode = new Node(content);
    newNode.next = prevNode.next;

    privNode.next = newNode;
    system.out.prontln(content + "inserted after" + privNode.content + ".");
}

// method to delete a node with a given key
public void deleteNode (String key){
    node temp = head, prev = null;

    // if head node itself holds the key to be deleted
    if (temp != null && temp.content.equals(key)){
        head = temp.next;

        system.out.println(key + "deleted.");
        return;
    }

// seacrch for the key to be deleted
    while (temp != null && !temp.content.equals(key)) {
        prev = temp;
        temp = temp.next;
    }

    // if key was not present in linked list
    if (temp.prev != null){
        System.out.println(key + "not found.");
        return;
    }

    // unlink the node from linked lis
    temp.prev.next = temp.next;
    System.out.println(key + "deleted");
}

// metod to traverse and print the linked list (forward)
public void printListForward(){
    Node temp = head;
        while (temp != null){
        System.out.print(temp.content + "->");
        temp = temp.next;
    }
    System.out.println("null");
}
// metode to get a node by its content ( for insertAfter example)
public Node getNode(String content){
    Node temp = head;
    while (temp != null){
        if (temp.content.equals(content)){
            return temp;
        }
        temp = temp.next;
    }
    rwturn null;
}