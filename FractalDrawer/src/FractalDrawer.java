import java.awt.Color;
import java.util.Scanner;
import java.util.Random;

public class FractalDrawer {
// FractalDrawer class draws a fractal of a shape indicated by user input


    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // contructor
           public Canvas newf;


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas drawing = new Canvas(800, 800);
        if (type.equals("circle")) {
            //drawCircle Fractal returns void. The drawFractal funtion returns total area of fractal
            drawCircleFractal(150, 400, 400, Color.BLUE, drawing, 8);

            System.out.println("ran");

        }
        else if (type.equals("triangle")) {

            drawTriangleFractal(60, 60, 400, 400, Color.BLUE, drawing, 8);
        }
        else if (type.equals("rectangle")) {
                drawRectangleFractal(60, 80, 400, 400, Color.RED, drawing, 8);

            }

        return totalArea;

    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        if (level == 0) {
            return;  // Base case: stop recursion
        }

        Triangle myTriangle = new Triangle(x, y, width, height);
        myTriangle.setColor(c);
        double area = myTriangle.calculateArea(height, width);

        totalArea += area;
        can.drawShape(myTriangle);

        //can is canvas of type Canvas
        System.out.println("Drawing triangle at (" + x + ", " + y + ") with base " + width +  " and color " + c);

        // maybe change generateRandomColors input number
        Color[] newColors = generateRandomColors(80);
        double newBaseLength = width/2;
        double newHeight = height * (0.5);
//only runs the first line x+ radius
        drawTriangleFractal(newBaseLength, newHeight, x + width/4, y + height/2, newColors[0], can, level-1);
        drawTriangleFractal(newBaseLength, newHeight, x + width, y, newColors[1], can, level -1);
        drawTriangleFractal(newBaseLength, newHeight, x - width/2, y, newColors[2], can,  level - 1);

    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques



    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if (level == 0) {
            return;  // Base case: stop recursion
        }

        Circle myCircle = new Circle(x, y, radius);
        myCircle.setColor(c);
        double area = myCircle.calculateArea(radius);
        totalArea += area;
        can.drawShape(myCircle);

        //can is canvas of type Canvas
        System.out.println("Drawing circle at (" + x + ", " + y + ") with radius " + radius + " and color " + c);

        // maybe change generateRandomColors input number
        Color[] newColors = generateRandomColors(80);
        double newRadius = radius / 2;
//only runs the first line x+ radius
        drawCircleFractal(newRadius, x + radius, y, newColors[0], can, level - 1);
        drawCircleFractal(newRadius, x -  radius, y, newColors[1], can, level - 1);
        drawCircleFractal(newRadius, x, y +   radius, newColors[2], can, level - 1);
        drawCircleFractal(newRadius, x, y - radius, newColors[3], can, level - 1);
        }



    private static Color[] generateRandomColors(int count) {
        Color[] colors = new Color[count];
        for (int i = 0; i < count; i++) {
            colors[i] = getRandomColor();
        }
        return colors;
    }

    // Helper method to generate a random color
    private static Color getRandomColor() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new Color(r, g, b);
    }








    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level == 0) {
            return;  // Base case: stop recursion
        }

        Rectangle myRectangle = new Rectangle(x, y, width, height);
        myRectangle.setColor(c);
        double area = myRectangle.calculateArea();
        totalArea += area;
        can.drawShape(myRectangle);

        //can is canvas of type Canvas
        System.out.println("Drawing rectangle at (" + x + ", " + y + ") with radius "  + " and color " + c);

        // maybe change generateRandomColors input number
        Color[] newColors = generateRandomColors(80);
        double new_width = width/2;
        double new_height = height/2;
//only runs the first line x+ radius
        drawRectangleFractal(width/2, height/2, x + width, y, newColors[0], can, level -1);
        drawRectangleFractal(width/2, height/2, x - new_width, y, newColors[1], can, level -1);
        drawRectangleFractal(width/2, height/2, x, y+ height, newColors[2], can, level -1);
        drawRectangleFractal(width/2, height/2, x, y - new_height, newColors[3], can, level -1);
    }


    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
        FractalDrawer drawer = new FractalDrawer();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("circle, triangle or rectangle");
        String input = myScanner.next();
        if (input.equals("circle"))
            drawer.drawFractal("circle");
        else if (input.equals("triangle"))
                drawer.drawFractal("triangle");
        else if (input.equals("rectangle"))
                drawer.drawFractal("rectangle");
        else{
            System.out.println("Unknown shape. Please enter circle, triangle, or rectangle.");
        }
        System.out.println("Total area: " +drawer.totalArea);

    }
}
