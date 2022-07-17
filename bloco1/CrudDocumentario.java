package bloco1;

import java.util.Scanner;

public class CrudDocumentario extends Catalogo{
	
	Scanner leia = new Scanner(System.in);
	@Override
	public void criar() {
	leia.nextLine();
	System.out.println("\nDigite o Titulo: ");
	String titulo = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite o Genero");
	String genero = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite a Sinopse: ");
	String sinopse = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite a Classificação Indicativa: ");
	String classificacao = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite o Tipo de documentario: ");
	String tipo = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite a duracao :");
	int duracao = leia.nextInt();
	
	
	
	Documentario documentario = new Documentario(titulo,genero,sinopse,classificacao,tipo,duracao);
	this.listDocumentario.add(documentario);
	
}


	@Override
	public void visualizar() {
	
		for (Documentario exibir: listDocumentario ) {
			System.out.println("**************************************************");
			System.out.print("Titulo: "+exibir.getTitulo());
			System.out.print("\nGenero: "+exibir.getGenero());
			System.out.print("\nClassificacao indicativa: "+exibir.getClassificacaoindicativa());
			System.out.print("\nSinopse: "+exibir.getSinopse());
			System.out.print("\nTipo: "+exibir.getTipo());
			System.out.print("\nDuracao"+exibir.getDuracao());		
			System.out.println("\n**************************************************");
		}
		
	
	 } 
}