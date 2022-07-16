package bloco1;

public class Documentario extends ProgramasTv {
	private String tipo;
	private int duracao;
	
	public Documentario(String titulo, String genero, String sinopse, String classificacaoindicativa,String tipo, int duracao) {
		super(titulo, genero, sinopse, classificacaoindicativa);
		this.tipo = tipo;
		this.duracao = duracao;
	}

	protected String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

	protected int getDuracao() {
		return duracao;
	}

	protected void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
}
