package automacao;

import org.openqa.selenium.By;
import java.lang.Thread;
import java.io.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Atendimento_Cidadao_Consulta {

	public static void main(String[] args) {
		//Não funcional - numero de atendimento e data da autuação. Falta teste de unidade. 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

		
		
		String[] var1 = {"00042985", "0000025851", "0000025854", "dfggfd", "0000019812", "0000054865", "0000055584", "0000019275", "0000015866", "0000016786"};
		String[] var2 = {"14092022","01/06/2022","01/06/2022","10/12/2021","26/04/2022","07/12/2022","13/12/2022","25/04/2022","29/03/2022","04/04/2022"};
        //String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/aten/aten_valida.php";


		
		
		for (int i = 0; i < var1.length; i++) {

			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/aten/aten_valida.php?consulta");
			
		//WebElement consulta = driver.findElement(By.linkText("Consulta"));
		//consulta.isDisplayed();
		//consulta.isEnabled();
		//consulta.click();
		
		
		// Verificar campos
		WebElement numero = driver.findElement(By.xpath("//*[@id=\"mytab2\"]/form/div[1]/div/input"));
		numero.isDisplayed();
		numero.isEnabled();
		numero.click();
		numero.sendKeys(var1[i]);
		
		
		
		WebElement data = driver.findElement(By.xpath("//*[@id=\"mytab2\"]/form/div[1]/div/input"));
		data.isDisplayed();
		data.isEnabled();
		data.click();
		data.sendKeys(var2[i]);

		WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"mytab2\"]/form/div[3]/div/input"));
		pesquisa.isDisplayed();
		pesquisa.isEnabled();
		pesquisa.click();
	
        //String curr_window_title = driver.getCurrentUrl();
        //Assert.assertEquals(curr_window_title, test_url);
        //System.out.println("AssertEquals Test Passed\n");
        
        
       

		//driver.close();
		
		
		} 
	}
}
