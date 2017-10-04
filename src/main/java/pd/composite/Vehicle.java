package pd.composite;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
	
	private Long id;
	
	private String model;
	
	private String brand;
	
	private Fuel fuel;
	
	private List<Driver> drivers;
	
	public Vehicle(Long id, String brand,  
			String model, List<Driver> drivers, Fuel fuel) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.drivers = drivers;
		this.fuel = fuel;
	} 
	
	public Vehicle(Long id) {
		this.id = id;
		this.brand = "";
		this.model = "";
		this.drivers = new ArrayList<Driver>();
		this.fuel = Fuel.DIESEL;
	}
	
	public Vehicle() {
		this.id = 0L;
		this.brand = "";
		this.model = "";
		this.drivers = new ArrayList<Driver>();
		this.fuel = Fuel.DIESEL;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public Long getId() {
		return id;
	}
	
	public Fuel getFuel() {
		return fuel;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}
	
	public List<Driver> getDrivers() {
		return drivers;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public boolean driverContains(Driver driver) {
        if (drivers == null) {
            return false;
        } else {
            return drivers.contains(driver);
        }
    } 
}
