package PageObject;

import java.io.File;
import java.util.Properties;

import MapObject.MapsObjetElementsMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;

public class PagsObjectElementsMobil extends MapsObjetElementsMobil
{
		public PagsObjectElementsMobil(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	
	public void urlAcceso(String url) 
	{
		driver.get(url);
	}
	
	
	public void seleccionElements(ReadExcelFile leer, Properties propiedades, String nomTest, File rutaCarpeta) throws Exception
		{

			
		click(paginaPrinc, rutaCarpeta);
		tiempoEspera(3000);
		click(segundoBox, rutaCarpeta);
		tiempoEspera(1000);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"), "datos", 1, 1), segundoBox,rutaCarpeta);     
		tiempoEspera(1000);
		click(selecVinculo,rutaCarpeta);
		scrollVertical1(rutaCarpeta, 362, 1110, 362, 1);
		tiempoEspera(3000);
		tocarPantalla(538,878);
		tiempoEspera(3000);
	
			
			
	
		
			
		
		}

	
	/*public void selecDelete( File rutaCarpeta) throws Exception
	{
	
		click(Delete, rutaCarpeta);
		tiempoEspera(3000);
		
	}*/
	

}
