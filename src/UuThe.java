import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;

public class UuThe {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    while (t-- > 0) {
      solve(scanner.nextInt());
      System.out.println();
    }
  }

  private static void solve(int n) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1); queue.add(2);

    int found = 0;
    while (found < n) {
      Integer cur = queue.peek();

//      System.out.println(queue);

      if (check(cur.toString())) {
        System.out.print(cur + " ");
        found++;
      }

      queue.add(cur*10);
      queue.add(cur*10 + 1);
      queue.add(cur*10 + 2);

      queue.poll();
    }
  }

  private static boolean check(String s) {
    int count = 0;
    for (char c : s.toCharArray()) {
      if (c == '2') {
        count ++;
      }
    }

    return count > s.length()-count;
  }
}
