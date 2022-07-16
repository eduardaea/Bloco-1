package bloco1;

public class Series extends ProgramasTv {
	
	private String duracao;
	private String episodios;
	private String temporadas;
	
	
	public Series(String titulo,String genero,String sinopse, String classificacaoindicativa,String duracao,String episodios,String temporadas) {
		 super(titulo,genero,sinopse,classificacaoindicativa);
		 this.duracao = duracao;
		 this.episodios = episodios;
		 this.temporadas = temporadas;
	}
	
		
	public String getDuracao() {
		return duracao;
	}
	protected void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	protected String getEpisodios() {
		return episodios;
	}
	protected void setEpisodios(String episodios) {
		this.episodios = episodios;
	}
	protected String getTemporadas() {
		return temporadas;
	}
	protected void setTemporadas(String temporadas) {
		this.temporadas = temporadas;
	}
	
	
	
}
