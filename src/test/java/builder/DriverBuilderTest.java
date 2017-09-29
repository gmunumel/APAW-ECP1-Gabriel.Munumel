package builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DriverBuilderTest {

	@Test
	public void testDriverIntStringLong() {
		Driver driver = new DriverBuilder()
				.id(1).reference("QWE1234").phone(1L).build();
		assertEquals(1, driver.getId());
		assertEquals("QWE1234", driver.getReference());
		assertEquals(1L, driver.getPhone(), 0);
	}
}
