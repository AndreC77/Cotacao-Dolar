package br.com.cotacaomoeda.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotacaomoeda.core.CotacaoMoedaCore;

@RestController
@RequestMapping("/cotacaodia")
public class CotacaoMoedaController {
	

	@GetMapping
	public ResponseEntity<?> cotacaoNoDia(){
		try {
		CotacaoMoedaCore cotacaoMoedaCore =  new CotacaoMoedaCore();
		return new ResponseEntity<>(cotacaoMoedaCore.cotacaoDolarDia(),HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>("Tente novamente Mais tarde!!",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
