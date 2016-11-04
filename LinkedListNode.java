class LinkedListNode extends Node {

  public int data;

  public LinkedListNode next;

  public LinkedListNode() {}

  public LinkedListNode(int data, LinkedListNode next) {
    this.data = data;
    this.next = next;
  }

  public LinkedListNode(LinkedListNode next) {
    this.data = 5000;
    this.next = next;
  }

  public LinkedListNode(int data) {
    this.data = data;
    this.next = null;
  }

}
