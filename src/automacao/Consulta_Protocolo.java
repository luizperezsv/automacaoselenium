package automacao;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.*;

public class Consulta_Protocolo {

	public static void main(String[] args) {
		// Funcional. Falta teste de unidade. 
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

		
		
		String[] var1 = {"0000042985", "0000025851", "0000025854", "dfggfd", "0000019812", "0000054865", "0000055584", "0000019275", "0000015866", "0000016786"};
		String[] var2 = {"14/09/2022","01/06/2022","01/06/2022","10/12/2021","26/04/2022","07/12/2022","13/12/2022","25/04/2022","29/03/2022","04/04/2022"};
        String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/gpro/protocolo_resulta_numero.php";


		
		
		for (int i = 0; i < var1.length; i++) {

			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/gpro/protocolo_consulta.php");
			
		WebElement numero = driver.findElement(By.name("numero"));
		numero.isDisplayed();
		numero.isEnabled();
		numero.click();
		numero.sendKeys(var1[i]);
		
		WebElement data = driver.findElement(By.id("id-date-picker-1"));
		data.isDisplayed();
		data.isEnabled();
		//data.click();
		data.sendKeys(var2[i]);
		
		for(int j = 0;j<1000000000;j++) {
			for(int k = 0;k<100000000;k++) {
        	int cont = 0;
        	cont=cont+1;
			}
        }

		WebElement pesquisa = driver.findElement(By.id("submit"));
		pesquisa.isDisplayed();
		pesquisa.isEnabled();
		pesquisa.click();
		
		for(int j = 0;j<100000000;j++) {
			for(int k = 0;k<100000000;k++) {
        	int cont = 0;
        	cont=cont+1000;
			}
        }
		
		
		
	
        String curr_window_title = driver.getCurrentUrl();
        Assert.assertEquals(curr_window_title, test_url);
        System.out.println("AssertEquals Test Passed\n");
        
        

       
        
		driver.close();
		
		
		} 
		
		
		
		
		
		
		
		
	}

}
