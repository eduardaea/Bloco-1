package bloco1;

public class ProgramasTv implements Programas {
	
		String titulo;
		String genero;
		String sinopse;
		String classificacaoindicativa;

	public ProgramasTv(String titulo,String genero,String sinopse,String classificacaoindicativa) {
			
			this.titulo=titulo;
			this.genero = genero;
			this.sinopse = sinopse;
			this.classificacaoindicativa = classificacaoindicativa;
			
		}
	  
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getSinopse() {
			return sinopse;
		}

		public void setSinopse(String sinopse) {
			this.sinopse = sinopse;
		}

		public String getClassificacaoindicativa() {
			return classificacaoindicativa;
		}

		public void setClassificacaoindicativa(String classificacaoindicativa) {
			this.classificacaoindicativa = classificacaoindicativa;
		}
		
	
	
}
