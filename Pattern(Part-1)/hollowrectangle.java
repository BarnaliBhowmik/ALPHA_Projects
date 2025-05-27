public class hollowrectangle {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


/*
public class hollowrectangle {
    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i=1; i <= totRows; i++) {
            for (int j=1; j <= totCols; j++) {
                if (i==1 || i==totRows || j==1 || j==totCols) {
                    System.out.print("*");"
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(totRows, totCols);
    }
}
 */