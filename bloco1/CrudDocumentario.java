package bloco1;

import java.util.Scanner;

public class CrudDocumentario extends Catalogo {
	
	Scanner leia = new Scanner(System.in);
	@Override
	public void criar() {
	leia.nextLine();
	System.out.println("\nDigite o TÃ­tulo: ");
	String titulo = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite o GÃªnero: ");
	String genero = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite a Sinopse: ");
	String sinopse = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite a ClassificaÃ§Ã£o Indicativa: ");
	String classificacao = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite o Tipo de documentÃ¡rio: ");
	String tipo = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite a duraÃ§Ã£o(em minutos): ");
	int duracao = leia.nextInt();
	
	Documentario documentario = new Documentario(titulo,genero,sinopse,classificacao,duracao,tipo);
	this.listDocumentario.add(documentario);
	
}


@Override
	public void visualizar() {
	
		if(listDocumentario.size()==0) {
			throw new RuntimeException("\nO Catalogo esta vazio, adicione um novo Documentario: ");
		}
		
		for (Documentario exibir: listDocumentario ) {
			System.out.print("Título: "+exibir.getTitulo());
			System.out.print("\nGênero: "+exibir.getGenero());
			System.out.print("\nClassificação indicativa: "+exibir.getClassificacaoindicativa());
			System.out.print("\nSinopse: "+exibir.getSinopse());
			System.out.print("\nTipo: "+exibir.getTipo());
			System.out.print("\nDuração(em minutos): "+exibir.getDuracao());		
			
		}
		
	
	 } 
 	

}
