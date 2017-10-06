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
    		throw new UnsupportedOperationException("Operación no soportada");
    }
    
    @Override
    public int numberOfDriversPerLeaf() {
        return 1;
    }
    
    @Override
    public int view() {
        return this.driver.getId();
    }

    @Override
    public String toString() {
        return "[Hoja=" + this.view() + "]";
    }
}
