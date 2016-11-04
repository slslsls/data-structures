class LinkedList implements DataStructure {

  public LinkedListNode root;

  public LinkedList() {}

  public LinkedList(int length) {
    this.root = new LinkedListNode();
    LinkedListNode current = this.root;
    for (int i = 1; i < length; i++) {
      LinkedListNode newNode = new LinkedListNode(i);
      current.next = newNode;
      current = newNode;
    }
  }

  public LinkedListNode find(int i) {
    LinkedListNode current = this.root;
    while (current != null) {
      if (current.data == i) {
        return current;
      } else {
        current = current.next;
      }
    }
    return null;
  }

  public void insertAfterNthNode(Node node, int n) {
    LinkedListNode newNode = (LinkedListNode)node;
    LinkedListNode current = this.root;
    for (int i = 1; i <= n; i++) {
      current = current.next;
    }
    newNode.next = current.next;
    current.next = newNode;
  }

  public void delete(Node node) {
    LinkedListNode newNode = (LinkedListNode)node;
    LinkedListNode current = this.root;
    while (current.next != newNode) {
      current = current.next;
    }
    current.next = newNode.next;
  }

  public void print() {
    LinkedListNode current = this.root;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

}
