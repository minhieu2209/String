import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        for(int i = 100000; i <= 999999; i++){
            String s = "";
            s = String.valueOf(i);
            if(thuanNghich(s)){
                System.out.println(i);
            }
        }
    }

    private static boolean thuanNghich(String s) {
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }


}



//1234321