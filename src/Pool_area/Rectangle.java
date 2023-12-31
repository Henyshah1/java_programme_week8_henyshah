package Pool_area;

/**
 * Write a class with the name Rectangle.
 * The class needs two fields (instance variable) with name width and length both of type double.
 * The class needs to have one constructor with parameters width and length both of type double and
 * it needs to initialize the fields.
 */
public class Rectangle {
    private double width;
    private double length;
    public Rectangle(double width, double length){
        if (width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
        if (length < 0){
            this.length = 0;
        }else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return width * length;
    }
}
