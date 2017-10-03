package pd.factoryandsingleton;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
	
	private Long id;
	
	private String brand;
	
	private String model;
	
	private List<Driver> drivers;
	 
	private Fuel fuel;
	
	public Vehicle() {
		this.id = 0L;
		this.brand = "";
		this.model = "";
		this.drivers = new ArrayList<Driver>();
		this.fuel = Fuel.DIESEL;
	}
	
	public Vehicle(Long id) {
		this.id = id;
		this.brand = "";
		this.model = "";
		this.drivers = new ArrayList<Driver>();
		this.fuel = Fuel.DIESEL;
	}
	
	public Vehicle(Long id, String brand, 
			String model, List<Driver> drivers, Fuel fuel) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.drivers = drivers;
		this.fuel = fuel;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public List<Driver> getDrivers() {
		return drivers;
	}
	
	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}
	
	public Fuel getFuel() {
		return fuel;
	}
	
	public boolean driverContains(Driver driver) {
        if (drivers == null) {
            return false;
        } else {
            return drivers.contains(driver);
        }
    } 
}
