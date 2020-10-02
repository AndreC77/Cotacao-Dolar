package br.com.cotacaomoeda.cotacaodto;

import java.util.List;

public class BancoBrasilResponse {

	private List<BancoBrasilCotacaoResponse> value;

	public List<BancoBrasilCotacaoResponse> getValue() {
		return value;
	}

	public void setValue(List<BancoBrasilCotacaoResponse> value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value.toString();
	}
	
}