package introduction;

class Student {
    int rollNo;
    String name;
    float marks;

    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Student rwitesh = new Student(151, "Rwitesh Bera", 87);

        System.out.println(rwitesh.rollNo + " " + rwitesh.name + " " + rwitesh.marks);
    }
}
