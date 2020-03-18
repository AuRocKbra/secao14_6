package entities;

public class Terceirizado extends Funcionario{
	private Double despesaAdicional;
	
	public Terceirizado() {
		super();
	}

	public Terceirizado(String nomeFuncionario, Integer horasTrabalhadas, Double valorDaHora, Double despesaAdicional) {
		super(nomeFuncionario, horasTrabalhadas, valorDaHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public Double valorAPagar() {
		return (this.getValorDaHora()*this.getHorasTrabalhadas())+(this.getDespesaAdicional()*11.0);
	}
}
