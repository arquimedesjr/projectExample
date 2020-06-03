package Tests.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Tests.cenario1.Cenario1;
import Tests.cenario2.Cenario2;

@RunWith(Suite.class)
@Suite.SuiteClasses({ Cenario1.class, Cenario2.class, })
public class SuiteTests {
	

}
