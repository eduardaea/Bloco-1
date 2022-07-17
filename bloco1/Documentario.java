package bloco1;

public class Documentario extends ProgramasTv{
	
	private String tipo;
	private int duracao;
	
	
	public Documentario(String titulo, String genero, String sinopse, String classificacaoindicativa, int duracao, String tipo) {
		super(titulo, genero, sinopse, classificacaoindicativa);
		
		this.tipo = tipo;
		this.duracao = duracao;
		
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getDuracao() {
		return duracao;
	}


	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}



}
