package interface_study;
// Implement the interface in a 
// class named Rectangle
class Rectangle implements Shape{
    private double length;
    private double width;

    // constructor for rectangle 
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    // Implementing the abstract 
    // method from the Shape interface
    public double AreaCalculate(){
        return length*width;
    }
}