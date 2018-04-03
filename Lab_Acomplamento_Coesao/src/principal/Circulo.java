package principal;

public class Circulo implements FiguraGeometrica {

	private int raio;
	
	public Circulo(int raio){
		this.raio = raio;
	}
	
	@Override
	public int perimetro() {
		int perimetro = (int) 3.14 * raio;
		if(perimetro > 0) {
			System.out.print("Perimetro do circulo: "+perimetro);
			System.out.println();
			}else{
				System.out.println("Erro");
				return 0;
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
