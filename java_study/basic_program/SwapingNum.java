import java.util.Scanner;
class SwapingNum{
    public static void main(String args[]){
        int a , b ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the a and b value :");
        a = s.nextInt();
        b = s.nextInt();
         System.out.println("Before Swaping the values :: "+a+" and "+b);
        // swaping logic ..
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swaping the values :: "+a+" and "+b);
    }
}