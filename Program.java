import java.util.Date;

class Program {

  public static void main(String[] args) {

    LinkedList myList = new LinkedList(20);

    myList.print();

    LinkedListNode toDelete = myList.find(8);

    myList.delete(toDelete);

    LinkedListNode reNode = new LinkedListNode(398729873);

    myList.insertAfterNthNode(reNode, 1);

    myList.print();

  }
}
