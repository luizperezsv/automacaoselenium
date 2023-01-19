package teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_Consulta_Licitações {
	
	@Test
	public void Teste() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

	
	
	String[] var1 = {"Concorrência"};
	String[] var2 = {"2022"};
	String[] var3 = {"Janeiro"};
	String[] var4 = {"Dezembro"};
	String[] var5 = {"1158"};
	String[] var6 = {"30"};
	
	//String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/legislativo/leis/consulta_leis.php";


	
	
	for (int i = 0; i < var1.length; i++) {

		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/materiais/sup/sup_consulta_licitacoes.php");
		
	WebElement modalidade = driver.findElement(By.xpath("//*[@id=\"con_licitacao\"]"));
	modalidade.isDisplayed();
	modalidade.isEnabled();
	//modalidade.click();
	modalidade.sendKeys(var1[i]);
	
	
	
	WebElement competencia = driver.findElement(By.xpath("//*[@id=\"competencia\"]"));
	competencia.isDisplayed();
	competencia.isEnabled();
	//competencia.click();
	competencia.sendKeys(var2[i]);
	
	
	WebElement mes_inicial = driver.findElement(By.xpath("//*[@id=\"mes_inicial\"]"));
	mes_inicial.isDisplayed();
	mes_inicial.isEnabled();
	//mes_inicial.click();
	mes_inicial.sendKeys(var3[i]);
	
	
	WebElement mes_final = driver.findElement(By.xpath("//*[@id=\"mes_final\"]"));
	mes_final.isDisplayed();
	mes_final.isEnabled();
	//mes_final.click();
	mes_final.sendKeys(var4[i]);
	
	
	WebElement processo = driver.findElement(By.xpath("//*[@id=\"numero_processo\"]"));
	processo.isDisplayed();
	processo.isEnabled();
	//processo.click();
	processo.sendKeys(var5[i]);
	
	WebElement num_modalidade = driver.findElement(By.xpath("//*[@id=\"numero_licitacao\"]"));
	num_modalidade.isDisplayed();
	num_modalidade.isEnabled();
	//num_modalidade.click();
	num_modalidade.sendKeys(var6[i]);
	
	
	
	
	
	
	

	WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"busca_edital\"]"));
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
