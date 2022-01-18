import java.util.Scanner;
import java.util.StringTokenizer;

public class bai5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] sa = s.split("\\W{3}");
//        for (String w : sa){
//            System.out.println(w);
//        }
        System.out.println(sa[2] + "..." + sa[0] + "..." + sa[1]);
    }
}
