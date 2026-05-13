
public class Student {

    String name;      // variable
    int rollno;       // variable

    Student(String name, int rollno) {   // constructor
        this.name = name;
        this.rollno = rollno;
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollno + "  Name: " + name);
    }
}
