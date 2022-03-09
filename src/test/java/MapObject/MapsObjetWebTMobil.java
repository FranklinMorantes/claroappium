package MapObject;

import org.openqa.selenium.By;
import DemoNav.ClaseBaseFinalMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetWebTMobil extends ClaseBaseFinalMobil {
	// CONSTRUCTOR DE LA CLASE
	public MapsObjetWebTMobil(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;

	}

	protected By firstName = By.xpath("//input[@placeholder='First Name']");
	protected By lastName = By.xpath("//input[@placeholder='Last Name']");
	protected By userEmail = By.xpath("//input[@id='userEmail']");
	protected By userEdad = By.xpath("//input[@id='age']");
	protected By userSalario = By.xpath("//input[@id='salary']");
	protected By userDepartment = By.xpath("//input[@id='department']");
	protected By sendInfo = By.xpath("//button[@id='submit']");

}
