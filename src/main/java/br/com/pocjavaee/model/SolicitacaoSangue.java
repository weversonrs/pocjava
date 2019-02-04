package br.com.pocjavaee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author p059165
 * @version 1.0
 * @created 25-jul-2016 16:27:40
 */

@Entity(name="SOLICITACAO_SANGUE")
public class SolicitacaoSangue {
	
	@Id @GeneratedValue
	@Column(name="CODIGO")
	private long codigo;
	
	@Column(name="DT_SOLICITACAO")
	private Date dataSolicitacao;
	
	@Column(name="JUSTIFICATIVA")
	private String justificativa;
	
	@Column(name="RESP_SOLICITACAO")
	private String responsavelSolicitacao;
	
	@Column(name="PACIENTE_BENEFICIARIO")
	private String pacienteBeneficiario;
	
	@OneToOne
	@JoinColumn(name="UNIDADE_ID")
	private UnidadeHospitalar unidadeHospitalar = null;

	public SolicitacaoSangue(){

	}

	public void finalize() throws Throwable {

	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public String getResponsavelSolicitacao() {
		return responsavelSolicitacao;
	}

	public void setResponsavelSolicitacao(String responsavelSolicitacao) {
		this.responsavelSolicitacao = responsavelSolicitacao;
	}

	public String getPacienteBeneficiario() {
		return pacienteBeneficiario;
	}

	public void setPacienteBeneficiario(String pacienteBeneficiario) {
		this.pacienteBeneficiario = pacienteBeneficiario;
	}

	public UnidadeHospitalar getUnidadeHospitalar() {
		return unidadeHospitalar;
	}

	public void setUnidadeHospitalar(UnidadeHospitalar unidadeHospitalar) {
		this.unidadeHospitalar = unidadeHospitalar;
	}

}