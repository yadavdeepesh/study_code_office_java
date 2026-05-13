import java.util.Scanner;
class SwapingTwoNum{
    public static void main(String args[]){
        int a , b , t ;
        // Scannner class for input 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the a and b values ::");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Before swaping a and b values ::"+ a +" and " +b);
        // swaping logic ..
        t = a;
        a = b;
        b = t;
        System.out.println("After swaping a and b values ::"+ a +" and " +b);
    }
}