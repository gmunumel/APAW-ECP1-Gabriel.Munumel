package pd.factoryandsingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import pd.factoryandsingleton.Driver;
import pd.factoryandsingleton.DriverFactory;

public class DriverFactoryTest {

	@Before
	public void executedBeforeEach() {
		DriverFactory.getFactory().clear();
	}
	
	@Test
    public void testIsFactory() {
        assertSame(DriverFactory.getFactory(), DriverFactory.getFactory());
    }
	
	@Test
	public void testDriverFactory() { 
		assertNotNull(DriverFactory.getFactory()); 
	}
	
	@Test
	public void testDriverFactoryCreateDriverInt() { 
		DriverFactory.getFactory();
		Driver driver = DriverFactory.createDriver(1);
		assertNotNull(driver); 
		assertEquals(1, driver.getId());
	}
	
	@Test
	public void testDriverFactoryGetDriverFound() {
		DriverFactory.getFactory();
		DriverFactory.createDriver(1);
		Driver driver  = DriverFactory.getFactory().getDriver(1);
		assertNotNull(driver); 
		assertEquals(1, driver.getId());  
	}
	
	@Test
	public void testDriverFactoryGetDriverNotFound() {
		DriverFactory.getFactory();
		DriverFactory.createDriver(1);
		Driver driver = DriverFactory.getFactory().getDriver(2);
		assertNotNull(driver); 
		assertEquals(2, driver.getId()); 
	}
	
	@Test
	public void testDriverFactoryRemoveDriver() { 
		DriverFactory.getFactory();
		DriverFactory.getFactory().getDriver(1);
		DriverFactory.getFactory().removeDriver(2);
		assertEquals(1, DriverFactory.getFactory().getDriversSize()); 
		DriverFactory.getFactory().removeDriver(1); 
		assertEquals(0, DriverFactory.getFactory().getDriversSize()); 
	} 
	
	@Test
	public void testDriverFactoryClear() { 
		assertEquals(0, DriverFactory.getFactory().getDriversSize()); 
	} 
}
