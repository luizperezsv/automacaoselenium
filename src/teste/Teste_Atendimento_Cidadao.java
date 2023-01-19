package teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_Atendimento_Cidadao {
	
	// Lista de cpf e cnpj inadequada. Funcional. Falta de teste unidade. sleep
	
	@Test
	public void Teste() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");
	
	
	String[] var1 = {"16763232870","25220077856","33192113820","34778000111","34801026893","29169652899"};
    String test_url = "CPF ou CNPJ não localizado no sistema";

	for (int i = 0; i < var1.length; i++) {

		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/aten/aten_valida.php");
		
	WebElement numero = driver.findElement(By.id("cpf_cnpj"));
	numero.isDisplayed();
	numero.isEnabled();
	numero.click();
	numero.sendKeys(var1[i]);
	
	 
	WebElement pesquisa = driver.findElement(By.id("cpf_cnpj_avancar"));
	pesquisa.isDisplayed();
	pesquisa.isEnabled();			
	pesquisa.click();
	
	WebElement volta = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div[3]/a"));
	volta.isDisplayed();
	volta.isEnabled();			
	volta.click();
	
    driver.close();
	}
	}

}
