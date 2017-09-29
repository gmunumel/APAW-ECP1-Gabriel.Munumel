package builder;

public class DriverBuilder {

	private Driver driver;
	
	public DriverBuilder(int id, String reference, Long phone) {
		this.driver = new Driver(id, reference, phone);
	}
	
	public DriverBuilder() {
		this(0, "", 0L);
	}
	
	public DriverBuilder id(int id) {
		this.driver = new Driver(id, "", 0L);
		return this;
	}
	
	public DriverBuilder reference(String reference) {
		this.driver.setReference(reference);
		return this;
	}
	
	public DriverBuilder phone(Long phone) {
		this.driver.setPhone(phone);
		return this;
	}
	
	public Driver build() {
        return this.driver;
    }
}
