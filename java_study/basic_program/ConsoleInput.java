import java.io.*;

class ConsoleInput{
    public static void main(String args[]){
        Console cn = System.console();
        int n ; 
        System.out.print("Enter the a Number : ");
        n = Integer.parseInt(cn.readLine());
        System.out.println("The given number : "+n);
    }
}