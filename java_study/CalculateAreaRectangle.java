import java.util.Scanner;

class CalculateAreaRectangle {
    public static void main( String arg[] ){

        Scanner s = new Scanner(System.in);

         

         System.out.print(" Enter the length ::");
         double length = s.nextDouble();
         System.out.print(" Enter the breadth ::");
         double breadth = s.nextDouble();

         double area = length * breadth;
         System.out.println("Area of Triangle :: "+ area);

         s.close();
    }
}