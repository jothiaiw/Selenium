package week6day1runtest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/week6day1feature/login.feature", 
      glue="week6day1steps",
      monochrome = true)

public class TestRun extends AbstractTestNGCucumberTests {
}
