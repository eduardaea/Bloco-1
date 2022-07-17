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
		this.listFilmes.add(filme);
		
	}
	
	
	@Override
	public void visualizar() {
		for (Filmes exibir: listFilmes ) {
			System.out.println("**************************************************");
			System.out.print("Titulo: "+exibir.getTitulo());
			System.out.print("\nGenero: "+exibir.getGenero());
			System.out.print("\nClassificacao indicativa: "+exibir.getClassificacaoindicativa());
			System.out.print("\nelenco: "+exibir.getElenco());
			System.out.print("\nDiretor: "+exibir.getDiretor());
			System.out.print("\nAno: "+exibir.getAno());
			System.out.println("\n**************************************************");
		}	
	}
}
	