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

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	
}
