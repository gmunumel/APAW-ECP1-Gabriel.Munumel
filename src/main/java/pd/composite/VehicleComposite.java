package pd.composite;

import java.util.ArrayList; 
import java.util.List;

public class VehicleComposite  extends VehicleComponent {

	private String name;
	
	List<VehicleComponent> vehicleComponentList;

    public VehicleComposite(String name) {
    		this.name = name;
        vehicleComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(VehicleComponent vehicleComponent) {
        assert vehicleComponent != null;
        vehicleComponentList.add(vehicleComponent);
    }
    
    @Override
    public int numberOfVehiclesPerLeaf() {
        return this.vehicleComponentList.size();
    }
    
    @Override
    public Long view() {
        return -1L;
    }
    
    @Override
    public String toString() {
    		StringBuilder result = new StringBuilder(); 
    		for(VehicleComponent veh : vehicleComponentList) {
    			result.append(veh.toString());
    		}
    		result.append("[" + this.name + "]");
        return result.toString();
    }
}
