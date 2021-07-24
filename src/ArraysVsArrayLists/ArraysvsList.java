package ArraysVsArrayLists;

import java.util.Arrays;
import java.util.List;

public class ArraysvsList {

  public static void main(String args[]) {

    String[] array = {"gerbil","mouse"};
    List<String> list = Arrays.asList(array); // now array is converted to list..we can use all list methods except resizable feature.
    //list.remove(0); --> throws unsupported exception as it resizes the backed array.
    //list.add("expand");--> throws unsupported exception
    list.set(1, "George");

    // when ever we change an array to a list or a list to an array, we cannot resize!!

    array[0] = "Andrew";
    //converting list to an array.
    System.out.println(list); // list prints the underlined backed array. hence first ele in list will be Andrew.

    String[] array2 = (String[]) list.toArray();
    list.remove(0);// list is converted to an array. therefore remove opr on list resizes the array..and hence no opr supp exception

  }

}
