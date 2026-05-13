class Student {
    int rollno;
    String name;
    // static variable 
    static String department = "IT";
    static int a = 10;
    static int b = 2;

    Student(int rno, String n){
        rollno = rno;
        name = n;
    }
    void display(){
        System.out.println("Roll No "+rollno+" Name "+name+" department "+department);
    }

    // create the static block 
    static{
        System.out.println("Static block initialized");
        System.out.println(a * b);

    }

    // static method
    static int m1(){
        
        System.out.println("From m1");
        return 20;
    }
}

public class GFG {
    public static void main(String args[]){
        Student s1 = new Student(234,"Deepesh yadav");
        Student s2 = new Student(235,"Pramod kumar");
        s1.display();
        s2.display();
        Student.m1();

    }
}