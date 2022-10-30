import java.util.Scanner;
import java.util.Stack;

public class CauDung {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();
    scanner.nextLine();
    while (t-- > 0) {
      String s = scanner.nextLine();

      System.out.println(check(s) ? "YES" : "NO");
    }
  }

  private static boolean check(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (c == ')') {
          if (stack.isEmpty() || stack.peek() != '(') {
            return false;
          } else {
            stack.pop();
          }
        } else if (c == ']') {
          if (stack.isEmpty() || stack.peek() != '[') {
            return false;
          } else {
            stack.pop();
          }
        } else if (c == '}') {
          if (stack.isEmpty() || stack.peek() != '{') {
            return false;
          } else {
            stack.pop();
          }
        }
      }
    }
    return stack.isEmpty();
  }
}
