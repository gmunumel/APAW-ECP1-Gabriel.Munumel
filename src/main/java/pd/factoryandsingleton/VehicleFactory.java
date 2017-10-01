package pd.factoryandsingleton;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

	private static final VehicleFactory factory = new VehicleFactory(); 
	
	private Map<Long, Vehicle> vehicles;
	
	private VehicleFactory() {
		this.vehicles = new HashMap<Long, Vehicle>();
	}
	
	public static VehicleFactory getFactory() {
		return factory;
	}
	
	public static Vehicle createVehicle(Long id) { 
		return new Vehicle(id);
	}
	
	public Vehicle getVehicle(Long key) { 
		return this.vehicles.computeIfAbsent(key, k -> createVehicle(key));
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
