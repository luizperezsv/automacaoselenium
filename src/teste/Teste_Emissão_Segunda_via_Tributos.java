package teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_Emissão_Segunda_via_Tributos {
	
	

	
	@Test 
	public void Teste() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

	
	String[] var1 = {"0071000302100669000","0071000302100175000","0071000302100160000"};
	//String[] var2 = {"057986","073702","062857","054596","056875", "062399"};
	
	//String[] var1 = {"7109268926800000000","7109270927000000000","3605443222800640000"};
	//String[] var2 = {"2022","2022","2022"};

	String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/2via/Ctec_Imobiliario.php";


	
	
	for (int i = 0; i < var1.length; i++) {

		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/2via/index.php");
		
	WebElement numero = driver.findElement(By.name("inscricaoIPTU"));
	numero.isDisplayed();
	numero.isEnabled();
	numero.click();
	numero.sendKeys(var1[i]);
	
	
	
	
	
	
	

	WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"2viaIptu\"]/div/div/form/input[2]"));
	//pesquisa.isDisplayed();
	//pesquisa.isEnabled();
	
	pesquisa.click();
	//*
	
	//WebElement gerar = driver.findElement(By.xpath("[@id=\"tabela_lista_imoveis_empresas\"]/tbody/tr/td[1]/a"));
	//gerar.isDisplayed();
	//gerar.isEnabled();
	
	//gerar.click();

    String curr_window_title = driver.getCurrentUrl();
    Assert.assertEquals(curr_window_title, test_url);
    System.out.println("AssertEquals Test Passed\n");
    
    
   

	driver.close();
	}
}
	}
	
