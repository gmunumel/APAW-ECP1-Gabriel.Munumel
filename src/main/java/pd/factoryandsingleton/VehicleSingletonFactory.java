package pd.factoryandsingleton;

import java.util.HashMap;
import java.util.Map;

public class VehicleSingletonFactory { 
	private static final VehicleSingletonFactory factory = new VehicleSingletonFactory(); 
	
	private Vehicle vehicle = null;
	
	private Map<Long, Vehicle> vehicles;
	
	private VehicleSingletonFactory() {
		this.vehicles = new HashMap<Long, Vehicle>();
		this.vehicle = new Vehicle();
	}
	
	public static VehicleSingletonFactory getFactory() {
		return factory;
	}
	
	public void createVehicle(Long key) { 
		this.vehicle.setId(key);
		this.vehicles.put(key, vehicle);
	}
	
	public Vehicle getVehicle(Long key) { 
		return this.vehicles.get(key);
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
