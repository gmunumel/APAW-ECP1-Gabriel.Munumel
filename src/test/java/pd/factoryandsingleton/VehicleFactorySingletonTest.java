package pd.factoryandsingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import pd.factoryandsingleton.VehicleFactorySingleton; 

public class VehicleFactorySingletonTest {

	@Before
	public void executedBeforeEach() {
		VehicleFactorySingleton.getInstance().clear();
	}
	
	@Test
    public void testIsSingleton() {
        assertSame(VehicleFactorySingleton.getInstance(), VehicleFactorySingleton.getInstance());
    }
	
	@Test
	public void testVehicleFactorySingleton() { 
		assertNotNull(VehicleFactorySingleton.getInstance()); 
	}
	
	@Test
	public void testVehicleFactorySingletonCreateVehicleLong() { 
		VehicleFactorySingleton.getInstance().addVehicle(1L);
		assertEquals(1, VehicleFactorySingleton.getInstance().getVehiclesSize()); 
	}
	
	@Test
	public void testVehicleFactorySingletonVehicleFound() {
		VehicleFactorySingleton.getInstance().addVehicle(1L);
		assertEquals(1L, VehicleFactorySingleton.getInstance().getVehicle(1L), 0); 
	}
	
	@Test
	public void testVehicleFactorySingletonVehicleNotFound() {
		VehicleFactorySingleton.getInstance().addVehicle(1L);
		assertEquals(-1L, VehicleFactorySingleton.getInstance().getVehicle(2L), 0); 
	}
	
	@Test
	public void testVehicleFactorySingletonRemoveVehicle() { 
		VehicleFactorySingleton.getInstance().addVehicle(1L);
		VehicleFactorySingleton.getInstance().removeVehicle(2L);
		assertEquals(1, VehicleFactorySingleton.getInstance().getVehiclesSize()); 
		VehicleFactorySingleton.getInstance().removeVehicle(1L); 
		assertEquals(0, VehicleFactorySingleton.getInstance().getVehiclesSize()); 
	} 
	
	@Test
	public void testVehicleFactorySingletonClear() { 
		assertEquals(0, VehicleFactorySingleton.getInstance().getVehiclesSize()); 
	} 
}
