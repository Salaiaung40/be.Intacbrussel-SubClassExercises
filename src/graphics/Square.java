package graphics;

import java.awt.*;

//Assignment 1
public class Square extends Rectangle {

    private int side;

    public Square() {
        super(); // this is calling variable form superclass (Rectangle)
        this.height = 5;
        this.width = 5;
    }

    //Assignment 2
    public int getArea() {
        return width * width;
    }

    public int getPerimeter() {
        return 4 * width;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // with the parameters
    public Square(int x, int y, int width, int height, int side) {
        super(x, y, width, height); // this is calling variable form superclass (Rectangle)
        this.side = side;
    }

    // Assignment 3 and 4

    public int getSide() {
        return (int) getHeight();
    }

    public void setSide(int side) {
        setHeight (side);
        setWidth (side);
    }

    public void setHeight(int height) {
        setSide(height);
    }
        public void setWidth(int width) {
        setSide(width);
    }

    public Square(Dimension d, int side) {
        super(d);
        this.side = side;
    }
    // Assignment 5
    Square(int side){
        this.side = side;

    }

    public Square (int side, int x, int y){
//        this (side , x, y);

        this.side = side;
        this.x = x;
        this.y = y;
    }
    Square (Square side){

    }
}
