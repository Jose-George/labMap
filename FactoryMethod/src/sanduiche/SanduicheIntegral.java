package sanduiche;

import ovo.Ovo;
import ovo.OvoCapoeira;
import pao.Pao;
import pao.PaoIntegral;
import queijo.Queijo;
import queijo.QueijoCheddar;

public class SanduicheIntegral implements Sanduiche {

	@Override
	public Pao pao() {
		return new PaoIntegral();
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
