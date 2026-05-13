// import java.io.*;

abstract class Demo{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class Child extends Demo{
   public void m1(){
     System.out.println("that is call the abstract method m1..");
    }
}
class SecondChild extends Child{
    public void m2(){
     System.out.println("that is call the abstract method m2..");
    }
     public void m3(){
     System.out.println("that is call the abstract method m3..");
    }
}

class GFGMain{
    public static void main(String args[]){
        SecondChild c = new SecondChild();
        c.m1();
        c.m2();
        c.m3();
    }
}