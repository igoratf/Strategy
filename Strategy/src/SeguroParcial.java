
public class SeguroParcial implements TipoSeguro {

	@Override
	public double calculaValorAquisicao(int valorVeiculo) {
		return valorVeiculo * 0.7;
	}
	
}
