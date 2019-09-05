package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Test;

import junit.framework.Assert;

public class ProjetoTest {
	
	@Test
	public void testaBuscaPrimeiroProjeto() {
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		String conteudoXML = target.path("/projetos").request().get(String.class);
		Assert.assertTrue(conteudoXML.contains("Minha loja"));
	}

}
