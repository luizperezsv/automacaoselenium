package automacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class primeiro {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luizperez\\Documents\\Demandas Kelly\\Migração\\Nova pasta (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		String cpf = "99558556815";
		
		driver.get("https://online.saovicente.sp.gov.br/pmsaovicente/websis/siapegov/administrativo/gpro/protocolo_consulta_documento.php");
		WebElement numero = driver.findElement(By.name("cpf_cnpj"));
		numero.isDisplayed();
		numero.isEnabled();
		numero.click();
		numero.sendKeys(cpf);
		
		WebElement pesquisa = driver.findElement(By.xpath("//input[@id='submit']"));
		pesquisa.isDisplayed();
		pesquisa.isEnabled();
		pesquisa.click();
		
		
		

	}

}
