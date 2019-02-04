package br.com.pocjavaee.bean;

import javax.faces.bean.ManagedBean;

import br.com.pocjavaee.model.SolicitacaoSangue;

@ManagedBean(name="solicitacaoBean")
public class SolicitacaoSangueBean {

	private SolicitacaoSangue solicitacao = null;

	public SolicitacaoSangueBean(){
		setSolicitacao(new SolicitacaoSangue());
	}

	public SolicitacaoSangue getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(SolicitacaoSangue solicitacao) {
		this.solicitacao = solicitacao;
	}

	public void solicitarSangue(SolicitacaoSangue solicitacao){
		
	}
}
