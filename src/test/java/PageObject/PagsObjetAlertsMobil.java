package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.Alert;
import MapObject.MapsObjetAlertsMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetAlertsMobil extends MapsObjetAlertsMobil {

	public PagsObjetAlertsMobil(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public void findAlerts (ReadExcelFile leer, Properties propiedades,String nomTest,File rutaCarpeta) throws Exception {
		
		scrollVertical1(rutaCarpeta, 340, 380, 700, 2);
		
		click(alertsFrame, rutaCarpeta);
		tiempoEspera(2000);
		
		scrollVertical1(rutaCarpeta, 340, 380, 700, 3);
		click(alerts, rutaCarpeta);
		tiempoEspera(1000);
		
		click(btnClic1, rutaCarpeta);
		click(btnClic12, rutaCarpeta);
		tiempoEspera(500);
		click(btnClic2, rutaCarpeta);
		tiempoEspera(5000);
	    click(btnClic22, rutaCarpeta);
		tiempoEspera(500);
		click(btnClic3, rutaCarpeta);
		tiempoEspera(500);
		click(btnClic33, rutaCarpeta);
		click(btnClic4, rutaCarpeta);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"), "datos", 1, 8), btnClic44,rutaCarpeta);     
		click(btnClic444, rutaCarpeta);
		//tiempoEspera(500);
		//driver.switchTo().alert().sendKeys(leer.getCellValue(propiedades.getProperty("PathExcel"),nomTest,1,8));
		//alert(); 
		
	}

}
