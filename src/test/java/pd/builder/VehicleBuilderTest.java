package pd.builder;

import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pd.builder.Driver;
import pd.builder.Fuel;
import pd.builder.Vehicle;
import pd.builder.VehicleBuilder;

public class VehicleBuilderTest {

	@Test 
	public void testVehicleLongStrinStringListOfDriverEnum() {
		Vehicle vehicle = new VehicleBuilder().id(1L).brand("Ferrari").model("Carrera")
				.driver(new DriverBuilder().id(1).reference("1234").phone(1L).build())
				.driver(new DriverBuilder().id(2).reference("2345").phone(2L).build())
				.driver(new DriverBuilder().id(3).reference("2468").phone(3L).build()).build();
		assertEquals(1L, vehicle.getId(), 0);
		assertEquals("Ferrari", vehicle.getBrand());
		assertEquals("Carrera", vehicle.getModel());
		assertEquals(Fuel.GASOLINE, vehicle.getFuel());
		assertEquals(3, vehicle.getDrivers().size());
	}
	
	@Test
    public void testDriverContainsFalseNullDrivers(){
        Vehicle vehicle = new VehicleBuilder().id(1L).brand("Ferrari").brand("Testarossa").build();
        assertFalse(vehicle.driverContains(new Driver(1, "1234", 1L)));
    }
	
	@Test
    public void testDriverContainsFalse() {
		Vehicle vehicle = new VehicleBuilder().id(1L).brand("Ferrari")
				.brand("Testarossa").driver(new Driver(0, "2467", 0L)).build();
		assertFalse(vehicle.driverContains(new Driver(1, "1234", 1L)));
    }
	
	@Test
    public void testDriverContainsTrue() {
		Driver driver1 = new DriverBuilder().id(1).reference("1234").phone(1L).build();
		Driver driver2 = new DriverBuilder().id(2).reference("2468").phone(2L).build();
		Vehicle vehicle = new VehicleBuilder().id(1L).brand("Ferrari")
				.brand("Testarossa").driver(driver1).driver(driver2).build();
        assertTrue(vehicle.driverContains(driver1));
        assertTrue(vehicle.driverContains(driver2));
    }
}
