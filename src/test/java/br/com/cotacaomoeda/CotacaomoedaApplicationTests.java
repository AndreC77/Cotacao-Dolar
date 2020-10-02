package br.com.cotacaomoeda;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CotacaomoedaApplicationTests {
	
	@LocalServerPort
	private int port;
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Test
	public void testarEndPoint() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/cotacaodia", String.class);
		assertTrue(200 == response.getStatusCodeValue());
	}

}
