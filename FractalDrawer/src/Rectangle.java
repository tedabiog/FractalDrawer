
import java.lang.Math;
import java.awt.Color;


public class Rectangle {
    private double height;
    private double yposition;
    private double width;
    private Color color;

    private double xposition;
    public Rectangle(double xposition, double yposition, double width, double height) {
        this.height = height;
        this.width = width;
        this.xposition = xposition;
        this.yposition = yposition;
    }
    public double calculatePerimeter() {
        return 2* (width + height);
    }
    public double calculateArea() {
        return width * height;
    }

    public void setColor(Color new_color) {
        color = new_color;
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
    public void setPos(double newx, double newy) {
        xposition = newx;
        yposition = newy;
    }

    public void setHeight(double newheight) {
        height = newheight;
    }

    public void setWidth(double new_width) {
        width = new_width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
