package bloco1;

import java.util.ArrayList;

abstract public class Catalogo{

	ArrayList <Filmes> listFilmes = new ArrayList<Filmes>();
	ArrayList <Series> listSeries = new ArrayList<Series>();
	ArrayList <Documentario> listDocumentario = new ArrayList<Documentario>();
	
	abstract public void criar();
	abstract public void visualizar();
}