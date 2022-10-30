import java.io.File;
import java.util.*;

public class Email {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(new File("DANHSACH.in"));

    Map<String, Integer> l = new HashMap<>();
    while (scanner.hasNextLine()) {
      String s = chuanHoa(scanner.nextLine());

      Integer c = l.getOrDefault(s, 0);
      l.put(s, ++c);

      if (c == 1) {
        System.out.println(s + "@ptit.edu.vn");
      } else {
        System.out.println(s + c + "@ptit.edu.vn");
      }
    }
  }

  private static String chuanHoa(String s) {
    StringTokenizer tokenizer = new StringTokenizer(s.toLowerCase());

    String result = "";
    while (tokenizer.hasMoreTokens()) {
      String next = tokenizer.nextToken();
      if (tokenizer.hasMoreTokens()) {
        result += next.charAt(0);
      } else {
        result = next + result;
      }
    }

    return result;
  }
}
