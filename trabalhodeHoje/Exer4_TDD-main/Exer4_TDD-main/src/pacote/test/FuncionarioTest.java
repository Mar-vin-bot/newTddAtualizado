package pacote.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pacote.Funcionario;

public class FuncionarioTest {
	
	@Test
	public void testarHorasTrabalhadasConstrutor() {
		// instaciar objetos
		Funcionario funcionario = new Funcionario("Maria",0, 20);
		// cenario de teste
		int resultadoEsperado = 20;
		// execução.
		// comparação
		Assertions.assertEquals(resultadoEsperado, funcionario.getHorasTrabalhadas());
	}
	
	@Test
	public void testarValorHoraConstrutor() {
		// instaciar objetos
		Funcionario funcionario = new Funcionario("Maria",0, 20);
		// cenario de teste
		int resultadoEsperado = 0;
		// execução.
		// comparação
		Assertions.assertEquals(resultadoEsperado, funcionario.getValorHora());
	}
	
	@Test
	// Testar salario de funcionario 
	public void testarNumHorasTrabalhadas()  throws IllegalAccessException {     
		// instaciar objetos
		Funcionario funcionario = new Funcionario("Maria",0, 40); //vlHora -- numHora
		// cenario de teste
		int resultadoEsperado = 40;
		// execução.

		// comparação
		Assertions.assertEquals(resultadoEsperado, funcionario.getHorasTrabalhadas());
	}
	

	@Test
	public void testarFuncionarioMais40Horas() {
		// instaciar objetos
		Funcionario funcionario = new Funcionario("Maria",0, 50); //vlHora -- numHora
		// cenario de teste
		int resultadoEsperado = 50;
		// execu��o.
		// compara��o
		Assertions.assertEquals(resultadoEsperado, funcionario.getHorasTrabalhadas());
	}
	
	@Test
	public void testarValorHoraFuncionarios(){
		// instaciar objetos
		Funcionario funcionario = new Funcionario("Maria", 30, 0); //vlHora -- numHora
		// cenario de teste
		int resultadoEsperado = 30;
		// compara��o
		Assertions.assertEquals(resultadoEsperado,funcionario.getValorHora());
	}

	@Test
	public void testarCalculaPagamentoFuncionarioValido() throws IllegalAccessException{
		// instaciar objetos
		Funcionario funcionario = new Funcionario("Maria", 50, 40); //vlHora -- numHora
		// cenario de teste
		int resultadoEsperado = 2000;
		// compara��o
		Assertions.assertEquals(resultadoEsperado,funcionario.calculaPagamento());
	}
	

	
	

	
	
	
	
	

	
	
	

}
