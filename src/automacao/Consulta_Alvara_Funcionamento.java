package automacao;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Consulta_Alvara_Funcionamento {

	public static void main(String[] args) {
		// Funcional. 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

		
		
		String[] var1 = {"057986","073702","062857","054596","056875", "062399"};
		
	    String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/alvara/emitirAlvara.php";

		for (int i = 0; i < var1.length; i++) {

			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/alvara/index.php");
			
		WebElement numero = driver.findElement(By.name("inscricao"));
		numero.isDisplayed();
		numero.isEnabled();
		numero.click();
		numero.sendKeys(var1[i]);
		
		WebElement pesquisa = driver.findElement(By.name("emitir"));
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
