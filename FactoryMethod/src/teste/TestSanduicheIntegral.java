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
import sanduiche.SanduicheIntegral;
import sanduiche.Verdura;

public class TestSanduicheIntegral {

	Sanduiche sanduiche;
	Ovo ovo; 
	Pao pao; 
	Queijo queijo; 
	Verdura tomate; 
	
	
	@Before
	public void incializando(){
		sanduiche = new SanduicheIntegral();
		ovo = new OvoCapoeira();
		pao = new PaoBola();
		
	}
	
	@Test 
	public void testPao(){
		assertEquals("Pão Integral", sanduiche.pao().tipoPao());
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
