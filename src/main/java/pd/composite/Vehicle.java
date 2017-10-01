package pd.composite;

import java.util.List;

public class Vehicle {
	
	private Long id;
	
	private String brand;
	
	private String model;
	
	private List<Driver> drivers;
	 
	private Fuel fuel;
	
	public Vehicle(Long id, String brand, 
			String model, List<Driver> drivers, Fuel fuel) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.drivers = drivers;
		this.fuel = fuel;
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
