package builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DriverTest {

	@Test
	public void testDriverIntStringLong() {
		Driver driver = new Driver(1, "QWR123", 3L);
		assertEquals(1, driver.getId());
		assertEquals("QWR123", driver.getReference());
		assertEquals(3L, driver.getPhone(), 0);
	}
}
