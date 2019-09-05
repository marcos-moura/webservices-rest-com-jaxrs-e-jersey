package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Test;

import junit.framework.Assert;

public class ClientTest {

	@Test
	public void testaQueAConexaoComOServidorFunciona() {
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://www.mocky.io");
		String conteudoHTML = target.path("/v2/52aaf5bbee7ba8c60329fb7b").request().get(String.class);
		String conteudoXML = target.path("/v2/52aaf5deee7ba8c70329fb7d").request().get(String.class);
		Assert.assertTrue(conteudoHTML.contains("Rua"));
		Assert.assertTrue(conteudoXML.contains("Videogame 4"));
	}
}
