
import java.lang.Math;
import java.awt.Color;

public class Triangle {
    private double xposition;
    private double yposition;
    private double width;
    private double height;
    private Color color;
    public Triangle(double xposition, double yposition, double width, double height) {
        this.xposition = xposition;
        this.yposition = yposition;
        this.width = width;
        this.height = height;

    }
    public double calculatePerimeter(double height, double width) {
        double half_base = width / 2;
        double side = Math.sqrt(Math.pow(half_base, 2) + Math.pow(height, 2));
        return side + side + width;
    }

    public double calculateArea(double height, double width) {
        return height * width / 2;
    }
    public void setColor(Color newColor) {
        this.color = newColor;
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
    public Color getColor() {
        return color;
    }
    public double getYPos() {
        return yposition;
    }
    public double getWidth() {
        return width;
    }
    public double getXPos() {
        return xposition;
    }
    public double getHeight() {
        return height;
    }




}
