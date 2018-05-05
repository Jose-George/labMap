package sanduiche;

import ovo.Ovo;
import ovo.OvoGranja;
import pao.Pao;
import pao.PaoFrances;
import queijo.Queijo;
import queijo.QueijoMussarela;

public class SanduicheFrances implements Sanduiche{

	@Override
	public Pao pao() {
		return new PaoFrances();
	}

	@Override
	public Queijo queijo() {
		return new QueijoMussarela();
	}

	@Override
	public Ovo ovo() {
		return new OvoGranja();
	}

	@Override
	public Verdura verdura() {
		return new Verdura();
	}

}
