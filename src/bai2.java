import java.util.Locale;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(s.substring(0, 1).toUpperCase(Locale.ROOT));
        for(int i = 1; i < s.length() - 1; i++){
            if(i % 2 == 0) System.out.print(s.substring(i,i + 1).toUpperCase(Locale.ROOT));
            else System.out.print(s.substring(i, i + 1).toLowerCase(Locale.ROOT));
        }
    }
}
