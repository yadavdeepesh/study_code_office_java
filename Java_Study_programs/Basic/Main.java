public class Main{
    public static void main(String[] args){
        // create the student class object .. first way to create object in java start 
        // Student s = new Student("dk",12);
        // s.displayDetails();
        // first way to create object in java end

        // create the dog class object ..
        Dog d = new Dog("tuffy", "papillon", 5, "white");
        // that line is enougf to calling toString() function automatically .. start 
        // System.out.println(d);
        // that line is enougf to calling toString() function automatically .. end  

        // do not need to using this line code start
        //   System.out.println(d.toString()); // call same output ....
        // do not need to using this line code end ..

        // calling the static function ...
        // MobileInfo.set("Oppo Reno 12 ",20000f);
        // MobileInfo.get();

        // second way to create object in java... start 
        //  Using Reflection
        // try {
        //     Class<?> c = Class.forName("Test");
        //     Test t = (Test) c.getDeclaredConstructor().newInstance();
        //     System.out.println(t);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
         // second way to create object in java... end 

         // create the object using four way .. start 
         // this code is not working properly ....
        // try (ObjectOutputStream out =
        //     new ObjectOutputStream(new FileOutputStream("student.ser"))) {
        //     out.writeObject(new GeeksDeSerialization("Alice"));
        // } catch (IOException e) { e.printStackTrace(); }

        // try (ObjectInputStream in =
        //         new ObjectInputStream(new FileInputStream("student.ser"))) {
        //     GeeksDeSerialization s = (GeeksDeSerialization) in.readObject();
        //     System.out.println(s);
        // } catch (Exception e) { e.printStackTrace(); }

        // this aboved code is not working properly ..

        // calling the pattern class method

        SquarePattern.printSquare(8,22);

    }
}