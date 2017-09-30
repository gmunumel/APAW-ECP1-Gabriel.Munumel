package pd.factoryandsingleton;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
	private static final DriverFactory factory = new DriverFactory(); 
	
	private Map<Integer, Driver> drivers;
	
	private DriverFactory() {
		this.drivers = new HashMap<Integer, Driver>();
	}
	
	public static DriverFactory getFactory() {
		return factory;
	}
	
	public static Driver createDriver(int id) { 
		return new Driver(id);
	}
	
	public Driver getDriver(int key) { 
		Driver driver = this.drivers.get(key);
        if (driver == null) {
        		driver = createDriver(key);
            this.drivers.put(key, driver); 
        }
        return driver;
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
