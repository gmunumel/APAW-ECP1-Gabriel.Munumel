package pd.composite;

public abstract class DriverComponent {
    
    public abstract boolean isComposite();
    
    public abstract void add(DriverComponent driverComponent);
    
    public abstract int numberOfDriversPerLeaf();
    
    public abstract int view();
}
