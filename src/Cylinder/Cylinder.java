package Cylinder;

/**
 * Write a class with the name Cylinder that extends Circle class.
 * The class needs one field (instance variable) with name height of type double.
 * The class needs to have one constructor with two parameters radius and height both of type double.
 * It needs to call the parent constructor and initialize a height field.
 */
public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, double height){
        super(radius);//Constructor
        if (height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
