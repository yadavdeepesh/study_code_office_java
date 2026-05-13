import java.util.Scanner;
class UserInput2{
    public static void main(String arg[]){
         System.out.println(" Using the Scanner Class.. ");

         System.out.print(" enter the age : ");
         Scanner s = new Scanner(System.in);

         int age = s.nextInt();
         s.nextLine();
         System.out.println(" Age = "+age );

         // string input 
         System.out.print(" Enter the favorite color :" );

         String color = s.nextLine();
         System.out.println(" favorite color :"+color );


         System.out.print("enter the boolean value :");
         boolean flag = s.nextBoolean();
          s.nextLine();

         System.out.println("flag value :: "+ flag);

         System.out.print("enter the name ::");

         String name = s.nextLine();
         System.out.println("your name is ::" +name);

         System.out.print("Enter the double value ::");

         double num = s.nextDouble();
         System.out.println("Double value ::"+num);

         s.close();

    }
}