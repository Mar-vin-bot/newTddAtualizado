package pacote;

public class Funcionario {
	
	public static final int salarioMinimo = 1212;
	

	private String nome;
	private double valorHora;
	private int horasTrabalhadas;
	
	public Funcionario(String nome, double valorHora, int horasTrabalhadas) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	//não ta funcionando para atributo > 40 ou negativo
	public void numerodeHorasTrabalhadas() throws IllegalAccessException {
		if ((getHorasTrabalhadas() > 0) && (getHorasTrabalhadas() <= 40) ){
			this.horasTrabalhadas = getHorasTrabalhadas();
		}else {
			throw new IllegalArgumentException("Valor de horas trabalhadas Ã© invalido");
		}
	}




	
	public void calcularValorPorHora(int valorHora) throws IllegalAccessException {
		if (	valorHora >= (salarioMinimo/100*(4)) || valorHora < (salarioMinimo /100*(10))  ){
			this.valorHora = valorHora;
		}else {
			throw new IllegalArgumentException("Valor da hora invalido");
		}
	}
	
	
	public double calculaPagamento( ) throws IllegalAccessException {
	//public double calculaPagamento(int horasTrabalhadas,  int valorHora) throw IllegalAccessException {
		if (horasTrabalhadas * valorHora >= salarioMinimo) {
			double salarioFuncionario = horasTrabalhadas * valorHora;
			return salarioFuncionario;
		}else {
		throw new IllegalArgumentException("Salario invalido");
		}
	}
	
	

}
