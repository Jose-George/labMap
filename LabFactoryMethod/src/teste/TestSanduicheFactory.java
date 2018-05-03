package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sanduiche.Sanduiche;
import sanduiche.SanduicheBola;
import sanduiche.SanduicheFactory;
import sanduiche.SanduicheFrances;
import sanduiche.SanduichePaoIntegral;
import sanduiche.TipoSanduiche;

public class TestSanduicheFactory {

	SanduicheFactory sanduicheFactory;
	
	Sanduiche sanduicheBola;
	//SanduicheFrances sanduicheFrances;
	//SanduichePaoIntegral sanduicePaoIntegral;
	
	@Before
	public void inicializando(){
		
		sanduicheFactory = new SanduicheFactory();
		//sanduicheBola = new SanduicheBola();
		//sanduicheFrances = new SanduicheFrances();
		//sanduicePaoIntegral = new SanduichePaoIntegral();
	}
	
	@Test
	public void testSanduicheBola() {
		sanduicheBola = sanduicheFactory.creator(TipoSanduiche.BOLA);
		assertEquals("{Bola,Cheldda,Capoeira,Tomate}",sanduicheBola.creatorSanduiche("Bola", "Cheldda", "Capoeira", "Tomate"));
	}

}
