package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import ovo.Ovo;
import ovo.OvoCapoeira;
import pao.Pao;
import pao.PaoBola;
import queijo.Queijo;
import sanduiche.Sanduiche;
import sanduiche.SanduicheBola;
import sanduiche.Verdura;

public class TestSanduicheBola {

	
	Sanduiche sanduiche;
	Ovo ovo; 
	Pao pao; 
	Queijo queijo; 
	Verdura tomate; 
	
	
	@Before
	public void incializando(){
		sanduiche = new SanduicheBola();
		ovo = new OvoCapoeira();
		pao = new PaoBola();
		
	}
	
	@Test 
	public void testPao(){
		assertEquals("Pão Bola", sanduiche.pao().tipoPao());
	}
	
	@Test 
	public void testQueijo(){
		assertEquals("Queijo Cheddar", sanduiche.queijo().tipoQueijo());
	}
	
	@Test 
	public void testOvo(){
		assertEquals("Ovo Capoeira", sanduiche.ovo().tipoOvo());
	}
	
	@Test 
	public void testVerdura(){
		assertEquals("Tomate", sanduiche.verdura().toString());
	}
	
}
