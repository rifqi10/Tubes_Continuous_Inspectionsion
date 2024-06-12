/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author asus
 */
public class SUV extends Car{
    private int groundClearence;
    
    public SUV(int xLoc, int yLoc, String plateNum, double speed) {
        super(xLoc, yLoc, plateNum, speed);
    }

    public int getGroundClearence() {
        return groundClearence;
    }

    public void setGroundClearence(int groundClearence) {
        this.groundClearence = groundClearence;
    }

    @Override
    public String toString() {
        return "SUV{" + "groundClearence=" + groundClearence + '}';
    }
    
    
    
};
