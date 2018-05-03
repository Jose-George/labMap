package sanduiche;

public class SanduicheBola implements Sanduiche {

	private String ingredientes; 
	@Override
	public String creatorSanduiche(String pao, String queijo, String ovo, String verdura) {
		ingredientes =  "{"+pao+","+queijo+","+ovo+","+verdura+"}";
		System.out.println(ingredientes);
		return ingredientes;
	}
	
	public String getIngredientes(){
		return ingredientes;
	}
	
}
