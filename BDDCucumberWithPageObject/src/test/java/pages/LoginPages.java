package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import initializer.PropertyFileInitializer;

public class LoginPages extends PropertyFileInitializer {
	static WebDriver driver;

	public LoginPages(WebDriver driver) {
		this.driver=driver;
	}
	public static void enterUsername(String name) {
		WebElement username =driver.findElement(By.xpath(property.getProperty("username_txtbox")));
		username.sendKeys(name);

	}
	public static void enterpassword(String password){
		WebElement username =driver.findElement(By.xpath(property.getProperty("password_txt")));
		username.sendKeys(password);

	}
	public static void click() {
		WebElement login = driver.findElement(By.xpath(property.getProperty("Login_btn")));
		login.click();

	}

}
