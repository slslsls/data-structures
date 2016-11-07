import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Program {

  public static void main(String[] args) {

    LinkedList myLL = new LinkedList(10);
    List<Integer> myList = new ArrayList<Integer>(Arrays.asList(19, 3, 92, 38));

    LinearNode newNode = new LinearNode(18243765);

    myLL.insertAfterNthNode(5, newNode);

    System.out.println(myList);

    myList.add(3, 10000);

    System.out.println(myList);

    // for (int i = 0; i < myArray.size; )

    // myList.print();
    //
    // LinearNode toDelete = myList.find(8);
    //
    // myList.delete(toDelete);
    //
    // LinearNode reNode = new LinearNode(398729873);
    //
    // myList.insertAfterNthNode(reNode, 1);
    //
    // myList.print();

  }
}
