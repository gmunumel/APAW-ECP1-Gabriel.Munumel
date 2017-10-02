package pd.factoryandsingleton;

import java.util.HashMap;
import java.util.Map;

public class DriverSingletonFactory { 
	private static final DriverSingletonFactory factory = new DriverSingletonFactory(); 
	
	private Driver driver = null;
	
	private Map<Integer, Driver> drivers;
	
	private DriverSingletonFactory() { 
		this.drivers = new HashMap<Integer, Driver>();
		this.driver = new Driver();
	}

	public static synchronized DriverSingletonFactory getFactory() {
		return factory;
	}
	
	public void createDriver(int key) {
		this.driver.setId(key);
		this.drivers.put(key, driver);
	}
	
	public Driver getDriver(int key) { 
		return this.drivers.get(key);
	}
	
	public void removeDriver(int key) {
        this.drivers.remove(key); 
    }
	
	public int getDriversSize() {
		return this.drivers.size();
	}
	
	public void clear() {
		this.drivers.clear();
	}
}
