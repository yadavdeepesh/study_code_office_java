import java.util.Scanner;

class InputGame3{
    public static void main(String arg[]){
        System.out.print("input games::");

        Scanner s = new Scanner(System.in);
        System.out.print("What is your name " );
        String name = s.nextLine();
        System.out.print("Where are you from " );
        String city = s.nextLine();
        // s.nextLine();
        System.out.print("how is your favorite actor ");
        String actor = s.nextLine();
        System.out.print("how is your favorite actoress ");
        String actoress = s.nextLine();
        System.out.print("what is your age ");
        int age = s.nextInt();

        System.out.println("What is your name " + name);
        System.out.println("Where are you from "+ city);
        System.out.println("how is your favorite actor "+actor);
        System.out.println("how is your favorite actoress "+actoress);
        System.out.println("what is your age "+ age);

        s.close();
    }
}