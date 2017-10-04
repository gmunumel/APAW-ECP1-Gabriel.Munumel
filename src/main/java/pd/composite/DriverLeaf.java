package pd.composite;

public class DriverLeaf extends DriverComponent { 
	
	private Adapter driverAdapter;
	
	public DriverLeaf(Adapter driverAdapter) {
        this.driverAdapter = driverAdapter;
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
    public void remove(DriverComponent driverComponent) {
    		// Do nothing because is leaf
    }
    
    @Override
    public int numberOfDriversPerLeaf() {
        return 1;
    }

    @Override
    public String toString() {
        return "Hoja[" + this.driverAdapter.view() + "]";
    }
}
