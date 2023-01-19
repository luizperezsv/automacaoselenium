package teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Teste_Consulta_Veracidade_Certidao {
	
	
	@Test
	public void Teste() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

	
	
	String[] var1 = {"1100011000400036026"};
	String[] var2 = {"099C.3001.B2733"};

	//String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/gpro/protocolo_resulta_documento.php";


	
	
	for (int i = 0; i < var1.length; i++) {

		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/arrecadacao/baw/veracidade_certidao.php");
		
	WebElement numero = driver.findElement(By.name("inscricao"));
	numero.isDisplayed();
	numero.isEnabled();
	numero.click();
	numero.sendKeys(var1[i]);
	
	WebElement controle = driver.findElement(By.name("cod_controle"));
	controle.isDisplayed();
	controle.isEnabled();
	controle.click();
	controle.sendKeys(var2[i]);
	
	
	
	
	

	WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/form/div[4]/div/input"));
	pesquisa.isDisplayed();
	pesquisa.isEnabled();
	pesquisa.click();

    //String x = "CN - Certidao Negativa";
    //WebElement teste = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div[1]/div/h3"));
    //Assert.assertEquals(x, teste);
    //System.out.println("AssertEquals Test Passed\n");
    
    
   

	//driver.close();
	
	}
	} 
	

}
