
package interview_pratices_programs;
public class ReverseNumber {

    public static int reverseNumber(int num) {
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return rev;
    }

      public static void main(String[] args) {
       ReverseNumber rn = new ReverseNumber();
     int rev=  rn.reverseNumber(1234);
        System.out.println("Reverse Number is = " + rev);
    }
}
