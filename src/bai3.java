import java.util.Locale;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //bo dau cách thừa
        //kí tự đầu của mỗi chữ viết hoa
        s = s.toLowerCase(Locale.ROOT);
        String[] sa;
        String s2 = "";
        sa = s.split(" ");
        for(int i = 0; i < sa.length; i++){
            String s1 = "";
            if(sa[i].length() != 0){
                s1 += Character.toUpperCase(sa[i].charAt(0));
                if(sa[i].length() > 1) s1 += sa[i].substring(1);
                s2 += s1;
                if(i < sa.length) s2 += " ";
            }
        }
        System.out.println(s2);
    }
}
