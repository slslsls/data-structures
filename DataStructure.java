interface DataStructure {

  public Node root = new Node();

  public Node find(int i);

  public void insertAfterNthNode(Node newNode, int n);

  public void delete(Node node);

  public void print();

}
