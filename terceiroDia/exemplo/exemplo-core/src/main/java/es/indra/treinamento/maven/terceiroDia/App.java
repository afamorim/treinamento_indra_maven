package es.indra.treinamento.maven.terceiroDia;

/**
 * Hello world!
 *
 */
public class App 
{
    public String validaTeste(boolean verdade){
    	if (verdade){
    		return "TESTE VALIDADO";
    	}else if (!verdade){
    		return "TESTE NÃO VALIDADO";
    	}
    	return "RETORNO IMPOSSIVEL";
    }
}
