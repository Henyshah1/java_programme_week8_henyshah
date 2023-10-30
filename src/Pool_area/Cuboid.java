package Pool_area;

/**
 * Write a class with the name Cuboid that extends Rectangle class.
 * The class needs one field (instance variable) with name height of type double.
 * The class needs to have one constructor with three parameters width, length, and height all of type double.
 * It needs to call the parent constructor and initialize a height field.
 */
public class Cuboid extends Rectangle{
    private double height;
    public Cuboid(double width, double length, double height){
        super(width, length);
        if (height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
