// Java program implementing Singleton class
// with method name as that of class

// Helper class
class Singleton2 
{
    // Static variable single_instance of type Singleton
    private static Singleton2 single_instance = null;

    // Declaring a variable of type String
    public String s;

    // Constructor of this class
    // Here private constructor is used to
    // restricted to this class itself
    private Singleton2()
    {
        s = "String from Singleton class";
    }

    // Method
    // Static method to create instance of Singleton class
    public static Singleton2 Singleton2()
    {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new Singleton2();
        }
        return single_instance;
    }
}
