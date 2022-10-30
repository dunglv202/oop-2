import java.util.*;

public class NguyenThuy {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();
    while (t-- > 0) {
      solve(scanner.nextInt());
      System.out.println();
    }
  }

  private static void solve(int n) {
    Queue<String> q = new LinkedList<>();

    q.add("4");
    q.add("5");
    int found = 0;
    while (found < n) {
      String s = q.peek();
      System.out.print(s + new StringBuilder(s).reverse() + " ");
      found++;

      q.add(s + "4");
      q.add(s + "5");
      q.poll();
    }
  }
}