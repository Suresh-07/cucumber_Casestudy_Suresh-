package Definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class test_defn {
	public static String url="https://demo.guru99.com/test/newtours/";
    WebDriver driver;

	@When("Enter the username {string}")
	public void enter_the_username(String string) {
		WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(string);
	}
	    
	@And("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(string);
	}
	    
	
	@And("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@name='submit']")).click();
	    
	}
	@Then("I should see title as {string}")
	public void i_should_see_title_as(String string) {
		String suri =driver.getTitle();
		Assert.assertEquals(string,suri);
	}
}
	    
