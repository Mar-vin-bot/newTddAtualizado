package teste3103;

public class Funcionario {
	public static final int salarioMinimo = 1212;
	private int horasTrabalhadas;
	private double valorHora;
	
	public Funcionario(int horasTrabalhadas,double valorHora) {
		super();
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}	
	public Funcionario(){
		
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Integer getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}
	public double getvalorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public void testarHorasValidasSemanal(int horasTrabalhadas){
		if(horasTrabalhadas<=40) {
			this.horasTrabalhadas = horasTrabalhadas;
		}
		else if(horasTrabalhadas<0 || horasTrabalhadas>40) {
			throw new IllegalArgumentException("Valor de horas trabalhadas invalido");
		}
	}
	public void CalcularValorPorHora(int valorHora){
		// 30,3
		double valorMaximoPorHoraSemanal = salarioMinimo/40;
		// 12,12
		double valorMinimoPorHoraSemanal = salarioMinimo/100;
		
		if(valorHora<=valorMaximoPorHoraSemanal && valorHora>=valorMinimoPorHoraSemanal) {
			this.valorHora = valorHora;
		}
		else {
			throw new IllegalArgumentException("Valor de horas invalido");
		}
	
		
	}
	public double calcularPagamento() {
		double salarioPorSemana = valorHora*horasTrabalhadas;
		double salarioMinimoSemana = salarioMinimo/4;
		if(salarioPorSemana>=salarioMinimoSemana) {
			return salarioPorSemana;
		}
		else {
			throw new IllegalArgumentException("Salario invalido");
		}
	}
}


