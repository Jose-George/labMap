package sanduiche;

import ovo.Ovo;
import ovo.OvoCapoeira;
import pao.Pao;
import pao.PaoBola;
import queijo.Queijo;
import queijo.QueijoCheddar;

public class SanduicheBola implements Sanduiche {

	
	@Override
	public Pao pao() {
		return new PaoBola();
	}

	@Override
	public Queijo queijo() {
		return new QueijoCheddar();
	}

	@Override
	public Ovo ovo() {
		return new OvoCapoeira();
	}

	@Override
	public Verdura verdura() {
		return new Verdura();
	}

	
}
