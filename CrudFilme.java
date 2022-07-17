package bloco1;

import java.util.Scanner;

public class CrudFilme extends Catalogo {
	
	Scanner leia = new Scanner(System.in);
	@Override
	public void criar() {
	leia.nextLine();
	System.out.println("\nDigite o Título: ");
	 String titulo = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite o Gênero: ");
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
	System.out.println("\nDigite o diretor: ");
	String diretor = leia.nextLine();
	
	leia.nextLine();
	System.out.println("\nDigite que ano o filme foi lançado: ");
	int ano = leia.nextInt();
	
	Filmes filme = new Filmes(titulo,genero,sinopse,classificacao,elenco,diretor,ano);
	this.listFilmes.add(filme);
	
	
}


@Override
public void visualizar() {
	

	for (Filmes exibir: listFilmes ) {
	
		System.out.println("**************************************************");
		System.out.print("Título: "+exibir.getTitulo());
		System.out.print("\nGênero: "+exibir.getGenero());
		System.out.print("\nClassificação indicativa: "+exibir.getClassificacaoindicativa());
		System.out.print("\nElenco: "+exibir.getElenco());
		System.out.print("\nDiretor: "+exibir.getDiretor());
		System.out.print("\nAno de lançamento: "+exibir.getAno());
		System.out.print("\nSinopse: "+exibir.getSinopse());
		
		System.out.println("\n**************************************************");
		
	}
	
 } 

}
