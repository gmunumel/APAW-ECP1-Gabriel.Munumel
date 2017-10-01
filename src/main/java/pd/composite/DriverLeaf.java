package pd.composite;

public class DriverLeaf extends DriverComponent {
	
	private Driver driver;
	
	public DriverLeaf(Driver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(DriverComponent driverComponent) {
    		// Do nothing because is leaf
    }

    @Override
    public void remove(DriverComponent driverComponent) {
    		// Do nothing because is leaf
    }

    public Driver getDriver() {
        return driver;
    }

}
