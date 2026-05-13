import java.util.Scanner;
class Pattern1{
    public static void main(String args[]){
        System.out.print("Enter The Number :");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i , j;
        for ( i = 1 ; i <= num ; i++ ){
            for ( j= 1 ; j <= num ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}