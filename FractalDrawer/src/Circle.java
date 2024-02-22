
import java.lang.Math;
import java.awt.Color;
public class Circle {
    private double xposition;
    private double yposition;
    private double rad;
    private Color color;
//    initializes variable color of Type color

    public Circle(double x, double y, double radius) {
        xposition = x;
        yposition = y;
        rad = radius;
    }
//    other methods go here

    public double calculatePerimeter(double rad){

        return 2* Math.PI * rad;
    }

    public double calculateArea(double rad) {
        return Math.PI * Math.pow(rad, 2);
    }

    public void setColor(Color newColor) {
        color = newColor;
    }

    public void setPos(double newx, double newy) {
        xposition = newx;
        yposition = newy;
//setPos is to change the center position coordinates of the cirlce
    }

    public void setRadius(double newrad) {
        rad = newrad;
    }

    public Color getColor() {
        return color;
    }

    public double getXPos() {
        return xposition;
    }

    public double getYPos() {
        return yposition;
    }

    public double getRadius() {
        return rad;
    }


}
