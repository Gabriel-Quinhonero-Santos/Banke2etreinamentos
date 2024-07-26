package bancke2etreinamentos.Teste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bancke2etreinamentos.browese.Executa;
import bancker.metodos.Metodos;
import banke.Elementos;

public class CadastroDeTeste {
	Metodos metodo = new Metodos();
	Elementos El = new Elementos();	
	
	@BeforeEach
	public void iniciar () {
	Executa.iniciarTeste();
	metodo.EsperarumElementoVisivel(El.BtnAbriconta, 20);
	metodo.clicar(El.BtnAbriconta);
	
	}
	
	@AfterEach
	public void finalizar() {
	Executa.finalizarTeste();
		
	}
	
	
	@Test
	public void cpfEmBranco() {
		String msg1 = "Erro na verificação do CPF";
		metodo.clicar(El.Btncontinuar);
		metodo.EsperarumElementoVisivel(El.msgerrorcpfembranco, 15);
		metodo.validarTexto(El.msgerrorcpfembranco, msg1);
		metodo.printScreen("evidencias", "CT_Deslogar_steps01");
	}
	@Test
	public void cpfNaofuncionario() {
		String msg2 = "O CPF fornecido não é de um funcionário.";
		metodo.escrever(El.cpf,"123.456.789.11");
		metodo.clicar(El.Btncontinuar);
		metodo.EsperarumElementoVisivel(El.msgError, 15);
		metodo.validarTexto(El.msgError, msg2);
		metodo.printScreen("evidencias", "CT_Deslogar_steps02");
	}
	@Test
	public void cadastro() {
		metodo.escrever(El.cpf,"300.919.919-84");
		metodo.clicar(El.Btncontinuar);
		metodo.EsperarumElementoVisivel(El.nome, 15);
		metodo.escrever(El.nome, "Gabriel");
		metodo.escrever(El.sobrenome, "Quinhonero");
		metodo.escrever(El.email, "Quinhonero@gmail.com");
		metodo.clicar(El.phoneNumber);
		metodo.escrever(El.phoneNumber, "11955599595");
		metodo.escrever(El.endereço, "Manuel Leiroz");
		metodo.escrever(El.rg, "38822641");
		metodo.clicar(El.cep);
		metodo.escrever(El.cep, "03735180");
		metodo.escrever(El.numero, "230");
		metodo.escrever(El.estado, "São Paulo");
		metodo.escrever(El.cidade, "São Paulo");
		metodo.escrever(El.complemento, "503");
		metodo.escrever(El.dataNasc, "11101996");
		metodo.clicar(El.btnAvancar);
		
		//Dados Profissionais
		metodo.EsperarumElementoVisivel(El.grupoAtual, 15);
		metodo.escrever(El.grupoAtual, "012024");
		metodo.escrever(El.primeiroGrupo, "122023");
		metodo.escrever(El.cargo, "Analista Qa");
		metodo.escrever(El.salario, "400000");
		metodo.escrever(El.emailProf, "gabriel@e2etreinamentos.com.br");
		//metodo.clicar(El.btnAvancar);
		
		//senha
		/**
		metodo.EsperarumElementoVisivel(El.grupoAtual, 15);
		metodo.escrever(El.senha, "e2@1234");
		metodo.escrever(El.Confsenha, "e2@1234");
		metodo.clicar(El.btnAvancar);*/
		
		
		
		
		
		
	}

}
