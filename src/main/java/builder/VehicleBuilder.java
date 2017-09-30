package builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehicleBuilder {
	
	private List<Driver> drivers;
	
	private Vehicle vehicle; 
	
	public VehicleBuilder(Long id, String brand, String model,
			List<Driver> drivers, Fuel fuel) {
		this.vehicle = new Vehicle(id, brand, model, drivers, fuel);
	}
	
	public VehicleBuilder() {
		this(0L, "", "", Collections.<Driver>emptyList(), Fuel.DIESEL);
	}
	
	public VehicleBuilder id(Long id) {
		this.vehicle = new Vehicle(id, "", "", Collections.<Driver>emptyList(), Fuel.GASOLINE);
		return this;
	}
	
	public VehicleBuilder brand(String brand) {
		this.vehicle.setBrand(brand);
		return this;
	}
	
	public VehicleBuilder model(String model) {
		this.vehicle.setModel(model);
		return this;
	}
	
	public VehicleBuilder driver(Driver driver) {
        if (this.drivers == null) {
            this.drivers = new ArrayList<Driver>();
            this.vehicle.setDrivers(drivers);
        }
        this.drivers.add(driver);
        return this;
    }
	
	public Vehicle build() {
        return this.vehicle;
    }
}
