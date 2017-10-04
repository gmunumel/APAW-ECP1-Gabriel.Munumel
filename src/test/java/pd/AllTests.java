package pd;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pd.builder.AllBuilderTests;
import pd.composite.AllCompositeTests;
import pd.factoryandsingleton.AllFactoryAndSingletonTests;
import pd.strategy.AllStrategyTests;

@RunWith(Suite.class)
@SuiteClasses({
	AllFactoryAndSingletonTests.class,
    AllBuilderTests.class,
    AllCompositeTests.class,
    AllStrategyTests.class
})
public class AllTests {

}
