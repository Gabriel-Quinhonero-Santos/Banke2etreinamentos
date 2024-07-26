package bancke2etreinamentos.browese;

import org.openqa.selenium.chrome.ChromeDriver;

import bancke2etreinamentos.drivers.Drivers;


public class Executa extends Drivers{
	
	
	
	public static void iniciarTeste() {	
		
		driver = new ChromeDriver();
		
		driver.get("http://52.2.114.98/");
		driver.manage().window().maximize();
		System.out.println("******* Iniciar Teste ***********");
	}

	public static void finalizarTeste() {
		
		driver.quit();
		System.out.println("******* Finalizar Teste ***********");
	}
}

