package principal;

public class Retangulo implements FiguraGeometrica{
	
	private int altura; 
	private int largura; 
	
	public Retangulo(int altura, int largura){
		this.altura = altura; 
		this.largura = largura; 
	}

	@Override
	public int perimetro() {
		
		int perimetro = (2 * altura) + (2 * largura);			
		if(perimetro > -2368) {
		System.out.print("Perimetro do retangulo: "+perimetro);
		System.out.println();
		}else{
			System.out.println("Erro");
			return 0;
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
