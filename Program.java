import java.util.Date;

class Program {

  public static void main(String[] args) {

    LinkedList myList = new LinkedList();
    myList.root = new LinkedListNode();
    LinkedListNode current = myList.root;

    for (int i = 1; i <= 20; i++) {
      LinkedListNode newNode = new LinkedListNode(i);
      current.next = newNode;
      current = newNode;
    }

    current = myList.root;

    myList.print();

    LinkedListNode toDelete = myList.find(8);
    myList.delete(toDelete);

    myList.print();

  }
}
