import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DsCanhPair {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int nV = scanner.nextInt();
    List<Pair<Integer, Integer>> dsCanh = new LinkedList<>();
    for (int i=1; i<=nV; i++) {
      for (int j=1; j<=nV; j++) {
        int c = scanner.nextInt();
        if (i<j && c == 1) {
          dsCanh.add(new Pair<>(i, j));
        }
      }
    }

    dsCanh.forEach(System.out::println);

  }

  private static class Pair<T, V> {
    private T first;
    private V second;

    public Pair(T first, V second) {
      this.first = first;
      this.second = second;
    }

    public T getFirst() {
      return first;
    }

    public void setFirst(T first) {
      this.first = first;
    }

    public V getSecond() {
      return second;
    }

    public void setSecond(V second) {
      this.second = second;
    }

    @Override
    public String toString() {
      return String.format("(%s,%s)", first.toString(), second.toString());
    }
  }
}
