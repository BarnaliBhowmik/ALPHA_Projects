class Student {
    String name;
    int marks;
}
public class PQ1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "rena"; //Dot operator
        System.out.println(st.name);
    }
}

/*
 * 1) s-> name = "diya" : C++.
 * 2) Student.name = "diya."
 */