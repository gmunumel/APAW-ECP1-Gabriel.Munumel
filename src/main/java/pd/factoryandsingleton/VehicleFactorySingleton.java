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
	
	public Vehicle getVehicle(Vehicle vehicle) { 
		return this.vehicles.computeIfAbsent(vehicle.getId(), k -> vehicle);
	}
	
	public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle.getId()); 
    }
	
	public int getVehiclesSize() {
		return this.vehicles.size();
	}
	
	public void clear() {
		this.vehicles.clear();
	}
}
