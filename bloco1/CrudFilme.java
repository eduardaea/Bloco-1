package bloco1;

import java.util.Scanner;

public class CrudFilme extends Catalogo {

	Scanner leia = new Scanner(System.in);
		@Override
		public void criar() {
		leia.nextLine();
		System.out.println("\nDigite o Titulo: ");
		 String titulo = leia.nextLine();
		
		leia.nextLine();
		System.out.println("\nDigite a Genero");
		String genero = leia.nextLine();
		
		leia.nextLine();
		System.out.println("\nDigite a Sinopse: ");
		String sinopse = leia.nextLine();
		
		leia.nextLine();
		System.out.println("\nDigite a Classificação Indicativa: ");
		String classificacao = leia.nextLine();
		
		leia.nextLine();
		System.out.println("\nDigite O elenco Principal: ");
		String elenco = leia.nextLine();
		
		leia.nextLine();
		System.out.println("\nDigite o diretor :");
		String diretor = leia.nextLine();
		
		leia.nextLine();
		System.out.println("\nDigite que ano o filme foi lancado :");
		String ano = leia.nextLine();
		
		
		Filmes filme = new Filmes(titulo,genero,sinopse,classificacao,elenco,diretor,ano);
		this.generico.add(filme);
		
	}
	
	
	@Override
	public void visualizar() {
		System.out.println(generico);
	 	} 
	}