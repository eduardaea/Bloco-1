package bloco1;

import java.util.Scanner;

public class CrudSerie extends Catalogo {
	
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
		System.out.println("\nDigite a Classificacao Indicativa: ");
		String classificacao = leia.nextLine();
		
		leia.nextLine();
		System.out.println("\nDigite a duracao :");
		String duracao = leia.nextLine();
		
		leia.nextLine();
		System.out.println("\nDigite quantos episodios a serie tem :");
		String episodios = leia.nextLine();
		
		leia.nextLine();
		System.out.println("\nDigite quantas temporadas a serie tem :");
		String temporadas = leia.nextLine();
		
		Series series = new Series(titulo,genero,sinopse,classificacao,duracao,episodios,temporadas);
		this.listSeries.add(series);
		
	}
	
	
	@Override
	public void visualizar() {
		for(Series exibir: listSeries) {
			System.out.println("**************************************************");
			System.out.print("Titulo: "+exibir.getTitulo());
			System.out.print("\nGenero: "+exibir.getGenero());
			System.out.print("\nClassificacao indicativa: "+exibir.getClassificacaoindicativa());
			System.out.print("\nDuracao: "+exibir.getDuracao());
			System.out.print("\nEpisodios: "+exibir.getEpisodios());
			System.out.print("\nTemporadas: "+exibir.getTemporadas());
			System.out.println("\n**************************************************");
		}
	}
	
	
}
