package pacote.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import pacote.Funcionario;
import pacote.FuncionarioTerceirizado;

public class FuncionarioTerceirizadoTest {
	

	@Test
	public void testarValorCalcularPagamentoFuncionarioTerceirizado(){
		// instaciar objetos
		FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Maria", 0,40, 40);
		int resultadoEsperado = 1600;
		// cenario de teste
		// comparação
		Assertions.assertEquals(resultadoEsperado, terceirizado.calculaPagamento());
	}

	@Test
	public void testValidaDesesaAdc() {
		// instaciar objetos
		FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Maria", 1000, 40, 0);
		double resultadoEsperado = 1000.00;
		// cenario de teste
		// comparação
		Assertions.assertEquals(resultadoEsperado, terceirizado.validaDespesasAdc(resultadoEsperado));
	} 
	
	/*
	 * 	@Test
	public void testarCalculaPagamentoFuncionarioValido() throws IllegalAccessException{
		// instaciar objetos
		Funcionario funcionario = new Funcionario("Maria", 50, 40); //vlHora -- numHora
		// cenario de teste
		int resultadoEsperado = 2000;
		// comparação
		Assertions.assertEquals(resultadoEsperado,funcionario.calculaPagamento());
	}
	*/
	 */


}
