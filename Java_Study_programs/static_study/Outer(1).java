class Outer{
    static void method(){
        System.out.println("This is the out class method ..");
    }
    static class Inner{
        void show(){
            System.out.println("This is the inner class method ..");
        }
    }

    public static void main(String args[]){
        Outer.Inner obj = new Outer.Inner();
        obj.show();
        method();

    }
}