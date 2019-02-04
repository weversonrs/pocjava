package br.com.pocjavaee.bean;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import br.com.pocjavaee.model.Agendamento;
import br.com.pocjavaee.model.Laboratorio;

@ManagedBean(name="agendamentoBean")
public class AgendamentoBean {
	
	private Laboratorio selectedLaboratorio;
	private Agendamento agendamento= null;
	private List<Laboratorio> laboratorios = null;
	
	public AgendamentoBean(){
		setAgendamento(new Agendamento());
		laboratorios = new ArrayList<Laboratorio>();
		Laboratorio lab1 = new Laboratorio();
		lab1.setCodigo(100l);
		lab1.setNome("Lab 1");
		laboratorios.add(lab1);
		Laboratorio lab2 = new Laboratorio();
		lab2.setCodigo(100l);
		lab2.setNome("Lab 2");
		laboratorios.add(lab2);
	}
	
	public Laboratorio getSelectedLaboratorio() {
		return selectedLaboratorio;
	}

	public void setSelectedLaboratorio(Laboratorio selectedLaboratorio) {
		this.selectedLaboratorio = selectedLaboratorio;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}
	
	public List<SelectItem> getLaboratorios() {  
	    List<SelectItem> items = new ArrayList<SelectItem>();  
	    for (Laboratorio e : this.laboratorios) {  
	        // observem que o value do meu SelectItem a própria entidade  
	        items.add(new SelectItem(e, e.getNome()));  
	    }  
	    return items;  
	}

	public void agendar(Agendamento agendamento){
		
	}

}
