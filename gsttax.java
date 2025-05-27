import java.util.Scanner;

public class gsttax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Cost of Pen: ");
        float pen = sc.nextFloat();
        System.out.print("Cost of Eraser: ");
        float eraser = sc.nextFloat();
        double price = (pencil + pen + eraser);
        double gst = (price * 0.18);
        double  totalPrice = (price + gst);
        System.out.print("Total Price is : " + totalPrice);
    }
}