package teste;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_Atendimento_Cidadao_Consulta {

	// Não funcional - numero de atendimento e data da autuação. Falta teste de
	// unidade.
	@RepeatedTest(value = 1)
	public void Teste() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

		String[] var1 = { "2581", "1012" };
		String[] var2 = { "11-06-2018", "11-06-2018" };
		String test_url = "Nome/Processo não encontrado ou Incorretos";
		

		for (int i = 0; i < var1.length; i++) {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get(
					"https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/aten/aten_valida.php?consulta");

			// WebElement consulta = driver.findElement(By.linkText("Consulta"));
			// consulta.isDisplayed();
			// consulta.isEnabled();
			// consulta.click();

			// Verificar campos
			WebElement numero = driver.findElement(By.xpath("//*[@id=\"mytab2\"]/form/div[1]/div/input"));
			numero.isDisplayed();
			numero.isEnabled();
			// numero.click();
			numero.sendKeys(var1[i]);

			WebElement data = driver.findElement(By.xpath("//*[@id=\"id-date-picker-1\"]"));
			data.isDisplayed();
			// data.isEnabled();
			// data.click();
			data.sendKeys(var2[i]);

			WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"mytab2\"]/form/div[3]/div/input"));
			pesquisa.isDisplayed();
			pesquisa.isEnabled();
			pesquisa.click();

			WebElement curr_window_title = driver.findElement(By.className("page-content"));
//			WebElement teste1 = driver.findElement(By.className("page-content"));

	       // Assert.assertEquals(curr_window_title.getText().contains(test_url),test_url);
//			System.out.println(curr_window_title.getText());

			if (curr_window_title.getText().contains(test_url)) {
				System.out.println("Falhou\n");
				System.out.println(var1[i]);
				System.out.println(var2[i]);
				
				
				
				
			} else {
				System.out.println("Sucesso\n");
				System.out.println(var1[i]);
				System.out.println(var2[i]);
			
			}

			//WebElement teste = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/table[1]/tbody/tr[3]/td[1]/a"));
			// teste.isDisplayed();
			// teste.isEnabled();
			//teste.click();
			// *[@id="main-container"]/div[1]/table[1]/tbody/tr[3]/td[1]/a

			// String curr_window_title = driver.getCurrentUrl();
			// Assert.assertEquals(test_url, curr_window_title);

			// System.out.println("AssertEquals Test Passed\n");
			
			driver.close();
			
			

			

		}
		
		
		 
	}

}
