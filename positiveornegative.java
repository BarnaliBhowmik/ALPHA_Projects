import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("The given number is positive i.e., Number is greater than ZERO");
        }
        else {
            System.out.println("The given number is negative i.e., Number is less than or equal to ZERO");
        }
    }
}
