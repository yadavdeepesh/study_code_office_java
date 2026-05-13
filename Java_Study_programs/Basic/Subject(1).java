// create the abstract method..
// having constructor . data member , and methods 
abstract class Subject {
    Subject(){
     System.out.println("Learn Subject..");
    }
    // create the abstract method 
    abstract void syllabus();
    // create the non-abstract method
    void Learn(){
        System.out.println("I am preparing Right Now!");
    }
}
