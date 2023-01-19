package teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_Consulta_Legislativa {

	@Test
	public void Teste() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

	
	
	String[] var1 = {"Lei Complementar"};
	String[] var2 = {"238"};
	//String[] var3 = {"1999"};
	String[] var4 = {"Projeto de Lei Complementar nº 13/99de autoria do Vereador Carlos Santiago Dispõe sobre o cancelamento de débitos dos contribuintes prestadores de serviços constituídos sob a forma de microempresas nos termos que especifica. "};
	String[] var5 = {"VEREADOR CARLOS SANTIAGO"};
	
	//String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/legislativo/leis/consulta_leis.php";


	
	
	for (int i = 0; i < var1.length; i++) {

		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/legislativo/leis/consulta_leis.php");
		
	//WebElement categoria = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[1]/div/div/a/span"));
	//categoria.isDisplayed();
	//categoria.isEnabled();
	//categoria.click();
	//categoria.sendKeys(var1[i]);
	
	
	
	WebElement numero = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[2]/div/input"));
	numero.isDisplayed();
	numero.isEnabled();
	numero.click();
	numero.sendKeys(var2[i]);
	
	
	//WebElement criacao = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[3]/div/div/a/span"));
	//criacao.isDisplayed();
	//criacao.isEnabled();
	//criacao.click();
	//criacao.sendKeys(var3[i]);
	
	
	WebElement ementa = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[4]/div/input"));
	ementa.isDisplayed();
	ementa.isEnabled();
	ementa.click();
	ementa.sendKeys(var4[i]);
	
	
	WebElement autor = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[5]/div/input"));
	autor.isDisplayed();
	autor.isEnabled();
	autor.click();
	autor.sendKeys(var5[i]);
	
	
	
	
	
	
	
	
	

	WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[9]/div/input[2]"));
	pesquisa.isDisplayed();
	pesquisa.isEnabled();
	
	pesquisa.click();
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
