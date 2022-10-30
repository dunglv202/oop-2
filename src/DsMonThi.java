import java.io.File;
import java.util.*;

public class DsMonThi {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(new File("MONHOC.in"));


    Map<String, MonThi> dsMonThi = new HashMap();
    while (scanner.hasNextLine()) {
      MonThi monThi = new MonThi(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
      if (!dsMonThi.containsKey(monThi.getMa())) {
        dsMonThi.put(monThi.getMa(), monThi);
      }
    }

    dsMonThi.values().stream().sorted().forEach(System.out::println);
  }

  private static class MonThi implements Comparable<MonThi> {
    private String ma;
    private String ten;
    private String hinhThuc;

    public String getMa() {
      return ma;
    }

    public MonThi(String ma, String ten, String hinhThuc) {
      this.ma = ma;
      this.ten = ten;
      this.hinhThuc = hinhThuc;
    }

    @Override
    public String toString() {
      return String.format("%s %s %s", ma, ten, hinhThuc);
    }

    @Override
    public int compareTo(MonThi o) {
      return this.ma.compareTo(o.ma);
    }
  }
}
