package teste3103;

public class FuncionarioTerceirizado extends Funcionario{
	
	private double despesasAdicionais;
	public FuncionarioTerceirizado(int horasTrabalhadas,int valorHora) {
		super(horasTrabalhadas, valorHora);
	}
	public void setDespesasAdicionais(double despesasAdicionais) {
		this.despesasAdicionais = despesasAdicionais;
	}
	public double getDespesasAdicionais() {
		return despesasAdicionais;
	}
	public FuncionarioTerceirizado() {
		// TODO Auto-generated constructor stub
	}
	public Integer validaDespesas(int despesasAdicionais) {
		if(despesasAdicionais<=1000) {
			return despesasAdicionais;
		}
		else {
			throw new IllegalArgumentException("Valor da despesa invalido");
		}
	}
	
}
