package pd.composite;

public class VehicleLeaf extends VehicleComponent { 
	
	private Vehicle vehicle;
	
	public VehicleLeaf(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(VehicleComponent driverComponent) {
    		throw new UnsupportedOperationException("Operación no soportada");
    }
    
    @Override
    public int numberOfVehiclesPerLeaf() {
        return 1;
    }
    
    @Override
    public Long view() {
        return this.vehicle.getId();
    }

    @Override
    public String toString() {
        return "[Hoja=" + this.view() + "]";
    }
}
