// Print numbers form n to 1 (Decreasing Order)

public class P1 {
    public static void printDec(int n) {
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}

/* Call Stack : Decreasing Order
public static void printDec(int n) {
    if(n == 1) {
        System.out.println(n);
        return;
    }
    System.out.println(n);
    printDec(n-1);
}
*/