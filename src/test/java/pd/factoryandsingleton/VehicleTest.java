package pd.factoryandsingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pd.factoryandsingleton.Driver;
import pd.factoryandsingleton.Fuel;
import pd.factoryandsingleton.Vehicle;

public class VehicleTest {
	
	@Test
	public void testVehicleLongStringStringListOfDriverEnum() { 
		List<Driver> drivers = new ArrayList<Driver>();
        drivers.add(new Driver(1, "1234", 6L));
        drivers.add(new Driver(2, "5678", 7L));
        drivers.add(new Driver(3, "2461", 8L));
		Vehicle vehicle = new Vehicle(1L, "BMW", "T1000", drivers, Fuel.GASOLINE);
		assertEquals(1L, vehicle.getId(), 0);
		assertEquals("BMW", vehicle.getBrand());
		assertEquals("T1000", vehicle.getModel());
		assertEquals(Fuel.GASOLINE, vehicle.getFuel());
		assertEquals(3, vehicle.getDrivers().size());
	}
	
	@Test
	public void testVehicleLong() { 
		Vehicle vehicle = new Vehicle(1L);
		assertEquals(1L, vehicle.getId(), 0);
		assertEquals("", vehicle.getBrand());
		assertEquals("", vehicle.getModel());
		assertEquals(Fuel.DIESEL, vehicle.getFuel());
		assertEquals(0, vehicle.getDrivers().size());
	}
	
	@Test
    public void testDriverContainsFalseNullDrivers(){
        List<Driver> drivers = null;
        Vehicle vehicle = new Vehicle(1L, "Ferrari", "Testarossa", drivers, Fuel.DIESEL);
        assertFalse(vehicle.driverContains(new Driver(1, "1234", 1L)));
    }
	
	@Test
    public void testDriverContainsDrivers(){
		Driver driver = new Driver(1, "1234", 6L);
		List<Driver> drivers = new ArrayList<Driver>();
        drivers.add(driver);
        Vehicle vehicle = new Vehicle(1L, "Ferrari", "Testarossa", drivers, Fuel.DIESEL);
        assertTrue(vehicle.driverContains(driver));
    } 
	
	@Test
    public void testDriverSetBrand(){
        Vehicle vehicle = new Vehicle(1L, "Ferrari", "Testarossa", new ArrayList<Driver>(), Fuel.DIESEL);
        vehicle.setBrand("BMW");
        assertEquals("BMW", vehicle.getBrand());
    }
	
	@Test
    public void testDriverSetModel(){
        Vehicle vehicle = new Vehicle(1L, "Ferrari", "Testarossa", new ArrayList<Driver>(), Fuel.DIESEL);
        vehicle.setModel("T1000");
        assertEquals("T1000", vehicle.getModel());
    }
	
	@Test
    public void testDriveSetDrivers(){
		List<Driver> drivers = new ArrayList<Driver>();
        drivers.add(new Driver(1, "1234", 6L));
        drivers.add(new Driver(2, "5678", 7L));
        drivers.add(new Driver(3, "2461", 8L));
        Vehicle vehicle = new Vehicle(1L, "Ferrari", "Testarossa", drivers, Fuel.DIESEL);
        drivers.clear();
        vehicle.setDrivers(drivers);
        assertEquals(0, vehicle.getDrivers().size());
    }
	
}
