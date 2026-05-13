// third way to create object in java... start 
// Using clone() method
class GeeksClone implements Cloneable{
    String name ="Deepesh Yadav";
    String profession ="Developer";
    

    // overriding the clone object ..
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args){
        try{
            GeeksClone g1 = new GeeksClone();
            GeeksClone g2 = (GeeksClone) g1.clone();
            System.out.println(g2.name);
            System.out.println(g2.profession);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
// third way to create object in java end .