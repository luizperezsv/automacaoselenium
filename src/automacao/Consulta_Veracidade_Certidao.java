package automacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Consulta_Veracidade_Certidao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");

		
		
		String[] var1 = {"0071000302100669000","0071000302100175000","0071000302100160000","0071000302100170000","0071000302100110000","0071000302100150000","0071000302100075000","0071000302100050000","0071000302100040000","0071000302100042000","0071000302100030000","0071000303000085000","0071000302100010000","0071000303000020000","0071000303000030000","0071000302100065000"};
		String[] var2 = {"2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022","2022"};

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
		
		
		
		
		

		WebElement pesquisa = driver.findElement(By.xpath("html/body/div/div/form/div/input"));
		pesquisa.isDisplayed();
		pesquisa.isEnabled();
		pesquisa.click();
	
        //String curr_window_title = driver.getCurrentUrl();
        //Assert.assertEquals(curr_window_title, test_url);
        //System.out.println("AssertEquals Test Passed\n");
        
        
       

		driver.close();
		
		
		} 
		
		
	}

}
