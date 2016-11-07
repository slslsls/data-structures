class LinearNode extends Node {

  public int data;

  public LinearNode next;

  public LinearNode() {}

  public LinearNode(int data, LinearNode next) {
    this.data = data;
    this.next = next;
  }

  public LinearNode(LinearNode next) {
    this.data = 5000;
    this.next = next;
  }

  public LinearNode(int data) {
    this.data = data;
    this.next = null;
  }

}
