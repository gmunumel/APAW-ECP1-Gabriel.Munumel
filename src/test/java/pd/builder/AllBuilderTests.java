package pd.builder;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    DriverTest.class,
    DriverBuilderTest.class,
    VehicleTest.class,
    VehicleBuilderTest.class
})
public class AllBuilderTests {
}
