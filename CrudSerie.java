package bloco1;


import java.util.Scanner;

public class CrudSerie extends Catalogo {
	
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
		System.out.println("\nDigite a duração média de cada episósio(em minutos): ");
		int duracao = leia.nextInt();
		
		
		leia.nextLine();
		System.out.println("\nDigite quantos episodios a série tem: ");
		int episodios = leia.nextInt();
		
		leia.nextLine();
		System.out.println("\nDigite quantas temporadas a série tem: ");
		int temporadas = leia.nextInt();
		
		
		Series series = new Series(titulo,genero,sinopse,classificacao,duracao,episodios,temporadas);
		
		this.listSeries.add(series);
		
	}
	
	
	@Override
	public void visualizar() {
		for(Series exibir: listSeries) {
			System.out.println("**************************************************");
			System.out.print("Título: "+exibir.getTitulo());
			System.out.print("\nGênero: "+exibir.getGenero());
			System.out.print("\nClassificação indicativa: "+exibir.getClassificacaoindicativa());
			System.out.print("\nDuração média por episódio: "+exibir.getDuracao());
			System.out.print("\nEpisódios: "+exibir.getEpisodios());
			System.out.print("\nTemporadas: "+exibir.getTemporadas());
			System.out.println("\n**************************************************");
		}
		
	}
		
}
	


