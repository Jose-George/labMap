package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ovo.Ovo;
import ovo.OvoCapoeira;
import pao.Pao;
import pao.PaoBola;
import queijo.Queijo;
import sanduiche.Sanduiche;
import sanduiche.SanduicheFrances;
import sanduiche.Verdura;

public class TestSanduicheFrances {

	Sanduiche sanduiche;
	Ovo ovo; 
	Pao pao; 
	Queijo queijo; 
	Verdura tomate; 
	
	
	@Before
	public void incializando(){
		sanduiche = new SanduicheFrances();
		ovo = new OvoCapoeira();
		pao = new PaoBola();
		
	}
	
	@Test 
	public void testPao(){
		assertEquals("Pão Frânces", sanduiche.pao().tipoPao());
	}
	
	@Test 
	public void testQueijo(){
		assertEquals("Queijo Mussarela", sanduiche.queijo().tipoQueijo());
	}
	
	@Test 
	public void testOvo(){
		assertEquals("Ovo Granja", sanduiche.ovo().tipoOvo());
	}
	
	@Test 
	public void testVerdura(){
		assertEquals("Tomate", sanduiche.verdura().toString());
	}
	
}
