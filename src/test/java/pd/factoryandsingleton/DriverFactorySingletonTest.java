package pd.factoryandsingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import pd.factoryandsingleton.DriverFactorySingleton;

public class DriverFactorySingletonTest {

	@Before
	public void executedBeforeEach() {
		DriverFactorySingleton.getInstance().clear();
	}
	
	@Test
    public void testIsSingleton() {
        assertSame(DriverFactorySingleton.getInstance(), DriverFactorySingleton.getInstance());
    }
	
	@Test
	public void testDriverFactorySingleton() { 
		assertNotNull(DriverFactorySingleton.getInstance()); 
	}
	
	@Test
	public void testDriverFactorySingletonCreateDriverInt() { 
		Driver driver = DriverFactorySingleton.getInstance().getDriver(1);
		assertNotNull(driver); 
	}
	
	@Test
	public void testDriverFactorySingletonDriverFound() { 
		Driver driver1 = DriverFactorySingleton.getInstance().getDriver(1);
		Driver driver2 = DriverFactorySingleton.getInstance().getDriver(1);
		assertSame(driver1, driver2); 
	}
	
	@Test
	public void testDriverFactorySingletonRemoveDriver() { 
		DriverFactorySingleton.getInstance().getDriver(1);
		DriverFactorySingleton.getInstance().removeDriver(2);
		assertEquals(1, DriverFactorySingleton.getInstance().getDriversSize()); 
		DriverFactorySingleton.getInstance().removeDriver(1); 
		assertEquals(0, DriverFactorySingleton.getInstance().getDriversSize()); 
	} 
	
	@Test
	public void testDriverFactoryClear() { 
		assertEquals(0, DriverFactorySingleton.getInstance().getDriversSize()); 
	} 
}
