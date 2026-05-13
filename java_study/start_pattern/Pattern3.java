import java.util.Scanner;
class Pattern3{
    public static void main(String args[]){
        System.out.print("Enter The Number :");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i , j;
        for ( i = num ; i >= 1 ; i-- ){
            for ( j= num ; j >= 1 ; j-- ){
                // System.out.print(i+" ");
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}