package br.com.pocjavaee.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author p059165
 * @version 1.0
 * @created 25-jul-2016 13:27:12
 */
@Entity
public class Paciente extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="DIAGNOSTICO")
	private String diagnostico;

	public Paciente(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

}