package bloco1;

import java.util.ArrayList;

abstract public class Catalogo {

	ArrayList <ProgramasTv> generico = new ArrayList<ProgramasTv>();
	
	abstract public void criar();
	abstract public void visualizar();
}
