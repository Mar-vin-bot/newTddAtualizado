package pacote;

public class FuncionarioTerceirizado extends Funcionario {
	private double despesasAdc;

	public FuncionarioTerceirizado(String nome, double valorHora, int horasTrabalhadas, double despesasAdc) {
		super(nome, valorHora, horasTrabalhadas);
		this.despesasAdc = despesasAdc;
	}

	public double getDespesasAdc() {
		return despesasAdc;
	}

	public void setDespesasAdc(double despesasAdc) {
		this.despesasAdc = despesasAdc;
	}
	
	public double calculaPagamento () {
		return 0;
	}
	
	public double validaDespesasAdc() throws IllegalAccessException  {
		if (despesasAdc <= 1000) {
			double despesas = despesasAdc;
			return despesas;
		}else {
			throw new IllegalArgumentException("Valor despesas invalido");
			
		}
	
	}
	
}
