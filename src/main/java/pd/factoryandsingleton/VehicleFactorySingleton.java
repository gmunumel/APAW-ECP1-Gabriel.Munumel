package pd.factoryandsingleton;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactorySingleton {
	
	private static VehicleFactorySingleton vehicleFactorySingleton;
	
	private Map<Long, Vehicle> vehicles; 
	
	private VehicleFactorySingleton() {
		this.vehicles = new HashMap<Long, Vehicle>();
	}
	
	public static VehicleFactorySingleton getInstance() {
		if (vehicleFactorySingleton == null) {
			vehicleFactorySingleton = new VehicleFactorySingleton();
		}
		return vehicleFactorySingleton;
	}
	
	public Long getVehicle(Long key) {
		return this.vehicles.containsKey(key) ? key : -1L;
	}
	
	public void addVehicle(Long key) {
		this.vehicles.put(key, null);
	}
	
	public void removeVehicle(Long key) {
        this.vehicles.remove(key); 
    }
	
	public int getVehiclesSize() {
		return this.vehicles.size();
	}
	
	public void clear() {
		this.vehicles.clear();
	}
}
