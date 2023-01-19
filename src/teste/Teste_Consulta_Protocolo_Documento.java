package teste;

//import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_Consulta_Protocolo_Documento {
	
	@Test
	public void teste(){ 
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

	
	
	String[] var1 = {"16763232870","25220077856","33192113820","34778000111","34801026893","29169652899"};
	//String[] var2 = {"2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022"};

	//String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/gpro/protocolo_resulta_documento.php?cpf_cnpj=?";


	
	
	for (int i = 0; i < var1.length; i++) {

		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
		
	driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/gpro/protocolo_consulta_documento.php");
		
	WebElement numero = driver.findElement(By.name("cpf_cnpj"));
	numero.isDisplayed();
	numero.isEnabled();
	numero.click();
	numero.sendKeys(var1[i]);
	
	//WebElement data = driver.findElement(By.name("ano"));
	//data.isDisplayed();
	//data.isEnabled();
	//data.click();
	//data.sendKeys(var2[i]);
	
	
	
	
	
	

	WebElement pesquisa = driver.findElement(By.name("Pesquisar"));
	//pesquisa.isDisplayed();
	//pesquisa.isEnabled();
	pesquisa.click();

   // String curr_window_title = driver.getCurrentUrl();
   // Assert.assertEquals(curr_window_title, test_url);
   // System.out.println("AssertEquals Test Passed\n");
    
    
    
   

	driver.close();
	
	}
	}

}
