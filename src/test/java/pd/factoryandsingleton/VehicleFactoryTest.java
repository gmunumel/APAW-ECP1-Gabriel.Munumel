package pd.factoryandsingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import pd.factoryandsingleton.Vehicle;
import pd.factoryandsingleton.VehicleFactory;

public class VehicleFactoryTest {

	@Before
	public void executedBeforeEach() {
		VehicleFactory.getFactory().clear();
	}
	
	@Test
    public void testIsFactory() {
        assertSame(VehicleFactory.getFactory(), VehicleFactory.getFactory());
    }
	
	@Test
	public void testVehicleFactory() { 
		assertNotNull(VehicleFactory.getFactory()); 
	}
	
	@Test
	public void testVehicleFactoryCreateVehicleLong() { 
		VehicleFactory.getFactory();
		Vehicle vehicle = VehicleFactory.createVehicle(1L);
		assertNotNull(vehicle); 
		assertEquals(1L, vehicle.getId(), 0);
	}
	
	@Test
	public void testVehicleFactoryGetVehicleFound() {
		VehicleFactory.getFactory();
		VehicleFactory.createVehicle(1L);
		Vehicle vehicle = VehicleFactory.getFactory().getVehicle(1L);
		assertNotNull(vehicle); 
		assertEquals(1L, vehicle.getId(), 0);  
	}
	
	@Test
	public void testVehicleFactoryGetVehicleNotFound() {
		VehicleFactory.getFactory();
		VehicleFactory.createVehicle(1L);
		Vehicle vehicle = VehicleFactory.getFactory().getVehicle(2L);
		assertNotNull(vehicle); 
		assertEquals(2L, vehicle.getId(), 0); 
	}
	
	@Test
	public void testVehicleFactoryRemoveVehicle() {
		VehicleFactory.getFactory();
		VehicleFactory.getFactory().getVehicle(1L);
		VehicleFactory.getFactory().removeVehicle(2L);
		assertEquals(1, VehicleFactory.getFactory().getVehiclesSize()); 
		VehicleFactory.getFactory().removeVehicle(1L); 
		assertEquals(0, VehicleFactory.getFactory().getVehiclesSize()); 
	} 
	
	@Test
	public void testVehicleFactoryClear() { 
		assertEquals(0, VehicleFactory.getFactory().getVehiclesSize()); 
	} 
}
