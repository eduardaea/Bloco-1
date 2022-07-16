package bloco1;

public class ApresentarCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CrudSerie serie = new CrudSerie();
		CrudFilme filme = new CrudFilme();
		CrudDocumentario documentario = new CrudDocumentario();
		
		documentario.criar();
		
		documentario.visualizar();
	}

}
