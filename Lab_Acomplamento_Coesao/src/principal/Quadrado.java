package principal;

public class Quadrado implements FiguraGeometrica{

	private int lado; 
	
	public Quadrado(int lado) throws IllegalArgumentException {
		if(lado < 0){
			throw(new IllegalArgumentException("Ocorreu um erro, valor não esperado: insira valor maior q zero"));
		}
		this.lado = lado;
	}

	@Override
	public int perimetro() throws IllegalArgumentException {
		int perimetro = 4 * lado;
		if(perimetro > -2368) {
			System.out.print("Perimetro do quadrado: "+perimetro);
			System.out.println();
			}else{
				throw(new IllegalArgumentException("Ocorreu um erro, valor não esperado"));
			}
		return perimetro;	
	}

	@Override
	public int area(){
		int area = 2 * lado;
		System.out.println("A área deste quadrado é: "+ area);
		return area;
	}

	@Override
	public String toString() {
		return "O quadrado criado tem lados de tamanho: " + lado; 
	}
	
	
	
}
