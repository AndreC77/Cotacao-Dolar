package br.com.cotacaomoeda.core;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import br.com.cotacaomoeda.cotacaodto.BancoBrasilCotacaoResponse;
import br.com.cotacaomoeda.cotacaodto.BancoBrasilResponse;
import br.com.cotacaomoeda.cotacaodto.ResponseCotacao;

public class CotacaoMoedaCore {
	
	
	public ResponseCotacao cotacaoDolarDia() {
		
		Gson gson = new Gson();
		
		Calendar dataAtual = Calendar.getInstance();
		
		if(dataAtual.get(Calendar.HOUR_OF_DAY) < 14) {
			dataAtual.add(Calendar.DATE,-1);
		} 
		
		DateFormat formatar = new SimpleDateFormat("MM-dd-yyyy");
		String data = formatar.format(dataAtual.getTime());
		
		
		String urlBancoBrasil = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/CotacaoDolarDia(dataCotacao=@dataCotacao)?@dataCotacao='"+ data +"'&$top=100&$format=json";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(urlBancoBrasil, String.class);
		String jsonEnd = response.getBody();
		BancoBrasilResponse result = gson.fromJson(jsonEnd, BancoBrasilResponse.class);		
		
		BancoBrasilCotacaoResponse bancoBrasilResponse = result.getValue().get(0);
		ResponseCotacao responseCotacao = new ResponseCotacao(bancoBrasilResponse.getCotacaoCompra());
		
		
		return responseCotacao;
	}
	
}
