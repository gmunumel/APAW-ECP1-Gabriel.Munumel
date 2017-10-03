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
	
	public Vehicle getVehicle(Long key) { 
//		if (vehicles.containsKey(key)) {
//			return vehicles.get(key);
//		} else {
//			Vehicle vehicle = new Vehicle(key);
//			vehicles.put(key, vehicle);
//			return vehicle;
//		}
		return vehicles.computeIfAbsent(key, k -> new Vehicle(k));
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
