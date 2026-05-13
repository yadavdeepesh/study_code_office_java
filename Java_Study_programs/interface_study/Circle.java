package interface_study;
// create the interface
interface Shape{
    // abstract method for calculationg area..
    double AreaCalculate();
}

// Implement the interface 
// in a class named Circle
class Circle implements Shape{
    private double r;
    // contructor of cricle 
    public Circle(double r){
        this.r = r;
    }
    // Implementing the abstract method 
    // from the Shape interface
    public double AreaCalculate(){
      return Math.PI*r*r;
    }
}