package pd.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pd.builder.Driver;
import pd.builder.Fuel;
import pd.builder.Vehicle;

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
    public void testDriverContainsFalseNullDrivers(){
        List<Driver> drivers = null;
        Vehicle vehicle = new Vehicle(1L, "Ferrari", "Testarossa", drivers, Fuel.DIESEL);
        assertFalse(vehicle.driverContains(new Driver(1, "1234", 1L)));
    }
}
