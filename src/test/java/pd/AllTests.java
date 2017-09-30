package pd;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pd.builder.AllBuilderTests;
import pd.factoryandsingleton.AllFactoryAndSingletonTests;

@RunWith(Suite.class)
@SuiteClasses({
    AllBuilderTests.class,
    AllFactoryAndSingletonTests.class
    
})
public class AllTests {

}
