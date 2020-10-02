package br.com.cotacaomoeda.cotacaodto;

public class BancoBrasilCotacaoResponse {

	private double cotacaoCompra;
	private double cotacaoVenda;
	private String dataHoraCotacao;

	public double getCotacaoCompra() {
		return cotacaoCompra;
	}

	public void setCotacaoCompra(double cotacaoCompra) {
		this.cotacaoCompra = cotacaoCompra;
	}

	public double getCotacaoVenda() {
		return cotacaoVenda;
	}

	public void setCotacaoVenda(double cotacaoVenda) {
		this.cotacaoVenda = cotacaoVenda;
	}

	public String getDataHoraCotacao() {
		return dataHoraCotacao;
	}

	public void setDataHoraCotacao(String dataHoraCotacao) {
		this.dataHoraCotacao = dataHoraCotacao;
	}

	@Override
	public String toString() {
		return "BancoBrasilCotacaoResponse [cotacaoCompra=" + cotacaoCompra + ", cotacaoVenda=" + cotacaoVenda
				+ ", dataHoraCotacao=" + dataHoraCotacao + "]";
	}
	
	
	
}
