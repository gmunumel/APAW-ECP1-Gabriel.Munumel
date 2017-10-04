package pd.composite;

import java.util.ArrayList; 
import java.util.List;

public class DriverComposite  extends DriverComponent {

	private String name;
	
	List<DriverComponent> driverComponentList;

    public DriverComposite(String name) {
    		this.name = name;
        driverComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(DriverComponent driverComponent) {
        assert driverComponent != null;
        driverComponentList.add(driverComponent);
    }

    @Override
    public void remove(DriverComponent driverComponent) {
        assert driverComponent != null;
        driverComponentList.remove(driverComponent);
    }
    
    @Override
    public int numberOfDriversPerLeaf() {
        return this.driverComponentList.size();
    }
    
    @Override
    public String toString() {
        return "[" + this.name + "]";
    }
}
