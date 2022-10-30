import java.util.Scanner;
import java.util.Stack;

public class HauTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();
    scanner.nextLine();
    while (t-- > 0) {
      scanner.nextLine();
      System.out.format("%.0f\n", calc(scanner.nextLine()));
    }
  }

  private static Double calc(String s) {
    Scanner scanner = new Scanner(s);

    Stack<Double> stack = new Stack<>();
    while (scanner.hasNext()) {
      if (scanner.hasNextDouble()) {
        stack.push(scanner.nextDouble());
      } else {
        String operator = scanner.next();
        switch (operator) {
          case "+":
            stack.push(stack.pop() + stack.pop());
            break;
          case "–":
          case "-":
            stack.push(- stack.pop() + stack.pop());
            break;
          case "*":
            stack.push(stack.pop() * stack.pop());
            break;
          case "/":
            stack.push(1.0 / stack.pop() * stack.pop());
            break;
          default:
            throw new RuntimeException("Unsupported Operator");
        }
      }

//      System.out.println(stack);
    }

    return stack.peek();
  }
}
