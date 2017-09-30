package pd.factoryandsingleton;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    DriverTest.class,
    DriverFactoryTest.class,
    VehicleTest.class,
    VehicleFactoryTest.class
})
public class AllFactoryAndSingletonTests {
}
