package pd.factoryandsingleton;

public class DriverFlyweight {
	private int intrinsic;

    public DriverFlyweight(int intrinsic) {
        this.intrinsic = intrinsic;
    }

    public Driver add() {
    		return new Driver(this.intrinsic);
    }
}
