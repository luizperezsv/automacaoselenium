package teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_Publicação_Ata_Registro_Preço {
	
	
	@Test
	public void Teste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

		
		
		
		String[] var1 = {"1097"};
		

		//String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/geda/geda_dividas.php";


		
		
		for (int i = 0; i < var1.length; i++) {

			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/materiais/sup/sup-registro-preco.php");
			
		WebElement numero = driver.findElement(By.xpath("//*[@id=\"table-modalidade_filter\"]/label/input"));
		//numero.isDisplayed();
		//numero.isEnabled();
		//numero.click();
		numero.sendKeys(var1[i]);
		numero.click();
		
		
		
		
		
		
		

		//WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"Pessoa\"]/form/div/button"));
		//pesquisa.isDisplayed();
		//pesquisa.isEnabled();
		
		//pesquisa.click();
		//*
		
		//WebElement gerar = driver.findElement(By.xpath("[@id=\"tabela_lista_imoveis_empresas\"]/tbody/tr/td[1]/a"));
		//gerar.isDisplayed();
		//gerar.isEnabled();
		
		//gerar.click();
	
        //String curr_window_title = driver.getCurrentUrl();
        //Assert.assertEquals(curr_window_title, test_url);
        //System.out.println("AssertEquals Test Passed\n");
        
        
       

		//driver.close();
		
		}
	}
	

}
