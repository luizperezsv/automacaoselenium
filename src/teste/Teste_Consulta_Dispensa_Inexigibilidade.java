package teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_Consulta_Dispensa_Inexigibilidade {
	
	@Test
	public void Teste() {
	
	// TODO Auto-generated method stub
	// Funcional. Falta teste de unidade
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

	
	
	String[] var1 = {"2022"};
	String[] var2 = {"Janeiro"};
	String[] var3 = {"Dezembro"};
	String[] var4 = {"1"};
	String[] var5 = {"1"};

	String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/baw/certidaoValorVenal.php";


	
	
	for (int i = 0; i < var1.length; i++) {

		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/materiais/sup/sup_dispensa_inexigibilidade.php");
		
	WebElement ano = driver.findElement(By.xpath("//*[@id=\"competencia\"]"));
	ano.isDisplayed();
	ano.isEnabled();
	ano.click();
	ano.sendKeys(var1[i]);
	
	
	WebElement mes_inicial = driver.findElement(By.xpath("//*[@id=\"mes_inicial\"]"));
	mes_inicial.isDisplayed();
	mes_inicial.isEnabled();
	mes_inicial.click();
	mes_inicial.sendKeys(var2[i]);
	
	WebElement mes_final = driver.findElement(By.xpath("//*[@id=\"mes_final\"]"));
	mes_final.isDisplayed();
	mes_final.isEnabled();
	mes_final.click();
	mes_final.sendKeys(var3[i]);
	
	WebElement processo = driver.findElement(By.xpath("//*[@id=\"numero_processo\"]"));
	processo.isDisplayed();
	processo.isEnabled();
	processo.click();
	processo.sendKeys(var4[i]);
	
	WebElement modalidade = driver.findElement(By.xpath("//*[@id=\"numero_licitacao\"]"));
	modalidade.isDisplayed();
	modalidade.isEnabled();
	modalidade.click();
	modalidade.sendKeys(var5[i]);
	
	

	WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"busca_edital\"]"));
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
