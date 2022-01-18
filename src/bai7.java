import java.util.Locale;
import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        String s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập xâu s1: ");
        s1 = in.nextLine();
        System.out.println("Nhập xâu s2: ");
        s2 = in.nextLine();
        s1.toLowerCase(Locale.ROOT);
        s2.toLowerCase(Locale.ROOT);
        while (s1.contains(s2)) {
            s1 = s1.replace(s2, "");
            s1 = s1.trim().replaceAll("\\s+", " ");
        }
        System.out.println(s1);
    }
}
