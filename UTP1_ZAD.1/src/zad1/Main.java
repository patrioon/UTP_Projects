/**
 *
 *  @author Stanczewski Patryk S22901
 *
 */

package zad1;



import java.util.*;

public class Main {
  public Main() {
    List<Integer> src1 = Arrays.asList(1, 7, 9, 11, 12);/*<-- tu dopisać inicjację elementów listy */
    System.out.println(test1(src1));

    List<String> src2 = Arrays.asList("a", "zzzz", "vvvvvvv");/*<-- tu dopisać inicjację elementów listy */
    System.out.println(test2(src2));
  }

  public List<Integer> test1(List<Integer> src) {
    Selector <Integer>sel = new Selector<Integer>() {
      @Override
      public boolean select(Integer element) {
        return element.intValue() < 10;
      }

    };  /*<-- definicja selektora; bez lambda-wyrażeń; nazwa zmiennej sel */

    Mapper <Integer, Integer> map = new Mapper<Integer, Integer>() {
      @Override
      public Integer map(Integer element) {
        return element+10;
      }

    };/*<-- definicja mappera; bez lambda-wyrażeń; nazwa zmiennej map */
    return   /*<-- zwrot wyniku
      uzyskanego przez wywołanie statycznej metody klasy ListCreator:
     */  ListCreator.collectFrom(src).when(sel).mapEvery(map);
  }

  public List<Integer> test2(List<String> src) {
    Selector <String>sel = new Selector<String>() {
      int maxDlugosc=3;

      @Override
      public boolean select(String element) {
        return  element.length() >=maxDlugosc;
      }


    };/*<-- definicja selektora; bez lambda-wyrażeń; nazwa zmiennej sel */
    Mapper <String,Double>map = new Mapper<String, Double>() {
      @Override
      public Double map(String element) {
        return Double.valueOf( element.length() +10);
      }

    }; /*<-- definicja mappera; bez lambda-wyrażeń; nazwa zmiennej map */
    return   /*<-- zwrot wyniku
      uzyskanego przez wywołanie statycznej metody klasy ListCreator:*/
            ListCreator.collectFrom(src).when(sel).mapEvery(map);
  }

  public static void main(String[] args) {
    new Main();
  }
}
