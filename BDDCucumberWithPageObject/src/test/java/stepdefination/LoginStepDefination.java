package stepdefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import initializer.PropertyFileInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPages;

public class LoginStepDefination {
	WebDriver driver;
	
	

	@Given("Open browser")
	public void open_browser() throws IOException {

		PropertyFileInitializer.initialize();
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		new LoginPages(driver);
		// to open web browser
	}

	@Then("Enter url {string}")
	public void enter_url(String url) {
		driver.get(url);
	}

	@Then("Enter valid username {string}")
	public void enter_valid_username(String name) {
		LoginPages.enterUsername(name);
	}

	@Then("enter valid password {string}")
	public void enter_valid_password(String password) {
		LoginPages.enterpassword(password);

	}

	@Then("click login")
	public void click_login() {
		LoginPages.click();

	}

}
