package banke;

import org.openqa.selenium.By;

public class Elementos {
	
	
	
	public By BtnAbriconta = By.xpath("//button[text()='Abrir conta']");
	public By cpf = By.id("cpf-input");
	public By Btncontinuar = By.xpath("//button[text()='Continuar']");
	public By msgerrorcpfembranco = By.xpath("//p[text()='Erro na verificação do CPF']");
	public By msgError = By.id("error-message");
	
	
	
	
	//Dados pessoais
	public By nome = By.name("firstName");
	public By sobrenome = By.name("lastName");
	public By email = By.name("email");
	public By phoneNumber = By.name("phoneNumber");
	public By endereço = By.name("address");
	public By rg = By.xpath("//input[@name='rg']");
	public By cep = By.xpath("//input[@name='cep']");
	public By numero = By.xpath("//input[@name='number']");
	public By estado = By.xpath("//input[@name='state']");
	public By cidade = By.xpath("//input[@name='city']");
	public By complemento = By.xpath("//input[@name='complement']");
	public By dataNasc = By.xpath("//input[@name='dataBirthday']");	
	public By textoDadosPessoais = By.xpath("//h2[contains(text(),'Dados Pessoais')]");
	public By btnAvancar = By.xpath("//button[@type='button']");
	
	
//Tela - Dados Profissionais

	public By grupoAtual = By.xpath("//input[@name='actualGroup']");
	public By primeiroGrupo = By.xpath("//input[@name='firstGroup']");
	public By cargo = By.xpath("//input[@name='job']");
	public By salario = By.xpath("//input[@placeholder='Salário']");
	public By emailProf = By.xpath("//input[@name='professionalEmail']");
	public By textoDadosProf = By.xpath("//h2[contains(text(),'Dados Profissionais')]");
	public By btnEnviar = By.id("btnEnviar");
	// Tela Dados Senha
	public By senha = By.name("password");
	public By Confsenha = By.name("confirmPassword");
	
}
