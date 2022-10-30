import java.util.Scanner;
import java.util.Stack;

public class ThuTuNgoac {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    scanner.nextLine();

    while (t-- > 0) {
      solve(scanner.nextLine());
      System.out.println();
    }
  }

  private static void solve(String s) {
    Stack<Integer> stack = new Stack<>();
    int count = 0;
    for (char c : s.toCharArray()) {
      if (c == '(') {
        System.out.print(++count + " ");
        stack.push(count);
      } else if (c == ')') {
        System.out.print(stack.peek() + " ");
        stack.pop();
      }
    }
  }
}
