/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportasi;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Transportasi implements Serializable {
    private String description, pengendara;
    private double price;
    
    public Transportasi(){
        description = "";
        price = 0.0;
        pengendara = "";
    }
    
    public Transportasi(String desc, double harga, String Nama){
        this.description = desc;
        this.price = harga;
        this.pengendara = Nama;
    }
    
    public void display(){
        System.out.println(getDescription() + "" + getPrice() + "" + getNama());
    }
    
    public String getDescription(){
        return description;
    }
    
    public  double getPrice(){
        return price;
    }
    
    public String getNama(){
        return pengendara;
    }
    
    public void saveObjectToFIle(Object ob, String namaFile){
        System.out.println("--> saving book ............");
        try {
            FileOutputStream f_out = new FileOutputStream (namaFile);
            ObjectOutputStream obj_out = new ObjectOutputStream (f_out);
            obj_out.writeObject(ob);
            }catch (IOException e){
                System.out.println (e.toString());
                System.exit(1);
            }
    }
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    public static void main(String[] args) throws IOException{
    String fileName = "contoh_book.txt";
    Kendaraan buku = new Kendaraan("sample-book_description", 24.95, "sample-author");
    try (FileWriter writer = new FileWriter(fileName)) {
        writer.write("description = " + buku.getDescription() + " \n");
        writer.write("price = " + buku.getPrice() + " \n");
        writer.write("Pengendara = " + buku.getNama());
        writer.close();
    }
    String line;
    try {
        BufferedReader in = new BufferedReader (new FileReader("contoh_book.txt"));
        line = in.readLine();
        while (line != null){
            System.out.println(line);
            line = in.readLine();
        }
    } catch(IOException e){
        System.out.println("Problem reading : " + e.getMessage());
    }
        
        System.out.println(" ");

        Car Car1;
        Car1 = new Car(0, 0, "B1234AB", 0.0);
        
        System.out.println("==============Car==============");
        System.out.println("Initial car location: (" + Car1.getXLoc() + ", " + Car1.getYLoc() + ")");
        Car1.move(10, 20);
        System.out.println("After moving (10, 20): (" + Car1.getXLoc() + ", " + Car1.getYLoc() + ")");

        System.out.println("Initial car speed: " + Car1.getSpeed());
        Car1.accelerate(30.0);
        System.out.println("After accelerating by 30: " + Car1.getSpeed());
       
                
        System.out.println(" ");
        System.out.println("=============Plane=============");
        Plane pl;
        pl = new Plane(0, 0, 0.0);

        System.out.println("Initial Plane location: (" + pl.getXLoc() + ", " + pl.getYLoc() + ")");
        pl.move(10, 20);
        System.out.println("After moving (10, 20): (" + pl.getXLoc() + ", " + pl.getYLoc() + ")");

        System.out.println("Initial Plane speed: " + pl.getSpeed());
        pl.accelerate(30.0);
        System.out.println("After accelerating by 30: " + pl.getSpeed());
        
        System.out.println(" ");
        System.out.println("=============Inheritance=============");

        Kendaraan p = new Kendaraan();
		
		
		System.out.println(p.methodParent());
		System.out.println(Car1.methodParent());

		System.out.println(Car1.methodChild());
                System.out.println(Car1.methodParent2());
        
        System.out.println(" ");
        System.out.println("=============Wide=============");

        //wide
        int i = 50;
        long l = i;
        float f = l;
        
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);

        System.out.println(" ");
        System.out.println("=============Narrow=============");
       
        //narrow
        double d = 25.16;
        long a = (long)d;
        int b = (int)a;
        
        System.out.println("double value: " + d);
	System.out.println("long value: " + a);
	System.out.println("int value: " + b);
        
        System.out.println(" ");
        System.out.println("=============toString=============");
        
        Motorcycle m1;
        m1 = new Motorcycle(0, 0, "B1234AD", 0.0);
        
        Bicycle b1;
        b1 = new Bicycle(0,0,0.0);
        
        SUV s1;
        s1 = new SUV(0,0,"B1234AD",0.0);
        
        System.out.println(Car1.toString());
        System.out.println(m1.toString());
        System.out.println(b1.toString());
        System.out.println(pl.toString());
        System.out.println(s1.toString());
        
        System.out.println(" ");
        System.out.println("=============UpCasting=============");
        
        Kendaraan Cast1;
        Cast1 = new Car(0,0,"B1234AD",0.0);
        System.out.println(Cast1.toString());
        
        Cast1 = new SUV(0,0,"B1234AD",0.0);
        System.out.println(Cast1.toString());
        
        System.out.println("============================");        
        System.out.println(" ");
       
        ArrayList<Kendaraan> emp;
        emp = new ArrayList();
        emp.add(Cast1);
        emp.forEach(System.out :: println);
        
        System.out.println("============================");                
        System.out.println(" ");
        
        int maxPenumpang = 4;
        int jumlahPenumpang = 5;
        int kecepatan = 120;
        
        assert jumlahPenumpang <= maxPenumpang : "Kendaraan penuh";
        
        assert kecepatan <= 100 : "Kecepatan terlalu tinggi";
        
       try {
            if (jumlahPenumpang >= maxPenumpang) {
                throw new KendaraanPenuhException("Kendaraan sudah penuh");
            }
        } catch (KendaraanPenuhException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            if (kecepatan > 100) {
                throw new KecepatanTerlaluTinggiException("Kecepatan terlalu tinggi");
            }
        } catch (KecepatanTerlaluTinggiException e) {
            System.out.println(e.getMessage());
        
        System.out.println("============================");                    
        System.out.println(" ");

        MyGenericClass<Integer> myObj = new MyGenericClass<>(10);
        System.out.println(myObj.getMyVar()); 
        System.out.println(" ");
        myObj.printType(); 
        
        System.out.println("============================");
        System.out.println(" ");

        MyGenericClass<String> myObj2 = new MyGenericClass<>("Transportasi");
        System.out.println(myObj2.getMyVar()); 
        System.out.println(" ");
        myObj2.printType(); 

        }
    }
     public static class KendaraanPenuhException extends Exception {
        public KendaraanPenuhException(String message) {
            super(message);
        }
    }
     public static class KecepatanTerlaluTinggiException extends Exception {
        public KecepatanTerlaluTinggiException(String message) {
            super(message);
        }
    }
     
    public static class MyGenericClass<T> {
    private T myVar;

    public MyGenericClass(T var) {
        this.myVar = var;
    }

    public  T getMyVar() {
        return myVar;
    }
    
    public void setMyVar(T myVar) {
        this.myVar = myVar;
    }

    public void printType() {
        System.out.println("Type of T is: " + myVar.getClass().getName());
    }
    
    
}

}
