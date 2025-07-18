public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        // Student s2 = new Student("diya");
        Student s3 = new Student(123);
        s1.name = "shradha";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); //copied s1 values in s2
        s2.password = "xyz";

        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];
    
    //copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student() {
        marks = new int[3];
        System.out.println("constructor is called...");
    }
    
    /* Student(String name) {
        marks = new int[3];
        this.name = name;
    } */
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}