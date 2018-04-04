package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import principal.Quadrado;

public class QuadradoTest {

	private Quadrado quadrado; 
	
	@Test
	public void areaTest() {
		quadrado = new Quadrado(4);
		assertEquals(8, quadrado.area());
	}
	
	@Test
	public void perimetroTest() {
		quadrado = new Quadrado(4);
		assertEquals(16, quadrado.perimetro());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void perimetroInvalidoTest() {
		quadrado = new Quadrado(-1233);
		assertEquals(0, quadrado.perimetro());
		assertFalse(-12313 == quadrado.perimetro());
	}


}
