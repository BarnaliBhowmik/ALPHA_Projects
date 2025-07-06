public class StaticKW {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JNV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";
    }
}

class Student {
    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName; //static keyword applied and hence answer is still the same & no error.

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}