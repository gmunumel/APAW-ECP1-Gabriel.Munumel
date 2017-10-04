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
		Vehicle vehicle = VehicleFactorySingleton.getInstance().getVehicle(new Vehicle(1L));
		assertNotNull(vehicle); 
	}
	
	@Test
	public void testVehicleFactorySingletonVehicleFound() { 
		Vehicle vehicle1 = VehicleFactorySingleton.getInstance().getVehicle(new Vehicle(1L));
		Vehicle vehicle2 = VehicleFactorySingleton.getInstance().getVehicle(new Vehicle(1L));
		assertSame(vehicle1, vehicle2); 
	}
	
	@Test
	public void testVehicleFactorySingletonRemoveVehicle() { 
		VehicleFactorySingleton.getInstance().getVehicle(new Vehicle(1L));
		VehicleFactorySingleton.getInstance().removeVehicle(new Vehicle(2L));
		assertEquals(1, VehicleFactorySingleton.getInstance().getVehiclesSize()); 
		VehicleFactorySingleton.getInstance().removeVehicle(new Vehicle(1L)); 
		assertEquals(0, VehicleFactorySingleton.getInstance().getVehiclesSize()); 
	} 
	
	@Test
	public void testVehicleFactorySingletonClear() { 
		assertEquals(0, VehicleFactorySingleton.getInstance().getVehiclesSize()); 
	} 
}
