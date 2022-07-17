package bloco1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApresentarCrud {

	public static void main(String[] args) {
		
		CrudSerie serie = new CrudSerie();
		CrudFilme filme = new CrudFilme();
		CrudDocumentario documentario = new CrudDocumentario();
		
		int op=1;
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("\nPara Filmes digite 1: ");
			System.out.println("\nPara Séries digite 2: ");
			System.out.println("\nPara Documentários digite 3: ");
			op=input.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("**************************************************");
				System.out.println("\nPara adicionar novo Filme, digite 1: ");
				System.out.println("\nPara visualizar o Catálogo de Filmes digite 2: ");
				int op1 = input.nextInt();
				System.out.println("\n**************************************************");
					if(op1 == 1) {
						filme.criar();
					}
					else if(op1 ==2) {
						filme.visualizar();
					}
					else {System.out.println("Opção Inválida! Digite novamente sua escolha: ");
					op1= input.nextInt();
					}
			break;
			case 2:
				System.out.println("**************************************************");
				System.out.println("Para adicionar uma nova Série, digite 1: ");
				System.out.println("\nPara visualizar o Catálogo de Séries digite 2: ");
				int op2 = input.nextInt();
				System.out.println("\n**************************************************");
					if(op2 == 1) try{
						serie.criar();
					}catch(InputMismatchException inputMismatchException ) {
						System.err.printf("\nExceção: %s",inputMismatchException);
						input.nextLine();
						System.out.println("\nVocê deve entrar com um número inteiro. Por favor tente novamente!");
						}
					else if(op2 ==2)  {
					
						serie.visualizar();
						
					}
					
					else {System.out.println("Opção Inválida! Digite novamente sua escolha: ");
					op2 = input.nextInt();	}	
			break;
			case 3:
				System.out.println("**************************************************");
				System.out.println("\nPara criar um novo Documentário, digite 1: ");
				System.out.println("\nPara visualizar o Catálogo de Documentários, digite 2: ");
				int op3 = input.nextInt();
				System.out.println("\n**************************************************");
					if(op3 ==1) try{
					documentario.criar();
					}catch(InputMismatchException inputMismatchException ) {
						System.err.printf("\nExceção: %s",inputMismatchException);
						input.nextLine();
						System.out.println("\nVoce deve entrar com um numero inteiro. Por favor tente novamente!");
						}
					else if(op3 ==2) {
						try {
						documentario.visualizar();
						}
						catch(RuntimeException error){
							System.out.println("\n****************************************************");
							System.out.println("\n"+error.getMessage());
							System.out.println("\n****************************************************");
						};
				
					}
					else {System.out.println("Opção Invalida! Digite novamente sua escolha: ");
					op3 = input.nextInt();	}
			break;
			}
			
		}
		while(op != 0);

}
	
}
