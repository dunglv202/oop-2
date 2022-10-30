import java.util.*;

public class XepTheoThuTu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();
    while (t-- > 0) {
      int n = scanner.nextInt();

      List<Integer> a = new ArrayList<>();
      for (int i=0; i<n; i++) {
        a.add(scanner.nextInt());
      }

      Map<Integer, Integer> freq = new HashMap<>();
      Map<Integer, Integer> idx = new HashMap<>();
      for (int i=0; i<a.size(); i++) {
        int curFreq = freq.getOrDefault(a.get(i), 0);
        freq.put(a.get(i), curFreq+1);

        if (!idx.containsKey(a.get(i))) {
          idx.put(a.get(i), i);
        }
      }

      a.stream().sorted(Comparator.comparing(freq::get).reversed().thenComparing(idx::get)).forEach(v -> System.out.print(v + " "));
      System.out.println();
    }
  }
}
