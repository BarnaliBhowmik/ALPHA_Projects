class Person {
    String name;
    int weight;
}
class Student extends Person {
    int rollNumber;
    String schoolName;
}
public class PQ2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Barna";
        p.weight = 51;
        System.out.println(p.name);
        System.out.println(p.weight);
        Student s = new Student();
        s.rollNumber = 5;
        s.schoolName = "KV";
        System.out.println(s.rollNumber);
        System.out.println(s.schoolName);
    }
}

// private & protected modifier's are not allowed in front of the class as they make the class unusable.