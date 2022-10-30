import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class Email {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(new File("DANHSACH.in"));

    Set<String> dsTen = new HashSet<>();
    Map<String, Integer> emails = new HashMap<>();

    while (scanner.hasNextLine()) {
      String ten = chuanHoaTen(scanner.nextLine());
//      System.out.println(ten + " => " + dsTen.contains(ten));

      if (!dsTen.contains(ten)) {
        dsTen.add(ten);

        String prefix = rutGonTen(ten);
        Integer suffix = emails.getOrDefault(prefix, 0);

        emails.put(prefix, ++suffix);

        if (suffix == 1) {
          System.out.println(prefix + "@ptit.edu.vn");
        } else {
          System.out.println(prefix + suffix + "@ptit.edu.vn");
        }
      }
    }
  }

  private static String chuanHoaTen(String s) {
    return Arrays.stream(s.trim().toLowerCase().split("\\s+")).collect(Collectors.joining(" "));
  }

  private static String rutGonTen(String s) {
    String[] p = s.split(" ");

    String result = "";
    result += p[p.length-1];
    for (int i=0; i<p.length-1; i++) {
      result += p[i].charAt(0);
    }

    return result;
  }
}
