package automacao;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alteração_endereco_entrega_Imovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

		
		String[] var1 = {"1700102007101439006","1700102007101439006","1700102007101439006"};
		String[] var2 = {"41181099803","41181099802","41181099802"};
		

		String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/iptu/iptuPesquisarImoveis.php";


		
		
		for (int i = 0; i < var1.length; i++) {

			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/iptu/iptuPesquisarImoveis.php");
			
		WebElement numero = driver.findElement(By.id("inscricao"));
		numero.isDisplayed();
		numero.isEnabled();
		numero.click();
		numero.sendKeys(var1[i]);
		
		
		WebElement cpf = driver.findElement(By.id("cpf"));
		cpf.isDisplayed();
		cpf.isEnabled();
		cpf.click();
		cpf.sendKeys(var2[i]);
		
		
		
		

		WebElement pesquisa = driver.findElement(By.id("teste"));
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
        
        
       

		//driver.close();
		
		}							
		
	}

}
