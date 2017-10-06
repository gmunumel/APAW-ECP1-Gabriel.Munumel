package pd.composite;

public abstract class VehicleComponent {
    
    public abstract boolean isComposite();
    
    public abstract void add(VehicleComponent vehicleComponent);
    
    public abstract int numberOfVehiclesPerLeaf();
    
    public abstract Long view();
}
