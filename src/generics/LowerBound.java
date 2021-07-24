package generics;

import generics.UpperBound.Bird;
import java.util.ArrayList;
import java.util.List;

public class LowerBound {

  static class Bird{}
  static class Sparrow extends Bird {}

  public static void main(String[] args) {

    List<? super Sparrow> birds = new ArrayList<>();
    birds.add(new Sparrow());
    birds.add(new Bird());
    birds.add(new Object());



  }
}
