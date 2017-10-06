package pd.composite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    DriverTest.class,
    VehicleTest.class,
    VehicleComponentTest.class
})
public class AllCompositeTests {
}
