package br.com.cotacaomoeda.cotacaodto;

public class ResponseCotacao {
	
	private Double cotacaoCompra;
	
	

	public ResponseCotacao(Double cotacaoCompra) {
		super();
		this.cotacaoCompra = cotacaoCompra;
	}

	public Double getCotacaoCompra() {
		return cotacaoCompra;
	}

	public void setCotacaoCompra(Double cotacaoCompra) {
		this.cotacaoCompra = cotacaoCompra;
	}

	

}
