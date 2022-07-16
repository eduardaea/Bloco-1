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
	this.generico.add(documentario);
	
}


@Override
public void visualizar() {
	System.out.println(generico);
 	} 
}