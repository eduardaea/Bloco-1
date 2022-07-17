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
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getEpisodios() {
		return episodios;
	}
	public void setEpisodios(String episodios) {
		this.episodios = episodios;
	}
	public String getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(String temporadas) {
		this.temporadas = temporadas;
	}
	
	
	
}
