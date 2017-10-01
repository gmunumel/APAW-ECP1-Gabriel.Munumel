package pd;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pd.builder.AllBuilderTests;
import pd.factoryandsingleton.AllFactoryAndSingletonTests;
import pd.strategy.AllStrategyTests;

@RunWith(Suite.class)
@SuiteClasses({
    AllBuilderTests.class,
    AllFactoryAndSingletonTests.class,
    AllStrategyTests.class
})
public class AllTests {

}
