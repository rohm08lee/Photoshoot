import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String sb = sc.next();
        int count = 0;
        for (int i = N -2; i >= 0; i-=2) {
            String temp = sb.substring(i, i+2);
            if (temp.charAt(0) == temp.charAt(1)) {continue;}
            else if ((temp.equals("GH") && count % 2 == 0) ||
                    (temp.equals("HG") && count % 2 == 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}