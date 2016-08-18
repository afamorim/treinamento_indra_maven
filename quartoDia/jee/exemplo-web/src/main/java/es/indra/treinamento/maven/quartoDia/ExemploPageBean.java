package es.indra.treinamento.maven.quartoDia;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import es.indra.treinamento.maven.quartoDia.bean.ExemploBean;

@SuppressWarnings("serial")
@ManagedBean(name="exemploPageBean")
@ViewScoped
public class ExemploPageBean {
	
	@EJB
	private ExemploBean			exemploBean;
	
	public ExemploPageBean(){}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("TESTE DE PAGE BEAN");
	}
	
}
