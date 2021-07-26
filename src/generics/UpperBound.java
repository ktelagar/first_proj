/*
package generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {

  static class Bird{}
  static class Sparrow extends Bird{}

  public static void main(String[] args) {
    List<? extends Bird> birds = new ArrayList<>();
    birds.add(new Sparrow()); // java doesnt know what type List<? extends Bird> really is.(i.e., java
    //doesnt know what kind of List is birds variable?? )It could be a list<Bird> or list<Sparrow> or someother generic type that hasnt
    //been written yet. from java's point of view both scenarios are equally possible. so neighter is allowed. so compile error.
    birds.add(new Bird());

    //But this works!!
    List<? extends Number> l1 = new ArrayList<Integer>();
    l1.add(10); //fails as upper bound wildcarts are immutable..we can do all operations other than adding.
    l1.remove(10); //works
    List<? extends Number> l2 = new ArrayList<Double>();

    //downcasting must be done!!
    List<? extends Double> l3 = new ArrayList<Number>();
  }
}
*/
