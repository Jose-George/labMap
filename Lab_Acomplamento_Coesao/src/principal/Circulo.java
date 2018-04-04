package principal;

public class Circulo implements FiguraGeometrica {

	private int raio;
	
	public Circulo(int raio) throws IllegalArgumentException{
		if(raio < 0){
			throw(new IllegalArgumentException("Ocorreu um erro, valor não esperado: insira valor maior q zero"));
		}
		this.raio = raio;
	}
	
	@Override
	public int perimetro() throws IllegalArgumentException {
		int perimetro = (int) 3.14 * raio;
		if(perimetro > 0) {
			System.out.print("Perimetro do circulo: "+perimetro);
			System.out.println();
			}else{
				throw(new IllegalArgumentException("Ocorreu um erro, valor não esperado"));
			
			}
		return perimetro;
	}
	
	@Override
	public int area() {
		int area = (int) (2 * 3.14 * raio);
		return area;
	}

	@Override
	public String toString() {
		return "O circulo criado tem raio de tamanho: " + raio;
	}
	
	
}
