package interface_study;
public class ShapeMain{
    public static void main(String[] args){
        // Reference type is the interface (Shape)
        Shape cir = new Circle(3.4);
        Shape rect = new Rectangle(4.0,6.0);

        // call areas method 
        System.out.println("Aera of circle ="+cir.AreaCalculate());
        System.out.println("Aera of rectangle ="+rect.AreaCalculate());
    }
}