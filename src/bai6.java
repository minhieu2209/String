import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while(!checkString(s) || !checkWord(s)){
            System.out.println("Sai định dạng câu, nhập lại");
            s = in.nextLine();
        }
        abc(s);
    }

    private static void abc(String s) {
        String[] sa = s.split(" ");
        for (int i = 0; i < sa.length - 1; i++) {
            for (int j = i + 1; j < sa.length; j++) {
                if (sa[i].compareToIgnoreCase(sa[j]) > 0) {
                    String t = sa[i];
                    sa[i] = sa[j];
                    sa[j] = t;
                }
            }
        }
        for (String w : sa) System.out.println(w);
    }

    private static boolean checkWord(String s) {
        String[] sa = s.split(" ");
        for (int i = 0; i < sa.length; i++) {
            if (sa[i].length() > 10) return false;
        }
        return true;
    }

    private static boolean checkString(String s) {
        String[] sa = s.split(" ");
        if (sa.length > 20) return false;
        return true;
    }
}
