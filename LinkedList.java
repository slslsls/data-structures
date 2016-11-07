class LinkedList implements DataStructure {

  public LinearNode root;

  public LinkedList() {}

  public LinkedList(int length) {
    this.root = new LinearNode();
    LinearNode current = this.root;
    for (int i = 1; i < length; i++) {
      LinearNode newNode = new LinearNode(i);
      current.next = newNode;
      current = newNode;
    }
  }

  public LinearNode find(int i) {
    LinearNode current = this.root;
    while (current != null) {
      if (current.data == i) {
        return current;
      } else {
        current = current.next;
      }
    }
    return null;
  }

  public void insertAfterNthNode(int n, Node node) {
    LinearNode newNode = (LinearNode)node;
    LinearNode current = this.root;
    for (int i = 1; i <= n; i++) {
      current = current.next;
    }
    newNode.next = current.next;
    current.next = newNode;
  }

  public void delete(Node node) {
    LinearNode newNode = (LinearNode)node;
    LinearNode current = this.root;
    while (current.next != newNode) {
      current = current.next;
    }
    current.next = newNode.next;
  }

  public void print() {
    LinearNode current = this.root;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

}
