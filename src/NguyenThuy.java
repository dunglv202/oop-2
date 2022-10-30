import java.util.*;

public class NguyenThuy {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();

    // init
    List<String> l = solve(10000);

    while (t-- > 0) {
      int n = scanner.nextInt();
      Iterator<String> iterator = l.stream().iterator();
      for (int i=0; i<n; i++) {
        System.out.print(iterator.next() + " ");
      }
    }
  }

  private static List<String> solve(int n) {
    List<String> result = new LinkedList<>();
    Queue<String> q = new LinkedList<>();

    q.add("");
    int found = 0;
    while (found < n) {
      String cur = q.peek();

      if (check(cur)) {
        result.add(cur);
        found++;
      }

      q.add(cur + "4");
      q.add(cur + "5");

      q.poll();
    }

    return result;
  }

  private static boolean check(String n) {
    return n.length()%2 == 0 && isSymmetric(n);
  }

  private static boolean isSymmetric(String s) {
    String rs = new StringBuilder(s).reverse().toString();
    return rs.equals(s);
  }
}
