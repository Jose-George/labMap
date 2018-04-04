package principal;

public class Retangulo implements FiguraGeometrica{
	
	private int altura; 
	private int largura; 
	
	public Retangulo(int altura, int largura) throws IllegalArgumentException{
		if(altura <0 || largura <0){
			throw(new IllegalArgumentException("Ocorreu um erro, valor não esperado: insira valor maior q zero"));
		}
		this.altura = altura; 
		this.largura = largura; 
	}

	@Override
	public int perimetro() throws IllegalArgumentException {
		
		int perimetro = (2 * altura) + (2 * largura);			
		if(perimetro > -2368) {
		System.out.print("Perimetro do retangulo: "+perimetro);
		System.out.println();
		}else{
			throw(new IllegalArgumentException("Ocorreu um erro, valor não esperado"));
		}
		return perimetro;
	}

	@Override
	public int area() {
		int area = altura * largura;
		return area;
	}

	@Override
	public String toString() {
		return "O retângulo criado tem altura de tamanho: " + altura + 
				"e largura de tamanho: " + largura;
	}
	
	
	
}
