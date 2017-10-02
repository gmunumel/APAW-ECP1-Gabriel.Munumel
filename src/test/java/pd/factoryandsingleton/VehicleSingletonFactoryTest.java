package pd.factoryandsingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import pd.factoryandsingleton.VehicleSingletonFactory;

public class VehicleSingletonFactoryTest {

	@Before
	public void executedBeforeEach() {
		VehicleSingletonFactory.getFactory().clear();
	}
	
	@Test
    public void testIsFactory() {
        assertSame(VehicleSingletonFactory.getFactory(), VehicleSingletonFactory.getFactory());
    }
	
	@Test
	public void testVehicleFactory() { 
		assertNotNull(VehicleSingletonFactory.getFactory()); 
	}
	
	@Test
	public void testVehicleFactoryCreateVehicleLong() { 
		VehicleSingletonFactory.getFactory().createVehicle(1L);
		assertNotNull(VehicleSingletonFactory.getFactory().getVehicle(1L)); 
	}
	
	@Test
	public void testVehicleFactoryGetVehicleFound() {
		VehicleSingletonFactory.getFactory().createVehicle(1L);
		assertNotNull(VehicleSingletonFactory.getFactory().getVehicle(1L)); 
	}
	
	@Test
	public void testVehicleFactoryGetVehicleNotFound() {
		VehicleSingletonFactory.getFactory().createVehicle(1L);
		assertNull(VehicleSingletonFactory.getFactory().getVehicle(2L)); 
	}
	
	@Test
	public void testVehicleFactoryRemoveVehicle() {
		VehicleSingletonFactory.getFactory().createVehicle(1L);
		VehicleSingletonFactory.getFactory().removeVehicle(2L);
		assertEquals(1, VehicleSingletonFactory.getFactory().getVehiclesSize()); 
		VehicleSingletonFactory.getFactory().removeVehicle(1L); 
		assertEquals(0, VehicleSingletonFactory.getFactory().getVehiclesSize()); 
	} 
	
	@Test
	public void testVehicleFactoryClear() { 
		assertEquals(0, VehicleSingletonFactory.getFactory().getVehiclesSize()); 
	} 
}
