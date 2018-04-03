package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import principal.Retangulo;

public class RetanguloTest {

	private Retangulo retangulo; 
	
	@Test
	public void AreaTest() {
		retangulo = new Retangulo(10, 10);
		assertEquals(100, retangulo.area());
	}
	
	@Test
	public void PerimetroTest() {
		retangulo = new Retangulo(10, 10);
		assertEquals(40, retangulo.perimetro());
	}
	
	@Test
	public void PerimetroInvalidoTest() {
		retangulo = new Retangulo(-1030, -1032);
		assertEquals(0, retangulo.perimetro());
	}


	
}
