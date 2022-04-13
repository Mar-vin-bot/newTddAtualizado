package teste3103;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Entity.Pessoa;

public class testeFunc {
	
	@Test
	public void testarConstrutorFuncionarioHorasTrabalhadas() {
		// instaciar objetos
		Funcionario funcionario = new Funcionario(20,0);
		// cenario de teste
		int resultadoEsperado = 20;
		// execução.
		// comparação
		Assertions.assertEquals(resultadoEsperado, funcionario.getHorasTrabalhadas());
	}
	@Test
	public void testarConstrutorFuncionarioValorHoras() {
		// instaciar objetos
		Funcionario funcionario = new Funcionario(0,30);
		// cenario de teste
		int resultadoEsperado = 30;
		// execução.
		// comparação
		Assertions.assertEquals(resultadoEsperado, funcionario.getvalorHora());
	}
	@Test
	public void testarSetterFuncionarioHorasTrabalhadas() {
		// instaciar objetos
		Funcionario funcionario = new Funcionario();
		// cenario de teste
		funcionario.setHorasTrabalhadas(20);
		int resultadoEsperado = 20;
		// execução.
		// comparação
		Assertions.assertEquals(resultadoEsperado, funcionario.getHorasTrabalhadas());
	}
	@Test
	public void testarSetterFuncionarioValorHora() {
		// instaciar objetos
		Funcionario funcionario = new Funcionario();
		// cenario de teste
		funcionario.setValorHora(30);
		int resultadoEsperado = 30;
		// execução.
		// comparação
		Assertions.assertEquals(resultadoEsperado, funcionario.getvalorHora());
	}
	@Test
	// Testar salario de funcionario padrão
	public void testarHorasFuncionarios() {
		// instaciar objetos
		Funcionario funcionario;
		// cenario de teste
		int horasTrabalhadas = 40;
		int resultadoEsperado = 40;
		// execução.
		funcionario = new Funcionario(horasTrabalhadas, 0);
		// comparação
		Assertions.assertEquals(resultadoEsperado, funcionario.getHorasTrabalhadas());
	}
	@Test
	public void testarHorasFuncionariosComHorasExcedidas() {
		// instaciar objetos
		Funcionario funcionario;
		// cenario de teste
		int horasTrabalhadas = 50;
		int resultadoEsperado = 50;
		// execução.
		funcionario = new Funcionario(horasTrabalhadas,0);
		// comparação
		Assertions.assertEquals(resultadoEsperado, funcionario.getHorasTrabalhadas());
	}
	@Test
	public void testarHorasFuncionariosComHorasValidasPeloMetodo() throws Exception {
		// instaciar objetos
		Funcionario funcionario = new Funcionario();
		// cenario de teste
		funcionario.testarHorasValidasSemanal(40);
		int resultadoEsperado = 40;
		// execução.
		// comparação
		Assertions.assertEquals(resultadoEsperado, funcionario.getHorasTrabalhadas());
	}
	@Test
	public void testarHorasFuncionariosComHorasExcedidasPeloMetodo() throws Exception {
		// instaciar objetos
		Funcionario funcionario = new Funcionario();
		// cenario de teste
		// execução.
		// comparação
		Assertions.assertThrows(IllegalArgumentException.class,()->{funcionario.testarHorasValidasSemanal(50);});
	}
	@Test
	public void testarValorHoraFuncionarios(){
		// instaciar objetos
		Funcionario funcionario = new Funcionario();
		// cenario de teste
		funcionario.CalcularValorPorHora(30);
		int resultadoEsperado = 30;
		// comparação
		Assertions.assertEquals(resultadoEsperado,funcionario.getvalorHora());
	}
	@Test
	public void testarValorHoraFuncionariosInvalido() throws Exception {
		// instaciar objetos
		Funcionario funcionario = new Funcionario();
		// cenario de teste
		// comparação
		Assertions.assertThrows(IllegalArgumentException.class,()->{funcionario.CalcularValorPorHora(50);});
	}
	@Test
	public void testarValorPagamentoFuncionariosValido(){
		// instaciar objetos
		Funcionario funcionario = new Funcionario();
		// cenario de teste
		funcionario.setValorHora(30);
		funcionario.setHorasTrabalhadas(40);
		int resultadoEsperado = 1200;
		// comparação
		Assertions.assertEquals(resultadoEsperado,funcionario.calcularPagamento());
	}
	@Test
	public void testarValorPagamentoFuncionariosInvalido() throws Exception {
		// instaciar objetos
		Funcionario funcionario = new Funcionario();
		// cenario de teste
		// comparação
		Assertions.assertThrows(IllegalArgumentException.class,()->{funcionario.CalcularValorPorHora(50);});
	}


/*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/


	@Test
	public void testarValorDepesasFuncionarioTerceirizado(){
		// instaciar objetos
		FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado();
		int resultadoEsperado = 1000;
		// cenario de teste
		// comparação
		Assertions.assertEquals(resultadoEsperado,funcionario.validaDespesas(1000));
	}
	@Test
	public void testarValorDespesasFuncionarioTerceirizadoInvalido() throws Exception {
		// instaciar objetos
		FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado();
		// cenario de teste
		// comparação
		Assertions.assertThrows(IllegalArgumentException.class,()->{funcionario.validaDespesas(1200);});
	}
	@Test
	public void testarValorCalcularPagamentoFuncionarioTerceirizado(){
		// instaciar objetos
		FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado(30,40);
		int resultadoEsperado = 1200;
		// cenario de teste
		// comparação
		Assertions.assertEquals(resultadoEsperado,funcionario.calcularPagamento());
	}
	@Test
	public void testarValorCalcularPagamentoFuncionarioTerceirizadonvalido() throws Exception {
		// instaciar objetos
		FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado(10,20);
		// cenario de teste
		// comparação
		Assertions.assertThrows(IllegalArgumentException.class,()->{funcionario.calcularPagamento();});
	}
	@Test
	public void testarValorCalcularPagamentoFuncionarioValido(){
		// instaciar objetos
		Funcionario funcionario = new Funcionario(30,40);
		int resultadoEsperado = 1200;
		// cenario de teste
		// comparação
		Assertions.assertEquals(resultadoEsperado,funcionario.calcularPagamento());
	}
	@Test
	public void testarValorCalcularPagamentoFuncionarioTerceirizadoInvalido() throws Exception {
		// instaciar objetos
		Funcionario funcionario = new Funcionario(10,20);
		// cenario de teste
		// comparação
		Assertions.assertThrows(IllegalArgumentException.class,()->{funcionario.calcularPagamento();});
	}
}
