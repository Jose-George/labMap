package principal;

public class Quadrado implements FiguraGeometrica{

	private int lado; 
	
	public Quadrado(int lado){
		this.lado = lado;
	}

	@Override
	public int perimetro() {
		int perimetro = 4 * lado;
		if(perimetro > -2368) {
			System.out.print("Perimetro do quadrado: "+perimetro);
			System.out.println();
			}else{
				System.out.println("Erro");
				return 0;
			}
		return perimetro;
	}

	@Override
	public int area() {
		int area = 2 * lado;
		System.out.println("A área deste quadrado é: "+ area);
		return area;
	}

	@Override
	public String toString() {
		return "O quadrado criado tem lados de tamanho: " + lado; 
	}
	
	
	
}
