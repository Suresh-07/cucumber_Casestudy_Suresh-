package Runner_cs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"src/test/resources/Casestudy/Multipleoption.feature"},glue = {"Definition"}, tags= "@PositiveTesting",plugin= {"html:suresh/Talakal.html"})
//@CucumberOptions (features = {"src/test/resources/Casestudy/Multipleoption.feature"},glue = {"Definition"},tags= "@NegativeTesting")
public class run_test{

}