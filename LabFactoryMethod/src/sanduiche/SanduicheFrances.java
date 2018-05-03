package sanduiche;

public class SanduicheFrances implements Sanduiche {

	@Override
	public String creatorSanduiche(String pao, String queijo, String ovo, String verdura) {
		return "{"+pao+","+queijo+","+ovo+","+verdura+"}";
	}
}
