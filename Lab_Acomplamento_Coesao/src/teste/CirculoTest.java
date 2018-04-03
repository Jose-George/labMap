package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import principal.Circulo;

public class CirculoTest {

	private Circulo circulo; 
	
	
	@Test
	public void perimetroTest() {
		circulo = new Circulo(2);
		assertEquals(6, circulo.perimetro());	
	}
	
	@Test
	public void perimetroInvalidoTest() {
		circulo = new Circulo(-1);
		assertEquals(0, circulo.perimetro());	
	}
	
	@Test
	public void areaTest() {
		circulo = new Circulo(2);
		assertEquals(12,circulo.area());
		
	}

}
