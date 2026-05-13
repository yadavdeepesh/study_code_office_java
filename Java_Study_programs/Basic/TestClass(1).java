interface Test{
    final int a = 10;
    default void display(){
        System.out.println("Hello");
    }

    static void display2()
    {
        System.out.println("hello22");
    }
}

class TestClass implements Test{
 void test(){
    System.out.println("test called ");
  }
}