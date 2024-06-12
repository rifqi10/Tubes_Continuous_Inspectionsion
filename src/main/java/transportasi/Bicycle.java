/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author asus
 */
public class Bicycle {
    private int xLoc;
    private int yLoc;
    private double speed;

    public Bicycle(int xLoc, int yLoc, double speed) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.speed = speed;
    }

    public void move(int x, int y) {
        this.xLoc += x;
        this.yLoc += y;
    }

    public void accelerate(double acceleration) {
        this.speed += acceleration;
    }

    // getter methods for fields
    public int getXLoc() {
        return this.xLoc;
    }

    public int getYLoc() {
        return this.yLoc;
    }

    public double getSpeed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "xLoc=" + xLoc + ", yLoc=" + yLoc + ", speed=" + speed + '}';
    }
    
    
}
