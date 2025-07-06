import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LazyCopyDemo {
    static class LazyCopier {
        private List<String> original;
        private List<String> copy;

        public LazyCopier(List<String> original) {
            this.original = original;
            this.copy = null; // No copy yet
        }

        public void modify(String newValue) {
            if (copy == null) {
                // Lazy copy happens here
                copy = new ArrayList<>(original);
            }
            copy.add(newValue);
        }

        public List<String> getData() {
            return (copy != null) ? copy : original;
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        LazyCopier lazyCopier = new LazyCopier(list);

        System.out.println("Before modification: " + lazyCopier.getData());

        lazyCopier.modify("D");  // triggers lazy copy

        System.out.println("After modification: " + lazyCopier.getData());
        System.out.println("Original list: " + list);
    }
}
