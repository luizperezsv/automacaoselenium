package automacao;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Certidao_Debitos_Tributos_Mobiliaria {

	public static void main(String[] args) {
		// Funcional. Falta teste de unidade
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

				
				
				String[] var1 = {"057986","073702","062857","054596","056875", "062399"};
				//String[] var2 = {"2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022"};

				String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/gpro/protocolo_resulta_documento.php";


				
				
				for (int i = 0; i < var1.length; i++) {

					
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
					
				driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/baw/certidao.php");
				
				WebElement selecionar = driver.findElement(By.xpath("//*[@id=\"label_mob\"]/span"));
				selecionar.isDisplayed();
				selecionar.isEnabled();
				selecionar.click();
			
				
									
				WebElement numero = driver.findElement(By.id("inscricao"));
				numero.isDisplayed();
				numero.isEnabled();
				numero.click();
				numero.sendKeys(var1[i]);
				
				
				

				WebElement pesquisa = driver.findElement(By.name("Verificar"));
				pesquisa.isDisplayed();
				pesquisa.isEnabled();
				pesquisa.click();
			
		        //String curr_window_title = driver.getCurrentUrl();
		       // Assert.assertEquals(curr_window_title, test_url);
		        //System.out.println("AssertEquals Test Passed\n");
		        
		        
		       

				driver.close();

	}
				}

}
