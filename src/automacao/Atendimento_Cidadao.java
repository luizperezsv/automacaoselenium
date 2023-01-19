package automacao;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Timer;
import java.util.TimerTask;
import	org.junit.After;
import	org.junit.Before;
import	org.junit.Test;


import org.junit.Assert;


public class Atendimento_Cidadao {

	public static void main(String[] args) {
		// Lista de cpf e cnpj inadequada. Funcional. Falta de teste unidade. sleep

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");
		
		
		String[] var1 = {"41181099803","752995000147","756958806","761261000124"};
        String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/aten/aten_login.php";

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
