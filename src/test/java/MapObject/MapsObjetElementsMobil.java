package MapObject;

import org.openqa.selenium.By;


import DemoNav.ClaseBaseFinalMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetElementsMobil extends ClaseBaseFinalMobil 
{
	public MapsObjetElementsMobil (AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	
	protected By paginaPrinc = By.xpath("//android.widget.ImageButton[@content-desc='Página principal']");
	protected By segundoBox = By.xpath("//android.widget.EditText[@text='Busca o escribe una URL']");
	protected By selecVinculo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout");
	protected By SearchBar = By.xpath("//android.widget.EditText[@text = 'Busca o escribe la dirección web']");
	protected By Table = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.ListView/android.view.View[4]");
	protected By FirtsName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]");
	

}
 