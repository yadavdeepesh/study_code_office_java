class GFGMain{
    public static void main(String args[]){
        // Subject it = new IT();
        // that is not possible in java , you are do not create the object of abstract class 
        // Subject it = new Subject();
        // do not create the object of abstract class ...
        // it.syllabus();
        // it.Learn();

        // called the Derived1 class then Base1 class constructor is automatically called..

        // Derived1 d = new Derived1();
        // d.fun();

        // Derived2 d2 = new Derived2();
        // d2.fun();

        // call the static method of abstract method ..
        // create the object of abtract class...
        // Helper.demofun();

        
        // TestClass tc = new TestClass();
        // tc.display();
        // System.out.println(tc.a);
        // tc.test();

        // called the static method ..
        // Test.display2();

        // Create teh object of programmer
        Programmer p = new Programmer();
        p.setName("Dk");
        System.out.println("programmer name "+p.getName());
  
    }
}