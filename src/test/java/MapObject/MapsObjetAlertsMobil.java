package MapObject;

import org.openqa.selenium.By;
import DemoNav.ClaseBaseFinalMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetAlertsMobil extends ClaseBaseFinalMobil {

	public MapsObjetAlertsMobil(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	protected By alertsFrame = By.xpath("//android.widget.TextView[@text='Alerts, Frame & Windows']");
	protected By alerts = By.xpath("//android.widget.TextView[@text='Alerts']");
	protected By btnClic1 = By.xpath("//android.widget.Button[@resource-id='alertButton']");
	protected By btnClic12 = By.xpath("//android.widget.Button[@resource-id='com.android.chrome:id/positive_button']");
	protected By btnClic2 = By.xpath("//android.widget.Button[@resource-id='timerAlertButton']");
	protected By btnClic22 = By.xpath("//android.widget.Button[@resource-id='com.android.chrome:id/positive_button']");
	protected By btnClic3 = By.xpath("//android.widget.Button[@resource-id='confirmButton']");
	protected By btnClic33 = By.xpath("//android.widget.Button[@resource-id='com.android.chrome:id/positive_button']");
	protected By btnClic4 = By.xpath("//android.widget.Button[@resource-id='promtButton']");
	protected By btnClic44 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText");
	protected By btnClic444 = By.xpath("//android.widget.Button[@resource-id='com.android.chrome:id/positive_button']");
	
	

}
