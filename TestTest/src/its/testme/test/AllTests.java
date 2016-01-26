package its.testme.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import its.testme.test.stipendi.AziendaTest;

@RunWith(Suite.class)
@SuiteClasses({AziendaTest.class})
public class AllTests {

}
