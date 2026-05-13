class MyConstant{
    public static final int months = 12;
    public static final double pi = (double) 22/7;
}
class PublicConstant {
    public static void main(String args[]){
        System.out.println("number of month ::"+MyConstant.months);
        System.out.println("PI : "+ MyConstant.pi);
    }
}