import java.util.Scanner;
import java.util.StringTokenizer;

public class bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        int max, i = 1, lengthS;
        max = st.nextToken().length();
//        System.out.println(max);
        int vt = i;
        while(st.hasMoreTokens()){
            lengthS = st.nextToken().length();
     //       System.out.println(lengthS);
            i++;
            if(max < lengthS){
                max = lengthS;
                vt = i;
            }
        }
        System.out.println("Độ dài xâu lớn nhất: " + max + " ở vị trí: " + vt);
    }
}
