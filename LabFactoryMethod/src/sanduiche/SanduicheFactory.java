package sanduiche;

public class SanduicheFactory {
	
	public Sanduiche creator(TipoSanduiche tipo){
		if(tipo.equals(TipoSanduiche.BOLA)){
			return new SanduicheBola();
		}else if(tipo.equals(TipoSanduiche.INTEGRAL)){
			return new SanduicheFrances();
		}else{
			return new SanduichePaoIntegral();
		}
	}
}
