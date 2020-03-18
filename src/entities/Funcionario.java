package entities;

public class Funcionario {
	private String nomeFuncionario;
	private Integer horasTrabalhadas;
	private Double valorDaHora;
	
	public Funcionario() {
		
	}

	public Funcionario(String nomeFuncionario, Integer horasTrabalhadas, Double valorDaHora) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorDaHora = valorDaHora;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorDaHora() {
		return valorDaHora;
	}

	public void setValorDaHora(Double valorDaHora) {
		this.valorDaHora = valorDaHora;
	}
	
	public Double valorAPagar() {
		return this.valorDaHora * this.horasTrabalhadas;
	}
}
