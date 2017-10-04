package pd.composite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    DriverTest.class,
    VehicleTest.class,
    DriverComponentTest.class
})
public class AllCompositeTests {
}
