import java.util.Scanner;
class BooleanTest{
    public static void main(String args[]){
       // create the scnner class object ..
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the boolean value :: True / False ");
       boolean b = s.nextBoolean();
       if(b){
        System.out.println("User enter the true value..");
       }
       else{
         System.out.println("User enter the false value..");
       }
    }
}