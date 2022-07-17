package bloco1;

public class Series extends ProgramasTv{
	
	private int duracao;
	private int episodios;
	private int temporadas;
	
	
	public Series(String titulo,String genero,String sinopse, String classificacaoindicativa,int duracao,int episodios,int temporadas) {
		 super(titulo,genero,sinopse,classificacaoindicativa);
		 this.duracao = duracao;
		 this.episodios = episodios;
		 this.temporadas = temporadas;
	}
	
		
	public int getDuracao() {
		return duracao;
	}
	protected void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	protected int getEpisodios() {
		return episodios;
	}
	protected void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	protected int getTemporadas() {
		return temporadas;
	}
	protected void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
}
