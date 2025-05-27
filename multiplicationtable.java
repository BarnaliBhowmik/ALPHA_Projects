import java.util.*;
public class multiplicationtable {
    public static void printmultiplicationtable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = sc.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.println( N + " * " + i + " = " + N * i);
        }
    }
    public static void main(String s[]) {
        printmultiplicationtable();
    }
}