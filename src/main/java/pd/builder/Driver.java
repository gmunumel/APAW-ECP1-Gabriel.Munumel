package pd.builder;

public class Driver {
	
	private int id;
	
	private String reference;
	
	private Long phone; 

	public Driver(int id, String reference, Long phone) {
		this.id = id;
		this.reference = reference;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public Long getPhone() {
		return phone;
	}
	
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
}
