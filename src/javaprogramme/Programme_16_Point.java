package javaprogramme;
/**
You have to represent a point in 2D space.
Write a class with the name Point.
The class needs two fields (instance variables) with name x and y of type int.
The class needs to have two constructors.
The first constructor does not have any parameters (no-arg constructor).
The second constructor has parameters x and y of type int and it needs to initialize the fields.

 */
public class Programme_16_Point {
        private int x;
        private int y;

        public Programme_16_Point() {
            this(0, 0);
        }

        public Programme_16_Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
//Instance method used
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public double distance() {
            return Math.sqrt(x * x + y * y);
        }

        public double distance(int x, int y) {
            int xDiff = this.x - x;
            int yDiff = this.y - y;
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        }

        public double distance(Programme_16_Point another) {
            int xDiff = this.x - another.getX();
            int yDiff = this.y - another.getY();
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        }
//Main method
        public static void main(String[] args) {
            Programme_16_Point first = new Programme_16_Point(6, 5);
            Programme_16_Point second = new Programme_16_Point(3, 1);
            System.out.println("distance(0,0) = " + first.distance());
            System.out.println("distance(second) = " + first.distance(second));
            System.out.println("distance(2,2) = " + first.distance(2, 2));
            Programme_16_Point point = new Programme_16_Point();
            System.out.println("distance() = " + point.distance());
        }
    }




