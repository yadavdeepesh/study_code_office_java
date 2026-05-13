public class MobileInfo{
   static String mobileName;
   static float price;
    
    public static void set(String mn,float p){
        mobileName = mn;
        price = p;
    }
    
    public static void get(){
        System.out.println("Mobile Name "+mobileName);
        System.out.println("Price "+price);
    }
}