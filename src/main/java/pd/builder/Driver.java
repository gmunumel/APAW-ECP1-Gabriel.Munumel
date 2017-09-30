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
	
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
	public String getReference() {
		return reference;
	}
	
	public Long getPhone() {
		return phone;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
}
