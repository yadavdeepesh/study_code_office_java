// Main class
class SingletonMain2
{
    // Main driver method
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
        Singleton2 x = Singleton2.Singleton2();

        // Instantiating Singleton class with variable y
        Singleton2 y = Singleton2.Singleton2();

        // Now changing variable of instance x
        // via toUpperCase() method
       

        // Print and display commands
        System.out.println("String from x: " + x.s + ", y: " + y.s);

        // Now again changing variable of instance y
        y.s = (y.s).toLowerCase();

        System.out.println("String from x: " + x.s + ", y: " + y.s);
    }
}