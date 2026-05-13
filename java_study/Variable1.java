class Variable1 {
     public static void main( String arg[] ){

        // study variable in java  
        // there are two type of variable in java
        
        /*
        // primitive  variable 
        int 
        double
        char
        boolean
        
        // referance variable 
        string 
        array 
        object 
        */

       // int 

       int age = 21;
       int number = 55;
       int qty = 100;
       int year = 2025;
     
        System.out.print("my age is "+age+" year "+year);

       // double

       double pi = 3.14;
       double price = 500.23;
       double discount = 12.5;

       System.out.println("price value = "+price+"discount"+discount);

       // char 

       char grade = 'A';
       char symbal = '$';
       char result = 'P';
       char gender = 'M';

       System.out.println("grade= "+grade+"symbal= "+symbal+"result= "+result+"Gender ="+gender);

      // boolean

      boolean isStudent = true;
      boolean studentResult = false;
      boolean isAdmin = false;

      System.out.println("isStduent "+isStudent);


        if( isAdmin ){
            System.out.println("yes, I am admin ");
        }
        else{
            System.out.println("No, I am not admin ");
        }

    // string 

      String name = "Deepesh yadav ";
      String city = "Gurgaon";
      String country = "India";

      System.out.println("name is "+name+" and city "+city+" ,country "+country);
     }
}