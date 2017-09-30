package pd.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pd.factoryandsingleton.Driver;

public class DriverTest {

	@Test
	public void testDriverIntStringLong() {
		Driver driver = new Driver(1, "QWR123", 3L);
		assertEquals(1, driver.getId());
		assertEquals("QWR123", driver.getReference());
		assertEquals(3L, driver.getPhone(), 0);
	}
	
	@Test
	public void testDriverSetReference() { 
		Driver driver = new Driver(1, "QWR123", 3L);
		assertEquals("QWR123", driver.getReference());
		driver.setReference("AAA123");
		assertEquals("AAA123", driver.getReference());
	}
	
	@Test
	public void testDriverSetPhone() { 
		Driver driver = new Driver(1, "QWR123", 3L);
		assertEquals(3L, driver.getPhone(), 0);
		driver.setPhone(1L);
		assertEquals(1L, driver.getPhone(), 0);
	}
}
