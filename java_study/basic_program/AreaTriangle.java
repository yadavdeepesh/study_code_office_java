import java.util.Scanner;
class AreaTriAngle {
    public static void main(String arg[] ){
     System.out.println("Area of Triangle !!");

     double a , b , c , s , area;
     // creta the object of scanner class
     Scanner scanner = new Scanner(System.in);
     System.out.print(" Enter the value a =");
     a = scanner.nextDouble(); 
     System.out.print(" Enter the value b =");
     b = scanner.nextDouble(); 
     System.out.print(" Enter the value c =");
     c = scanner.nextDouble(); 

     s = (a + b + c)/2;

     area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
     System.out.print("Area of Triangle :: = " + area);





     


    }
}