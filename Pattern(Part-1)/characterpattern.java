import java.util.Scanner;

public class characterpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        int n = sc.nextInt();
        for (int i=1; i <= n; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}