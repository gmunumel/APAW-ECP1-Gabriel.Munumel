package pd.composite;

public class Adapter implements IAdapter { 
	
	private Driver adapteeDriver; 

    public Adapter(Driver driver) {
        this.adapteeDriver = driver;
    }

    @Override
    public int view() {
        return adapteeDriver.getId();
    }
}
