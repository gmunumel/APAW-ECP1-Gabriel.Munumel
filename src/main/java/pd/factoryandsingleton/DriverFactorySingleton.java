package pd.factoryandsingleton;

import java.util.HashMap;
import java.util.Map;

public class DriverFactorySingleton {

	private static DriverFactorySingleton driverFactorySingleton;

	private Map<Integer, Driver> drivers;

	private DriverFactorySingleton() {
		drivers = new HashMap<Integer, Driver>();
	}

	public static DriverFactorySingleton getInstance() {
		if (driverFactorySingleton == null) {
			driverFactorySingleton = new DriverFactorySingleton();
		}
		return driverFactorySingleton;
	}

	public Driver getDriver(int key) {
		return drivers.computeIfAbsent(key, k -> new Driver(k));
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
