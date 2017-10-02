package pd.factoryandsingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import pd.factoryandsingleton.DriverSingletonFactory;

public class DriverSingletonFactoryTest {

	@Before
	public void executedBeforeEach() {
		DriverSingletonFactory.getFactory().clear();
	}
	
	@Test
    public void testIsFactory() {
        assertSame(DriverSingletonFactory.getFactory(), DriverSingletonFactory.getFactory());
    }
	
	@Test
	public void testDriverFactory() { 
		assertNotNull(DriverSingletonFactory.getFactory()); 
	}
	
	@Test
	public void testDriverFactoryCreateDriverInt() { 
		DriverSingletonFactory.getFactory().createDriver(1);
		assertNotNull(DriverSingletonFactory.getFactory().getDriver(1)); 
	}
	
	@Test
	public void testDriverFactoryGetDriverFound() {
		DriverSingletonFactory.getFactory().createDriver(1);
		assertNotNull(DriverSingletonFactory.getFactory().getDriver(1));  
	}
	
	@Test
	public void testDriverFactoryGetDriverNotFound() {
		DriverSingletonFactory.getFactory().createDriver(1);
		assertNull(DriverSingletonFactory.getFactory().getDriver(2)); 
	}
	
	@Test
	public void testDriverFactoryRemoveDriver() { 
		DriverSingletonFactory.getFactory().createDriver(1);
		DriverSingletonFactory.getFactory().removeDriver(2);
		assertEquals(1, DriverSingletonFactory.getFactory().getDriversSize()); 
		DriverSingletonFactory.getFactory().removeDriver(1); 
		assertEquals(0, DriverSingletonFactory.getFactory().getDriversSize()); 
	} 
	
	@Test
	public void testDriverFactoryClear() { 
		assertEquals(0, DriverSingletonFactory.getFactory().getDriversSize()); 
	} 
}
