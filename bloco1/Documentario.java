package bloco1;

public class Documentario extends ProgramasTv {
	public String tipo;
	private int duracao;
	
	public Documentario(String titulo, String genero, String sinopse, String classificacaoindicativa,String tipo, int duracao) {
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
