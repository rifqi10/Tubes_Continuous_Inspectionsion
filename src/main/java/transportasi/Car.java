/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author asus
 */
public class Car extends Kendaraan {
    private int xLoc = 10; 
    private int yLoc;
    private String plateNum;
    private double speed;

    public Car(int xLoc, int yLoc, String plateNum, double speed) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.plateNum = plateNum;
        this.speed = speed;
    }

    public void move(int x, int y) {
        this.xLoc += x; 
        this.yLoc += y;
    }

    public void accelerate(double speed) {
        this.speed += speed;
    }

    // getter and setter methods
    public int getXLoc() {
        return xLoc;
    }

    public void setXLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getYLoc() {
        return yLoc;
    }

    public void setYLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public String methodChild(){
		return "this is method Child";
	}	
    
   
    @Override
    public String methodParent(){
		return "this method overriden by Child";
    }   
    
    public String methodParent2() {
                return super.methodParent();
    }

    @Override
    public String toString() {
        return "Car{" + "xLoc=" + xLoc + ", yLoc=" + yLoc + ", plateNum=" + plateNum + ", speed=" + speed + '}';
    }
    
    
}
