import java.util.Scanner;
class ConvertToDays{
    public static void main(String args[]){
        int days , years , months , weeks ;
        System.out.println("Enter the number of Days ::");
        // using scnner object 
        Scanner s = new Scanner(System.in);
        days = s.nextInt();
    

        years = days / 365;
        days = days % 365;
        months = days / 30;
        days = days % 30;
        weeks = days / 7;
        days = days % 7;

        System.out.println(" Years = "+years);
        System.out.println(" MonThs = "+months);
        System.out.println(" weeks = "+weeks);
        System.out.println(" days = "+days);

    }
} 