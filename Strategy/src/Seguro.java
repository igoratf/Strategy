
public class Seguro {
	
	TipoSeguro tipoSeguro;

	public Seguro(TipoSeguro tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
	
	public double calculaValorAquisicao(int valorVeiculo) {
		return tipoSeguro.calculaValorAquisicao(valorVeiculo);
	}
	
	

}
