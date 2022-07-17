package bloco1;

import java.util.Scanner;

public class ApresentarCrud {	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CrudSerie serie = new CrudSerie();
		CrudFilme filme = new CrudFilme();
		CrudDocumentario documentario = new CrudDocumentario();
		
	
		
		int op=1;
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("\nPara Filmes digite 1: ");
			System.out.println("\nPara Series digite 2: ");
			System.out.println("\nPara Documentarios digite 3: ");
			op=input.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("**************************************************");
				System.out.println("\nPara Adicionar novo filme, Digite 1: ");
				System.out.println("\nPara Visualizar o Catalogo de Filmes Digite 2: ");
				int op1 = input.nextInt();
				System.out.println("\n**************************************************");
					if(op1 == 1) {
						filme.criar();
					}
					else if(op1 ==2) {
						filme.visualizar();
					}
					else {System.out.println("Opcao Invalida, digite novamente sua escolha: ");
					op1= input.nextInt();
					}
			break;
			case 2:
				System.out.println("**************************************************");
				System.out.println("Para adicionar uma nova Serie, digite 1: ");
				System.out.println("\nPara visualizar o catalogo de series digite 2: ");
				int op2 = input.nextInt();
				System.out.println("\n**************************************************");
					if(op2 == 1) {
						serie.criar();
					}
					else if(op2 ==2) {
						serie.visualizar();
					}
					else {System.out.println("Opcao Invalida, digite novamente sua escolha: ");
					op2 = input.nextInt();	}	
			break;
			case 3:
				System.out.println("**************************************************");
				System.out.println("\nPara criar um novo Documentario digite 1: ");
				System.out.println("\nPara visualizar o catalogo de Documentarios digite 2: ");
				int op3 = input.nextInt();
				System.out.println("\n**************************************************");
					if(op3 ==1) {
						documentario.criar();
					}
					else if(op3 ==2) {						
						documentario.visualizar();
					}
					else {System.out.println("Opcao Invalida, digite novamente sua escolha: ");
					op3 = input.nextInt();	}
			break;
			}
			
		}
		while(op != 0);
	}
}
