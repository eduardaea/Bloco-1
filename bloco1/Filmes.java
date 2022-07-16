package bloco1;

public class Filmes extends ProgramasTv {

	private String elenco;
	private String diretor;
	private String ano;
	
	public Filmes(String titulo, String genero, String sinopse, String classificacaoindicativa,String elenco, String diretor, String ano) {
		super(titulo, genero, sinopse, classificacaoindicativa);
		this.elenco = elenco;
		this.diretor = diretor;
		this.ano = ano;
	}

	protected String getElenco() {
		return elenco;
	}

	protected void setElenco(String elenco) {
		this.elenco = elenco;
	}

	protected String getDiretor() {
		return diretor;
	}

	protected void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	protected String getAno() {
		return ano;
	}

	protected void setAno(String ano) {
		this.ano = ano;
	}
	
	
}
