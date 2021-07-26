package FilteringApplesUsingClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplesFilterMain1 {

  public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
    List<Apple> result = new ArrayList<>();
    for(Apple apple: inventory){
      if(p.test(apple))
        result.add(apple);
    }
    return result;
  }

  public static void main(String[] args) {
    List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                                          new Apple(155,"green"),
                                          new Apple(120,"red"));


    List<Apple> heavyApples = filterApples(inventory,new AppleHeavyWeightPredicate());
    List<Apple> redApples = filterApples(inventory,new AppleRedColorPredicate());
    List<Apple> greenApples = filterApples(inventory,new AppleGreenColorPredicate());
    System.out.println("Heavy Apples : "+heavyApples);
    System.out.println("Red Apples : "+redApples);
    System.out.println("Green Apples : "+greenApples);

    //now if I want GreenApples that are Heavy - I need to write a class implementing predicate.
    /*we can solve this problem by using Anonymous inner classes..
    but the prob with aic is verbosity and confusion among many programmers.
    The BEST SOLUTION IS LAMDAS
*/



  }
}
