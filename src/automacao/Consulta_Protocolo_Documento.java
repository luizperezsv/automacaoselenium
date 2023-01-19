package automacao;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Consulta_Protocolo_Documento {

	
	public static void main(String[] args) {
		//Botão não funciona consultar e não seleciona o ano
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

		
		
		String[] var1 = {"22553000145","752995000147","756958806","761261000124","765356813","767022000181","770485000100","775123000102","789713000186","796428000192","810083000184",	"810404583","835623000184",	"840111000106","845573000116","871579000168","871677000103"};
		String[] var2 = {"2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022"};

		String test_url = "https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/gpro/protocolo_resulta_documento.php";


		
		
		for (int i = 0; i < var1.length; i++) {

			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
			
		driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/gpro/protocolo_consulta_documento.php");
			
		WebElement numero = driver.findElement(By.name("inscricao"));
		numero.isDisplayed();
		
		numero.isEnabled();
		numero.click();
		numero.sendKeys(var1[i]);
		
		WebElement data = driver.findElement(By.name("ano"));
		data.isDisplayed();
		data.isEnabled();
		data.click();
		data.sendKeys(var2[i]);
		
		
		
		
		
		

		WebElement pesquisa = driver.findElement(By.name("consultar"));
		//pesquisa.isDisplayed();
		//pesquisa.isEnabled();
		pesquisa.click();
	
        String curr_window_title = driver.getCurrentUrl();
        Assert.assertEquals(curr_window_title, test_url);
        System.out.println("AssertEquals Test Passed\n");
        
        
        
       

		driver.close();
		
		
		} 
		
		
		

	}

}
