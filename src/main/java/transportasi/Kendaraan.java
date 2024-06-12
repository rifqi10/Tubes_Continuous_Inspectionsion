/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

import java.io.Serializable;

/**
 *
 * @author asus
 */
public class Kendaraan extends Transportasi implements Serializable {
    private String pengendara;
    private String getDescription;
    private String getPrice;
    
    public Kendaraan(){
        super();
        pengendara = "";
    }
    
    public Kendaraan(String desc, double harga, String pengendara){
        super(desc, harga, pengendara);
        this.pengendara = pengendara;
    }
    
    public double calculateTax(){
        double taxRate = 0;
        return getPrice()*taxRate;     
    }
    
    @Override
    public void display(){
        System.out.println("Pengendara          :" + this.pengendara);
        System.out.println("Description         :" + this.getDescription);
        System.out.println("Price               :" + this.getPrice);        
    }
    private int xLoc;
    
    public void Setxloc(int xLoc){ 
		this.xLoc = xLoc; 
	} 
    public String methodParent(){
		return "this is method Parent";
    }   
        
}
