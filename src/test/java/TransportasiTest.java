import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import transportasi.*;

public class TransportasiTest {
    
    private Car car;
    private Plane plane;
    private Motorcycle motorcycle;
    private Bicycle bicycle;
    

    @Before
    public void setUp() {
        car = new Car(0, 0, "B1234AB", 0.0);
        plane = new Plane(0, 0, 0.0);
        motorcycle = new Motorcycle(0, 0, "B1234AD", 0.0);
        bicycle = new Bicycle(0, 0, 0.0);
        
    }

    @Test
    public void testCarMovement() {
        car.move(15, 20);
        assertEquals(15, car.getXLoc());
        assertEquals(20, car.getYLoc());
    }

    @Test
    public void testCarAcceleration() {
        car.accelerate(30.0);
        assertEquals(30.0, car.getSpeed(), 0.01);
    }

    @Test
    public void testPlaneMovement() {
        plane.move(10, 20);
        assertEquals(10, plane.getXLoc());
        assertEquals(20, plane.getYLoc());
    }

    @Test
    public void testPlaneAcceleration() {
        plane.accelerate(30.0);
        assertEquals(30.0, plane.getSpeed(), 0.01);
    }

    @Test
    public void testInheritance() {
        Kendaraan k = new Car(0, 0, "B1234AB", 0.0);
        assertEquals("this method overriden by Child", k.methodParent());
    }

    @Test
    public void testToStringMethods() {
        assertNotNull(car.toString());
        assertNotNull(plane.toString());
        assertNotNull(motorcycle.toString());
        assertNotNull(bicycle.toString());
    }


    @Test(expected = Transportasi.KendaraanPenuhException.class)
    public void testKendaraanPenuhException() throws Transportasi.KendaraanPenuhException {
        int maxPenumpang = 4;
        int jumlahPenumpang = 5;

        if (jumlahPenumpang >= maxPenumpang) {
            throw new Transportasi.KendaraanPenuhException("Kendaraan sudah penuh");
        }
    }

    @Test(expected = Transportasi.KecepatanTerlaluTinggiException.class)
    public void testKecepatanTerlaluTinggiException() throws Transportasi.KecepatanTerlaluTinggiException {
        int kecepatan = 120;

        if (kecepatan > 100) {
            throw new Transportasi.KecepatanTerlaluTinggiException("Kecepatannya sangat tinggi");
        }
    }

    @Test
    public void testGenericClass() {
        Transportasi.MyGenericClass<Integer> myObj = new Transportasi.MyGenericClass<>(10);
        assertEquals(Integer.valueOf(10), myObj.getMyVar());
        assertEquals("java.lang.Integer", myObj.getMyVar().getClass().getName());

        Transportasi.MyGenericClass<String> myObj2 = new Transportasi.MyGenericClass<>("Transportasi");
        assertEquals("Transportasi", myObj2.getMyVar());
        assertEquals("java.lang.String", myObj2.getMyVar().getClass().getName());
    }
}
