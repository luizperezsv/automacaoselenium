package teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_Veracidade_Holerith {
	
	@Test
	public void Teste() {
	
	// TODO Auto-generated method stub
	// Funcional. Falta teste de unidade
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

	
	
	String[] var1 = {"64007"};
	String[] var2 = {"099E.8001.BD726"};

	

	//String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/baw/certidaoValorVenal.php";


	
	
	for (int i = 0; i < var1.length; i++) {

		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/recursos_humanos/fol/veracidade_holerith.php");
		
	WebElement numero = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[1]/div/input"));
	numero.isDisplayed();
	numero.isEnabled();
	numero.click();
	numero.sendKeys(var1[i]);
	
	
	WebElement cpf = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[2]/div/input"));
	cpf.isDisplayed();
	cpf.isEnabled();
	cpf.click();
	cpf.sendKeys(var2[i]);
	
	
	

	
	

	WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[3]/div/input"));
	//pesquisa.isDisplayed();
	//pesquisa.isEnabled();
	
	pesquisa.click();
	//*
	
	//WebElement gerar = driver.findElement(By.xpath("[@id=\"tabela_lista_imoveis_empresas\"]/tbody/tr/td[1]/a"));
	//gerar.isDisplayed();
	//gerar.isEnabled();
	
	//gerar.click();

   // String curr_window_title = driver.getCurrentUrl();
    //Assert.assertEquals(curr_window_title, test_url);
   // System.out.println("AssertEquals Test Passed\n");
    
    
   

	//driver.close();
	}
	}	

}
