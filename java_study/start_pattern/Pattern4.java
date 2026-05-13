import java.util.Scanner;
class Pattern4{
    public static void main(String args[]){
        System.out.print("Enter The Number :");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i , j;
        int pat_num = 1;
        for ( i = 1 ; i <= num ; i++ ){
            for ( j= 1 ; j <= num ; j++ ){
                // Convert number to string and count its length
                    int digits = String.valueOf(Math.abs(i)).length();
                System.out.print(pat_num+" ".repeat(digits));
                pat_num++;
            }

            System.out.println();
        }
    }
}