package teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_Demonstrativo_Pagamento_IPTU {
	
	
	@Test
	public void Teste() {

	// Funcional. Falta de teste de unidade e time sleep
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

			
			
			String[] var1 = {"0071000302100669000","0071000302100175000","0071000302100160000"};
			String[] var2 = {"2022","2022","2022"};
		    String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/iptu/iptu_resulta_pagamentos.php";

			for (int i = 0; i < var1.length; i++) {

				
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
				
			driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/iptu/iptu_consulta_pagamentos.php");
				
			WebElement numero = driver.findElement(By.name("inscricao"));
			numero.isDisplayed();
			numero.isEnabled();
			numero.click();
			numero.sendKeys(var1[i]);
			
			WebElement ano = driver.findElement(By.name("ano"));
			ano.isDisplayed();
			ano.isEnabled();
			ano.click();
			ano.sendKeys(var2[i]);
			
			WebElement pesquisa = driver.findElement(By.name("consultar"));
			pesquisa.isDisplayed();
			pesquisa.isEnabled();
			pesquisa.click();
			
			 String curr_window_title = driver.getCurrentUrl();
		     Assert.assertEquals(curr_window_title, test_url);
		     System.out.println("AssertEquals Test Passed\n");
			
			driver.close();		
			}
		
			}

}
