package bancker.metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bancke2etreinamentos.drivers.Drivers;

public class Metodos extends Drivers {
	
	public void clicar(By elemento) {
		
		driver.findElement(elemento).click();
		
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}

	

	public void validarTexto(By elemento, String texto) {
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elemento));
		
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado, texto);
		
	}


	public void printScreen(String path, String nomeArquivo) {
			
			File prtScn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(prtScn, new File("./"+path+("/"+nomeArquivo+".png")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
public void EsperarumElementoVisivel(By elemento, int ateQuantosegndos) {
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(ateQuantosegndos));
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elemento));
		
		

}
public void limpar(By elemento, String texto) {
	driver.findElement(elemento).clear();
}
}
