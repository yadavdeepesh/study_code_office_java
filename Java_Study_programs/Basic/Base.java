// using the abstract class all called 

// abstract class
abstract class Sunstar{
    abstract void printInfo();
}
// Abstraction is perform using extends ..
class Employee extends Sunstar{
    // first we create the abstact method..
    String name = "Deepesh yadav";
    int age = 25;
    float salary = 222.5F;
    void printInfo(){
        System.out.println("Name : "+name+" age : "+"salaary : "+salary);
    }
} 
class Base {
    public static void main(String args[]){
         Sunstar s = new Employee();
         s.printInfo();
    }
}
