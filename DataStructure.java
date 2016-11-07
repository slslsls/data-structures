interface DataStructure {

  public Node root = new Node();

  public Node find(int i);

  public void insertAfterNthNode(int n, Node newNode);

  public void delete(Node node);

  public void print();

}
