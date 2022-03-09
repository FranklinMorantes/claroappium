package PageObject;

import java.io.File;
import java.util.Properties;
import MapObject.MapsObjetWebTMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetWebTMobil extends  MapsObjetWebTMobil
{
	public PagsObjetWebTMobil(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	public void EnvioTexto(ReadExcelFile leer, Properties propiedades,String numHoja,File rutaCarpeta ) throws Exception 
	{

		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,2),firstName,rutaCarpeta);
	
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,3),lastName,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,4),userEmail,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,5),userEdad,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,6),userSalario,rutaCarpeta);
	
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,7),userDepartment,rutaCarpeta);
		
		click( sendInfo, rutaCarpeta);
		tiempoEspera(1000);

		
	}
	
	

}
