import java.util.Scanner;
class AreaofCricle {
    public static void main(String arg[] ){
    Scanner s = new Scanner(System.in);
    double rad;
    double PT = 3.1416;
    // using Scanner class 
    System.out.print("Enter the Radius value ");
    rad = s.nextInt();
    // Area of Cricle 
    double area = PT * rad * rad;
    System.out.println("Area of Cricle = "+area);
    }
}