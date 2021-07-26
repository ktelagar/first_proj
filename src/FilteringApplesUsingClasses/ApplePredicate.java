package FilteringApplesUsingClasses;

@FunctionalInterface
public interface ApplePredicate {

  boolean test(Apple apple);
}
