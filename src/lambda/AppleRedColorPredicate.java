package lambda;

public class AppleRedColorPredicate implements ApplePredicate{


  @Override
  public boolean test(Apple apple) {
    return apple.getColor().equals("red");
  }
}
