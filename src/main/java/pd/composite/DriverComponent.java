package pd.composite;

public abstract class DriverComponent {

    public DriverComponent() {

    }
    
    public abstract boolean isComposite();
    
    public abstract void add(DriverComponent driverComponent);
    
    public abstract void remove(DriverComponent driverComponent);
}
