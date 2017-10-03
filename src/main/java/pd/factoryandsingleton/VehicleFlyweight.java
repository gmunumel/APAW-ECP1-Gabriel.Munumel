package pd.factoryandsingleton;

public class VehicleFlyweight {
	private Long intrinsic;

    public VehicleFlyweight(Long intrinsic) {
        this.intrinsic = intrinsic;
    }

    public Vehicle add() {
    		return new Vehicle(this.intrinsic);
    }
}
