package videoteca;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BluRayTest.class, CassettaTest.class, DvdTest.class, VideotecaTest.class})
public class AllTests {

}
