package week6day1runtestupdated1;

import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/week6day1featureupdated1/LoginUpdated.feature",
                 glue = "week6day1stepsupdated1",
                 monochrome = true)
               /*  dryRun=true,
				 snippets=SnippetType.CAMELCASE)*/

public class RunTestUpdated extends AbstractTestNGCucumberTests {

}
