package week6day1runtestupdated;

import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/week6day1featureupdated/LoginUpdated.feature",
                 glue = "week6day1stepsupdated",
                 monochrome = true)
               /*  dryRun=true,
				 snippets=SnippetType.CAMELCASE)*/

public class RunTestUpdated extends AbstractTestNGCucumberTests {

}
