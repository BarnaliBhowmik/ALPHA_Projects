import java.util.*;
public class lowertrianglestar {
    public static void lowertrianglularpattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            //one line
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        lowertrianglularpattern();
    }
}